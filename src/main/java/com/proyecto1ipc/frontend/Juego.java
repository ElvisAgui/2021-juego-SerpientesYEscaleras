/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto1ipc.frontend;

import com.proyecto1ipc.Archivos.LectorArchivoTxt;
import com.proyecto1ipc.Tablero.Tablero;
import com.proyecto1ipc.jugador.Jugador;
import com.proyecto1ipc.jugador.ManejadorReportes;
import com.proyecto1ipc.jugador.ManjadorJugadores;
import java.awt.Graphics;
import java.awt.Image;
import static java.time.Clock.system;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author elvis_agui
 */
public class Juego extends javax.swing.JFrame {

    private FondoPanel fondo = new FondoPanel();
    private Tablero t;
    private LectorArchivoTxt LectorArchivoTxt;
    private MenuPrincipal regresar;

    public Juego(LectorArchivoTxt LectorArchivoTxt) {
        this.LectorArchivoTxt = LectorArchivoTxt;
        this.setContentPane(fondo);
        initComponents();
        datosPartida();

        //t.prueva();
        if (LectorArchivoTxt.getDimenciones()[1] != 0 && LectorArchivoTxt.getDimenciones()[0] != 0) {
            t = new Tablero(this.fondoJuegojPanel, this.LectorArchivoTxt);
            t.iniciarTablero();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        fondoJuegojPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        titlejLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enJuegojTable = new javax.swing.JTable();
        TirarDadoJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        turnojLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RegresarjButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escaleras Y Serpientes");
        setExtendedState(6);

        fondoJuegojPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout fondoJuegojPanelLayout = new javax.swing.GroupLayout(fondoJuegojPanel);
        fondoJuegojPanel.setLayout(fondoJuegojPanelLayout);
        fondoJuegojPanelLayout.setHorizontalGroup(
            fondoJuegojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        fondoJuegojPanelLayout.setVerticalGroup(
            fondoJuegojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        titlejLabel.setBackground(new java.awt.Color(0, 255, 255));
        titlejLabel.setFont(new java.awt.Font("Inconsolata Condensed Black", 1, 18)); // NOI18N
        titlejLabel.setForeground(new java.awt.Color(0, 0, 0));
        titlejLabel.setText("Jugadores En Partida");

        enJuegojTable.setBackground(new java.awt.Color(0, 102, 204));
        enJuegojTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        enJuegojTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        enJuegojTable.setForeground(new java.awt.Color(0, 0, 0));
        enJuegojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(enJuegojTable);

        TirarDadoJButton.setBackground(new java.awt.Color(255, 153, 0));
        TirarDadoJButton.setForeground(new java.awt.Color(0, 0, 0));
        TirarDadoJButton.setText("TirarDado");
        TirarDadoJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TirarDadoJButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Inconsolata Condensed Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Turno de;");

        turnojLabel.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        turnojLabel.setForeground(new java.awt.Color(0, 0, 0));
        turnojLabel.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TirarDadoJButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(titlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(turnojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(turnojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(TirarDadoJButton)
                .addGap(81, 81, 81))
        );

        jLabel3.setBackground(new java.awt.Color(255, 0, 0));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Inicio");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        RegresarjButton.setBackground(new java.awt.Color(204, 204, 0));
        RegresarjButton.setFont(new java.awt.Font("Inconsolata Condensed Black", 1, 18)); // NOI18N
        RegresarjButton.setForeground(new java.awt.Color(204, 0, 0));
        RegresarjButton.setText("Volver a Menu");
        RegresarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarjButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fondoJuegojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegresarjButton)
                            .addComponent(jButton2))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fondoJuegojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(RegresarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TirarDadoJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TirarDadoJButtonActionPerformed

        t.juego();
        datosPartida();

    }//GEN-LAST:event_TirarDadoJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RegresarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarjButtonActionPerformed
        regresar = new MenuPrincipal();
        regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RegresarjButton;
    private javax.swing.JButton TirarDadoJButton;
    private javax.swing.JTable enJuegojTable;
    private javax.swing.JPanel fondoJuegojPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titlejLabel;
    private javax.swing.JLabel turnojLabel;
    // End of variables declaration//GEN-END:variables

    public void datosPartida() {
        ManejadorReportes.tablaPartida(ManjadorJugadores.Compitiendo, enJuegojTable);
        for (Jugador jugador : ManjadorJugadores.Compitiendo) {
            if (jugador.isTurno()) {
                turnojLabel.setText(jugador.getNombre());
                break;
            }

        }

    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/fondoJuego.png")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }

}
