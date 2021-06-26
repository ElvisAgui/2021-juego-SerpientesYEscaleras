
package com.proyecto1ipc.frontend;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author elvis_agui
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private FondoPanel fondo = new FondoPanel();
    private RegistroJugadores registro = new RegistroJugadores();
    private LobbyJuego lobby = new LobbyJuego();
    public MenuPrincipal() {
        this.setContentPane(fondo);
        this.setExtendedState(6);
        
        
        initComponents();
        asignarImagenBotones();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondojPanel = new FondoPanel();
        regristarJugadoresjButton = new javax.swing.JButton();
        jagrearJugLabel = new javax.swing.JLabel();
        jugarJButton = new javax.swing.JButton();
        jagrearJugLabel1 = new javax.swing.JLabel();
        jugarJLabel = new javax.swing.JLabel();
        reportesJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondojPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondojPanel.setToolTipText("");

        regristarJugadoresjButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        regristarJugadoresjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regristarJugadoresjButtonActionPerformed(evt);
            }
        });

        jagrearJugLabel.setBackground(new java.awt.Color(102, 102, 0));
        jagrearJugLabel.setFont(new java.awt.Font("Droid Naskh Shift Alt", 1, 18)); // NOI18N
        jagrearJugLabel.setForeground(new java.awt.Color(255, 51, 0));
        jagrearJugLabel.setText("Reporte de Jugadores -->");

        jugarJButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jugarJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarJButtonActionPerformed(evt);
            }
        });

        jagrearJugLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jagrearJugLabel1.setFont(new java.awt.Font("Droid Naskh Shift Alt", 1, 18)); // NOI18N
        jagrearJugLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jagrearJugLabel1.setText("Agreagar Jugadores -->");

        jugarJLabel.setBackground(new java.awt.Color(102, 102, 0));
        jugarJLabel.setFont(new java.awt.Font("FreeSans", 1, 18)); // NOI18N
        jugarJLabel.setForeground(new java.awt.Color(0, 102, 255));
        jugarJLabel.setText("Comenzar a Jugar --->");

        reportesJButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        reportesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportesJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondojPanelLayout = new javax.swing.GroupLayout(fondojPanel);
        fondojPanel.setLayout(fondojPanelLayout);
        fondojPanelLayout.setHorizontalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fondojPanelLayout.createSequentialGroup()
                        .addComponent(jugarJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jugarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(523, 523, 523))
                    .addGroup(fondojPanelLayout.createSequentialGroup()
                        .addComponent(jagrearJugLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondojPanelLayout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jagrearJugLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reportesJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(295, Short.MAX_VALUE))
                            .addGroup(fondojPanelLayout.createSequentialGroup()
                                .addComponent(regristarJugadoresjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        fondojPanelLayout.setVerticalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regristarJugadoresjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jagrearJugLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondojPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jugarJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondojPanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jugarJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportesJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondojPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jagrearJugLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
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

    private void regristarJugadoresjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regristarJugadoresjButtonActionPerformed
        registro.setVisible(true);

    }//GEN-LAST:event_regristarJugadoresjButtonActionPerformed

    private void jugarJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarJButtonActionPerformed

        this.lobby.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jugarJButtonActionPerformed

    private void reportesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportesJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportesJButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondojPanel;
    private javax.swing.JLabel jagrearJugLabel;
    private javax.swing.JLabel jagrearJugLabel1;
    private javax.swing.JButton jugarJButton;
    private javax.swing.JLabel jugarJLabel;
    private javax.swing.JButton regristarJugadoresjButton;
    private javax.swing.JButton reportesJButton;
    // End of variables declaration//GEN-END:variables


    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/men.png")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
    
    private void asignarImagenBotones(){
        regristarJugadoresjButton.setIcon(ajustar("/Imagenes/usuar.png", regristarJugadoresjButton));
        jugarJButton.setIcon(ajustar("/Imagenes/jugar.png", jugarJButton));
        reportesJButton.setIcon(ajustar("/Imagenes/report.png", jugarJButton));
    }
    
    private Icon ajustar(String direccion, JButton boton){
        ImageIcon icon = new ImageIcon(getClass().getResource(direccion));
        ImageIcon icono = new ImageIcon(icon.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT));
        return icono;
    }
}
