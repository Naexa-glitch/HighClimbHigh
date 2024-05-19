/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author nashl
 */
public class Fondo{
    
    private int x;
    private int y;
    private ImageIcon imagen;

    public Fondo(ImageIcon imagen, int x, int y) {
        this.x = x;
        this.y = y;
        this.imagen = imagen;
    }//Fin de constructor

    public Fondo(int x, int y) {
        this.x = x;
        this.y = y;
    }//Fin de constructor

    public ImageIcon getImagen() {
        return imagen;
    }//Fin de metodo getImagen

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }//Fin de metodo setImagen

    

    public int getX() {
        return x;
    }//Fin de metodo getX

    public void setX(int x) {
        this.x = x;
    }//Fin de metodo setX

    public int getY() {
        return y;
    }//Fin de metodo getY

    public void setY(int y) {
        this.y = y;
    }//Fin de metodo setY
    
    
    
    public void dibujar(Graphics g){
    
        imagen.paintIcon(null, g, getX(), getY());
        //g.drawString("X "+x+" Y "+y , x, y);
        
    }//Fin de metodo dibujar
    
    
    
}
