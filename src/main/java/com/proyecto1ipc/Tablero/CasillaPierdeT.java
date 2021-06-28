package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Interfaces.PierdeTurno;

/**
 *
 * @author elvis_agui
 */
public class CasillaPierdeT extends Casilla implements PierdeTurno {

    public CasillaPierdeT(int altura, int ancho, int cantJug, int pos) {
        super(altura, ancho, cantJug, pos);
    }

    @Override
    public boolean pierdeTurno(int i) {
        boolean turno = false;
        if (numJug[i] == 1) {
            turno = true;
        }

        return turno;
    }

}
