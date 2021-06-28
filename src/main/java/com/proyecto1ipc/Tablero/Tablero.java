
package com.proyecto1ipc.Tablero;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author elvis_agui
 */
public class Tablero {
    
    private JPanel fondo;
    private CasillaSimple purea = new CasillaSimple(45, 45, 4, 5);
    
    public Tablero(JPanel fondo){
        this.fondo= fondo;
    }
    
    
    
    public void prueva(){
        //fondo.setLayout(null);
        purea.getNumJug()[0] = 1;
        purea.getNumJug()[1] = 1;
        purea.getNumJug()[2] = 1;
        purea.getNumJug()[3] = 1;
        purea.agregar();
        purea.setBounds(0, 0, 100, 100);
        this.fondo.add(purea);
        this.fondo.setBackground(Color.ORANGE);
    }
}
