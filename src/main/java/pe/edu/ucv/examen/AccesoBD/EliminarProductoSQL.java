/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.AccesoBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pe.edu.ucv.examen.Controller.Producto;

/**
 *
 * @author User
 */
public class EliminarProductoSQL {
    
     public void Eliminar_Producto(Producto vo){       
       try {
        Connection con = AccesoBD.getConexion();
        CallableStatement cs = con.prepareCall("{call EliminarProducto(?)}");
        cs.setInt(1, vo.getIdProducto());
        cs.executeUpdate();
        JOptionPane.showMessageDialog(null, "Producto eliminado");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString());
    }
}

}
        