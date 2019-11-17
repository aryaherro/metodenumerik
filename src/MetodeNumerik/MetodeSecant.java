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
        
        System.out.println("Rumus : " + MS.cetakRumus(MS.getJumlahPangkat()));
        MS.cetakRumus(MS.getJumlahPangkat());
        
        System.out.print("Ingin Menginput manual nilai x" + MS.superscript(1) + " dan nilai x" + MS.superscript(2) + " (y/n): ");
        String input = scn.nextLine();
        if (input.equals("y") || input.equals("Y")) {
            System.out.print("Masukkan nilai x" + MS.superscript(1) + " : ");
            MS.setX(scnDouble.nextDouble(),0);
            System.out.print("Masukkan nilai x" + MS.superscript(2) + " : ");
            MS.setX(scnDouble.nextDouble(),1);
        }
        else{
            MS.setX((MS.acak(-10, 10)), 0);
            do
            {
                MS.setX((MS.acak(-10, 10)), 1);
            }while(MS.getX(0) == MS.getX(1));
        }
        
        System.out.println("Iterasi\t\tx₁\t\tx₂\t\tx₃");
        try {
            for (int i = 0; ((i < MS.getUlangMaks()) && (!(Double.isNaN(MS.getX(i+1)))) && !(((MS.getX(i+1)-MS.getX(i)) < MS.getErTol()) && ((MS.getX(i+1)-MS.getX(i)) > 0))); i++) {
                //System.out.print((i+1) + "\t\t" + MS.getX(i) + "\t\t" + MS.getX(i+1));
                System.out.printf((i+1) + "\t\t%.6f\t%.6f",MS.getX(i),MS.getX(i+1));
                MS.setX((MS.rumusSecant(MS.getX(i), MS.getX(i+1))),(i+2));
                //System.out.println("\t\t" + MS.getX(i+2));
                System.out.printf("\t%.6f\n",MS.getX(i+2));
            }    
        }
        catch(ArrayIndexOutOfBoundsException exception){
            
        }
    }
    public double rumusSecant(double newA,  double newB){
        double newC = newB - ((perhitunganY(newB, getJumlahPangkat()) * (newB - newA)) / (perhitunganY(newB, getJumlahPangkat()) - perhitunganY(newA, getJumlahPangkat())));
        return newC;
    }
}