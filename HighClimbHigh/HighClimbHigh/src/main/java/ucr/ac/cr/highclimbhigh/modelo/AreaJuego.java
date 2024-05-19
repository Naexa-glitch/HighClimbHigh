/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.modelo;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import ucr.ac.cr.highclimbhigh.controlador.ControladorVideoJuego;

/**
 *
 * @author nashl
 */
public class AreaJuego {

    private PersonajePrincipal personajePrincipal;
    private Fondo fondo;
    private ArrayList<Obstaculos> obstaculos;
    private ControladorVideoJuego controladorVideoJuego;

    public AreaJuego() {

        obstaculos = new ArrayList<Obstaculos>();
        setComponentesVideoJuego();

    }//Fin de constructor

    public void setComponentesVideoJuego() {

        dibujaPersonajePrincipal();
        dibujaFondoNivelUno();
        dibujaObstaculos();

    }  //Fin de setComponentsVideoJuego

    public void dibujaPersonajePrincipal() {

        ImageIcon personajeSube = new ImageIcon("./src/main/resources/img/imagenBase.png");

        personajePrincipal = new PersonajePrincipal(personajeSube, 410, 690);

    }//Fin de metodo dibujaPersonajePrincipal

    public void dibujaFondoNivelUno() {

        ImageIcon escenario1 = new ImageIcon("./src/main/resources/img/fondoVideoJuego.png");
        fondo = new Fondo(escenario1, 0, -12000);

    }//Fin de metodo dibujaFondoNivelUno

    public void dibujaObstaculos() {

        ImageIcon obstaculo1 = new ImageIcon("./src/main/resources/img/arana.png");
        Obstaculos obstaculo = new Obstaculos(obstaculo1, 100, -90);
        obstaculos.add(obstaculo);

        obstaculo1 = new ImageIcon("./src/main/resources/img/manzana.png");
        obstaculo = new Obstaculos(obstaculo1, 400, -340);
        obstaculos.add(obstaculo);

        obstaculo1 = new ImageIcon("./src/main/resources/img/arana.png");
        obstaculo = new Obstaculos(obstaculo1, 800, -300);
        obstaculos.add(obstaculo);

        obstaculo1 = new ImageIcon("./src/main/resources/img/manzana.png");
        obstaculo = new Obstaculos(obstaculo1, 200, -140);
        obstaculos.add(obstaculo);

        obstaculo1 = new ImageIcon("./src/main/resources/img/arana.png");
        obstaculo = new Obstaculos(obstaculo1, 1000, -240);
        obstaculos.add(obstaculo);

        obstaculo1 = new ImageIcon("./src/main/resources/img/manzana.png");
        obstaculo = new Obstaculos(obstaculo1, 1200, -200);
        obstaculos.add(obstaculo);

    }//Fin de metodo dibujaObstaculos

    public void movimientoFondo() {
        if (personajePrincipal.getX() >= 0 && personajePrincipal.getX() <= 1365 && personajePrincipal.getY() <= 270) {
            getFondo().setY(getFondo().getY() + 2);
        }
    }//Fin de metodo movimientoFondo

    public PersonajePrincipal getPersonajePrincipal() {
        return personajePrincipal;
    }//Fin de metodo getPersonajePrincipal

    public Fondo getFondo() {

        return fondo;

    }//Fin de metodo getFondo

    public int getCantidadObstaculos() {

        return obstaculos.size();

    }//Fin de metodo getCantidadObstaculos

    synchronized public boolean getImpacto() {

        for (int ubicacion = 0; ubicacion < obstaculos.size(); ubicacion++) {
            if (personajePrincipal.getRectangulo().intersects(obstaculos.get(ubicacion).getRectangulo())) {

                personajePrincipal.setImagen(new ImageIcon("./src/main/resources/img/animacion3.gif"));

                obstaculos.get(ubicacion).setImpacto(false);

                return true;
            }
        }
        return false;

    }//Fin de metodo getImpacto

    public Obstaculos getObstaculos(int ubicacion) {
        return obstaculos.get(ubicacion);
    }//Fin de metodo getObstaculos

    public boolean isGanador(int nivel) {

        if (nivel == 3 && fondo.getY() >= 0) {
            return true;
        }
        return false;

    }//Fin de metodo isGanador

    public void detener() {
        for (int posicion = 0; posicion > obstaculos.size(); posicion++) {
            obstaculos.get(posicion).setImpacto(false);
        }

    }//Fin de metodo detener

}//Fin de la clase
