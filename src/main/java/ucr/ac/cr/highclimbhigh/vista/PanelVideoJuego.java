/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.vista;

import java.awt.Graphics;
import ucr.ac.cr.highclimbhigh.controlador.ControladorVideoJuego;


/**
 *
 * @author nashl
 */
public class PanelVideoJuego extends javax.swing.JPanel {


    private ControladorVideoJuego controladorVideoJuego;
    
    //private int vez;
    /**
     * Creates new form PanelVideoJuego
     */
    
    
    public PanelVideoJuego() {
        initComponents();
        //vez=1;
        
    }//Fin de constructor

    public void setControladorVideoJuego(ControladorVideoJuego controladorVideoJuego) {
        this.controladorVideoJuego = controladorVideoJuego;
    }//Fin de metodo setControladorVideoJuego

    public ControladorVideoJuego getControladorVideoJuego() {
        return controladorVideoJuego;
    }//Fin de metodo getControladorVideoJuego
    


    public void paint (Graphics g){
    
        super.paintComponent (g);
        
        controladorVideoJuego.mostrarImagenes(g);
        //fondo.paintIcon(null, g, 0, 0);
        //System.out.print("Me dibujé "+vez+" veces");
        //vez++;
    }//Fin de metodo paint
    
    
   public void escuchar(){
   
       this.addMouseListener(controladorVideoJuego);
       this.addMouseMotionListener(controladorVideoJuego);
   
   }//Fin de metodo escuchar
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}//Fin de la clase
