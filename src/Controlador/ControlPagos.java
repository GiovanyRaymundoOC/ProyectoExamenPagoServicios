/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Pagos;
 import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author joseo
 */
public class ControlPagos {
    public boolean RegistrarPago(Pagos objeto) {
        boolean respuesta = false;

        Connection cn = Conexion.establecerConexion();
        String sql = "INSERT INTO pagos (id_pago, id_usuario, id_servicio, monto, fecha_pago, fecha_vencimiento) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setInt(1, 0);
            pstmt.setInt(2, objeto.getId_usuario());
            pstmt.setInt(3, objeto.getId_servicio());
            pstmt.setString(4, objeto.getMonto());
            pstmt.setString(5, objeto.getFecha_pago());
            pstmt.setString(6, objeto.getFecha_vencimiento());
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                respuesta = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al insertar datos: " + e.toString());
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.toString());
            }
        }

        return respuesta;
    }
}
