/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Introduce el valor (entero) de x:");
                x = input.nextInt();
                System.out.println("Introduce el valor (entero) de y:");
                y = input.nextInt();
                int resu = x / y;
                System.out.println("La division de " + x + "/" + y + " es: " + resu);
                break;
            } catch (InputMismatchException e) {
                System.out.println("La captura es incorrecta " + e.getMessage());
                System.out.println("No se introdujo un número válido, vuelve a capturar");
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre cero: " + e.getMessage());
                System.out.println("No se introdujo un número válido, vuelve a capturar");
            }
        } while (true);
        System.out.println("PROGRAMA HA TERMINADO CON EXITO");
        
    }

}
