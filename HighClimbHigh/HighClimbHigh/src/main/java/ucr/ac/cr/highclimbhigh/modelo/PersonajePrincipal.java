/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.modelo;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author nashl
 */
public class PersonajePrincipal extends Fondo{
   
   //private ImageIcon imagen;

    public PersonajePrincipal(ImageIcon imagen, int x, int y) {
        super(imagen, x, y);
    }//Fin de constructor

   
  /* public void dibujarRectangulo(Graphics g){
   
       getImagen().paintIcon(null, g, getX(), getY());
       
       g.drawString(" X " + getX() + " Y " + getY(), getX(), getY() );
       g.drawString(" X2 " + (getX()+800) + " Y2 " + (getY()+800), getX()+600, getY()+700);
       g.drawRect(getX()+88, getY()+80, getImagen().getIconWidth()-170, getImagen().getIconHeight()-130);
   }
   */
   public Rectangle getRectangulo(){
   
       return new Rectangle(getX()+88, getY()+80, getImagen().getIconWidth()-170, getImagen().getIconHeight()-130);
   
   }//Fin de metodo getRectangulo


}//Fin de la clase