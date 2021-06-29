package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Interfaces.Avanza;
import javax.swing.JButton;

/**
 *
 * @author elvis_agui
 */
public class CasillaAvanza extends Casilla implements Avanza {
    public CasillaAvanza(int altura, int ancho, int cantJug, int pos, int cantidadPos) {
        super(altura, ancho, cantJug, pos,cantidadPos);
        
    }

    @Override
    public int avanza(int i) {
        int vanza = 0;
        if (numJug[i] == 1) {
            vanza = cantidadPos;
        }
        return vanza;

    }

    public int getCantidadPos() {
        return cantidadPos;
    }

    public void setCantidadPos(int cantidadPos) {
        this.cantidadPos = cantidadPos;
    }
    
    

}
