/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.AccesoBD;

import java.sql.CallableStatement;
import java.sql.Connection;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import pe.edu.ucv.examen.Controller.Producto;


public class ModificarSQL {
     public void Modificar_ProductoVO(Producto vo) {
      try {
        Connection con = AccesoBD.getConexion();
        CallableStatement cs = con.prepareCall("{call ActualizarProducto(?, ?, ?, ?, ?, ?, ?)}");

        cs.setInt(1, vo.getIdProducto());
        cs.setString(2, vo.getNombre());
        cs.setDouble(3, vo.getPrecio());
        cs.setInt(4, vo.getCategoria());
        cs.setInt(5, vo.getIdProveedor());
        cs.setString(6, vo.getReceta());
        cs.setBytes(7, vo.getFoto());

        cs.executeUpdate();

        JOptionPane.showMessageDialog(null, "Producto modificado");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString());
    }
}

   public void Modificar_ProductoVO2(Producto vo) {
     try {
        Connection con = AccesoBD.getConexion();
        CallableStatement cs = con.prepareCall("{call ActualizarProducto2(?, ?, ?, ?, ?, ?)}");
        cs.setInt(1, vo.getIdProducto());
        cs.setString(2, vo.getNombre());
        cs.setDouble(3, vo.getPrecio());
        cs.setInt(4, vo.getCategoria());
        cs.setInt(5, vo.getIdProveedor());
        cs.setString(6, vo.getReceta());

        cs.executeUpdate();

        JOptionPane.showMessageDialog(null, "Producto modificado");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString());
    }
}
}
