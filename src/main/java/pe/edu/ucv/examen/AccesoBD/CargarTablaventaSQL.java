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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CargarTablaventaSQL {

    public CargarTablaventaSQL() {
    }
    
public void cargarDatosEnTabla(DefaultTableModel modelito, JTextField txtTotalFinal, JTextField txtIDCompra, int idventa) {
    modelito.setRowCount(0);
    try (Connection con = AccesoBD.getConexion()) {
        // Procedimiento almacenado para cargar los detalles de la venta
        String procedimientoDetalle = "{CALL ObtenerDetallePorIdVenta(?)}";
        // Procedimiento almacenado para cargar el total de la venta
        String procedimientoTotalVenta = "{CALL ObtenerTotalYIdVenta(?)}";

        try (CallableStatement csDetalle = con.prepareCall(procedimientoDetalle);
             CallableStatement csTotalVenta = con.prepareCall(procedimientoTotalVenta)) {
            // Cargar los detalles de la venta
            csDetalle.setInt(1, idventa);
            try (ResultSet rsDetalle = csDetalle.executeQuery()) {
                ResultSetMetaData rsmdDetalle = rsDetalle.getMetaData();
                int columnasDetalle = rsmdDetalle.getColumnCount();

                while (rsDetalle.next()) {
                    Object[] fila = new Object[columnasDetalle];
                    for (int a = 0; a < columnasDetalle; a++) {
                        fila[a] = rsDetalle.getObject(a + 1);
                    }
                    modelito.addRow(fila);
                }
            }
            // Cargar el total de la venta
            csTotalVenta.setInt(1, idventa);
            try (ResultSet rsTotalVenta = csTotalVenta.executeQuery()) {
                // Verificar si hay algún resultado antes de intentar obtenerlo
                if (rsTotalVenta.next()) {
                    double totalVenta = rsTotalVenta.getDouble("total");
                    int iden = rsTotalVenta.getInt("idVenta");

                    // Ahora puedes hacer algo con el total de la venta, por ejemplo, mostrarlo en un JTextField
                    txtTotalFinal.setText(String.valueOf(totalVenta));
                    txtIDCompra.setText(String.valueOf(iden));
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