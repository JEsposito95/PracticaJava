/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es
una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga 
“CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java.

 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
        System.out.println("ingrese palabra");
        String palabra= leer.nextLine();
        String letra= palabra.substring(0, 1);
        if(letra.equals("a")||letra.equals("A")){
            System.out.println("correcto");
        } else{
            System.out.println("Incorrecto");
        }
    }
    
}
