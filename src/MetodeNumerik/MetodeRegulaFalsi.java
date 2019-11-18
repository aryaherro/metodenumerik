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
public class MetodeRegulaFalsi extends MetodeNumerik {
    public MetodeRegulaFalsi(int jumlahPangkat, int ulangMaks, double erTol) {
        super(jumlahPangkat, ulangMaks, erTol);
    }
    
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
        
        MetodeRegulaFalsi MRF = new MetodeRegulaFalsi(x, y, z);
        
        
        MRF.inputRumus();
        
        System.out.println("Rumus : " + MRF.cetakRumus(MRF.getJumlahPangkat()));
        MRF.cetakRumus(MRF.getJumlahPangkat());
        
        System.out.print("Ingin Menginput manual nilai x" + MRF.superscript(1) + " dan nilai x" + MRF.superscript(2) + " (y/n): ");
        String input = scn.nextLine();
        MRF.inputAcakAB(input);
        
        System.out.println("\nIterasi\t\tx₁\t\tx₂\t\tx₃");
        int i = 0;
        do{
        //for (int i = 0; ((i < MRF.getUlangMaks()) && (MRF.perhitunganY(MRF.getA(), MRF.getJumlahPangkat()) * MRF.perhitunganY(MRF.getB(), MRF.getJumlahPangkat()) != 0) && !(((MRF.getB()-MRF.getA()) < MRF.getErTol()) && ((MRF.getB()-MRF.getA()) > 0))); i++) { 
            System.out.printf((i+1) + "\t\t%.6f\t%.6f",MRF.getA(),MRF.getB());
            MRF.setC(MRF.rumusRegulaFalsi(MRF.getA(), MRF.getB()));
            System.out.printf("\t%.6f\n",MRF.getC());
            
            if (MRF.perhitunganY(MRF.getA(), MRF.getJumlahPangkat()) * MRF.perhitunganY(MRF.getC(), MRF.getJumlahPangkat()) < 0) { 
                MRF.setB(MRF.getC());
            } else {
                MRF.setA(MRF.getC());
            }
            /*if (MRF.rumusRegulaFalsi(MRF.getA(), MRF.getB()) == MRF.getC()) {
                break;
            } */  
            i++;
        }while((i < MRF.getUlangMaks()) && (MRF.perhitunganY(MRF.getA(), MRF.getJumlahPangkat()) * MRF.perhitunganY(MRF.getB(), MRF.getJumlahPangkat()) != 0) && !(((MRF.getB()-MRF.getA()) <= MRF.getErTol()) && ((MRF.getB()-MRF.getA()) >= 0)));
        System.out.printf("\nNilai akar dari persamaan " + MRF.cetakRumus(MRF.getJumlahPangkat()) + " = 0 terdapat pada iterasi ke-" + i + " adalah %.6f\n",MRF.getA());
    }
    
    public double rumusRegulaFalsi(double newA, double newB) {
        return (((perhitunganY(newB, getJumlahPangkat()) * newA) - (perhitunganY(newA, getJumlahPangkat()) * newB)) / (perhitunganY(newB, getJumlahPangkat()) - perhitunganY(newA, getJumlahPangkat())));
        //return (newB - ((perhitunganY(newB, getJumlahPangkat()) * (newB - newA)) / (perhitunganY(newB, getJumlahPangkat()) - perhitunganY(newA, getJumlahPangkat()))));
    }
}
