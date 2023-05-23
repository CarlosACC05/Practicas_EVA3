/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_throw_excepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA3_7_THROW_EXCEPCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba obj = new Prueba();
        //checked;; es forozo atenderlas
        //unchecked: errores de logica, no es forzoso resolverlas
        //int resu 5/0;
        try {
            obj.capturaMayorCero(100);
            Scanner input = new Scanner(System.in);
            System.out.println("Introduce un valor");
            int valor = input.nextInt();
        } catch (Exception ex) {
            //NO ES BUENO USAR EXCEPTION, YA UE ES
            //LA SUPER CLASE DE LAS EXCEPCIONES. VA 
            //A CAPTURAR CUALQUIER EXCEPCION
            System.out.println(ex.getMessage());
        } 
        /*catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }*/
        
        //ARITHMETIC EXCEPTION ES "UNCHECKED" Y NO ES OBLIGATORIO CAPTURAR EXCEPCION
        try {
            obj.division(1, 0);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}

class Prueba {

    public void capturaMayorCero(int valor) throws Exception {
        if (valor <= 0)//Voy a generar una excepcion
        {
            throw new Exception(valor + " es negativo, solo se aceptan valores mayores a cero");
        }
        System.out.println("El valor es: " + valor);

    }

    public int division(int x, int y) throws ArithmeticException {
        if (y == 0) {
            throw new ArithmeticException("El valor del divisor es cero, y es invalido");
        }
        return x / y;
    }
}
