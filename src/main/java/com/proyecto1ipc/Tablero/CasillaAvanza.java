package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Interfaces.Avanza;
import javax.swing.JButton;

/**
 *
 * @author elvis_agui
 */
public class CasillaAvanza extends Casilla implements Avanza {
    private int cantidadPos;
    public CasillaAvanza(int altura, int ancho, int cantJug, int pos, int cantidadPos) {
        super(altura, ancho, cantJug, pos);
        this.cantidadPos = this.cantidadPos;
    }

    @Override
    public int avanza(int i, int pos) {
        int vanza = 0;
        if (numJug[i] == 1) {
            vanza = pos;
        }
        return vanza;

    }

}
