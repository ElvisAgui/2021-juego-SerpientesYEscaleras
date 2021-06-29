package com.proyecto1ipc.Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author elvis_agui
 */
public class LectorArchivoTxt {

    private String inicioTablero = "tablero(";
    private String pierdeTurno = "pierdeturno(";
    private String tirarDado = "tiradados(";
    private String avanz = "avanza(";
    private String retroceso = "retrocede(";
    private String subida = "subida(";
    private String bajada = "bajada(";
    private  int[] dimenciones = new int[2];
    public  int[] pierdeTur = new int[30];
    public  int[] tiradado = new int[30];
    public  int[] avanza = new int[60];
    public  int[] retroces = new int[60];
    public  int[] subid = new int[100];
    public  int[] bajad = new int[100];
    
    public LectorArchivoTxt(){
        inicializar();
//        dimenciones[0]=8;
//        dimenciones[1]=8;
    }

    public void leerFichero(File archivo) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {   
            separarCampos(linea);
        }
        fr.close();
    }

    private void separarCampos(String linea) {
        String campos[] = null;
        String aux = linea.substring(0, 8);
        if (aux.equalsIgnoreCase(this.inicioTablero)) {
            String lineaDeCampos = linea.substring(inicioTablero.length(), linea.length() - 1);
            campos = lineaDeCampos.split(",");
            if (verificacion(campos)) {
                dimenciones[0] = Integer.parseInt(campos[0]);
                dimenciones[1] = Integer.parseInt(campos[1]);
            }
        } else {
            aux = linea.substring(0, 12);
            if (aux.equalsIgnoreCase(pierdeTurno)) {
                String lineaDeCampos = linea.substring(pierdeTurno.length(), linea.length() - 1);
                campos = lineaDeCampos.split(",");
                if (verificacion(campos)) {
                    int i = indice(pierdeTur);
                    pierdeTur[i] = Integer.parseInt(campos[0]);
                    pierdeTur[i+1] = Integer.parseInt(campos[1]);
                }
            } else {
                aux = linea.substring(0, 9);
                if (aux.equalsIgnoreCase(tirarDado)) {
                    String lineaDeCampos = linea.substring(tirarDado.length(), linea.length() - 1);
                    campos = lineaDeCampos.split(",");
                    if (verificacion(campos)) {
                        int i = indice(tiradado);
                        tiradado[i] = Integer.parseInt(campos[0]);
                        tiradado[i+1] = Integer.parseInt(campos[1]);
                    }
                } else {
                    aux = linea.substring(0, 7);
                    if (aux.equalsIgnoreCase(avanz)) {
                        String lineaDeCampos = linea.substring(avanz.length(), linea.length() - 1);
                        campos = lineaDeCampos.split(",");
                        if (verificacion(campos)) {
                            int i = indice(avanza);
                            avanza[i] = Integer.parseInt(campos[0]);
                            avanza[i+1] = Integer.parseInt(campos[1]);
                            avanza[i+2] = Integer.parseInt(campos[2]);
                        }
                    } else {
                        aux = linea.substring(0, 10);
                        if (aux.equalsIgnoreCase(retroceso)) {
                            String lineaDeCampos = linea.substring(retroceso.length(), linea.length() - 1);
                            campos = lineaDeCampos.split(",");
                            if (verificacion(campos)) {
                                int i = indice(retroces);
                                retroces[i] = Integer.parseInt(campos[0]);
                                retroces[i+1] = Integer.parseInt(campos[1]);
                                retroces[i+2] = Integer.parseInt(campos[2]);
                            }
                        } else {
                            aux = linea.substring(0, 7);
                            if (aux.equalsIgnoreCase(subida)) {
                                String lineaDeCampos = linea.substring(subida.length(), linea.length() - 1);
                                campos = lineaDeCampos.split(",");
                                if (verificacion(campos)) {
                                    int i = indice(subid);
                                    subid[i] = Integer.parseInt(campos[0]);
                                    subid[i+1] = Integer.parseInt(campos[1]);
                                    subid[i+2] = Integer.parseInt(campos[2]);
                                    subid[i+3] = Integer.parseInt(campos[3]);
                                }
                            } else {
                                aux = linea.substring(0, 7);
                                if (aux.equalsIgnoreCase(bajada)) {
                                    String lineaDeCampos = linea.substring(bajada.length(), linea.length() - 1);
                                    campos = lineaDeCampos.split(",");
                                    if (verificacion(campos)) {
                                        int i = indice(bajad);
                                        bajad[i] = Integer.parseInt(campos[0]);
                                        bajad[i+1] = Integer.parseInt(campos[1]);
                                        bajad[i+2] = Integer.parseInt(campos[2]);
                                        bajad[i+3] = Integer.parseInt(campos[3]);
                                    }
                                }

                            }
                        }

                    }

                }

            }
        }

    }

    private int indice(int[] arreglo) {
        int inci = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] == -1) {
                inci =i;
                break;
            }
        }
        return inci;
    }

    private void negativo(int [] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = -1;
        }
    }
    
    private void inicializar(){
        negativo(tiradado);
        negativo(pierdeTur);
        negativo(avanza);
        negativo(retroces);
        negativo(subid);
        negativo(bajad);
    }

    private boolean verificacion(String[] num) {
        boolean verificado = true;
        if (num != null) {
            try {
                for (int i = 0; i < num.length; i++) {
                    int nu = Integer.parseInt(num[i]);
                }
            } catch (Exception e) {
                verificado = false;
            }
        }

        return verificado;
    }

    public int[] getDimenciones() {
        return dimenciones;
    }

    public void setDimenciones(int[] dimenciones) {
        this.dimenciones = dimenciones;
    }

    
    
}
