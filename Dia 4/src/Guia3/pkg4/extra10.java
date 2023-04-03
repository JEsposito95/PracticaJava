/*
 Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números
generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta.
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
         int num1= (int)(Math.random()*10+1) ;
        int num2=(int)(Math.random()*10+1) ;
        System.out.println(num1);
        System.out.println(num2);
        int resultado= num1*num2;
        int correcta;
        
        do{
            System.out.println("adivine el resultado: ");
            correcta=leer.nextInt();
            
        }while(resultado!=correcta);
        System.out.println("la respuesta "+correcta+" es la correcta!");
        
    }
    
}
