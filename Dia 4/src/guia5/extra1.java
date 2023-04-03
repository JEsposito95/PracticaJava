/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el largo del vector");
        int n=leer.nextInt();
        int [] vector= new int[n];
        int suma=0;
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese el numero en la posicion "+i+" del vector:");
            int num=leer.nextInt();
            vector[i]= num;
            suma+=num;
        }
        System.out.println("la suma de los valores es de: "+suma);
    }
    
}
