package MetodeNumerik;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Ajeng
 */
public class MetodeSecant extends MetodeNumerik{
    
    public MetodeSecant(int jumlahPangkat, int ulangMaks, double erTol) {
        super(jumlahPangkat, ulangMaks, erTol);
    }
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Scanner scnInt = new Scanner(System.in);
        Scanner scnDouble = new Scanner(System.in);
        
        
        System.out.print("\nMasukkan pangkat maksimal : ");
        int x = scnInt.nextInt();
        
        System.out.print("Masukkan jumlah iterasi maksimum yang dilakukan : ");
        int y = scnInt.nextInt();
        
        System.out.print("Masukkan toleransi maksimum : ");
        double z = scnDouble.nextDouble();
        
        MetodeSecant MS = new MetodeSecant(x, y, z);
        
        
        MS.inputRumus();
        
        System.out.println("\nRumus : " + MS.cetakRumus(MS.getJumlahPangkat()));
        MS.cetakRumus(MS.getJumlahPangkat());
        
        System.out.print("\nIngin Menginput manual nilai x" + MS.superscript(1) + " dan nilai x" + MS.superscript(2) + " (y/n): ");
        String input = scn.nextLine();
                
        MS.inputAcakAB(input);
        
        System.out.println("\nIterasi\t\tx₁\t\tx₂\t\tx₃");
        
        int i = 0;
        do{
            System.out.printf((i+1) + "\t\t%.6f\t%.6f",MS.getA(),MS.getB());
            MS.setC(MS.rumusSecant(MS.getA(), MS.getB()));
            System.out.printf("\t%.6f\n",MS.getC());
            MS.setA(MS.getB());
            MS.setB(MS.getC());
            i++;
        }while((i < MS.getUlangMaks()) && (!(Double.isNaN(MS.getB()))) && !(((MS.getC() - MS.getA()) <= MS.getErTol()) && ((MS.getC() - MS.getA()) >= 0)));    
        
        System.out.printf("\nNilai akar dari persamaan " + MS.cetakRumus(MS.getJumlahPangkat()) + " = 0 terdapat pada iterasi ke-" + i + " adalah %.6f\n",MS.getA());
    }
    public double rumusSecant(double newA,  double newB){
        return (newB - ((perhitunganY(newB, getJumlahPangkat()) * (newB - newA)) / (perhitunganY(newB, getJumlahPangkat()) - perhitunganY(newA, getJumlahPangkat()))));
    }
}