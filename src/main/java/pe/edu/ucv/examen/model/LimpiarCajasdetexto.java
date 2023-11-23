/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.model;

import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class LimpiarCajasdetexto {
      public void Limpiar (JTextField... cajas) {
        for (JTextField caja : cajas) {
            caja.setText("");
        }
}
      public void LimpiarCombobox(JComboBox<?>... comboboxes) {
    for (JComboBox<?> combobox : comboboxes) {
        combobox.setSelectedIndex(0); // O establecer a -1 si no quieres que se seleccione ningún elemento
    }
}
  public void limpiar(JTextArea... areasDeTexto) {
        for (JTextArea areaDeTexto : areasDeTexto) {
            areaDeTexto.setText("");
        }
  }}
