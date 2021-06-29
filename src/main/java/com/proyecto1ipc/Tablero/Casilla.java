package com.proyecto1ipc.Tablero;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author elvis_agui
 */
public abstract class Casilla extends JPanel {

    protected JButton ficha[] = new JButton[4];
    protected JLabel num = new JLabel();
    protected int altura;
    protected int ancho;
    protected final int pos;
    protected int cantJug;
    protected int numJug[] = new int[4];

    public Casilla(int altura, int ancho, int cantJug, int pos) {
        this.altura = altura;
        this.ancho = ancho;
        this.cantJug = cantJug;
        this.pos = pos;
        inicializar();
    }

    public void inicializar() {
        for (int i = 0; i < ficha.length; i++) {
            if (i <= cantJug - 1) {
                ficha[i] = new JButton();
                pintar(i, ficha[i]);
            }
        }
        for (int i = 0; i < ficha.length; i++) {
            if (i <= cantJug - 1) {
                numJug[i] = 0;
            } else {
                numJug[i] = 16165;
            }
        }

    }

    private void pintar(int pos, JButton boton) {
        if (pos == 0) {
            boton.setBackground(Color.red);
        }
        if (pos == 1) {
            boton.setBackground(Color.yellow);
        }
        if (pos == 2) {
            boton.setBackground(Color.blue);
        }
        if (pos == 3) {
            boton.setBackground(Color.green);
        }
    }

    public void repitar() {
        this.removeAll();
    }

    public void agregar() {
        repitar();
        int temp=pos+1;
        num.setText("*" + temp + "*");
        num.setBounds(0, 0, 30, 15);
        this.add(num);
        for (int i = 0; i < ficha.length; i++) {
            if (ficha[i] != null && numJug[i] == 1) {
                ficha[i].setBounds(30, 15, 50, 50);
                this.add(ficha[i]);
            }
        }
    }

    //get and seters
    public int getCantJug() {
        return cantJug;
    }

    public void setCantJug(int cantJug) {
        this.cantJug = cantJug;
    }

    public int[] getNumJug() {
        return numJug;
    }

    public void setNumJug(int[] numJug) {
        this.numJug = numJug;
    }

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

    public JLabel getNum() {
        return num;
    }

    public void setNum(JLabel num) {
        this.num = num;
    }

}
