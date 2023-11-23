/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.model;

import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class CajasdeTextoModel {
    
    
    
     public void DesactivarCajas(JTextField... cajas) {
        for (JTextField caja : cajas) {
            caja.setEnabled(false);
        }
}
      public void calcularYMostrarTotal(JTextField txtTotalFinal,DefaultTableModel modelito) {
        double totalFinal = 0;
        int rowCount = modelito.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            // Sumar el subtotal de cada fila
            double subtotalFila = Double.parseDouble(modelito.getValueAt(i, 4).toString());
            totalFinal += subtotalFila;
        }

        // Mostrar el total en el campo txtTotalFinal
        txtTotalFinal.setText(String.valueOf(totalFinal));
    }
}