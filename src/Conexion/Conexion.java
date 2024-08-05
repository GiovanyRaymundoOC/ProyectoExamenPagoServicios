/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion {

    public static Connection establecerConexion() {
        
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pagodeservicios", "root", "Marzo.2004");
            return cn;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos, error: " + e.toString());        }
        return null;
    }

}
