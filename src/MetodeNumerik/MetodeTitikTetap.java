/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeNumerik;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ajeng
 */
public class MetodeTitikTetap extends MetodeNumerik{
    
    public MetodeTitikTetap(int jumlahPangkat, int ulangMaks, double erTol) {
        super(jumlahPangkat, ulangMaks, erTol);
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scnInt = new Scanner(System.in);
        Scanner scnDouble = new Scanner(System.in);
        
        System.out.print("\nMasukkan pangkat maksimal : ");
        int x = scnInt.nextInt();
        
        System.out.print("Masukkan jumlah iterasi maksimum yang dilakukan : ");
        int y = scnInt.nextInt();
        
        System.out.print("Masukkan toleransi maksimum : ");
        double z = scnDouble.nextDouble();
        
        MetodeTitikTetap MTT = new MetodeTitikTetap(x, y, z);
        
        MTT.inputRumus();
        
        System.out.println("Rumus : " + MTT.cetakRumus(MTT.getJumlahPangkat()));
        MTT.cetakRumus(MTT.getJumlahPangkat());
        
        System.out.print("Ingin Menginput manual nilai x" + MTT.superscript(1) + " dan nilai x" + MTT.superscript(2) + " (y/n): ");
        String input = scn.nextLine();
        if (input.equals("y") || input.equals("Y")) {
            MTT.setB(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan nilai x" + MTT.subscript(1) + " : ", ("x" + MTT.subscript(1)), 1)));
        }
        else{
            MTT.setB(MTT.acak(-10, 10));
        }

        System.out.println("\nIterasi\t\tx₁\t\tx₂\t\tf(x₂)");
        int i = 0;
        do{
            MTT.setA(MTT.getB());
            MTT.setB(MTT.rumusTitikTetap(MTT.getA()));
            System.out.printf((i+1) + "\t\t%.6f\t%.6f\t%.6f\n",MTT.getA(),MTT.getB(),MTT.perhitunganY(MTT.getA(), MTT.getJumlahPangkat()));
            i++;
        }while((i < MTT.getUlangMaks()) && (MTT.perhitunganY(MTT.getA(), MTT.getJumlahPangkat())!= 0) && !(((MTT.getB()-MTT.getA()) <= MTT.getErTol()) && ((MTT.getB()-MTT.getA()) >= 0)));
        System.out.printf("\nNilai akar dari persamaan " + MTT.cetakRumus(MTT.getJumlahPangkat()) + " = 0 terdapat pada iterasi ke-" + i + " adalah %.6f\n",MTT.getA());
    }
    
    public double rumusTitikTetap(double newX) {
        double hasil = 0;
        System.out.println("nilai X : " + newX);
        for (int i = getJumlahPangkat(); i > 0; i--) {
            hasil += getKonstanta(i) * Math.pow(newX, i-1);
        }
        return ((-1 * getKonstanta(0)) / hasil);
    }
}
