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
import javax.swing.JOptionPane;

public class EliminarVentaSQL {
    
    public static void eliminarVenta(int idVenta) {
    try {
        Connection con = AccesoBD.getConexion();

        // Procedimiento almacenado para verificar si el ID de la Venta existe
        String procedimientoVerificarVenta = "{CALL ContarVentasPorId(?)}";

        // Procedimiento almacenado para eliminar registros de la tabla Detalle
        String procedimientoEliminarDetalle = "{CALL EliminarDetallePorIdVenta(?)}";

        // Procedimiento almacenado para eliminar registro de la tabla Venta
        String procedimientoEliminarVenta = "{CALL EliminarVentaPorId(?)}";

        try (CallableStatement csVerificarVenta = con.prepareCall(procedimientoVerificarVenta);
             CallableStatement csEliminarDetalle = con.prepareCall(procedimientoEliminarDetalle);
             CallableStatement csEliminarVenta = con.prepareCall(procedimientoEliminarVenta)) {

            // Verificar si el ID de la Venta existe
            csVerificarVenta.setInt(1, idVenta);
            try (ResultSet rsVerificarVenta = csVerificarVenta.executeQuery()) {
                rsVerificarVenta.next();
                int rowCount = rsVerificarVenta.getInt(1);

                if (rowCount > 0) {
                    // El ID de la Venta existe, proceder con la eliminación

                    // Iniciar una transacción
                    con.setAutoCommit(false);

                    try {
                        // Eliminar registros de la tabla Detalle
                        csEliminarDetalle.setInt(1, idVenta);
                        csEliminarDetalle.executeUpdate();

                        // Eliminar registro de la tabla Venta
                        csEliminarVenta.setInt(1, idVenta);
                        csEliminarVenta.executeUpdate();

                        // Confirmar la transacción
                        con.commit();
                        JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    } catch (SQLException e) {
                        // Si ocurre un error, hacer un rollback para deshacer la transacción
                        con.rollback();
                        JOptionPane.showMessageDialog(null, "Error al eliminar el registro:\n" + e.toString());
                    } finally {
                        // Restablecer la configuración de la conexión
                        con.setAutoCommit(true);
                    }
                } else {
                    // El ID de la Venta no existe
                    JOptionPane.showMessageDialog(null, "El ID de la Venta no existe.");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }
}
}
        
