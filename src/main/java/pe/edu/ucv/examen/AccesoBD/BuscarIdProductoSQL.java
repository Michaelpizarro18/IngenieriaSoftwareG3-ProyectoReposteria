/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.AccesoBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class BuscarIdProductoSQL {
    public void obtenerIdCategoriaYMostrar(String categoria, JTextField jtxtidcategoria) {
    try (Connection con = AccesoBD.getConexion()) {
        String consultaSql = "{CALL ObtenerIdCategoria(?)}"; // Usamos la llamada al procedimiento almacenado

        try (CallableStatement statement = con.prepareCall(consultaSql)) {
            statement.setString(1, categoria);
            ResultSet resultSet = statement.executeQuery();

            // Muestra el ID de la categoría en el JTextField
            if (resultSet.next()) {
                int idCategoria = resultSet.getInt("idCategoria");
                jtxtidcategoria.setText(String.valueOf(idCategoria));
            } else {
                // Manejar el caso en el que no se encuentra la categoría
                jtxtidcategoria.setText("No se encontró la categoría para el producto: " + categoria);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
}
