
package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Interfaces.TiraDados;

/**
 *
 * @author elvis_agui
 */
public class CasillaTirarD extends Casilla implements TiraDados{

    public CasillaTirarD(int altura, int ancho, int cantJug, int pos,int cantidadPos) {
        super(altura, ancho, cantJug, pos,cantidadPos);
    }

    @Override
    public boolean tirarDado(int i) {
       boolean dad = false;
        if (numJug[i] == 1) {
            dad = true; 
        }
        return dad;
    }
    
    
    
}
