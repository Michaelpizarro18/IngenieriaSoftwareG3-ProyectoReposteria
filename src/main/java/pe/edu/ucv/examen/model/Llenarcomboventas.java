/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import pe.edu.ucv.examen.AccesoBD.AccesoBD;

/**
 *
 * @author User
 */
public class Llenarcomboventas {

    public Llenarcomboventas() {
    }
    
    
    public void PonerDatosCBXProducto(JComboBox<String> cbxproducto) {
    String consultaSql = "{CALL sp_GetProductoNames}";
    Connection con = null; // Declarar la conexión

    try {
        // Obtener la conexión a la base de datos (Asumiendo que 'AccesoBD' es la clase que gestiona la conexión)
        con = AccesoBD.getConexion();

        if (con != null) {
            try (CallableStatement cs = con.prepareCall(consultaSql);
                 ResultSet resultSet = cs.executeQuery()) {
                // Limpia el ComboBox antes de agregar nuevos elementos
                cbxproducto.removeAllItems();

                // Agrega los nombres de los productos al ComboBox
                while (resultSet.next()) {
                    String nombreProducto = resultSet.getString("nombre");
                    cbxproducto.addItem(nombreProducto);
                }
            }
        } else {
            System.err.println("No se pudo obtener la conexión a la base de datos.");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cierra la conexión si se abrió correctamente
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
    
    
    //Nada el que esta en otro package
    
}
