/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.highclimbhigh.vista.GUIGanador;
import ucr.ac.cr.highclimbhigh.vista.GUIUsuario;
import ucr.ac.cr.highclimbhigh.vista.GUIVideoJuego;
import ucr.ac.cr.highclimbhigh.vista.PanelGanador;

/**
 *
 * @author nashl
 */
public class ControladorGanador implements ActionListener{
    
   private PanelGanador panelGanador; 
   private GUIGanador guiGanador;
   private GUIUsuario guiUsuario;
   private GUIVideoJuego guiVideoJuego;

    public ControladorGanador(GUIGanador guiGanador, PanelGanador panelGanador) {
        this.panelGanador = panelGanador;
        this.guiGanador = guiGanador;
        guiVideoJuego = new GUIVideoJuego();
    }//Fin de constructor
   
   

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String evento=e.getActionCommand();
    
        if(e.getActionCommand().equalsIgnoreCase("Salir")){
        
            System.exit(0);
            
            //JOptionPane.showMessageDialog(null, "apretó el boton salir");
        
        }else{
        
            if(e.getActionCommand().equalsIgnoreCase("Registrar")){
            
                guiUsuario = new GUIUsuario(guiVideoJuego.getControladorVideoJuego());
            
            }
        
        }
        
    }
    
}//Fin de la clase
