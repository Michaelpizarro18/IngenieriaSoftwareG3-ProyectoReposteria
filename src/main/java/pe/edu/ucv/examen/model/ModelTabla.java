/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.model;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ModelTabla {
    
    
    public void inicializarModelo(DefaultTableModel modelito) {
    modelito.addColumn("PRODUCTO");
    modelito.addColumn("CANTIDAD");
    modelito.addColumn("PRECIO");
    modelito.addColumn("DESCUENTO");
    modelito.addColumn("SUBTOTAL");
    modelito.addColumn("IMPUESTO");
    modelito.addColumn("TOTAL");
}
     public void limpiarCampos(JComponent... cajas) {
        for (JComponent componente : cajas) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            } else if (componente instanceof JComboBox) {
                ((JComboBox) componente).setSelectedIndex(0);
            }
        }
    }
}
