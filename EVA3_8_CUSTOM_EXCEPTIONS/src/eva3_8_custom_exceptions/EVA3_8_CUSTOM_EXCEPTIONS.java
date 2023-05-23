/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_custom_exceptions;

/**
 *
 * @author carlo
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        perso1.setNombre("Juan");
        perso1.setApellido("Perez");
        try{
            perso1.setEdad(-1);
        }catch(DatoEntradaCheckedEx e){
            System.out.println(e.getMessage());
        }
    }
    
}
class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 1;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        //setEdad(edad);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoEntradaCheckedEx{
        if(edad < 0)
            throw new DatoEntradaCheckedEx();
        this.edad = edad;
    }

}

class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("Datos de entrada incorrecto!! El valor debe ser positivo");
    }

}

class DatoEntradaCheckedEx extends Exception{

    public DatoEntradaCheckedEx() {
        super("Datos de entrada incorrecto!! El valor debe ser positivo");
    }

}
