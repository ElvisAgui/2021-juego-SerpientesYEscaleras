
package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Interfaces.Retrocede;

/**
 *
 * @author elvis_agui
 */
public class CasillaRetroced extends Casilla implements Retrocede{
    private int cantidadPos;
    public CasillaRetroced(int altura, int ancho, int cantJug, int pos,int cantidadPos) {
        super(altura, ancho, cantJug, pos);
        this.cantidadPos = this.cantidadPos;
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
