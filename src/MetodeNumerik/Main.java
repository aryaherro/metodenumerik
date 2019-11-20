/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeNumerik;

import java.util.Arrays;

/**
 *
 * @author Ajeng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // TODO code application logic here
        Tampilan tamp = new Tampilan();
        java.awt.EventQueue.invokeLater(() -> {
            new Tampilan().setVisible(true);
        });
        //if (tamp.getHitung().getActionListeners().toString()) {
            
        //}
        System.out.println(tamp.getHitung().getActionMap());
        //MetodeSecant MS = new MetodeSecant(Integer.parseInt(tamp.getPangkatMaks().getText()), Integer.parseInt(tamp.getIterasiMaks().getText()), Double.parseDouble(tamp.getToleransiError().getText()));
        
    }
    
}
