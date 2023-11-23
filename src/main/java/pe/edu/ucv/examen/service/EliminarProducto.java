/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.service;

import pe.edu.ucv.examen.AccesoBD.EliminarProductoSQL;
import pe.edu.ucv.examen.Controller.Producto;


public class EliminarProducto {
    public void eliminar(int id,int codigo){
       Producto vo = new  Producto();
              
        vo.setIdProducto(codigo);
        
        EliminarProductoSQL dao = new EliminarProductoSQL();
        dao.Eliminar_Producto(vo);
    }
}
