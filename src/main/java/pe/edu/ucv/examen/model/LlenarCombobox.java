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
public class LlenarCombobox {
    
    
 public static void PonerDatosCBX(JComboBox<String> jcbxProveedor) {
        String consultaSql = "{CALL sp_GetProveedorNames}";
        Connection con = null; // Declarar la conexión

        try {
            // Obtener la conexión a la base de datos (Asumiendo que 'AccesoBD' es la clase que gestiona la conexión)
            con = AccesoBD.getConexion();

            if (con != null) {
                try (CallableStatement cs = con.prepareCall(consultaSql);
                     ResultSet resultSet = cs.executeQuery()) {
                    // Limpia el ComboBox antes de agregar nuevos elementos
                    jcbxProveedor.removeAllItems();

                    // Agrega los nombres de los proveedores al ComboBox
                    while (resultSet.next()) {
                        int idProveedor = resultSet.getInt("idProveedor");
                        String nombreProveedor = resultSet.getString("pronombre");

                        // Agrega al ComboBox solo el nombre del proveedor
                        jcbxProveedor.addItem(nombreProveedor);

                        // Asocia el ID del proveedor con el índice en el ComboBox
                        jcbxProveedor.putClientProperty(nombreProveedor, idProveedor);
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
  public static void PonerDatosCBXCategoria(JComboBox<String> jcbxCategoria) {
        String consultaSql = "{CALL sp_GetCategoria}";
        Connection con = null; // Declarar la conexión

        try {
            // Obtener la conexión a la base de datos (Asumiendo que 'AccesoBD' es la clase que gestiona la conexión)
            con = AccesoBD.getConexion();

            if (con != null) {
                try (CallableStatement cs = con.prepareCall(consultaSql);
                     ResultSet resultSet = cs.executeQuery()) {
                    // Limpia el ComboBox antes de agregar nuevos elementos
                    jcbxCategoria.removeAllItems();

                    // Agrega los nombres de las categorías al ComboBox
                    while (resultSet.next()) {
                        int idCategoria = resultSet.getInt("idCategoria");
                        String nombreCategoria = resultSet.getString("catnombre");

                        // Agrega al ComboBox solo el nombre de la categoría
                        jcbxCategoria.addItem(nombreCategoria);

                        // Asocia el ID de la categoría con el índice en el ComboBox
                        jcbxCategoria.putClientProperty(nombreCategoria, idCategoria);
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
}


