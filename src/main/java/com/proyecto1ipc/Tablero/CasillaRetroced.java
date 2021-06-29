
package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Interfaces.Retrocede;

/**
 *
 * @author elvis_agui
 */
public class CasillaRetroced extends Casilla implements Retrocede{
    public CasillaRetroced(int altura, int ancho, int cantJug, int pos,int cantidadPos) {
        super(altura, ancho, cantJug, pos,cantidadPos);
        
    }

    @Override
    public int retrocede(int i) {
        int retro = 0;
        if (numJug[i] == 1) {
            retro = cantidadPos;
        }
        return retro;
        
    }
    
}
