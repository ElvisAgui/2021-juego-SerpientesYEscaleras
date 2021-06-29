package com.proyecto1ipc.Tablero;

import com.proyecto1ipc.Archivos.LectorArchivoTxt;
import com.proyecto1ipc.jugador.Jugador;
import com.proyecto1ipc.jugador.ManjadorJugadores;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author elvis_agui
 */
public class Tablero {

    private int pos = 0;
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
        for (int k = 0; k < LectorArchivoTxt.pierdeTur.length - 1; k += 2) {
            if (i == LectorArchivoTxt.pierdeTur[k] && j == LectorArchivoTxt.pierdeTur[k + 1]) {
                tem = new CasillaPierdeT(alto, ancho, cant, pos);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.tiradado.length - 1; k += 2) {
            if (i == LectorArchivoTxt.tiradado[k] && j == LectorArchivoTxt.tiradado[k + 1]) {
                tem = new CasillaTirarD(alto, ancho, cant, pos);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.avanza.length - 1; k += 2) {
            if (i == LectorArchivoTxt.avanza[k] && j == LectorArchivoTxt.avanza[k + 1]) {
                tem = new CasillaAvanza(alto, ancho, cant, pos, LectorArchivoTxt.avanza[k + 2]);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.retroces.length - 1; k += 2) {
            if (i == LectorArchivoTxt.retroces[k] && j == LectorArchivoTxt.retroces[k + 1]) {
                tem = new CasillaRetroced(alto, ancho, cant, pos, LectorArchivoTxt.retroces[k + 2]);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.subid.length - 4; k += 4) {
            if (i == LectorArchivoTxt.subid[k] && j == LectorArchivoTxt.subid[k + 1]) {
                tem = new Casillasubida(alto, ancho, cant, pos);

            }
        }
        for (int k = 0; k < LectorArchivoTxt.bajad.length - 4; k += 4) {
            if (i == LectorArchivoTxt.bajad[k] && j == LectorArchivoTxt.bajad[k + 1]) {
                tem = new CasillaBajada(alto, ancho, cant, pos);

            }
        }

        return tem;
    }

    public void juego() {
        int dado = tirarDado();
        int i = turno();
        borrarFicha(i);
        cambiarPos(i, dado);
        pintaFicha(i);
        Casilla aux;
        if (( aux = obtenerCasill(i))!= null) {
            if (aux instanceof CasillaPierdeT) {
                ManjadorJugadores.Compitiendo.get(i).setPierdeTurno(((CasillaPierdeT) aux).pierdeTurno(i));  
                JOptionPane.showMessageDialog(null, "UPss!!, Casilla Pierde Turno");
            }
            if (aux instanceof CasillaTirarD) {
                JOptionPane.showMessageDialog(null, "Genial!!, Casilla repite tiro");
                ManjadorJugadores.Compitiendo.get(i).setTurno(((CasillaTirarD) aux).tirarDado(i));
                if (i == ManjadorJugadores.Compitiendo.size() - 1) {
                    ManjadorJugadores.Compitiendo.get(0).setTurno(false);
                } else {
                    ManjadorJugadores.Compitiendo.get(i + 1).setTurno(false);
                }  
            }
            if (aux instanceof CasillaAvanza) {
                
            }
            
        }
    }
    
    public Casilla obtenerCasill(int i){
        Casilla aux= null;
        int pos = ManjadorJugadores.Compitiendo.get(i).getPos();
        for (int j = 0; j < tablero.length; j++) {
            for (int k = 0; k < tablero[j].length; k++) {
                if (tablero[j][k].getPos() == pos) {
                    aux = tablero[j][k];
                    break;
                }
            }

        }
        return aux;
    }
    
    public void borrarFicha(int i) {
        int pos = ManjadorJugadores.Compitiendo.get(i).getPos();
        for (int j = 0; j < tablero.length; j++) {
            for (int k = 0; k < tablero[j].length; k++) {
                if (tablero[j][k].getPos() == pos) {
                    tablero[j][k].getNumJug()[i] = 0;
                    tablero[j][k].agregar();
                    break;
                }
            }

        }
    }

    public void cambiarPos(int i, int dado) {
        int pos = ManjadorJugadores.Compitiendo.get(i).getPos() + dado;
        if (pos <= tablero[LectorArchivoTxt.getDimenciones()[0] - 1][LectorArchivoTxt.getDimenciones()[1] - 1].getPos()) {
            ManjadorJugadores.Compitiendo.get(i).setPos(pos);
        } else {
            ManjadorJugadores.Compitiendo.get(i).setPos(pos);
        }
    }

    public void pintaFicha(int i) {
        int pos = ManjadorJugadores.Compitiendo.get(i).getPos();
        for (int j = 0; j < tablero.length; j++) {
            for (int k = 0; k < tablero[j].length; k++) {
                if (tablero[j][k].getPos() == pos) {
                    tablero[j][k].getNumJug()[i] = 1;
                    tablero[j][k].agregar();
                    break;
                }
            }

        }

    }

    public boolean ganador() {
        boolean ganador = false;
        for (Jugador jugador : ManjadorJugadores.Compitiendo) {
            if (jugador.getPos() == pos) {
                ganador = true;
                JOptionPane.showMessageDialog(this.fondo, "Felicidades Jugador " + jugador.getNombre() + " Haz Ganado");
                break;
            }
        }

        return ganador;

    }

    public int turno() {
        int iterador = 0;
        for (int i = 0; i < ManjadorJugadores.Compitiendo.size(); i++) {
            if (ManjadorJugadores.Compitiendo.get(i).isTurno() && ManjadorJugadores.Compitiendo.get(i).isPierdeTurno() == false) {
                iterador = i;
                ManjadorJugadores.Compitiendo.get(i).setTurno(false);
                if (i == ManjadorJugadores.Compitiendo.size() - 1) {
                    ManjadorJugadores.Compitiendo.get(0).setTurno(true);
                } else {
                    ManjadorJugadores.Compitiendo.get(i + 1).setTurno(true);
                }
                break;
            }
            if (ManjadorJugadores.Compitiendo.get(i).isTurno() && ManjadorJugadores.Compitiendo.get(i).isPierdeTurno()) {
                ManjadorJugadores.Compitiendo.get(i).setTurno(false);
                ManjadorJugadores.Compitiendo.get(i).setPierdeTurno(false);
                if (i == ManjadorJugadores.Compitiendo.size() - 1) {
                    iterador = 0;
                    ManjadorJugadores.Compitiendo.get(1).setTurno(true);
                } else {
                    iterador = i + 1;
                    ManjadorJugadores.Compitiendo.get(i + 2).setTurno(true);
                }
                break;
            }
        }
        return iterador;

    }

    public int tirarDado() {
        int dado1 = (int) (Math.random() * 5) + 1;
        int dado2 = (int) (Math.random() * 5) + 1;
        JOptionPane.showMessageDialog(this.fondo, "El valor del primer dado es: " + dado1 + "\nEl valor del segundo dado es: " + dado2);
        JOptionPane.showInternalMessageDialog(this.fondo, "El valor del primer dado es: " + dado1 + "\nEl valor del segundo dado es: " + dado2);
        return dado1 + dado2;
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
