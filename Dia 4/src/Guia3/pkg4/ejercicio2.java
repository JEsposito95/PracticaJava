/*
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto
, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese una frase");
        String frase= leer.nextLine();
        if(frase.equals("eureka")){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Incorrecto");
        }
    }
    
}
