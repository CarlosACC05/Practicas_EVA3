
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_leer_archivos_txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {
    final static String RUTA = "C:\\archivos\\prueba.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            
            readUsingFiles(RUTA); 
            readingUsingBufferedReader(RUTA);
            readingUsingFileReader(RUTA); 
            readingUsingScanner(RUTA); 
            
        } catch(IOException ex){
           ex.printStackTrace();
        }
    }
    /*
    FILES: Se lee todo el contendio del archivo y se
    transifere a memoria principal(RAM)
    Util con archivos pequeños
    */
    public static void readUsingFiles(String ruta) throws IOException{
        //CONSTRUIMOS LA RUTA EN BASE A LA CADENA DE TEXTO
        Path path = Paths.get(ruta);
        /*List <String> todasLineas = Files.readAllLines(path);
        System.out.println("Resultado: ");
        //System.out.println(todasLineas.toString());
        for (int i = 0; i < todasLineas.size(); i++) {
            System.out.println(todasLineas.get(i));
        }*/
        
        byte[] bytes = Files.readAllBytes(path);
        System.out.println(new String(bytes));
    }
    public static void readingUsingBufferedReader(String ruta) throws IOException{
        System.out.println("");
        System.out.println("LEER UN ARCHIVO CON BUFFERED READER");
        File file = new File(ruta);
        FileInputStream fileInputStream = new FileInputStream(file);
        
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        
        BufferedReader bufReader = new BufferedReader(inputStreamReader);
        
        String linea;
        while((linea = bufReader.readLine()) != null){
            System.out.println(linea);
        }
        bufReader.close();
    }
    
    
    public static void readingUsingFileReader(String ruta) throws IOException{
        System.out.println("");
        System.out.println("LEER UN ARCHIVO CON FILE READER");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufReader = new BufferedReader(fileReader);
        
        String linea;
        while((linea = bufReader.readLine()) != null){
            System.out.println(linea);
        }
        bufReader.close();
        fileReader.close(); 
    }
    
    public static void readingUsingScanner(String ruta) throws IOException{
        System.out.println("");
        System.out.println("LEER UN ARCHIVO CON SCANNER");
        Path path = Paths.get(ruta);
        Scanner scanner = new Scanner(path);
        while(scanner.hasNextLine()){
            String linea = scanner.nextLine();
            System.out.println(linea);
        }
        scanner.close();
    }
}
