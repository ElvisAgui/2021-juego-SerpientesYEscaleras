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
    private static int[] dimenciones = new int[2];
    private static int[] pierdeTur = new int[30];
    private static int[] tiradado = new int[30];
    private static int[] avanza = new int[30];
    private static int[] retroces = new int[30];
    private static int[] subid = new int[60];
    private static int[] bajad = new int[30];

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
        String aux = linea.substring(0, 9);
        if (aux.equalsIgnoreCase(this.inicioTablero)) {
            String lineaDeCampos = linea.substring(inicioTablero.length(), linea.length() - 2);
            campos = lineaDeCampos.split(",");
            if (verificacion(campos)) {
                dimenciones[0] = Integer.parseInt(campos[0]);
                dimenciones[1] = Integer.parseInt(campos[1]);
            }
        } else {
            aux = linea.substring(0, 13);
            if (aux.equalsIgnoreCase(pierdeTurno)) {
                String lineaDeCampos = linea.substring(pierdeTurno.length(), linea.length() - 2);
                campos = lineaDeCampos.split(",");
                if (verificacion(campos)) {
                    pierdeTur[0] = Integer.parseInt(campos[0]);
                    pierdeTur[1] = Integer.parseInt(campos[1]);
                }
            } else {
                aux = linea.substring(0, 10);
                if (aux.equalsIgnoreCase(tirarDado)) {
                    String lineaDeCampos = linea.substring(tirarDado.length(), linea.length() - 2);
                    campos = lineaDeCampos.split(",");
                    if (verificacion(campos)) {
                        tiradado[0] = Integer.parseInt(campos[0]);
                        tiradado[1] = Integer.parseInt(campos[1]);
                    }
                } else {
                    aux = linea.substring(0, 8);
                    if (aux.equalsIgnoreCase(avanz)) {
                        String lineaDeCampos = linea.substring(avanz.length(), linea.length() - 2);
                        campos = lineaDeCampos.split(",");
                        if (verificacion(campos)) {
                            avanza[0] = Integer.parseInt(campos[0]);
                            avanza[1] = Integer.parseInt(campos[1]);
                        }
                    } else {
                        aux = linea.substring(0, 11);
                        if (aux.equalsIgnoreCase(retroceso)) {
                            String lineaDeCampos = linea.substring(retroceso.length(), linea.length() - 2);
                            campos = lineaDeCampos.split(",");
                            if (verificacion(campos)) {
                                retroces[0] = Integer.parseInt(campos[0]);
                                retroces[1] = Integer.parseInt(campos[1]);
                            }
                        } else {
                            aux = linea.substring(0, 8);
                            if (aux.equalsIgnoreCase(subida)) {
                                String lineaDeCampos = linea.substring(subida.length(), linea.length() - 2);
                                campos = lineaDeCampos.split(",");
                                if (verificacion(campos)) {
                                    subid[0] = Integer.parseInt(campos[0]);
                                    subid[1] = Integer.parseInt(campos[1]);
                                }
                            } else {
                                aux = linea.substring(0, 8);
                                if (aux.equalsIgnoreCase(bajada)) {
                                    String lineaDeCampos = linea.substring(bajada.length(), linea.length() - 2);
                                    campos = lineaDeCampos.split(",");
                                    if (verificacion(campos)) {
                                        bajad[0] = Integer.parseInt(campos[0]);
                                        bajad[1] = Integer.parseInt(campos[1]);
                                    }
                                }

                            }
                        }

                    }

                }

            }
        }

    }

    private boolean verificacion(String[] num) {
        boolean verificado = true;
        if (num != null) {
            try {
                int nu = Integer.parseInt(num[0]);
                nu = Integer.parseInt(num[1]);
            } catch (Exception e) {
                verificado = false;
            }
        }

        return verificado;
    }

}
