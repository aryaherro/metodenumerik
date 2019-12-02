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
public class MetodeTitikTetap extends MetodeNumerik{
    
    public MetodeTitikTetap(int jumlahPangkat, int ulangMaks, double erTol) {
        super(jumlahPangkat, ulangMaks, erTol);
    }
    
    public double rumusTitikTetap(double newX) {
        double hasil = 0;
        for (int i = getJumlahPangkat(); i > 0; i--) {
            hasil += getKonstanta(i) * Math.pow(newX, i-1);
        }
        return ((-1 * getKonstanta(0)) / hasil);
    }
    
    @SuppressWarnings("unchecked")
    public ArrayList langkahTitikTetap(){
        ArrayList list = new ArrayList<>();
        int i = 0;
        do{
            Object[] alay = new Object[5];
            alay[0] = i+1;
            setA(getB());
            setB(rumusTitikTetap(getA()));
            alay[1] = getA();
            alay[2] = getB();
            setNilaiY(perhitunganY(getA(), getJumlahPangkat()));
            alay[3] = getNilaiY();
            alay[4] = getB() - getA();
            list.add(alay);
            i++;
        }while((i < getUlangMaks()) && (perhitunganY(getB(), getJumlahPangkat())!= 0) && !(((getB()-getA()) <= getErTol()) && ((getB()-getA()) >= 0)) && (getA() != getB()));
        return list;
    }
}
