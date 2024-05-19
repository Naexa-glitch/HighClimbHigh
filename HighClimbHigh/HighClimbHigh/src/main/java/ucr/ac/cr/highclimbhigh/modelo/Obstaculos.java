/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.modelo;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author nashl
 */
public class Obstaculos extends Fondo{
    
    private boolean impacto;
    private Random random = new Random();

    private int minimo = 0;
    private int maximo = 1365;

    public Obstaculos(ImageIcon imagen, int x, int y) {
        super(imagen, x, y);
        
    }//Fin de constructor

    public boolean isImpacto() {
        return impacto;
    }//Fin de metodo isImpacto

    public void setImpacto(boolean impacto) {
        this.impacto = impacto;
    }//Fin de metodo setImpacto

    
    public void movimientoObstaculo(int nivel){
    
        int valorRandom = random.nextInt(maximo+minimo)+minimo;
        
        if(nivel==1){
        
            if(getY()>=680){
        
                setY(-90);
            
                setX(valorRandom);
        
            }else{
        
                setY(getY()+30);
        
            }
    
        }else{
        
            if(nivel==2){
        
                if(getY()>=680){
        
                    setY(-90);
            
                    setX(valorRandom);
        
                }else{
        
                    setY(getY()+60);
        
                }
            
            }else{
            
                if(nivel == 3) {

                    if (getY() >= 680) {

                        setY(-90);

                        setX(valorRandom);

                    } else {

                        setY(getY() + 90);

                    }
            
                }
            }
        }
    }//Fin de metodo movimientoObstaculo
    
    /*public void dibujarRectangulo(Graphics g){
    
        getImagen().paintIcon(null, g, getX(), getY());
       
       g.drawString(" X " + getX() + " Y " + getY(), getX(), getY() );
       g.drawString(" X2 " + (getX()+69) + " Y2 " + (getY()+62), getX()+69, getY()+62);
       g.drawRect(getX()+41, getY()+80, getg.drawString(" X " + getX() + " Y " + getY(), getX(), getY() );Imagen().getIconWidth()-81, getImagen().getIconHeight()-98);
   }
   */
   public Rectangle getRectangulo(){
   
       return new Rectangle(getX()+41, getY()+80, getImagen().getIconWidth()-81, getImagen().getIconHeight()-98);
   
   }//Fin de metodo getRectangulo

        
}//Fin de clase
    
