
package com.proyecto1ipc.Archivos;

import com.proyecto1ipc.jugador.Jugador;
import com.proyecto1ipc.jugador.ManjadorJugadores;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author elvis_agui
 */
public class GuardarBinario {
    
    
    public void Guardar(String archivo) throws FileNotFoundException, IOException{
        FileOutputStream fileOutput; 
        ObjectOutputStream salida;
        for (Jugador jugador : ManjadorJugadores.Jugadores) {
            fileOutput = new FileOutputStream(archivo+"/"+jugador.getId());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(jugador);
            salida.close();
        }

    }
}
