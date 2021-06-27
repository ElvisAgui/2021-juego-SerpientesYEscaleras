
package com.proyecto1ipc.Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author elvis_agui
 */
public class LectorArchivoTxt {
    
    
    
    public void leerFichero(File archivo,JTextArea text) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] campos=separarCampos(linea);
            //Vehiculo vehiculo=ConstructorDeVehiculos.construirVehiculo(campos);
            
            text.append("\n"+linea);
        }
        fr.close();
    }
      private String[] separarCampos(String linea) {
        String inicioVehiculo = "VEHICULO(";
        String lineaDeCampos = linea.substring(inicioVehiculo.length(), linea.length() - 2);
        System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }
    
}
