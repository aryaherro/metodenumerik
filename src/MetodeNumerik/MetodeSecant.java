package MetodeNumerik;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ajeng
 */
public class MetodeSecant extends MetodeNumerik{
    
    public MetodeSecant(int jumlahPangkat, int ulangMaks, double erTol) {
        super(jumlahPangkat, ulangMaks, erTol);
    }
    
    public double rumusSecant(double newA,  double newB){
        return (newB - ((perhitunganY(newB, getJumlahPangkat()) * (newB - newA)) / (perhitunganY(newB, getJumlahPangkat()) - perhitunganY(newA, getJumlahPangkat()))));
    }
    
    @SuppressWarnings("unchecked")
    public ArrayList langkahSecant(){
        ArrayList list = new ArrayList<>();
        int i = 0;
        do{
            Object[] alay = new Object[5];
            alay[0] = i+1;
            alay[1] = getA();
            alay[2] = getB();
            setC(rumusSecant(getA(), getB()));
            alay[3] = getC();
            setA(getB());
            setB(getC());
            alay[4] = getC() - getA();
            list.add(alay);
            i++;
        }while((i < getUlangMaks()) && (!(Double.isNaN(getB()))) && !(((getC() - getA()) <= getErTol()) && ((getC() - getA()) >= 0)));
        return list;
        //System.out.printf("\nNilai akar dari persamaan " + cetakRumus(getJumlahPangkat()) + " = 0 terdapat pada iterasi ke-" + i + " adalah %.6f\n",getA());
    }
}