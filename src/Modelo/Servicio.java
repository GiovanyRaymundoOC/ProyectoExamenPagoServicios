/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class Servicio {
    private int id_Servicio;
    private String Nombre;
    
    public Servicio(int id_S, String n, String d){
        id_Servicio = id_S;
        Nombre = n;
    }

    public Servicio() {
        id_Servicio = 0;
        Nombre = "";
    }

    public int getId_Servicio() {
        return id_Servicio;
    }

    public void setId_Servicio(int id_Servicio) {
        this.id_Servicio = id_Servicio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
