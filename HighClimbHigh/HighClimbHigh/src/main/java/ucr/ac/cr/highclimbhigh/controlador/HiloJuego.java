/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.controlador;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import ucr.ac.cr.highclimbhigh.modelo.AreaJuego;
import ucr.ac.cr.highclimbhigh.vista.GUIVideoJuego;
import ucr.ac.cr.highclimbhigh.vista.PanelVideoJuego;

/**
 *
 * @author nashl
 */
public class HiloJuego extends Thread {

    private AreaJuego areaJuego;
    private ControladorVideoJuego controladorVideoJuego;
    private GUIVideoJuego guiVideoJuego;
    private PanelVideoJuego panelVideoJuego;
//    private File direccionMusica;
//    private AudioInputStream audioMusica;
//    private Clip clip;

    public HiloJuego() {
    }// Fin de constructor

    public HiloJuego(AreaJuego areaJuego, ControladorVideoJuego controladorVideoJuego, GUIVideoJuego guiVideoJuego, PanelVideoJuego panelVideoJuego) {
        this.areaJuego = areaJuego;
        this.controladorVideoJuego = controladorVideoJuego;
        this.guiVideoJuego = guiVideoJuego;
        this.panelVideoJuego = panelVideoJuego;
        
    }//Fin de constructor

    public void run() {

        while (!areaJuego.isGanador(controladorVideoJuego.trabajadorNiveles())) {
            try {
                for (int indice = 0; indice < areaJuego.getCantidadObstaculos(); indice++) {
                    areaJuego.getObstaculos(indice).movimientoObstaculo(controladorVideoJuego.trabajadorNiveles());
                    System.out.println(controladorVideoJuego.trabajadorNiveles());
                    areaJuego.movimientoFondo();
                }//for

                if (areaJuego.getImpacto()) {                    
                    controladorVideoJuego.decirPerdedor();
                    System.out.println("Fin del juego");
                    this.suspend();   
                }             

                controladorVideoJuego.refrescar();
                sleep(100);
            } //Fin de metodo run
            catch (InterruptedException ex) {
                Logger.getLogger(HiloJuego.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        controladorVideoJuego.finDeJuego();
        this.suspend();
    }//Fin de if
  
}//Fin de la clase
