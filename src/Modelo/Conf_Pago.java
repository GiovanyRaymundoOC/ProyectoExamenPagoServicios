/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author joseo
 */
public class Conf_Pago {
    
    private int id_conf, id_servicio;
    private String fecha_vencimiento, monto;

    public Conf_Pago() {
        this.id_conf = 0;
        this.id_servicio = 0;
        this.fecha_vencimiento = "";
        this.monto = "";
    }

    public int getId_conf() {
        return id_conf;
    }

    public void setId_conf(int id_conf) {
        this.id_conf = id_conf;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }
    
    
}
