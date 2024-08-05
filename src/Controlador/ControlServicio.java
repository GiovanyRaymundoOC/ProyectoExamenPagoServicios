/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Servicio;
import Conexion.Conexion;
import java.sql.*;

public class ControlServicio {

    public boolean Guardar(Servicio objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("insert into servicios values (?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getNombre());
            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al guardar" + e);
        }

        return respuesta;
    }

    public boolean ExisteSer(String servicio) {
        boolean respuesta = false;

        String sql = "select nombre from servicios where nombre = '" + servicio + "';";
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

    public boolean Actualizar(Servicio objeto, int idServicio) {
    boolean respuesta = false;
    Connection cn = Conexion.establecerConexion();
    try {
        PreparedStatement consulta = cn.prepareStatement("update servicios set nombre = ? where id_servicio = ?");
        
        consulta.setString(1, objeto.getNombre());
        consulta.setInt(2, idServicio);
        if (consulta.executeUpdate() > 0) {
            respuesta = true;
        }
        cn.close();

    } catch (SQLException e) {
        System.out.println("Error al actualizar: " + e);
    }

    return respuesta;
}
    public boolean Eliminar(int idServicio) {
        boolean respuesta = false;
        Connection cn = Conexion.establecerConexion();
        try {
            PreparedStatement consulta = cn.prepareStatement("delete from servicios where id_servicio = ?");
            consulta.setInt(1, idServicio);
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
