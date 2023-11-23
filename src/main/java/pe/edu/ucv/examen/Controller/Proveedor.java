/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.Controller;


public class Proveedor {
   
    private int idproveedor;
    private String nombreproveedor;
    private String direccion;

    public Proveedor() {
    }

    public Proveedor(int idproveedor, String nombreproveedor, String direccion) {
        this.idproveedor = idproveedor;
        this.nombreproveedor = nombreproveedor;
        this.direccion = direccion;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombreproveedor ;
    }
    
    
}
