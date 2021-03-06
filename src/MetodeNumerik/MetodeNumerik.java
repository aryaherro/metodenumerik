/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeNumerik;

import javax.swing.JOptionPane;

/**
 *
 * @author Ajeng
 */
public class MetodeNumerik{
    private final double[] konstanta;
    private int jumlahPangkat, ulangMaks, nilaiI;
    private double a, b, c, erTol, nilaiY;
    private double total = 0;    

    public MetodeNumerik(int jumlahPangkat, int ulangMaks, double erTol) {
        setJumlahPangkat(jumlahPangkat);
        setUlangMaks(ulangMaks);
        setErTol(erTol);
        this.konstanta = new double[jumlahPangkat+1];
    }

    public int getNilaiI() {
        return nilaiI;
    }

    public void setNilaiI(int nilaiI) {
        this.nilaiI = nilaiI;
    }
    
    public double getKonstanta(int i) {
        return konstanta[i];
    }

    public void setKonstanta(double konstanta, int i) {
        this.konstanta[i] = konstanta;
    }

    public double fungsiPangkat(double newKonstanta, double newX, int newPangkat)
    {
        return (newKonstanta * (Math.pow(newX, newPangkat)));
    }
    
    public double perhitunganY(double newX, int newPangkat)
    {
        if (newPangkat == 0) {
            return getKonstanta(0);
        } else {
            return (fungsiPangkat(getKonstanta(newPangkat), newX, newPangkat) + perhitunganY(newX, newPangkat-1));
        }
    }
    
    public int acak(int a, int b){
        return (int)(Math.random()*(b - a + 1)) + a;
    }
    
    public double pengecekan(double newA, double newB) {
        return ((perhitunganY(newA, getJumlahPangkat())) * (perhitunganY(newB, getJumlahPangkat())));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public int getJumlahPangkat() {
        return jumlahPangkat;
    }

    public void setJumlahPangkat(int jumlahPangkat) {
        if (jumlahPangkat < 1) {
            this.jumlahPangkat = 1;
            JOptionPane.showMessageDialog(null, "Jumlah Pangkat minimal 1");
        }
        else {
            this.jumlahPangkat = jumlahPangkat;
        }
    }
    
    public int getUlangMaks() {
        return ulangMaks;
    }

    public void setUlangMaks(int ulangMaks) {
        if (ulangMaks <= 0) {
            this.ulangMaks = 99999;
            JOptionPane.showMessageDialog(null, "Jumlah perulangan minimal 1, diberikan nilai maksimum 99999");
        }
        else {
            this.ulangMaks = ulangMaks;
        }
    }

    public double getErTol() {
        return erTol;
    }

    public void setErTol(double erTol) {
        if (erTol < 0) {
            this.erTol = 0;
            JOptionPane.showMessageDialog(null, "Jumlah error toleransi minimal 0");
        }
        else {
            this.erTol = erTol;
        }
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public double getNilaiY() {
        return nilaiY;
    }

    public void setNilaiY(double nilaiY) {
        this.nilaiY = nilaiY;
    }
    
    public String superscript(int pangkat) {
        if (pangkat < 10) {
            switch(pangkat){
                case 0 :
                    return "⁰";                
                case 1 :
                    return "¹";
                case 2 :
                    return "²";
                case 3 :
                    return "³";
                case 4 :
                    return "⁴";
                case 5 :
                    return "⁵";
                case 6 :
                    return "⁶";
                case 7 :
                    return "⁷";
                case 8 :
                    return "⁸";
                case 9 :
                    return "⁹";
            }
        }
        else {
            String hurufAngka = "" + pangkat;
            return superscript(Integer.parseInt(hurufAngka.substring(0, hurufAngka.length()-1))) + superscript(Integer.parseInt(""+hurufAngka.charAt(hurufAngka.length()-1)));
        }
        return null;
    }
    
    public String subscript(int bawah) {
        if (bawah < 10) {
            switch(bawah){
                case 0 :
                    return "₀";                
                case 1 :
                    return "₁";
                case 2 :
                    return "₂";
                case 3 :
                    return "₃";
                case 4 :
                    return "₄";
                case 5 :
                    return "₅";
                case 6 :
                    return "₆";
                case 7 :
                    return "₇";
                case 8 :
                    return "₈";
                case 9 :
                    return "₉";
            }
        }
        else {
            String hurufAngka = "" + bawah;
            return subscript(Integer.parseInt(hurufAngka.substring(0, hurufAngka.length()-1))) + subscript(Integer.parseInt(""+hurufAngka.charAt(hurufAngka.length()-1)));
        }
        return null;
    }
    
    public void inputRumus(){
        for (int i = getJumlahPangkat() ; i >= 0; i--) {
            setKonstanta(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan nilai " + ((i != 0)?("Konstanta untuk x" + superscript(i)) : "Masukkan nilai C") + " (bisa desimal) : ", ((i != 0)?("x" + superscript(i)) : "C"), 1)),i);
        }
    }
    
    public String cetakRumus(int i){
        if (i == 0)
            return ((getKonstanta(i) == 0)? "" : "" + ((getKonstanta(i) < 0)? " - " + (-1*getKonstanta(i)): " + " + getKonstanta(i)));
        else{
            if (getKonstanta(i) == 0){
                return "" + cetakRumus(i-1);
            }
            else{
                if ((getKonstanta(i) == 1) || (getKonstanta(i) == -1))
                    return "" + ((getKonstanta(i) < 0)? " - " + (-1*getKonstanta(i)) : ((i == getJumlahPangkat())? "" : " + ") + "x" + superscript(i) + cetakRumus(i-1));
                else
                    return "" + ((getKonstanta(i) < 0)? " - " + (-1*getKonstanta(i)): ((i == getJumlahPangkat())? "" : " + ") + getKonstanta(i)) + "x" + superscript(i) + cetakRumus(i-1);
            }
        }
    }
    
    public void inputAcakAB(String input){
        if ((input.charAt(0) == 'y') || (input.charAt(0) == 'Y')) {
            setA(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan nilai x" + subscript(1) + " : ", ("x" + subscript(1)), 1)));
            do
            {
                setB(Double.parseDouble(JOptionPane.showInputDialog(null, ((getA() != getB())? "" : "Nilai x" + subscript(1) + " dan Nilai x" + subscript(2) + " tidak boleh sama, ") + "Masukkan nilai x" + subscript(2) + " : ", ("x" + subscript(2)), (getA() != getB()?1:2))));
            }while(getA() == getB());
        }
        else{
            setA(acak(-10, 10));
            do
            {
                setB(acak(-10, 10));
            }while(getA() == getB());
        }
    }
    
    public void inputAcakA(String input){
        if ((input.charAt(0) == 'y') || (input.charAt(0) == 'Y')) {
            setA(Double.parseDouble(JOptionPane.showInputDialog(null, "Masukkan nilai x : ", ("x"), 1)));
            setB(getA());
        }
        else{
            setA(acak(-10, 10));
            setB(getA());
        }
    }
}
