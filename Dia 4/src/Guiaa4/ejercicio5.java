/*
 Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.

Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package Guiaa4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero para ver si es primo");
        int n=leer.nextInt();
       boolean esPrimo;
       esPrimo=primo(n);
       
        System.out.println("el numero "+n+" es primo? "+esPrimo);
    }

    public static boolean primo(int n) {
         boolean esPrimo=false;
        int contador=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                contador++;
            }
        }
        if (contador==2){
            esPrimo=true;
        }else{
            esPrimo=false;
        }
    
    return esPrimo;
    }

    }
