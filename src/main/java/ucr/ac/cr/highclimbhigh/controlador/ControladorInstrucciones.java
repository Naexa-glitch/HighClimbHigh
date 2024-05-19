/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.highclimbhigh.vista.GUIInstrucciones;
import ucr.ac.cr.highclimbhigh.vista.GUIMenu;
import ucr.ac.cr.highclimbhigh.vista.PanelInstrucciones;

/**
 *
 * @author nashl
 */
public class ControladorInstrucciones implements ActionListener {
    
    private PanelInstrucciones panelInstrucciones;
    private GUIInstrucciones guiInstrucciones;
    private GUIMenu guiMenu;

    public ControladorInstrucciones(GUIInstrucciones guiInstrucciones, PanelInstrucciones panelInstrucciones) {
        this.panelInstrucciones = panelInstrucciones;
        this.guiInstrucciones = guiInstrucciones;
    }//Fin de constructor

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String evento = e.getActionCommand();
        
        if(e.getActionCommand().equalsIgnoreCase("Salir")){
        
            guiInstrucciones.dispose();
            
            guiMenu= new GUIMenu(); 
            
            //JOptionPane.showMessageDialog(null, "apretó el boton salir");
        
        }
        
    }
    
}//Fin de la clase
