/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author joseo
 */
public class VistaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form VistaAdmin
     */
    public static JDesktopPane JDP_Menu;
    
    public VistaAdmin() {
        initComponents();
        this.setSize(new Dimension(800,500));
        this.setLocationRelativeTo(null);
        this.setTitle("Administración del Sistema");
        
        this.setLayout(null);
        JDP_Menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        VistaAdmin.JDP_Menu.setBounds(0, 0, 800, 500-90);
        this.add(JDP_Menu);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        RegistrarUser = new javax.swing.JMenuItem();
        ModificarUser = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        AgregarServ = new javax.swing.JMenuItem();
        GestionarServ = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MostrarPagos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        AgregarAdmin = new javax.swing.JMenuItem();
        GestionarAdmin = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(150, 50));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMenu1.setText("Usuarios");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 50));

        RegistrarUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        RegistrarUser.setText("Registrar Usuario");
        RegistrarUser.setPreferredSize(new java.awt.Dimension(180, 30));
        RegistrarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarUserActionPerformed(evt);
            }
        });
        jMenu1.add(RegistrarUser);

        ModificarUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ModificarUser.setText("Gestionar Usuarios");
        ModificarUser.setPreferredSize(new java.awt.Dimension(180, 30));
        ModificarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarUserActionPerformed(evt);
            }
        });
        jMenu1.add(ModificarUser);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Servicios");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        AgregarServ.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        AgregarServ.setText("Agregar Servicio");
        AgregarServ.setPreferredSize(new java.awt.Dimension(180, 30));
        AgregarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarServActionPerformed(evt);
            }
        });
        jMenu2.add(AgregarServ);

        GestionarServ.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        GestionarServ.setText("Gestionar Servicios");
        GestionarServ.setPreferredSize(new java.awt.Dimension(180, 30));
        GestionarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarServActionPerformed(evt);
            }
        });
        jMenu2.add(GestionarServ);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Pagos");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jMenu3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 50));

        MostrarPagos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        MostrarPagos.setText("Mostrar Pagos");
        MostrarPagos.setPreferredSize(new java.awt.Dimension(180, 30));
        MostrarPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPagosActionPerformed(evt);
            }
        });
        jMenu3.add(MostrarPagos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Administradores");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jMenu4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 50));

        AgregarAdmin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        AgregarAdmin.setText("Agregar Administrador ");
        AgregarAdmin.setPreferredSize(new java.awt.Dimension(180, 30));
        AgregarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAdminActionPerformed(evt);
            }
        });
        jMenu4.add(AgregarAdmin);

        GestionarAdmin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        GestionarAdmin.setText("Gestionar Administradores");
        GestionarAdmin.setPreferredSize(new java.awt.Dimension(180, 30));
        GestionarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarAdminActionPerformed(evt);
            }
        });
        jMenu4.add(GestionarAdmin);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jMenu5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jMenu5.setInheritsPopupMenu(true);
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 50));

        Salir.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.setPreferredSize(new java.awt.Dimension(180, 30));
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu5.add(Salir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarServActionPerformed
        // TODO add your handling code here:
        InternalServicios Is = new InternalServicios();
        JDP_Menu.add(Is);
        Is.setVisible(true);
    }//GEN-LAST:event_AgregarServActionPerformed

    private void GestionarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarServActionPerformed
        // TODO add your handling code here:
        InternalGestionarServ Igs = new InternalGestionarServ();
        JDP_Menu.add(Igs);
        Igs.setVisible(true);
    }//GEN-LAST:event_GestionarServActionPerformed

    private void RegistrarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarUserActionPerformed
        // TODO add your handling code here:
        InternalRegistroUser IrU = new InternalRegistroUser();
        JDP_Menu.add(IrU);
        IrU.setVisible(true);
    }//GEN-LAST:event_RegistrarUserActionPerformed

    private void ModificarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarUserActionPerformed
        // TODO add your handling code here:
        InternalGestionarUser IgU = new InternalGestionarUser();
        JDP_Menu.add(IgU);
        IgU.setVisible(true);
    }//GEN-LAST:event_ModificarUserActionPerformed

    private void GestionarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarAdminActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            InternalValidarAdmin v = new InternalValidarAdmin();
            JDP_Menu.add(v);
            v.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(VistaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_GestionarAdminActionPerformed

    private void AgregarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAdminActionPerformed
        try {
            // TODO add your handling code here:
            InternalValidarAdmin2 v = new InternalValidarAdmin2();
            JDP_Menu.add(v);
            v.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(VistaAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AgregarAdminActionPerformed

    private void MostrarPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPagosActionPerformed
        // TODO add your handling code here:
        InternalMostrarPagosUser MpA = new InternalMostrarPagosUser();
        JDP_Menu.add(MpA);
        MpA.setVisible(true);
    }//GEN-LAST:event_MostrarPagosActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarAdmin;
    private javax.swing.JMenuItem AgregarServ;
    private javax.swing.JMenuItem GestionarAdmin;
    private javax.swing.JMenuItem GestionarServ;
    private javax.swing.JMenuItem ModificarUser;
    private javax.swing.JMenuItem MostrarPagos;
    private javax.swing.JMenuItem RegistrarUser;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
