/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion5;

import java.awt.Color;
import parcialjavadiegoyoc.JFrmMenu;

/**
 *
 * @author ChocoChiwi
 */
public class JFrmSolucion5 extends javax.swing.JFrame {

    /**
     * Creates new form JFrmSolucion5
     */
    ProcesosSolucion5 objeto=new ProcesosSolucion5();
    public JFrmSolucion5() {
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

        jBtnRegresar = new javax.swing.JButton();
        jLblTexto = new javax.swing.JLabel();
        jTxtTexto = new javax.swing.JTextField();
        jLblEtiquetaResultado = new javax.swing.JLabel();
        jBtnOpcion1 = new javax.swing.JButton();
        jBtnOpcion2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jBtnOpcion3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLstEnunciado5 = new javax.swing.JList<>();
        jBtnOpcion4 = new javax.swing.JButton();
        jBtnOpcion5 = new javax.swing.JButton();
        jLblTitulo = new javax.swing.JLabel();
        jBtnOpcion6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLstResultado = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solución 5");
        setResizable(false);

        jBtnRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnRegresar.setText("Regresar al Menú");
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        jLblTexto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblTexto.setForeground(new java.awt.Color(255, 255, 255));
        jLblTexto.setText("Ingrese Texto a utilizar");

        jTxtTexto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTxtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtTextoActionPerformed(evt);
            }
        });
        jTxtTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtTextoKeyTyped(evt);
            }
        });

        jLblEtiquetaResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLblEtiquetaResultado.setForeground(new java.awt.Color(255, 255, 255));
        jLblEtiquetaResultado.setText("Resultado: ");

        jBtnOpcion1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion1.setText("Opción 1");
        jBtnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion1ActionPerformed(evt);
            }
        });

        jBtnOpcion2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion2.setText("Opción 2");
        jBtnOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion2ActionPerformed(evt);
            }
        });

        jBtnOpcion3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion3.setText("Opción 3");
        jBtnOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion3ActionPerformed(evt);
            }
        });

        jLstEnunciado5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Solicitar un texto:", "1) Mostrar de uno en uno los caracteres que forman dicho texto.", "2) Mostrar los caracteres de forma inversa", "3) Mostrar los caracteres de 2 en 2", "4) Mostrar los caracteres de 3 en 3", "5) Mostrar los caracteres en posición par", "6) Mostrar los caracteres en posición impar" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jLstEnunciado5);

        jBtnOpcion4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion4.setText("Opción 4");
        jBtnOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion4ActionPerformed(evt);
            }
        });

        jBtnOpcion5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion5.setText("Opción 5");
        jBtnOpcion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion5ActionPerformed(evt);
            }
        });

        jLblTitulo.setFont(new java.awt.Font("Cooper Black", 1, 24)); // NOI18N
        jLblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLblTitulo.setText("Solución 5");

        jBtnOpcion6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnOpcion6.setText("Opción 6");
        jBtnOpcion6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOpcion6ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jLstResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLblTexto)
                        .addGap(18, 18, 18)
                        .addComponent(jTxtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLblEtiquetaResultado)
                            .addComponent(jBtnOpcion4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnOpcion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtnOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jBtnOpcion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblTexto)
                    .addComponent(jTxtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOpcion1)
                    .addComponent(jBtnOpcion2)
                    .addComponent(jBtnOpcion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOpcion5)
                    .addComponent(jBtnOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnOpcion6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLblEtiquetaResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBtnRegresar)
                        .addGap(64, 64, 64)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        // TODO add your handling code here:
        JFrmMenu Menu = new JFrmMenu();
        Menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBtnRegresarActionPerformed

    private void jTxtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtTextoActionPerformed

    private void jTxtTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtTextoKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_jTxtTextoKeyTyped

    private void jBtnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion1ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
        objeto.setTexto(jTxtTexto.getText());
        jLstResultado.setModel(objeto.llenarLista1());
        }
    }//GEN-LAST:event_jBtnOpcion1ActionPerformed

    private void jBtnOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion2ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
        objeto.setTexto(jTxtTexto.getText());
        jLstResultado.setModel(objeto.llenarLista2());
        }
    }//GEN-LAST:event_jBtnOpcion2ActionPerformed

    private void jBtnOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion3ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
        objeto.setTexto(jTxtTexto.getText());
        jLstResultado.setModel(objeto.llenarLista3());
        }
    }//GEN-LAST:event_jBtnOpcion3ActionPerformed

    private void jBtnOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion4ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
        objeto.setTexto(jTxtTexto.getText());
        jLstResultado.setModel(objeto.llenarLista4());
        }
    }//GEN-LAST:event_jBtnOpcion4ActionPerformed

    private void jBtnOpcion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion5ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
        objeto.setTexto(jTxtTexto.getText());
        jLstResultado.setModel(objeto.llenarLista5());
        }
        
    }//GEN-LAST:event_jBtnOpcion5ActionPerformed

    private void jBtnOpcion6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOpcion6ActionPerformed
        // TODO add your handling code here:
        if (jTxtTexto.getText().isEmpty()) {

            jLstResultado.setModel(objeto.vacio());
        }
        else{
        objeto.setTexto(jTxtTexto.getText());
        jLstResultado.setModel(objeto.llenarLista6());
        }
    }//GEN-LAST:event_jBtnOpcion6ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmSolucion5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmSolucion5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmSolucion5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmSolucion5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmSolucion5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnOpcion1;
    private javax.swing.JButton jBtnOpcion2;
    private javax.swing.JButton jBtnOpcion3;
    private javax.swing.JButton jBtnOpcion4;
    private javax.swing.JButton jBtnOpcion5;
    private javax.swing.JButton jBtnOpcion6;
    private javax.swing.JButton jBtnRegresar;
    private javax.swing.JLabel jLblEtiquetaResultado;
    private javax.swing.JLabel jLblTexto;
    private javax.swing.JLabel jLblTitulo;
    private javax.swing.JList<String> jLstEnunciado5;
    private javax.swing.JList<String> jLstResultado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtTexto;
    // End of variables declaration//GEN-END:variables
}
