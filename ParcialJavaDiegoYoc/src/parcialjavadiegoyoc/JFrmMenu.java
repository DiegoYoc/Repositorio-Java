/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialjavadiegoyoc;

import java.awt.Color;
import solucion1.JFrmSolucion1;
import solucion2.JFrmSolucion2;
import solucion3.JFrmSolucion3;
import solucion4.JFrmSolucion4;
import solucion5.JFrmSolucion5;
import solucion6.JFrmSolucion6;
import solucion7.JFrmSolucion7;
import solucion8.JFrmSolucion8;

/**
 *
 * @author ChocoChiwi
 */
public class JFrmMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFrmMenu
     */
    public JFrmMenu() {
        initComponents();
        this.getContentPane().setBackground(Color.black);
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

        jLabel1 = new javax.swing.JLabel();
        jLblTitulo = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jLblCarnet = new javax.swing.JLabel();
        jLblOpciones = new javax.swing.JLabel();
        jBtnSolucion1 = new javax.swing.JButton();
        jBtnSolucion2 = new javax.swing.JButton();
        jBtnSolucion3 = new javax.swing.JButton();
        jBtnSolucion4 = new javax.swing.JButton();
        jBtnSolucion5 = new javax.swing.JButton();
        jBtnSolucion6 = new javax.swing.JButton();
        jBtnSolucion7 = new javax.swing.JButton();
        jBtnSolucion8 = new javax.swing.JButton();
        jLblCurso = new javax.swing.JLabel();
        jBtnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Parcial");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/programacion.png"))); // NOI18N

        jLblTitulo.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
        jLblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLblTitulo.setText("Parcial 1");

        jLblNombre.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLblNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLblNombre.setText("Diego Josué Moises Yoc Chajón");

        jLblCarnet.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLblCarnet.setForeground(new java.awt.Color(255, 255, 255));
        jLblCarnet.setText("Carné 201401037");

        jLblOpciones.setFont(new java.awt.Font("Cooper Black", 3, 17)); // NOI18N
        jLblOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jLblOpciones.setText("Elija la opción de su preferencia ");

        jBtnSolucion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSolucion1.setText("Solución 1");
        jBtnSolucion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSolucion1ActionPerformed(evt);
            }
        });

        jBtnSolucion2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSolucion2.setText("Solución 2");
        jBtnSolucion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSolucion2ActionPerformed(evt);
            }
        });

        jBtnSolucion3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSolucion3.setText("Solución 3");
        jBtnSolucion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSolucion3ActionPerformed(evt);
            }
        });

        jBtnSolucion4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSolucion4.setText("Solución 4");
        jBtnSolucion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSolucion4ActionPerformed(evt);
            }
        });

        jBtnSolucion5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSolucion5.setText("Solución 5");
        jBtnSolucion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSolucion5ActionPerformed(evt);
            }
        });

        jBtnSolucion6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSolucion6.setText("Solución 6");
        jBtnSolucion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSolucion6ActionPerformed(evt);
            }
        });

        jBtnSolucion7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSolucion7.setText("Solución 7");
        jBtnSolucion7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSolucion7ActionPerformed(evt);
            }
        });

        jBtnSolucion8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSolucion8.setText("Solución 8");
        jBtnSolucion8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSolucion8ActionPerformed(evt);
            }
        });

        jLblCurso.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLblCurso.setForeground(new java.awt.Color(255, 255, 255));
        jLblCurso.setText("Programación de Aplicaciones Moviles");

        jBtnSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblCurso)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLblTitulo)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnSolucion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSolucion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSolucion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSolucion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSolucion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSolucion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnSolucion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLblOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnSolucion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLblNombre)))
                                .addGap(0, 4, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLblCarnet)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLblCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLblCarnet)
                        .addGap(18, 18, 18)
                        .addComponent(jLblOpciones)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnSolucion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSolucion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSolucion3)
                        .addGap(4, 4, 4)
                        .addComponent(jBtnSolucion4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSolucion5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSolucion6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnSolucion7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSolucion8)
                    .addComponent(jBtnSalir))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnSolucion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSolucion1ActionPerformed
        // TODO add your handling code here:
        JFrmSolucion1 Sol1 = new JFrmSolucion1();
        Sol1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnSolucion1ActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnSolucion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSolucion2ActionPerformed
        // TODO add your handling code here:
        JFrmSolucion2 Sol2 = new JFrmSolucion2();
        Sol2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnSolucion2ActionPerformed

    private void jBtnSolucion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSolucion3ActionPerformed
        // TODO add your handling code here:
        JFrmSolucion3 Sol3 = new JFrmSolucion3();
        Sol3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnSolucion3ActionPerformed

    private void jBtnSolucion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSolucion4ActionPerformed
        // TODO add your handling code here:
        JFrmSolucion4 Sol4 = new JFrmSolucion4();
        Sol4.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnSolucion4ActionPerformed

    private void jBtnSolucion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSolucion5ActionPerformed
        // TODO add your handling code here:
        JFrmSolucion5 Sol5 = new JFrmSolucion5();
        Sol5.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnSolucion5ActionPerformed

    private void jBtnSolucion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSolucion6ActionPerformed
        // TODO add your handling code here:
        JFrmSolucion6 Sol6 = new JFrmSolucion6();
        Sol6.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnSolucion6ActionPerformed

    private void jBtnSolucion7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSolucion7ActionPerformed
        // TODO add your handling code here:
        JFrmSolucion7 Sol7 = new JFrmSolucion7();
        Sol7.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnSolucion7ActionPerformed

    private void jBtnSolucion8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSolucion8ActionPerformed
        // TODO add your handling code here:
        JFrmSolucion8 Sol8 = new JFrmSolucion8();
        Sol8.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnSolucion8ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jBtnSolucion1;
    private javax.swing.JButton jBtnSolucion2;
    private javax.swing.JButton jBtnSolucion3;
    private javax.swing.JButton jBtnSolucion4;
    private javax.swing.JButton jBtnSolucion5;
    private javax.swing.JButton jBtnSolucion6;
    private javax.swing.JButton jBtnSolucion7;
    private javax.swing.JButton jBtnSolucion8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLblCarnet;
    private javax.swing.JLabel jLblCurso;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblOpciones;
    private javax.swing.JLabel jLblTitulo;
    // End of variables declaration//GEN-END:variables
}
