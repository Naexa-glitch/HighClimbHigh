/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.vista;

import ucr.ac.cr.highclimbhigh.controlador.ControladorMenu;

/**
 *
 * @author nashl
 */
public class PanelMenu extends javax.swing.JPanel {

    private ControladorMenu controladorMenu;
    
    /**
     * Creates new form PanelMenu
     */
    public PanelMenu() {
        initComponents(); 
    }//Fin de constructor

    public void setControladorMenu(ControladorMenu controladorMenu) {
        this.controladorMenu = controladorMenu;
    }//Fin de metodo setControladorMenu
    
    public void escucharMenu(){
    
        btnJugar.addActionListener(controladorMenu);
        btnInstrucciones.addActionListener(controladorMenu);
        btnCreditos.addActionListener(controladorMenu);
        btnSalir.addActionListener(controladorMenu);
    
    }//Fin de metodo escucharMenu

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnJugar = new javax.swing.JButton();
        btnInstrucciones = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonesJugar.png"))); // NOI18N
        btnJugar.setActionCommand("Jugar");
        btnJugar.setBorderPainted(false);
        btnJugar.setContentAreaFilled(false);
        jPanel1.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 160, -1, -1));

        btnInstrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonesInstrucciones.png"))); // NOI18N
        btnInstrucciones.setActionCommand("Instrucciones");
        btnInstrucciones.setBorderPainted(false);
        btnInstrucciones.setContentAreaFilled(false);
        jPanel1.add(btnInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        btnCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonesCreditos.png"))); // NOI18N
        btnCreditos.setActionCommand("Creditos");
        btnCreditos.setBorderPainted(false);
        btnCreditos.setContentAreaFilled(false);
        jPanel1.add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonesSalirSin fondo.png"))); // NOI18N
        btnSalir.setActionCommand("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Menú.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 760));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnInstrucciones;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}//Fin de la clase
