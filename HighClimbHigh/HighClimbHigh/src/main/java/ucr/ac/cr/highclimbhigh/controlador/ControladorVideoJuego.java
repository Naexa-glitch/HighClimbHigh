/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.controlador;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import ucr.ac.cr.highclimbhigh.modelo.AreaJuego;
import ucr.ac.cr.highclimbhigh.modelo.Fondo;
import ucr.ac.cr.highclimbhigh.modelo.Obstaculos;
import ucr.ac.cr.highclimbhigh.modelo.PersonajePrincipal;
import ucr.ac.cr.highclimbhigh.modelo.Usuario;
import ucr.ac.cr.highclimbhigh.vista.GUIGanador;
import ucr.ac.cr.highclimbhigh.vista.GUIPerdedor;
import ucr.ac.cr.highclimbhigh.vista.GUIVideoJuego;
import ucr.ac.cr.highclimbhigh.vista.PanelVideoJuego;

/**
 *
 * @author nashl
 */
public class ControladorVideoJuego implements MouseMotionListener, MouseListener {

    private PersonajePrincipal personajePrincipal;
    private PanelVideoJuego panelVideoJuego;
    private GUIVideoJuego guiVideoJuego;
    private AreaJuego areaJuego;
    private Obstaculos obstaculos;
    private GUIPerdedor guiPerdedor;
    private GUIGanador guiGanador;
    private Usuario usuario;
    private HiloJuego hiloJuego;
    private Fondo fondo;
    private int nivel;
    private boolean cambioFondo;
//    private MelodiaVideoJuego melodia;
  

    public ControladorVideoJuego(PanelVideoJuego panelVideoJuego) {
        areaJuego = new AreaJuego();
        this.panelVideoJuego = panelVideoJuego;       
        //ImageIcon personajeSube = new ImageIcon("./src/main/resources/img/animacion1.gif");
        //ImageIcon obstaculo = new ImageIcon("./src/main/resources/img/arana.png");
        //obstaculos = new Obstaculos(obstaculo, 402, 300);
        //personajePrincipal = new PersonajePrincipal(personajeSube, 545, 311);
        nivel = 1;
        personajePrincipal = areaJuego.getPersonajePrincipal();
        hiloJuego = new HiloJuego(areaJuego, this, guiVideoJuego, panelVideoJuego);
        hiloJuego.start();
        hiloJuego.suspend();
       

    }//Fin de constructor

    public ControladorVideoJuego() {
    }

    
    
    public void setGuiVideoJuego(GUIVideoJuego guiVideoJuego) {
        this.guiVideoJuego = guiVideoJuego;

    }//Fin de metodo setGUIVideoJuego

    public void refrescar() {

        panelVideoJuego.repaint();

    }//Fin de metodo refrescar

    public void reiniciar() {

        personajePrincipal.setX(410);
        personajePrincipal.setY(690);
//        obstaculos.setY(-90);
        areaJuego.getFondo().setY(-12000);
        hiloJuego.resume();

    }//Fin de metodo reiniciar

    public int trabajadorNiveles() {

        
        if (nivel == 1) {

            //nivel=1;
            
            if (areaJuego.getFondo().getY() == 0) {

                nivel = 2;
                areaJuego.getFondo().setY(-12000);
            }

        } else {

            if (nivel == 2) {

                areaJuego.getFondo().setImagen(new ImageIcon("./src/main/resources/img/nivel2.png"));
                

                if (areaJuego.getFondo().getY() == 0) {

                    nivel = 3;
                    areaJuego.getFondo().setY(-12000);
                }

            } else {

                if (nivel == 3) {


                    areaJuego.getFondo().setImagen(new ImageIcon("./src/main/resources/img/nivel3.png"));

                    

                    if (areaJuego.getFondo().getY() == 0) {

                    }

                }

            }

        }


        return nivel;
        
        

    }//Fin de metodo trabajadorNiveles

    public int getNivel(){
    
        return nivel;
    
    }
    
    public void mostrarImagenes(Graphics g) {

        areaJuego.getFondo().dibujar(g);
        areaJuego.getPersonajePrincipal().dibujar(g);
        //obstaculos.dibujar(g);
        //personajePrincipal.dibujarRectangulo(g);
        //obstaculos.dibujarRectangulo(g);

        for (int ubicacion = 0; ubicacion < areaJuego.getCantidadObstaculos(); ubicacion++) {
            areaJuego.getObstaculos(ubicacion).dibujar(g);
        }

    }//Fin de metodo mostrarImagenes

    public void decirPerdedor() {

        areaJuego.detener();
        guiVideoJuego.dispose();

        guiPerdedor = new GUIPerdedor(guiVideoJuego);

    }//Fin de metodo decirPerdedor

    public void finDeJuego() {

        areaJuego.detener();
        guiVideoJuego.dispose();

        guiGanador = new GUIGanador(); // observar

    }//Fin de metodo finDeJuego

    @Override
    public void mouseDragged(MouseEvent evento) {

    }

    @Override
    public void mouseMoved(MouseEvent evento) {

        int coordenadaX = evento.getX();
        int coordenadaY = evento.getY();

        personajePrincipal.setX(coordenadaX - 158);
        personajePrincipal.setY(coordenadaY - 140);

        if (personajePrincipal.getY() >= 270) {

            areaJuego.getPersonajePrincipal().setImagen(new ImageIcon("./src/main/resources/img/animacion1.gif"));

        } else {

            if (personajePrincipal.getY() < 270) {

                areaJuego.getPersonajePrincipal().setImagen(new ImageIcon("./src/main/resources/img/animacion2.gif"));

            }

        }

        areaJuego.getImpacto();

//        areaJuego.isGanador(trabajadorNiveles());

        trabajadorNiveles();
        
        
        panelVideoJuego.repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println(" X " + e.getX() + " Y " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}//Fin de la clase
