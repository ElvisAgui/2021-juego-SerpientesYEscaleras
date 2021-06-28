
package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Interfaces.Subida;

/**
 *
 * @author elvis_agui
 */
public class Casillasubida extends Casilla implements Subida{

    public Casillasubida(int altura, int ancho, int cantJug, int pos) {
        super(altura, ancho, cantJug, pos);
    }

    @Override
    public int bajada(int i, int pos) {
        int ret = 0;
        if (numJug[i] == 1) {
            ret = pos;  
        }
        return ret;
        
    }
    
}
