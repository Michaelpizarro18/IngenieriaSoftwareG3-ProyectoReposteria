/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.AccesoBD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Vector;
import javax.swing.JOptionPane;
import pe.edu.ucv.examen.Controller.DetalleVenta;

/**
 *
 * @author User
 */
public class RegistrarVenta {
   
   public int registrarVenta(Connection conn, DetalleVenta venta) throws SQLException {
    String insertVentaSQL = "INSERT INTO Venta (fecha, total) VALUES (?, ?)";
    try (PreparedStatement preparedStatement = conn.prepareStatement(insertVentaSQL, Statement.RETURN_GENERATED_KEYS)) {
        preparedStatement.setDate(1, new java.sql.Date(venta.getFecha().getTime()));
        preparedStatement.setDouble(2, venta.getTotal());
        preparedStatement.executeUpdate();

        // Obtener el ID generado para la venta
        return obtenerIdGenerado(preparedStatement);
    }
}
public void registrarDetalleVenta(Connection conn, DetalleVenta venta, Vector<Object> fila) throws SQLException {
    String insertDetalleVentaSQL = "{CALL RegistrarDetalleVenta(?, ?, ?, ?, ?, ?)}"; // Llamada al procedimiento almacenado
    try (CallableStatement cs = conn.prepareCall(insertDetalleVentaSQL)) {
        cs.setInt(1, venta.getIdVenta());
        cs.setString(2, fila.get(0).toString()); // Columna PRODUCTO
        cs.setInt(3, Integer.parseInt(fila.get(1).toString())); // Columna CANTIDAD
        cs.setDouble(4, Double.parseDouble(fila.get(2).toString())); // Columna PRECIO
        cs.setDouble(5, Double.parseDouble(fila.get(3).toString())); // Columna DESCUENTO
        cs.setDouble(6, Double.parseDouble(fila.get(4).toString())); // Columna SUBTOTAL

        cs.executeUpdate();
    }
}

   public int obtenerIdGenerado(PreparedStatement preparedStatement) throws SQLException {
        try (var generatedKeys = preparedStatement.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID generado.");
            }
        }
    }}



