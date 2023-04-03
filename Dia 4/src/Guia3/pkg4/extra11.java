/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5.
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división.
Nota: recordar que las variables de tipo entero truncan los números o resultados.

 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int contador=0;
        System.out.println("ingrese el numero");
        int num=leer.nextInt();
        
        do{
            num= (int)Math.floor(num/10);
            contador++;
        }while(num!=0);
        System.out.println("la cantidad de digitos que tiene el numero es de: "+contador);
    }
    
}
