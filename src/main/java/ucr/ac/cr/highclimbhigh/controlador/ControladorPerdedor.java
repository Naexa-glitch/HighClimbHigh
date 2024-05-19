/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.highclimbhigh.vista.GUIMenu;
import ucr.ac.cr.highclimbhigh.vista.GUIPerdedor;
import ucr.ac.cr.highclimbhigh.vista.GUIUsuario;
import ucr.ac.cr.highclimbhigh.vista.GUIVideoJuego;
import ucr.ac.cr.highclimbhigh.vista.PanelPerdedor;

/**
 *
 * @author nashl
 */
public class ControladorPerdedor implements ActionListener{
    
    private GUIPerdedor guiPerdedor;
    private PanelPerdedor panelPerdedor;
    private GUIMenu guiMenu;
    private GUIVideoJuego guiVideoJuego;
    private GUIUsuario guiUsuario;

    public ControladorPerdedor(GUIPerdedor guiPerdedor, PanelPerdedor panelPerdedor, GUIVideoJuego guiVideoJuego) {
        this.guiPerdedor = guiPerdedor;
        this.panelPerdedor = panelPerdedor;
        this.guiVideoJuego= guiVideoJuego;
    }//Fin de constructor
    

    @Override
    public void actionPerformed(ActionEvent e) {
       
        String evento=e.getActionCommand();
        
        switch(evento){
        
            case "Salir":
                
                guiPerdedor.dispose();
                
                guiMenu = new GUIMenu();
                
                //JOptionPane.showMessageDialog(null, "Presionó salir");
            
            break;    
                
            case "Jugar":
                
                guiPerdedor.dispose();
                
                guiVideoJuego.setVisible(true);
                guiVideoJuego.getControladorVideoJuego().reiniciar();
                //JOptionPane.showMessageDialog(null, "Presionó jugar");
                
            break;
            
            case "Registrar":
                
                guiUsuario = new GUIUsuario(guiVideoJuego.getControladorVideoJuego());

                //JOptionPane.showMessageDialog(null, "Presionó registrar");
        
        }
        
    }
    
    
}//Fin de la clase
