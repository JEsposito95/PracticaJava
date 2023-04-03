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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los grados celcius:");
        int c = leer.nextInt();
        int f= 32+(9*c/5);
        System.out.println(c+" grados Celcius es igual a "+f+" grados Farenheit");
       
    }
    
}
