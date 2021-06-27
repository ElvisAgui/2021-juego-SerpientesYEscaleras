
package com.proyecto1ipc.Tablero;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author elvis_agui
 */
public class Casilla extends JPanel{
    private JButton ficha[] = new JButton[4];
    private int altura;
    private int ancho;
    private int pos;

    public JButton[] getFicha() {
        return ficha;
    }

    public void setFicha(JButton[] ficha) {
        this.ficha = ficha;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    
    
    
}
