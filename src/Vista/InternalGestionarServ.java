/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Conexion.Conexion;
import Controlador.ControlServicio;
import Modelo.Servicio;
import java.sql.*;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class InternalGestionarServ extends javax.swing.JInternalFrame {

    private int idServicio;

    public InternalGestionarServ() {
        initComponents();
        this.setSize(new Dimension(790, 410));
        this.setTitle("Gestionar Servicios");

        this.CargarServicios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicios = new javax.swing.JTable();
        btnEliminar = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombreS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Administrar Servicios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblServicios.setBackground(new java.awt.Color(51, 51, 51));
        tblServicios.setForeground(new java.awt.Color(255, 255, 255));
        tblServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblServicios);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 280));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 380, 300));

        btnEliminar.setBackground(new java.awt.Color(162, 162, 162));
        btnEliminar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.setOpaque(true);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 140, 40));

        btnActualizar.setBackground(new java.awt.Color(162, 162, 162));
        btnActualizar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnActualizar.setOpaque(true);
        btnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMouseClicked(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 140, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del Servicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 210, -1));

        txtNombreS.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreS.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombreS.setBorder(null);
        jPanel1.add(txtNombreS, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 210, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Minimalist-Background_Wallpaper-for-PC (1).png"))); // NOI18N
        jLabel3.setText("jLabel1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "¿Desea actualizar el Servicio?", "Confirmar Actualización", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            if (!txtNombreS.getText().isEmpty()) {
                Servicio s = new Servicio();
                ControlServicio Cs = new ControlServicio();
                s.setNombre(txtNombreS.getText().trim());
                if (Cs.Actualizar(s, idServicio)) {
                    JOptionPane.showMessageDialog(null, "Servicio actualizado");
                    txtNombreS.setText("");
                    this.CargarServicios();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un servicio");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Actualización cancelada");

        } 
        
    }//GEN-LAST:event_btnActualizarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "¿Desea eliminar el Servicio?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            if (!txtNombreS.getText().isEmpty()) {
                Servicio s = new Servicio();
                ControlServicio Cs = new ControlServicio();
                s.setNombre(txtNombreS.getText().trim());
                if (!Cs.Eliminar(idServicio)) {
                    JOptionPane.showMessageDialog(null, "Servicio eliminado");
                    txtNombreS.setText("");
                    this.CargarServicios();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al eliminar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un servicio");
            }
        }else {
            JOptionPane.showMessageDialog(null, "Eliminación cancelada");

        } 

    }//GEN-LAST:event_btnEliminarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JTable tblServicios;
    private javax.swing.JTextField txtNombreS;
    // End of variables declaration//GEN-END:variables

    private void CargarServicios() {
        Connection cn = Conexion.establecerConexion();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select id_servicio, nombre from servicios";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InternalGestionarServ.tblServicios = new JTable(model);
            InternalGestionarServ.jScrollPane1.setViewportView(InternalGestionarServ.tblServicios);

            model.addColumn("id_servicio");
            model.addColumn("nombre");

            while (rs.next()) {
                Object fila[] = new Object[2];
                for (int i = 0; i < 2; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar" + e);
        }

        tblServicios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaP = tblServicios.rowAtPoint(e.getPoint());
                int columnaP = 0;

                if (filaP > -1) {
                    idServicio = (int) model.getValueAt(filaP, columnaP);
                    EnviarDatosServ(idServicio);
                }
            }
        });
    }

    private void EnviarDatosServ(int idServicio) {
        try {
            Connection cn = Conexion.establecerConexion();
            PreparedStatement pst = cn.prepareStatement("select * from servicios where id_servicio = '" + idServicio + "'");
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txtNombreS.setText(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println("Error al seleccionar" + e);
        }
    }

}
