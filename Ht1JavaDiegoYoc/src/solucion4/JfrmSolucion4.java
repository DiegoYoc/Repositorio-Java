/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion4;

import ht1javadiegoyoc.JfrmMenu;
import java.awt.Color;

/**
 *
 * @author ChocoChiwi
 */
public class JfrmSolucion4 extends javax.swing.JFrame {

    /**
     * Creates new form JfrmSolucion4
     */
    FuncionesCaracteres objeto=new FuncionesCaracteres();
    public JfrmSolucion4() {
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

        jLblTexto = new javax.swing.JLabel();
        jTxtTexto2 = new javax.swing.JTextField();
        jLblTitulo = new javax.swing.JLabel();
        jBtnOpcion1 = new javax.swing.JButton();
        jBtnOpcion2 = new javax.swing.JButton();
        jBtnOpcion3 = new javax.swing.JButton();
        jBtnOpcion4 = new javax.swing.JButton();
        jLblEtiquetaResultado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstResultado = new javax.swing.JList<>();
        jBtnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLblTexto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblTexto.setText("Ingrese Texto a utilizar");

        jTxtTexto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtTexto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTexto2ActionPerformed(evt);
            }
        });
        jTxtTexto2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtTexto2KeyTyped(evt);
            }
        });

        jLblTitulo.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLblTitulo.setText("Solución 4");

        jBtnOpcion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion1.setText("uno en uno");
        jBtnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion1ActionPerformed(evt);
            }
        });

        jBtnOpcion2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion2.setText("inverso");
        jBtnOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion2ActionPerformed(evt);
            }
        });

        jBtnOpcion3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion3.setText("dos en dos");
        jBtnOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion3ActionPerformed(evt);
            }
        });

        jBtnOpcion4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion4.setText("tres en tres");
        jBtnOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion4ActionPerformed(evt);
            }
        });

        jLblEtiquetaResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblEtiquetaResultado.setText("Resultado: ");

        jScrollPane2.setViewportView(jLstResultado);

        jBtnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnRegresar.setText("Regresar al Menú");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblTexto)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblEtiquetaResultado)
                            .addComponent(jBtnOpcion4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTexto)
                    .addComponent(jTxtTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOpcion1)
                    .addComponent(jBtnOpcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnOpcion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblEtiquetaResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnRegresar)
                        .addGap(64, 64, 64)))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtTexto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTexto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTexto2ActionPerformed

    private void jTxtTexto2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTexto2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTexto2KeyTyped

    private void jBtnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion1ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto2.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
            objeto.setTexto(jTxtTexto2.getText());
            jLstResultado.setModel(objeto.llenarLista1());
        }
    }//GEN-LAST:event_jBtnOpcion1ActionPerformed

    private void jBtnOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion2ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto2.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
            objeto.setTexto(jTxtTexto2.getText());
            jLstResultado.setModel(objeto.llenarLista2());
        }
    }//GEN-LAST:event_jBtnOpcion2ActionPerformed

    private void jBtnOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion3ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto2.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
            objeto.setTexto(jTxtTexto2.getText());
            jLstResultado.setModel(objeto.llenarLista3());
        }
    }//GEN-LAST:event_jBtnOpcion3ActionPerformed

    private void jBtnOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion4ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto2.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
            objeto.setTexto(jTxtTexto2.getText());
            jLstResultado.setModel(objeto.llenarLista4());
        }
    }//GEN-LAST:event_jBtnOpcion4ActionPerformed

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        // TODO add your handling code here:
        JfrmMenu Menu = new JfrmMenu();
        Menu.setVisible(true);
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
            java.util.logging.Logger.getLogger(JfrmSolucion4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmSolucion4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmSolucion4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmSolucion4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmSolucion4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnOpcion1;
    private javax.swing.JButton jBtnOpcion2;
    private javax.swing.JButton jBtnOpcion3;
    private javax.swing.JButton jBtnOpcion4;
    private javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLblEtiquetaResultado;
    private javax.swing.JLabel jLblTexto;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JList<String> jLstResultado;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTxtTexto;
    private javax.swing.JTextField jTxtTexto1;
    private javax.swing.JTextField jTxtTexto2;
    // End of variables declaration//GEN-END:variables
}
