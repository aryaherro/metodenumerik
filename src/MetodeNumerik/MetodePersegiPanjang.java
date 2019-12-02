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
public class MetodePersegiPanjang extends MetodeNumerik{
    private double h;
    public MetodePersegiPanjang(int jumlahPangkat, int ulangMaks, double erTol) {
        super(jumlahPangkat, ulangMaks, erTol);
    }
    
    public double rumusPersegiPanjang(double x, double y){
        return x*y;
    }
    
    public ArrayList langkahPersegiPanjang(){
        double luas;
        ArrayList list = new ArrayList<>();
        
        if (getA() > getB()){
            double temp = getA();
            setA(getB());
            setB(temp);
        }
        
        setH((getB() - getA()) / getUlangMaks());
        if (getH() < 0) {
            setH(getH() * -1);
        }
        try {
            int i = 0;
            do{
                Object[] alay = new Object[5];
                setC(getA() + getH());

                alay[0] = i+1;
                alay[1] = getA();
                alay[2] = getC();
                setNilaiY(perhitunganY(getC(), getJumlahPangkat()));
                alay[3] = getNilaiY();
                luas = rumusPersegiPanjang(getNilaiY() , getH());
                alay[4] = luas;
                list.add(alay);
                setTotal(getTotal() + luas);
                setA(getC());
                i++;
            }while( i < getUlangMaks());
        }
        catch (Exception e){
            
        }
        return list;
    }

    /**
     * @return the h
     */
    public double getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(double h) {
        this.h = h;
    }
}
