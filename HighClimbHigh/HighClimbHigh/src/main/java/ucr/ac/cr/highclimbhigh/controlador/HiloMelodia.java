/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.controlador;

import java.io.File;
import static java.lang.Thread.sleep;
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
public class HiloMelodia extends Thread{
    
    private File direccionMusica;
    private AudioInputStream audioMusica;
    private Clip clip;
    private ControladorMenu controladorMenu;

    public HiloMelodia() {
    }//Fin de metodo constructor
    
    public void run(){
    
            try {
        
                direccionMusica = new File("./src/main/resources/img/melodia.wav");

                if (direccionMusica.exists()) {

                    audioMusica = AudioSystem.getAudioInputStream(direccionMusica);

                    clip = AudioSystem.getClip();
                    clip.open(audioMusica);
                    clip.start();
                    clip.loop(Clip.LOOP_CONTINUOUSLY);

                } else {

                    System.out.println(" El archivo no se encuentra");

                }

        }catch(Exception excepcion){
        
            System.out.println(" No se pudo reproducir la musica");
        
        }
    }//Fin de metodo run
    
    public void paraMelodia(){
    
        clip.stop();
    
    }//Fin de metodo paraMelodia
    
}//Fin de la clase
