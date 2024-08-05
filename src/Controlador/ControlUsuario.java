/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Usuario;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author joseo
 */
public class ControlUsuario {

    private String encriptarContrasena(String contrasena) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(contrasena.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al encriptar la contraseña", e);
        }
    }

    
    private boolean verificarContrasena(String contrasena, String contrasenaHash) {
        return encriptarContrasena(contrasena).equals(contrasenaHash);
    }

    public boolean LoginUser(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        String sql = "SELECT email, contrasena FROM usuarios WHERE email = ?";

        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setString(1, objeto.getEmail());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String contrasenaAlmacenada = rs.getString("contrasena");
                respuesta = verificarContrasena(objeto.getContrasena(), contrasenaAlmacenada);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión: " + e.getMessage());
        }

        return respuesta;
    }

    public boolean RegistrarUsuario(Usuario objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        String sql = "INSERT INTO usuarios (id_usuario, nombre, apellido, email, telefono, direccion, fecha_registro, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setInt(1, 0);
            pstmt.setString(2, objeto.getNombre());
            pstmt.setString(3, objeto.getApellido());
            pstmt.setString(4, objeto.getEmail());
            pstmt.setString(5, objeto.getTelefono());
            pstmt.setString(6, objeto.getDireccion());
            pstmt.setString(7, objeto.getFecha_registro());
            // Encriptar la contraseña antes de almacenarla
            pstmt.setString(8, encriptarContrasena(objeto.getContrasena()));
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

    public boolean ExisteUser(String user) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        String sql = "SELECT email FROM usuarios WHERE email = ?";

        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setString(1, user);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar: " + e.getMessage());
        }

        return respuesta;
    }

    public boolean Actualizar(Usuario objeto, int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        String sql = "UPDATE usuarios SET nombre = ?, apellido = ?, email = ?, telefono = ?, direccion = ? WHERE id_usuario = ?";

        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setString(1, objeto.getNombre());
            pstmt.setString(2, objeto.getApellido());
            pstmt.setString(3, objeto.getEmail());
            pstmt.setString(4, objeto.getTelefono());
            pstmt.setString(5, objeto.getDireccion());
            pstmt.setInt(6, idUsuario);
            if (pstmt.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar: " + e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return respuesta;
    }

    public boolean Eliminar(int idUsuario) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        String sql = "DELETE FROM usuarios WHERE id_usuario = ?";

        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setInt(1, idUsuario);
            if (pstmt.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return respuesta;
    }

    public boolean validarContrasenaActual(String correo, String contrasenaActual) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        String sql = "SELECT contrasena FROM usuarios WHERE email = ?";

        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setString(1, correo);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String contrasenaAlmacenada = rs.getString("contrasena");
                // Verificar si la contraseña actual proporcionada coincide con la almacenada
                respuesta = verificarContrasena(contrasenaActual, contrasenaAlmacenada);
            }
        } catch (SQLException e) {
            System.out.println("Error al validar contraseña actual: " + e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return respuesta;
    }

    public boolean actualizarContrasena(String correo, String nuevaContrasena) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        String sql = "UPDATE usuarios SET contrasena = ? WHERE email = ?";

        try (PreparedStatement pstmt = cn.prepareStatement(sql)) {
            pstmt.setString(1, encriptarContrasena(nuevaContrasena));
            pstmt.setString(2, correo);
            if (pstmt.executeUpdate() > 0) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar contraseña: " + e.getMessage());
        } finally {
            try {
                cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return respuesta;
    }
}
