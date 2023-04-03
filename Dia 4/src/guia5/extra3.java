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
public class extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [] vector= new int [5];
        rellenar(vector);
        mostrar(vector);
    }

    private static void rellenar(int[] vector) {
        for (int i = 0; i < 5; i++) {
            vector[i]= (int) (Math.random()*10);
        }
    }

    private static void mostrar(int[] vector) {
         for (int i = 0; i < 5; i++) {
             System.out.print(vector[i]+" ");
        }
    }
    
}
