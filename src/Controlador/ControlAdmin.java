/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author joseo
 */
import Conexion.Conexion;
import Modelo.Administrador;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControlAdmin {

    public boolean LoginAdmin(Administrador objeto) {

        boolean respuesta = false;

        Connection cn = Conexion.establecerConexion();
        String sql = "select email, contrasena from administradores where email = '" + objeto.getEmail() + "' and contrasena = '" + objeto.getContrasena() + "'";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }

        return respuesta;
    }

    public boolean ExisteAdmin(String admin) {
        boolean respuesta = false;

        String sql = "select email from administradores where nombre = '" + admin + "';";
        Statement st;
        try {
            Connection cn = Conexion.establecerConexion();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar" + e);
        }

        return respuesta;
    }

    public boolean RegistrarAdmin(Administrador objeto) {
        boolean respuesta = false;

        Connection cn = Conexion.establecerConexion();
        String sql = "INSERT INTO administradores (id_administrador, nombre, apellido, email, telefono, fecha_registro, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setInt(1, 0);
            pstmt.setString(2, objeto.getNombre());
            pstmt.setString(3, objeto.getApellido());
            pstmt.setString(4, objeto.getEmail());
            pstmt.setString(5, objeto.getTelefono());
            pstmt.setString(6, objeto.getFecha_registro());
            pstmt.setString(7, objeto.getContrasena());
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

    public boolean Actualizar(Administrador objeto, int idAdmin) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("update administradores set nombre = ?, apellido = ?, email = ?, telefono = ? where id_administrador = ?");

            consulta.setString(1, objeto.getNombre());
            consulta.setString(2, objeto.getApellido());
            consulta.setString(3, objeto.getEmail());
            consulta.setString(4, objeto.getTelefono());
            consulta.setInt(5, idAdmin);
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e);
        }

        return respuesta;
    }

    public boolean Eliminar(int idAdmin) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("delete from administradores where id_administrador = ?");
            consulta.setInt(1, idAdmin);
            consulta.executeUpdate();
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al eliminar" + e);
        }

        return respuesta;
    }
}
