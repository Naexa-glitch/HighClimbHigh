/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import ucr.ac.cr.highclimbhigh.modelo.RegistroUsuario;
import ucr.ac.cr.highclimbhigh.modelo.Usuario;
import ucr.ac.cr.highclimbhigh.vista.GUIUsuario;
import ucr.ac.cr.highclimbhigh.vista.PanelDatosUsuario;

/**
 *
 * @author nashl
 */
public class ControladorUsuario implements ActionListener, MouseListener {
    
    private GUIUsuario guiUsuario;
    private PanelDatosUsuario panelDatosUsuario;
    private RegistroUsuario registroUsuario;
    private Usuario usuario;
    private ControladorVideoJuego controladorVideoJuego;

    public ControladorUsuario(GUIUsuario guiUsuario, PanelDatosUsuario panelDatosUsuario, ControladorVideoJuego controladorVideoJuego) {
        this.guiUsuario = guiUsuario;
        this.panelDatosUsuario = panelDatosUsuario;
        this.controladorVideoJuego = controladorVideoJuego;
        registroUsuario = new RegistroUsuario();
        panelDatosUsuario.setDatosTablaUsuario(registroUsuario.getDatosTablaUsuario());
        
    }//Fin de constructor 

    public ControladorUsuario() {
    }//Fin de constructor
    
    @Override
    public void actionPerformed(ActionEvent evento) {
       
        String opcion = evento.getActionCommand();
        
        switch(opcion){
        
            case "Agregar":
               
                if(panelDatosUsuario.getTxtNombre()!=null){
                    
                
                String nombre = panelDatosUsuario.getTxtNombre();
                    
                usuario = new Usuario(nombre, controladorVideoJuego.trabajadorNiveles());
                
                guiUsuario.mostrarMensaje(registroUsuario.agregar(usuario));
                
                 panelDatosUsuario.setDatosTablaUsuario(registroUsuario.getDatosTablaUsuario());
                 panelDatosUsuario.limpiar();
                
                }else{
                
                    guiUsuario.mostrarMensaje("Debe digitar el nombre de usuario");
                
                }
                //JOptionPane.showMessageDialog(null, "Presionó agregar");
        
            break;
            
            case "Reiniciar":
                
                registroUsuario.reiniciar();
                
                 //guiUsuario.mostrarMensaje("Presionó el boton reiniciar");
                
            break;
            
            case "Salir":
                
                guiUsuario.dispose();
                
                //JOptionPane.showMessageDialog(null, "Presionó salir");
            
            break;    
        
        }//Fin de switch
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        System.out.println(panelDatosUsuario.getFila());
        usuario=(Usuario)registroUsuario.buscar(panelDatosUsuario.getFila());
        panelDatosUsuario.setTxtNombre(usuario.getNombre());
    }//Fin de mouseClicked

    @Override
    public void mousePressed(MouseEvent e) {
        
    }//Fin de mousePressed

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }//Fin de mouseReleased

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }//Fin de mouseEntered

    @Override
    public void mouseExited(MouseEvent e) {
        
    }//Fin de mouseExited
   
   
    
}//Fin de la clase