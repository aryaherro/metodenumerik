/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import MetodeNumerik.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ajeng
 */
public class GuiSecant extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    /**
     * Creates new form Tampilan
     */
    public GuiSecant() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        pangkatMaks = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        iterasiMaks = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        toleransiError = new javax.swing.JFormattedTextField();
        hitung = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Rumus = new javax.swing.JTextArea();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metode Secant");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Masukkan pangkat maksimum : ");

        pangkatMaks.setText("Integer");
        pangkatMaks.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                pangkatMaksCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        pangkatMaks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pangkatMaksActionPerformed(evt);
            }
        });
        pangkatMaks.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                pangkatMaksPropertyChange(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "iterasi", "a", "b", "c", "error"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 0));
        jTable1.setMinimumSize(new java.awt.Dimension(30, 0));
        jTable1.setPreferredSize(new java.awt.Dimension(150, 0));
        jTable1.setRowHeight(20);
        jScrollPane2.setViewportView(jTable1);

        jLabel3.setText("Masukkan iterasi maksimum : ");

        iterasiMaks.setText("Integer");
        iterasiMaks.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                iterasiMaksCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        iterasiMaks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iterasiMaksActionPerformed(evt);
            }
        });
        iterasiMaks.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                iterasiMaksPropertyChange(evt);
            }
        });

        jLabel4.setText("Masukkan toleransi error : ");

        toleransiError.setText("Double");
        toleransiError.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                toleransiErrorCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        toleransiError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toleransiErrorActionPerformed(evt);
            }
        });
        toleransiError.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                toleransiErrorPropertyChange(evt);
            }
        });

        hitung.setText("hitung");
        hitung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hitungMouseClicked(evt);
            }
        });
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        Rumus.setColumns(20);
        Rumus.setRows(5);
        jScrollPane3.setViewportView(Rumus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pangkatMaks, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(toleransiError)
                            .addComponent(iterasiMaks, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(hitung)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(pangkatMaks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(iterasiMaks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(toleransiError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(hitung)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextArea getRumus() {
        return Rumus;
    }

    public void setRumus(JTextArea Rumus) {
        this.Rumus = Rumus;
    }

    public JButton getHitung() {
        return hitung;
    }

    public void setHitung(JButton hitung) {
        this.hitung = hitung;
    }

    public JFormattedTextField getIterasiMaks() {
        return iterasiMaks;
    }

    public void setIterasiMaks(JFormattedTextField iterasiMaks) {
        this.iterasiMaks = iterasiMaks;
    }

    public JEditorPane getjEditorPane1() {
        return jEditorPane1;
    }

    public void setjEditorPane1(JEditorPane jEditorPane1) {
        this.jEditorPane1 = jEditorPane1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JFormattedTextField getPangkatMaks() {
        return pangkatMaks;
    }

    public void setPangkatMaks(JFormattedTextField pangkatMaks) {
        this.pangkatMaks = pangkatMaks;
    }

    public JFormattedTextField getToleransiError() {
        return toleransiError;
    }

    public void setToleransiError(JFormattedTextField toleransiError) {
        this.toleransiError = toleransiError;
    }

    private void pangkatMaksPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_pangkatMaksPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_pangkatMaksPropertyChange

    private void pangkatMaksCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_pangkatMaksCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pangkatMaksCaretPositionChanged

    private void pangkatMaksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pangkatMaksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pangkatMaksActionPerformed

    private void iterasiMaksCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_iterasiMaksCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_iterasiMaksCaretPositionChanged

    private void iterasiMaksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iterasiMaksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iterasiMaksActionPerformed

    private void iterasiMaksPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_iterasiMaksPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_iterasiMaksPropertyChange

    private void toleransiErrorCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_toleransiErrorCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_toleransiErrorCaretPositionChanged

    private void toleransiErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toleransiErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toleransiErrorActionPerformed

    private void toleransiErrorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_toleransiErrorPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_toleransiErrorPropertyChange

    private void hitungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hitungMouseClicked
                // TODO add your handling code here:
        
    }//GEN-LAST:event_hitungMouseClicked

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        // TODO add your handling code here:
        MetodeSecant MS = new MetodeSecant(Integer.parseInt(pangkatMaks.getText()), Integer.parseInt(iterasiMaks.getText()), Double.parseDouble(toleransiError.getText()));
        MS.inputRumus();
        Rumus.setText(MS.cetakRumus(MS.getJumlahPangkat()));
        MS.inputAcakAB(JOptionPane.showInputDialog(null, "Ingin Menginput manual nilai x" + MS.superscript(1) + " dan nilai x" + MS.superscript(2) + " (y/n): "));
        
        DefaultTableModel modelTable = (DefaultTableModel) jTable1.getModel();
        Object[] atributBaris;
        try {
            var baris = MS.langkahSecant(); //harus dikasih try catch
            var listBaris = baris.iterator();
            while(listBaris.hasNext()){
                atributBaris = (Object[]) listBaris.next();
                modelTable.addRow(atributBaris);
            }
            jTable1.setModel(modelTable);
        } catch (Exception ex) {
            Logger.getLogger(GuiSecant.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hitungActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSecant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GuiSecant().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Rumus;
    private javax.swing.JButton hitung;
    private javax.swing.JFormattedTextField iterasiMaks;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField pangkatMaks;
    private javax.swing.JFormattedTextField toleransiError;
    // End of variables declaration//GEN-END:variables
}