/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_append;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author carlo
 */
public class EVA3_13_APPEND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta= "C:\\archivos\\";
        try {
           
            writeUsingBufferedWriter(ruta+"archivoBufferedWriter.txt","Prueba de escritura de archivo. "+
                    "Usando la clase BufferedWriter");
        } catch (IOException ex) {
            ex.printStackTrace();//IMPRIME LA EXCEPCION GENERADA
        }
    }
     public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            bufWriter.write((i+1)+" "+datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        fileWriter.close();
}
}