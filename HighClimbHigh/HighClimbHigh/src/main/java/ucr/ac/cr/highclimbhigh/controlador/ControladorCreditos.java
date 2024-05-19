/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.highclimbhigh.vista.GUICreditos;
import ucr.ac.cr.highclimbhigh.vista.GUIMenu;
import ucr.ac.cr.highclimbhigh.vista.PanelCreditos;

/**
 *
 * @author nashl
 */
public class ControladorCreditos implements ActionListener{
    
    private GUICreditos guiCreditos;
    private PanelCreditos panelCreditos;
    private GUIMenu guiMenu;

    public ControladorCreditos(GUICreditos guiCreditos, PanelCreditos panelCreditos) {
        this.guiCreditos = guiCreditos;
        this.panelCreditos = panelCreditos;
    }//Fin de constructor
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
       
        String evento = e.getActionCommand();
        
        if(e.getActionCommand().equalsIgnoreCase("Salir")){
        
            guiCreditos.dispose();
            
            guiMenu= new GUIMenu();
            
            //JOptionPane.showMessageDialog(null, "apretó el boton salir");
        
        }
        
    }
    
}//Fin de la clase
