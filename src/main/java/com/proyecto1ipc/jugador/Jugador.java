package com.proyecto1ipc.jugador;

import java.io.Serializable;

/**
 *
 * @author elvis_agui
 */
public class Jugador implements Serializable{

    private int id;
    private String nombre;
    private String apellido;
    private int partidadGanadas;
    private int partidadPerdiadas;
    private int partidasJugadas;
    private boolean turno = false;
    private boolean pierdeTurno = false;
    private int pos=0;

    public Jugador(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;

    }
    

    //Inicio de Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getPartidadGanadas() {
        return partidadGanadas;
    }

    public void setPartidadGanadas(int partidadGanadas) {
        this.partidadGanadas += partidadGanadas;
    }

    public int getPartidadPerdiadas() {
        return partidadPerdiadas;
    }

    public void setPartidadPerdiadas(int partidadPerdiadas) {
        this.partidadPerdiadas += partidadPerdiadas;
    }

    public int getPartidasJugadas() {
        return partidasJugadas = partidadGanadas + partidadPerdiadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    

    public boolean isPierdeTurno() {
        return pierdeTurno;
    }

    public void setPierdeTurno(boolean pierdeTurno) {
        this.pierdeTurno = pierdeTurno;
    }
    
    

}
