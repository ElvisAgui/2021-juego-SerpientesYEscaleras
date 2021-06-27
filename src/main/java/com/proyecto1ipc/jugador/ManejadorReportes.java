
package com.proyecto1ipc.jugador;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author elvis_agui
 */
public class ManejadorReportes {
    
    public static void tablaElegir(ArrayList<Jugador> jugadores, JTable table) {
        DefaultTableModel modelo = new DefaultTableModel();
        table.setModel(modelo);
        //Anadir columnas
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        for (Jugador jugador : jugadores) {
            modelo.addRow(new Object[]{jugador.getId(),jugador.getNombre(),jugador.getApellido()});
        }

    }
    public static void ides(JComboBox lista,ArrayList<Jugador> jugadores){
        for (Jugador jugador : jugadores) {
            lista.addItem(jugador.getId());
        }
        
    }
    
}
