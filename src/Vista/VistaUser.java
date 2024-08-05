/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.*;
import javax.swing.JDesktopPane;

/**
 *
 * @author joseo
 */
public class VistaUser extends javax.swing.JFrame {

    public static JDesktopPane JDP_Menu;
    /**
     * Creates new form VistaUser
     */
    public VistaUser() {
        initComponents();
        this.setSize(new Dimension(800,500));
        this.setLocationRelativeTo(null);
        this.setTitle("Pago de Servicios");
        
        this.setLayout(null);
        JDP_Menu = new JDesktopPane();
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        VistaUser.JDP_Menu.setBounds(0, 0, 800, 500-90);
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
        jMenu2 = new javax.swing.JMenu();
        PagarServicio = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MostrarPagos = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Servicios");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 50));

        PagarServicio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        PagarServicio.setText("Pagar Servicio");
        PagarServicio.setPreferredSize(new java.awt.Dimension(180, 30));
        PagarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarServicioActionPerformed(evt);
            }
        });
        jMenu2.add(PagarServicio);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PagarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarServicioActionPerformed
        // TODO add your handling code here:
        InternalPagoServicios IpS = new InternalPagoServicios();
        JDP_Menu.add(IpS);
        IpS.setVisible(true);
    }//GEN-LAST:event_PagarServicioActionPerformed

    private void MostrarPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPagosActionPerformed
        // TODO add your handling code here:
        InternalMostrarPagosUser ImU = new InternalMostrarPagosUser();
        JDP_Menu.add(ImU);
        ImU.setVisible(true);
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
            java.util.logging.Logger.getLogger(VistaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MostrarPagos;
    private javax.swing.JMenuItem PagarServicio;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
