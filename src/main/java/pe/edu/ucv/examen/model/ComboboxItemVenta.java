/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import pe.edu.ucv.examen.AccesoBD.AccesoBD;

/**
 *
 * @author User
 */
public class ComboboxItemVenta {

    public ComboboxItemVenta() {
    }   
      public static void cargarDatosProducto(String prod, JTextField txtIDProducto, JTextField txtPrecio) {
    // Procedimiento almacenado para obtener el ID del producto por nombre
    String procedimientoIdProducto = "{CALL ObtenerIdProductoPorNombre(?)}";
    // Procedimiento almacenado para obtener el precio del producto por nombre
    String procedimientoPrecioProducto = "{CALL ObtenerPrecioProductoPorNombre(?)}";
    try (Connection con = AccesoBD.getConexion();
         CallableStatement csIdProducto = con.prepareCall(procedimientoIdProducto);
         CallableStatement csPrecioProducto = con.prepareCall(procedimientoPrecioProducto)) {
        // Obtener el ID del producto por nombre
        csIdProducto.setString(1, prod);
        try (ResultSet rsIdProducto = csIdProducto.executeQuery()) {
            if (rsIdProducto.next()) {
                int idProducto = rsIdProducto.getInt("idProducto");
                txtIDProducto.setText(String.valueOf(idProducto));
            }
        }
        // Obtener el precio del producto por nombre
        csPrecioProducto.setString(1, prod);
        try (ResultSet rsPrecioProducto = csPrecioProducto.executeQuery()) {
            if (rsPrecioProducto.next()) {
                double precio = rsPrecioProducto.getDouble("precio");
                txtPrecio.setText(String.valueOf(precio));
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
}
        