/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.Controller;

import java.sql.Date;

/**
 *
 * @author User
 */
public class DetalleVenta {
     private int idVenta;
    private Date fecha;
    private double total;

    public DetalleVenta() {
    }

    public DetalleVenta(int idVenta, Date fecha, double total) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.total = total;
    }

    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
