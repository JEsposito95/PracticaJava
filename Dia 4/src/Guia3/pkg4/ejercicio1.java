/*
 * crear un programa que dado un número determine si es par o impar.

 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int num= leer.nextInt();
        if (num%2 !=0){
            System.out.println("el numero "+num+ " es impar");
        
    } else{
            System.out.println("el numero "+num+" es par");
            
        }
    }
}
