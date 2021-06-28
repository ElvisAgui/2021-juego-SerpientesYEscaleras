package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Archivos.LectorArchivoTxt;
import com.proyecto1ipc.jugador.ManjadorJugadores;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author elvis_agui
 */
public class Tablero {

    private JPanel fondo;
    private CasillaSimple purea = new CasillaSimple(45, 45, 4, 5);
    LectorArchivoTxt LectorArchivoTxt;
    private Casilla tablero[][];

    public Tablero(JPanel fondo, LectorArchivoTxt LectorArchivoTxt) {
        this.LectorArchivoTxt = LectorArchivoTxt;
        this.tablero = new Casilla[LectorArchivoTxt.getDimenciones()[0]][LectorArchivoTxt.getDimenciones()[1]];
        this.fondo = fondo;
    }

    public void iniciarTablero() {
        boolean esColorInicio = false;
        boolean esColorIteracion = false;
        if (LectorArchivoTxt.getDimenciones()[1] != 0 && LectorArchivoTxt.getDimenciones()[0] != 0) {
            int par;
            this.fondo.setBackground(Color.ORANGE);
            int x = 0;
            int y = 0;
            int cant = ManjadorJugadores.Compitiendo.size();
            int ancho = (fondo.getWidth() / LectorArchivoTxt.getDimenciones()[1]);
            int pos = 0;
            int alto = (fondo.getHeight() / LectorArchivoTxt.getDimenciones()[0]);
            for (int i = 0; i < tablero.length; i++) {
                esColorIteracion = !esColorInicio;
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = tipo(i, j, alto, ancho, cant, pos, x, y);
                    tablero[i][j].setBounds(x, y, ancho, alto);
                    if (esColorIteracion) {
                        tablero[i][j].setBackground(Color.orange);
                    }
                    if (i == LectorArchivoTxt.getDimenciones()[1] - 1 && j == LectorArchivoTxt.getDimenciones()[0] - 1) {
                        tablero[i][j].setBackground(Color.MAGENTA);
                        tablero[i][j].getNum().setText("Fin-");
                    }
                    if (i == 0 && j == 0) {
                        tablero[i][j].setBackground(Color.MAGENTA);
                        for (int k = 0; k < cant; k++) {
                            tablero[i][j].getNumJug()[k] = 1;
                        }
                    }
                    esColorIteracion = !esColorIteracion;
                    tablero[i][j].agregar();
                    fondo.add(tablero[i][j]);
                    x += ancho;
                    pos++;

                }
                esColorInicio = !esColorInicio;
                x = 0;
                y += alto;
            }
        }

        //try {
        // } catch (Exception e) {
        //}
    }

    /**
     * retorna el tipo de casilla que se crea dependiendo de sus casillas
     *
     * @param i
     * @param j
     * @param alto
     * @param ancho
     * @param cant
     * @param pos
     * @param x
     * @param y
     * @return
     */
    public Casilla tipo(int i, int j, int alto, int ancho, int cant, int pos, int x, int y) {
        Casilla tem = new CasillaSimple(alto, ancho, cant, pos);
        if (i == 0 && j == 0) {
            tem = new CasillaSimple(alto, ancho, cant, pos);
            tem.setBounds(x, y, ancho, alto);
            tem.setBackground(Color.RED);

        }
        for (int k = 0; k < LectorArchivoTxt.pierdeTur.length - 1; k++) {
            if (i == LectorArchivoTxt.pierdeTur[k] && j == LectorArchivoTxt.pierdeTur[k + 1]) {
                tem = new CasillaPierdeT(alto, ancho, cant, pos);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.tiradado.length - 1; k++) {
            if (i == LectorArchivoTxt.tiradado[k] && j == LectorArchivoTxt.tiradado[k + 1]) {
                tem = new CasillaTirarD(alto, ancho, cant, pos);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.avanza.length - 1; k++) {
            if (i == LectorArchivoTxt.avanza[k] && j == LectorArchivoTxt.avanza[k + 1]) {
                tem = new CasillaAvanza(alto, ancho, cant, pos, LectorArchivoTxt.avanza[k + 2]);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.retroces.length - 1; k++) {
            if (i == LectorArchivoTxt.retroces[k] && j == LectorArchivoTxt.retroces[k + 1]) {
                tem = new CasillaRetroced(alto, ancho, cant, pos, LectorArchivoTxt.retroces[k + 2]);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.subid.length - 4; k += 4) {
            if (i == LectorArchivoTxt.subid[k] && j == LectorArchivoTxt.subid[k + 1]) {
                tem = new Casillasubida(alto, ancho, cant, pos);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.subid.length - 4; k += 4) {
            if (i == LectorArchivoTxt.bajad[k] && j == LectorArchivoTxt.bajad[k + 1]) {
                tem = new Casillasubida(alto, ancho, cant, pos);

            }
        }

        return tem;
    }

    public void xd() {
        tablero[0][0].getNumJug()[0] = 1;
        tablero[0][0].getNumJug()[1] = 1;
        tablero[0][0].getNumJug()[2] = 1;
        tablero[0][0].getNumJug()[3] = 1;
    }

    public void prueva() {
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
