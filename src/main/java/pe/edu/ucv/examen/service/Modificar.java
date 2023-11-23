/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import pe.edu.ucv.examen.AccesoBD.ModificarSQL;
import pe.edu.ucv.examen.Controller.Producto;

/**
 *
 * @author User
 */
public class Modificar {
   
    public void modificar(String nombre, double precio, int categoria, int idProveedor, String receta, File ruta, int id){
       ModificarSQL dao;
        Producto vo = new Producto();
        dao = new ModificarSQL();     
        vo.setIdProducto(id);
        vo.setNombre(nombre);
        vo.setPrecio(precio);
        vo.setCategoria(categoria);
        vo.setIdProveedor(idProveedor);
        vo.setReceta(receta);      
        try{
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            vo.setFoto(icono);
        }catch(Exception ex){
            vo.setFoto(null);
        }
        dao.Modificar_ProductoVO(vo);
    }
       public void modificar2(String nombre, double precio, int categoria, int idProveedor, String receta, int id){
        ModificarSQL dao;
        Producto vo = new Producto();
        dao = new ModificarSQL();     
        vo.setIdProducto(id);
        vo.setNombre(nombre);
        vo.setPrecio(precio);
        vo.setCategoria(categoria);
        vo.setIdProveedor(idProveedor);
        vo.setReceta(receta);      
       
        dao.Modificar_ProductoVO2(vo);
    }
}
