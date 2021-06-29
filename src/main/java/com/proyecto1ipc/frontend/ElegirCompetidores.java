package com.proyecto1ipc.frontend;

import com.proyecto1ipc.jugador.Jugador;
import com.proyecto1ipc.jugador.ManejadorReportes;
import com.proyecto1ipc.jugador.ManjadorJugadores;
import javax.swing.JOptionPane;

/**
 *
 * @author elvis_agui
 */
public class ElegirCompetidores extends javax.swing.JFrame {

    public ElegirCompetidores() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondojPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        seleccionjButton = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        verJugjButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        salirJbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quines Jugaran la Partida???");

        fondojPanel.setBackground(new java.awt.Color(51, 0, 204));
        fondojPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        fondojPanel.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Inconsolata Condensed Black", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Jugadores Registrados");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        seleccionjButton.setText("Listo");
        seleccionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionjButtonActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 204, 0));
        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 255, 51));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Inconsolata Condensed Black", 1, 24)); // NOI18N
        jLabel2.setText("selecciona los id, para Jugar");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        verJugjButton.setText("Ver Jugadores");
        verJugjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verJugjButtonActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Inconsolata Condensed Black", 1, 24)); // NOI18N
        jLabel3.setText("Maximo 6 jugadores para la partida");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        salirJbutton.setText("Listo");
        salirJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirJbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondojPanelLayout = new javax.swing.GroupLayout(fondojPanel);
        fondojPanel.setLayout(fondojPanelLayout);
        fondojPanelLayout.setHorizontalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(fondojPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondojPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(fondojPanelLayout.createSequentialGroup()
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(seleccionjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(verJugjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondojPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        fondojPanelLayout.setVerticalGroup(
            fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondojPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verJugjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fondojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salirJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondojPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondojPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionjButtonActionPerformed
        int idax = (int) jComboBox1.getSelectedItem();
        for (Jugador jugador : ManjadorJugadores.Jugadores) {
            if (idax == jugador.getId()) {
                ManjadorJugadores.Compitiendo.add(jugador);
            }
        }
        ManjadorJugadores.Compitiendo.get(0).setTurno(true);
    }//GEN-LAST:event_seleccionjButtonActionPerformed

    private void verJugjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verJugjButtonActionPerformed
        try {
            ManejadorReportes.tablaElegir(ManjadorJugadores.Jugadores, jTable1);
            ManejadorReportes.ides(jComboBox1, ManjadorJugadores.Jugadores);
        } catch (Exception e) {
            JOptionPane.showInternalMessageDialog(this, "Lista Vacia");
        }
    }//GEN-LAST:event_verJugjButtonActionPerformed

    private void salirJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirJbuttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirJbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondojPanel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton salirJbutton;
    private javax.swing.JButton seleccionjButton;
    private javax.swing.JButton verJugjButton;
    // End of variables declaration//GEN-END:variables
}
