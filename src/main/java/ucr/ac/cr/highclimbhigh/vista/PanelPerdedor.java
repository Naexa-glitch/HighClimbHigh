/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ucr.ac.cr.highclimbhigh.vista;

import ucr.ac.cr.highclimbhigh.controlador.ControladorPerdedor;

/**
 *
 * @author nashl
 */
public class PanelPerdedor extends javax.swing.JPanel {

    private ControladorPerdedor controladorPerdedor;
    /**
     * Creates new form PanelPerdedor
     */
    public PanelPerdedor() {
        initComponents();
    }//Fin de constructor

    public void setControladorPerdedor(ControladorPerdedor controladorPerdedor) {
        this.controladorPerdedor = controladorPerdedor;
    }//Fin de metodo setControladorPerdedor
    
    public void escucharPerdedor(){
    
        btnSalir.addActionListener(controladorPerdedor);
        btnJugar.addActionListener(controladorPerdedor);
        btnRegistrar.addActionListener(controladorPerdedor);
    
    }//Fin de metodo escucharPerdedor

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonesSalirSin fondo.png"))); // NOI18N
        btnSalir.setActionCommand("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonesJugarSinfondo.png"))); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.setBorderPainted(false);
        btnJugar.setContentAreaFilled(false);
        jPanel1.add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 220, 90));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botonesRegistrar.png"))); // NOI18N
        btnRegistrar.setActionCommand("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perdiste.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}//Fin de la clase
