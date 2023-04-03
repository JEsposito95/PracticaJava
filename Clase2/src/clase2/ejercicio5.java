/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

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
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese un numero entero");
        int n= leer.nextInt();
        int doble= n *2;
        int triple = n*3;
        double raiz= Math.sqrt(n);
        System.out.println("el doble de "+n+" es: "+doble);
        System.out.println("el triple de "+n+" es: "+triple);
        System.out.println("la raiz cuadrada de "+n+" es: "+raiz);
    }
    
}
