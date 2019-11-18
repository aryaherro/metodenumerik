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
public class MetodeBiseksi extends MetodeNumerik{
    
    public MetodeBiseksi(int jumlahPangkat, int ulangMaks, double erTol) {
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
        
        MetodeBiseksi MB = new MetodeBiseksi(x, y, 0);
        
        MB.inputRumus();
        
        System.out.println("Rumus : " + MB.cetakRumus(MB.getJumlahPangkat()));
        MB.cetakRumus(MB.getJumlahPangkat());
        
        System.out.print("Ingin Menginput manual nilai x" + MB.superscript(1) + " dan nilai x" + MB.superscript(2) + " (y/n): ");
        String input = scn.nextLine();
        MB.inputAcakAB(input);
        
        for (int i = 0; ((i < MB.getUlangMaks()) && (MB.perhitunganY(MB.getA(), MB.getJumlahPangkat()) * MB.perhitunganY(MB.getB(), MB.getJumlahPangkat()) != 0) && !(((MB.getB()-MB.getA()) < MB.getErTol()) && ((MB.getB()-MB.getA()) > 0))); i++) { 
            System.out.print("nilai a : " + MB.getA());
            System.out.print("\t\tnilai b : " + MB.getB());
            MB.setC(MB.rumusBiseksi(MB.getA(), MB.getB()));
            
            System.out.print("\t\tnilai c : " + MB.getC());
            System.out.println("\t\tnilai f(c) : " + MB.perhitunganY(MB.getC(), MB.getJumlahPangkat()));
            if (MB.perhitunganY(MB.getA(), MB.getJumlahPangkat()) * MB.perhitunganY(MB.getC(), MB.getJumlahPangkat()) < 0) { 
                MB.setB(MB.getC());
            } else {
                MB.setA(MB.getC());
            }
        }    
    }
    
    public double rumusBiseksi(double newA, double newB) {
        return ((newA + newB)/ 2);
    }
}
