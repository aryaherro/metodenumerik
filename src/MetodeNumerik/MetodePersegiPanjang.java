/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeNumerik;

import java.util.Scanner;

/**
 *
 * @author Ajeng
 */
public class MetodePersegiPanjang extends MetodeNumerik{
    
    public MetodePersegiPanjang(int jumlahPangkat, int ulangMaks, double erTol) {
        super(jumlahPangkat, ulangMaks, erTol);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        double luas;
        Scanner scn = new Scanner(System.in);
        Scanner scnInt = new Scanner(System.in);
        Scanner scnDouble = new Scanner(System.in);
        
        System.out.print("\nMasukkan pangkat maksimal : ");
        int x = scnInt.nextInt();
        
        System.out.print("Masukkan jumlah pias(bagian) maksimum : ");
        int y = scnInt.nextInt();
      
        MetodePersegiPanjang MPP = new MetodePersegiPanjang(x, y, 0);
        
        MPP.inputRumus();
        
        System.out.println("Rumus : " + MPP.cetakRumus(MPP.getJumlahPangkat()));
        MPP.cetakRumus(MPP.getJumlahPangkat());
        
        System.out.print("Ingin Menginput manual nilai x" + MPP.superscript(1) + " dan nilai x" + MPP.superscript(2) + " (y/n): ");
        String input = scn.nextLine();
        MPP.inputAcakAB(input);
        if (MPP.getA() > MPP.getB()){
            double temp = MPP.getA();
            MPP.setA(MPP.getB());
            MPP.setB(temp);
        }
        double h = (MPP.getB() - MPP.getA()) / MPP.getUlangMaks();
        if (h < 0) {
            h *= -1;
        }
        
        System.out.println("\nIterasi\t\tx₁\t\t(x₁+h)\t\ty₁\t\tluas");
        int i = 0;
        do {
            MPP.setC(MPP.getA() + h);
            System.out.printf((i+1) + "\t\t%.6f\t%.6f",MPP.getA(),MPP.getC());
            MPP.setNilaiY(MPP.perhitunganY(MPP.getC(), MPP.getJumlahPangkat()));
            
            luas = MPP.rumusPersegiPanjang(MPP.getNilaiY() , h);
            if (luas < 0) {
                luas *= -1;
            }
            System.out.printf("\t%.6f\t%.6f\n",MPP.getNilaiY(),luas);
            MPP.setTotal(MPP.getTotal() + luas);
            MPP.setA(MPP.getC());
            i++;
        }while( i < MPP.getUlangMaks());
        System.out.printf("\nTotal Luas daerah " + MPP.cetakRumus(MPP.getJumlahPangkat()) + " adalah %.6f\n",MPP.getTotal());
    }
    
    public double rumusPersegiPanjang(double x, double y){
        return x*y;
    }
}
