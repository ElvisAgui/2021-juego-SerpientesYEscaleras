package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Interfaces.Bajada;

/**
 *
 * @author elvis_agui
 */
public class CasillaBajada extends Casilla implements Bajada {

    public CasillaBajada(int altura, int ancho, int cantJug, int pos) {
        super(altura, ancho, cantJug, pos);
    }

    @Override
    public int bajar(int i, int pos) {
        int ret = 0;
        if (numJug[i] == 1) {
            ret = pos;
        }
        return ret;

    }

}
