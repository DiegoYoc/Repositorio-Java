/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion1;


import ht1javadiegoyoc.JfrmMenu;
import java.awt.Color;

/**
 *
 * @author ChocoChiwi
 */
public class JfrmSolucion1 extends javax.swing.JFrame {

    /**
     * Creates new form JfrmSolucion1
     */
    
    FuncionesExtraer funciones=new FuncionesExtraer();
    public JfrmSolucion1() {
        initComponents();
        this.getContentPane().setBackground(Color.yellow);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblTitulo = new javax.swing.JLabel();
        jLblTexto = new javax.swing.JLabel();
        jTxtPalabra = new javax.swing.JTextField();
        jBtnPrimer = new javax.swing.JButton();
        jBtnTercer = new javax.swing.JButton();
        jBtnUltimo = new javax.swing.JButton();
        jBtnContar = new javax.swing.JButton();
        jLblEtiquetaResultado = new javax.swing.JLabel();
        jLblResultado1 = new javax.swing.JLabel();
        jBtnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblTitulo.setText("Solución 1");

        jLblTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLblTexto.setText("Ingrese el texto que desee:");

        jTxtPalabra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jBtnPrimer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnPrimer.setText("Primer Carácter");
        jBtnPrimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPrimerActionPerformed(evt);
            }
        });

        jBtnTercer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnTercer.setText("Tercer Carácter");
        jBtnTercer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTercerActionPerformed(evt);
            }
        });

        jBtnUltimo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnUltimo.setText("Último Carácter");
        jBtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUltimoActionPerformed(evt);
            }
        });

        jBtnContar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnContar.setText("Cantidad Caracteres");
        jBtnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnContarActionPerformed(evt);
            }
        });

        jLblEtiquetaResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblEtiquetaResultado.setText("Resultado: ");

        jLblResultado1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblResultado1.setText(" ");

        jBtnRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtnRegresar.setText("Regresar a Menú Principal");
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLblEtiquetaResultado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLblTexto)
                                .addComponent(jTxtPalabra)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBtnContar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jBtnPrimer, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBtnTercer, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jBtnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPrimer)
                    .addComponent(jBtnTercer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnUltimo)
                    .addComponent(jBtnContar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jBtnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblEtiquetaResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblResultado1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnPrimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrimerActionPerformed
        // TODO add your handling code here:
        if (jTxtPalabra.getText().isEmpty()) {

            jLblResultado1.setText(funciones.vacio());
        }
        else{
        funciones.asignarTexto(jTxtPalabra.getText());
        jLblResultado1.setText(funciones.PrimerC());
        
            
        }
        
       
    }//GEN-LAST:event_jBtnPrimerActionPerformed

    private void jBtnTercerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTercerActionPerformed
        // TODO add your handling code here:
        if (jTxtPalabra.getText().isEmpty()) {

            jLblResultado1.setText(funciones.vacio());
        }
        else{
        funciones.asignarTexto(jTxtPalabra.getText());
        jLblResultado1.setText(funciones.TercerC());
        
            
        }
      
    }//GEN-LAST:event_jBtnTercerActionPerformed

    private void jBtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUltimoActionPerformed
        // TODO add your handling code here:
        if (jTxtPalabra.getText().isEmpty()) {

            jLblResultado1.setText(funciones.vacio());
        }
        else{
       funciones.asignarTexto(jTxtPalabra.getText());
       jLblResultado1.setText(funciones.UltimoC());
            
        }
    }//GEN-LAST:event_jBtnUltimoActionPerformed

    private void jBtnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnContarActionPerformed
            // Crear un objeto o instanciar la clase Funciones Cadenas
            if (jTxtPalabra.getText().isEmpty()) {

            jLblResultado1.setText(funciones.vacio());
        }
        else{
        funciones.asignarTexto(jTxtPalabra.getText());
        jLblResultado1.setText(funciones.CantCaracteres());
            
        }
    }//GEN-LAST:event_jBtnContarActionPerformed

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        // TODO add your handling code here:
        JfrmMenu FrmMenu = new JfrmMenu();
    FrmMenu.setVisible(true);
    this.setVisible(false);
    
     
    }//GEN-LAST:event_jBtnRegresarActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfrmSolucion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmSolucion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmSolucion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmSolucion1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmSolucion1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnContar;
    private javax.swing.JButton jBtnPrimer;
    private javax.swing.JButton jBtnRegresar;
    private javax.swing.JButton jBtnTercer;
    private javax.swing.JButton jBtnUltimo;
    private javax.swing.JLabel jLblEtiquetaResultado;
    private javax.swing.JLabel jLblResultado1;
    private javax.swing.JLabel jLblTexto;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JTextField jTxtPalabra;
    // End of variables declaration//GEN-END:variables
}