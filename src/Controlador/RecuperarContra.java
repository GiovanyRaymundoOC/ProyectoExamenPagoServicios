/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author joseo
 */
public class RecuperarContra {
    public static String recuperarContrasena() throws Exception {
        Connection cn = Conexion.establecerConexion();
        String sql = "SELECT contrasena FROM administradores ORDER BY id_administrador LIMIT 1";
        Statement st = null;
        ResultSet rs = null;

        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                return rs.getString("contrasena");
            } else {
                throw new Exception("No se encontró ningún administrador en la base de datos.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            throw new Exception("Error al recuperar la contraseña.", e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar los recursos: " + e.getMessage());
            }
        }
    }
}
