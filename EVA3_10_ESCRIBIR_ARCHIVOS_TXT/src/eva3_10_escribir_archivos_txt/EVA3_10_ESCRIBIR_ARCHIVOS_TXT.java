/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_10_escribir_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.System.out;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class EVA3_10_ESCRIBIR_ARCHIVOS_TXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta= "C:\\archivos\\";
        try {
            writeUsingFiles(ruta+"archivoFiles.txt","Prueba de escritura de archivo \n "+
                    "Usando la clase Files");
            writeUsingFileWriter(ruta+"archivoFileWriter.txt","Prueba de escritura de archivo \n "+
                    "Usando la clase FileWriter");
            writeUsingBufferedWriter(ruta+"archivoBufferedWriter.txt","Prueba de escritura de archivo. "+
                    "Usando la clase BufferedWriter");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_10_ESCRIBIR_ARCHIVOS_TXT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeUsingFiles(String ruta, String datos) throws IOException{
    
        Path path = Paths.get(ruta);
        Files.write(path, datos.getBytes());
    
    }
    public static void writeUsingFileWriter(String ruta, String datos)throws IOException{
    File file = new File(ruta);
    FileWriter fileWriter = new FileWriter(file);
    fileWriter.write(datos);
    fileWriter.close();
}
    public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < 10; i++) {
            bufWriter.write((i+1)+" "+datos);
            bufWriter.write("\n");
        }
        bufWriter.close();
        fileWriter.close();
    }
}   
    
