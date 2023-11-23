/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.service;


import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;



public class PruebadelCodigoframe { 

public void PanelesControllerVerdadero(JPanel content, Component componente) { 
   content.setLayout(new BorderLayout());
   content.removeAll();
   content.add(componente, BorderLayout.CENTER);
   content.revalidate();
   content.repaint();
   
}
public void controlarTabbedPanes(JTabbedPane tabbedPane, Component componente,int x) {   
    tabbedPane.setSelectedIndex(x);    
   }

public void controlarTabbedPanesCatalogo(JTabbedPane tabbedPane, int x) {   
    tabbedPane.setSelectedIndex(x);  
}
public void mostrarJTabbedPane1(JPanel content, JTabbedPane jTabbedPane1) {
    content.setLayout(new BorderLayout());
    content.removeAll();
    content.add(jTabbedPane1, BorderLayout.CENTER);
    content.revalidate();
    content.repaint();
}


}


