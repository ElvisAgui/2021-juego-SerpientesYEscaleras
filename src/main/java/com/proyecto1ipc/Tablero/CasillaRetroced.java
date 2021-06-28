
package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Interfaces.Retrocede;

/**
 *
 * @author elvis_agui
 */
public class CasillaRetroced extends Casilla implements Retrocede{

    public CasillaRetroced(int altura, int ancho, int cantJug, int pos) {
        super(altura, ancho, cantJug, pos);
    }

    @Override
    public int retrocede(int i, int pos) {
        int retro = 0;
        if (numJug[i] == 1) {
            retro = pos;
        }
       
        return retro;
        
    }
    
}
