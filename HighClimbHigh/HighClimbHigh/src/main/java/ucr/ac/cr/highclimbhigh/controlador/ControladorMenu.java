/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.highclimbhigh.vista.GUICreditos;
import ucr.ac.cr.highclimbhigh.vista.GUIInstrucciones;
import ucr.ac.cr.highclimbhigh.vista.GUIMenu;
import ucr.ac.cr.highclimbhigh.vista.GUIVideoJuego;
import ucr.ac.cr.highclimbhigh.vista.PanelMenu;

/**
 *
 * @author nashl
 */
public class ControladorMenu implements ActionListener{
    
    private PanelMenu panelMenu;
    private GUIMenu guiMenu;
    private GUIInstrucciones guiInstrucciones;
    private GUICreditos guiCreditos;
    private GUIVideoJuego guiVideoJuego;
    private HiloMelodia hiloMelodia;
//    private MelodiaVideoJuego melodiaVideoJuego;
    //private HiloJuego hiloJuego;
    
    public ControladorMenu(GUIMenu guiMenu, PanelMenu panelMenu) {
        this.panelMenu = panelMenu;
        this.guiMenu = guiMenu;
        hiloMelodia = new HiloMelodia();
        hiloMelodia.start();
//        melodiaVideoJuego = new MelodiaVideoJuego();
//        melodiaVideoJuego.iniciarMelodia();
    }//Fin de constructor
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String evento=e.getActionCommand();
        
        switch (evento){
        
            case "Jugar":
                
                guiMenu.dispose();
                
                guiVideoJuego = new GUIVideoJuego(); 
                
                guiVideoJuego.getControladorVideoJuego().setGuiVideoJuego(guiVideoJuego);
                guiVideoJuego.getControladorVideoJuego().reiniciar();
                
                //JOptionPane.showMessageDialog(null, "Presionó jugar");
                
            break;
            
            case "Instrucciones":
               
                guiMenu.dispose();
                
                guiInstrucciones = new GUIInstrucciones();
                
                hiloMelodia.paraMelodia();
                
//                melodiaVideoJuego.paraMelodia();
                
                //JOptionPane.showMessageDialog(null, "Presionó instrucciones");
                
            break;
            
            
            case "Creditos":
                
                guiMenu.dispose();
                
                guiCreditos = new GUICreditos();
                
                hiloMelodia.paraMelodia();
                
//                 melodiaVideoJuego.paraMelodia();
                
                //JOptionPane.showMessageDialog(null, "Presionó creditos");
                
            break;
            
            case "Salir":
                
                //JOptionPane.showMessageDialog(null, "Presionó salir");
                
                System.exit(0);
                
            break;
        
        }
        
    }
    
    public GUIVideoJuego getGuiVideoJuego(){
    
        return guiVideoJuego;
    
    }//Fin de metodo getGUIVideoJuego
    
}//Fin de clase
