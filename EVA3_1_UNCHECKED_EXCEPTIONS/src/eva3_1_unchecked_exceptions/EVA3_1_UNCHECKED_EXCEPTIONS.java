/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_unchecked_exceptions;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA3_1_UNCHECKED_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SON TODAS RUNTIMEEXCEPTION
        //ARITHMETIC EXCEPCION:
        //division entre cero
        System.out.println("INCIANDO EL PROGRAMA");
        int x= 5, y=0;
        System.out.println("INCIALIZANDO LAS VARIABLES");
        int resu = x/y;
        System.out.println("CALCULANDO LAS VARIABLES");
        System.out.println("División = "+ resu);
        
        //INPUTMISTTMACH EXCEPTION: ERROR DE CAPTURA DE DATOS
        Scanner input = new Scanner(System.in);
        int nume = input.nextInt();
        System.out.println("Tu numero es: "+ nume);
        
        //INDEXOUTOFBOUND EXCEPTIONS
        int[] arreglo = new int[5];
        arreglo[0]= 100;
        arreglo[1]= 200;
        arreglo[2]= 300;
        arreglo[3]= 400;
        arreglo[4]= 500;
        arreglo[5]= 600;//error de lógica: 5 no es una posición válida   
      
        //NULLPOINTEREXCEPTION
        Prueba objPrueba = null;
        System.out.println("Valor de x= " + objPrueba.x);
    }

}

class Prueba {
    public int x = 100;
}
