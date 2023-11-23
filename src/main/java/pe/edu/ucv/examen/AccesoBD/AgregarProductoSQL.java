/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.AccesoBD;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pe.edu.ucv.examen.AccesoBD.AccesoBD;

/**
 *
 * @author User
 */
public class AgregarProductoSQL {
    public void agregar(String nombre, double precio, int categoria, int idProveedor, String receta, File ruta) {
    try {
        Connection con = AccesoBD.getConexion();
        CallableStatement cs = con.prepareCall("{call InsertarProducto(?, ?, ?, ?, ?, ?)}");

        cs.setString(1, nombre);
        cs.setDouble(2, precio);
        cs.setInt(3, categoria);
        cs.setInt(4, idProveedor);
        cs.setString(5, receta);
        
        byte[] icono = new byte[(int) ruta.length()];
        InputStream input = new FileInputStream(ruta);
        input.read(icono);
        
        cs.setBytes(6, icono);

        cs.executeUpdate();

        JOptionPane.showMessageDialog(null, "Registro de producto guardado");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.toString());
    }
}
}
