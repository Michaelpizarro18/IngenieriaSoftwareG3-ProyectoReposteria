/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.service;

import javax.swing.JOptionPane;
import pe.edu.ucv.examen.AccesoBD.CuentaSQL;
import pe.edu.ucv.examen.view.Principalview;

/**
 *
 * @author User
 */
public class LoginControl {
   public void validarUsuario(String usuario, String clave) {
        try {
            if (clave.isEmpty() || usuario.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Algún campo está vacío");
            } else {
                CuentaSQL controller = new CuentaSQL();
                controller.validarUsuario(usuario, clave);
                Principalview.main(null);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}

