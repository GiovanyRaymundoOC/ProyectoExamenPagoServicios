/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Controlador.ControlServicio;
import Modelo.Servicio;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author joseo
 */
public class InternalServicios extends javax.swing.JInternalFrame {

    public InternalServicios() {
        initComponents();
        this.setSize(new Dimension(400, 250));
        this.setTitle("Nuevo Servicio");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreS = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nuevo Servicio");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre Servicio: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 106, -1, -1));

        txtNombreS.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreS.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        txtNombreS.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreS.setBorder(null);
        txtNombreS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSActionPerformed(evt);
            }
        });
        txtNombreS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreSKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreSKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 198, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 200, 10));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("GUARDAR");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 70, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimalist-Background_Wallpaper-for-PC (1).png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 230));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Servicio s = new Servicio();
        ControlServicio Cs = new ControlServicio();

        s.setNombre(txtNombreS.getText().trim());

        if (txtNombreS.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los datos");
        } else {
            if (!Cs.ExisteSer(txtNombreS.getText().trim())) {
                s.setNombre(txtNombreS.getText().trim());
                if (Cs.Guardar(s)) {
                    JOptionPane.showMessageDialog(null, "Servicio Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Categoria Existente");
            }

        }

        txtNombreS.setText("");
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtNombreSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSKeyTyped

    private void txtNombreSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            Servicio s = new Servicio();
        ControlServicio Cs = new ControlServicio();

        s.setNombre(txtNombreS.getText().trim());

        if (txtNombreS.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete los datos");
        } else {
            if (!Cs.ExisteSer(txtNombreS.getText().trim())) {
                s.setNombre(txtNombreS.getText().trim());
                if (Cs.Guardar(s)) {
                    JOptionPane.showMessageDialog(null, "Servicio Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Categoria Existente");
            }

        }

        txtNombreS.setText("");
        }
    }//GEN-LAST:event_txtNombreSKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtNombreS;
    // End of variables declaration//GEN-END:variables
}
