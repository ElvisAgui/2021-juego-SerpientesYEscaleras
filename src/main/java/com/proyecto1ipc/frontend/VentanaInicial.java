/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1ipc.frontend;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author elvis_agui
 */
public class VentanaInicial extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    MenuPrincipal menu = new MenuPrincipal();

    public VentanaInicial() {
        this.setContentPane(fondo);
        this.setExtendedState(6);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondojPanel = new FondoPanel();
        IniciarJBotton = new javax.swing.JButton();
        bienvenidajLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("\"Juego De Escaleras Y Serpientes\"");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fondojPanel.setToolTipText("");

        IniciarJBotton.setBackground(new java.awt.Color(255, 255, 51));
        IniciarJBotton.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        IniciarJBotton.setForeground(new java.awt.Color(0, 0, 0));
        IniciarJBotton.setText("Comenzar");
        IniciarJBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarJBottonActionPerformed(evt);
            }
        });

        bienvenidajLabel.setBackground(new java.awt.Color(255, 255, 0));
        bienvenidajLabel.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        bienvenidajLabel.setForeground(new java.awt.Color(0, 0, 0));
        bienvenidajLabel.setText("Bienvenido al juego de ");
        bienvenidajLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout fondojPanelLayout = new javax.swing.GroupLayout(fondojPanel);
        fondojPanel.setLayout(fondojPanelLayout);
        fondojPanelLayout.setHorizontalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addContainerGap(336, Short.MAX_VALUE)
                .addComponent(IniciarJBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(bienvenidajLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondojPanelLayout.setVerticalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondojPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(bienvenidajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                .addComponent(IniciarJBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarJBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarJBottonActionPerformed
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IniciarJBottonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IniciarJBotton;
    private javax.swing.JLabel bienvenidajLabel;
    private javax.swing.JPanel fondojPanel;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/serpientes.png")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
    
    

}
