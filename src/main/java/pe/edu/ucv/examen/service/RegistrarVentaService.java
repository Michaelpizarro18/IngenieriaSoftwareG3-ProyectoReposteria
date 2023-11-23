/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pe.edu.ucv.examen.AccesoBD.AccesoBD;
import pe.edu.ucv.examen.AccesoBD.RegistrarVenta;
import pe.edu.ucv.examen.Controller.DetalleVenta;

/**
 *
 * @author User
 */
public class RegistrarVentaService {
    

   public static void registrarVentaYDetalle(Connection conexion, JTable tblDatos, double total) throws SQLException {
    RegistrarVenta ventas = new RegistrarVenta();

    if (conexion != null) {
        // Obtener datos de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        Vector<Vector> dataVector = modelo.getDataVector();

        // Iniciar la transacción
        conexion.setAutoCommit(false);

        // Crear una instancia de DetalleVenta
      Date fechaVenta = new Date();
     DetalleVenta venta = new DetalleVenta(0, new java.sql.Date(fechaVenta.getTime()), total);

        // Registrar la venta y obtener el ID generado
        int idVenta = ventas.registrarVenta(conexion, venta);

        // Actualizar el ID en la instancia de DetalleVenta
        venta.setIdVenta(idVenta);

        // Registrar los detalles de la venta
        for (Vector<Object> fila : dataVector) {
            ventas.registrarDetalleVenta(conexion, venta, fila);
        }

        // Commit de la transacción
        conexion.commit();
        JOptionPane.showMessageDialog(null, "Venta y detalle de venta registrados correctamente");
    }
}
}
