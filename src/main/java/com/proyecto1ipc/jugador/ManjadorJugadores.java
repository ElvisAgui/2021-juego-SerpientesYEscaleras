
package com.proyecto1ipc.jugador;

import java.util.ArrayList;

/**
 *
 * @author elvis_agui
 */
public class ManjadorJugadores {
    
    public static ArrayList<Jugador> Jugadores = new ArrayList<Jugador>();
    
    public static Jugador constructorJugador(int id, String[] datos){
        Jugador jugador = null;
        jugador = new Jugador(id, datos[0], datos[1]);
        return jugador;
    }
    
    
    
}
