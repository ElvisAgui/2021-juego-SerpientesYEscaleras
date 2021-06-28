package com.proyecto1ipc.jugador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author elvis_agui
 */
public class ManjadorJugadores {

    public static ArrayList<Jugador> Jugadores = new ArrayList<Jugador>();
    public static ArrayList<Jugador> Compitiendo = new ArrayList<Jugador>();

    public static void constructorJugador(int id, String[] datos) {
        Jugador jugador = null;
        if (id == 0) {
            JOptionPane.showMessageDialog(null, "Primero debes de clickear en Listo para generar tu ID");
        }
        if (id != 0 && igual(id) == false) {
            jugador = new Jugador(id, datos[0], datos[1]);
            Jugadores.add(jugador);
        }

    }

    private static boolean igual(int id) {
        boolean repit = false;
        for (int i = 0; i < Jugadores.size(); i++) {
            if (Jugadores.get(i).getId() == id) {
                repit = true;
                break;
            }

        }
        return repit;
    }

}
