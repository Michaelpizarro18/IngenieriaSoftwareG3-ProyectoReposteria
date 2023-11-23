package pe.edu.ucv.examen;

import javax.swing.SwingUtilities;
import pe.edu.ucv.examen.view.Principalview;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                   Principalview.main(args);
                  
        }
    });
    
}
}
