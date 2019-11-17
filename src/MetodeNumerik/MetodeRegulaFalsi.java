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
        Scanner scnInt = new Scanner(System.in);
        Scanner scnDouble = new Scanner(System.in);
        
        System.out.print("\nMasukkan pangkat maksimal : ");
        int x = scnInt.nextInt();
        
        System.out.print("Masukkan jumlah iterasi maksimum yang dilakukan : ");
        int y = scnInt.nextInt();
        
        MetodeRegulaFalsi MRF = new MetodeRegulaFalsi(x, y, 0);
        
        
        MRF.inputRumus();
        
        MRF.setA(MRF.acak(-10, 10));
        do
        {
            MRF.setB(MRF.acak(-10, 10));
        }while(MRF.getA() == MRF.getB());
        
        for (int i = 0; ((i < MRF.getUlangMaks()) && (MRF.perhitunganY(MRF.getA(), MRF.getJumlahPangkat()) * MRF.perhitunganY(MRF.getB(), MRF.getJumlahPangkat()) != 0) && !(((MRF.getB()-MRF.getA()) < MRF.getErTol()) && ((MRF.getB()-MRF.getA()) > 0))); i++) { 
            System.out.print("nilai a : " + MRF.getA());
            System.out.print("\tnilai b : " + MRF.getB());
            
            //if (MRF.rumusRegulaFalsi(MRF.getA(), MRF.getB()) == MRF.getC())
              //  break;
            MRF.setC(MRF.rumusRegulaFalsi(MRF.getA(), MRF.getB()));
            System.out.println("\tnilai c : " + MRF.getC());
            
            if (MRF.perhitunganY(MRF.getA(), MRF.getJumlahPangkat()) * MRF.perhitunganY(MRF.getC(), MRF.getJumlahPangkat()) < 0) { 
                MRF.setB(MRF.getC());
            } else {
                MRF.setA(MRF.getC());
            }
            if (MRF.rumusRegulaFalsi(MRF.getA(), MRF.getB()) == MRF.getC()) {
                break;
            }   
        }
    }
    
    /*public double rumusRegulaFalsi(double newA, double newB) {
        setC(((newA * perhitunganY(newB, getJumlahPangkat())) - (newB * perhitunganY(newA, getJumlahPangkat()))) / (perhitunganY(newB, getJumlahPangkat()) - perhitunganY(newA, getJumlahPangkat())));
        return ((perhitunganY(newA, getJumlahPangkat())) * (perhitunganY(getC(), getJumlahPangkat())));
            
    }*/
    public double rumusRegulaFalsi(double newA, double newB) {
        return (((perhitunganY(newB, getJumlahPangkat()) * newA) - (perhitunganY(newA, getJumlahPangkat()) * newB)) / (perhitunganY(newB, getJumlahPangkat()) - perhitunganY(newA, getJumlahPangkat())));
        //return (newB - ((perhitunganY(newB, getJumlahPangkat()) * (newB - newA)) / (perhitunganY(newB, getJumlahPangkat()) - perhitunganY(newA, getJumlahPangkat()))));
    }
}
