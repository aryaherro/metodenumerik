/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeNumerik;

import java.util.ArrayList;

/**
 *
 * @author Ajeng
 */
public class MetodeRegulaFalsi extends MetodeNumerik {
    public MetodeRegulaFalsi(int jumlahPangkat, int ulangMaks, double erTol) {
        super(jumlahPangkat, ulangMaks, erTol);
    }
    
    public double rumusRegulaFalsi(double newA, double newB) {
        return (((perhitunganY(newB, getJumlahPangkat()) * newA) - (perhitunganY(newA, getJumlahPangkat()) * newB)) / (perhitunganY(newB, getJumlahPangkat()) - perhitunganY(newA, getJumlahPangkat())));
    }
    
    @SuppressWarnings("unchecked")
    public ArrayList langkahRegulaFalsi(){
        ArrayList list = new ArrayList<>();
        int i = 0;
        do{
            Object[] alay = new Object[5];
            alay[0] = i+1;
            alay[1] = getA();
            alay[2] = getB();
            setC(rumusRegulaFalsi(getA(), getB()));
            alay[3] = getC();
            if (perhitunganY(getA(), getJumlahPangkat()) * perhitunganY(getC(), getJumlahPangkat()) < 0) { 
                setB(getC());
            } else {
                setA(getC());
            }
            alay[4] = getB() - getA();
            list.add(alay);
            i++;
        }while((i < getUlangMaks()) && (perhitunganY(getA(), getJumlahPangkat()) * perhitunganY(getB(), getJumlahPangkat()) != 0) && !(((getB()-getA()) <= getErTol()) && ((getB()-getA()) >= 0)));
        return list;
    }
}
