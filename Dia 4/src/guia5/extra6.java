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
public class extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        String [][] sopaDeLetras= new String [20][20];
       do{
           System.out.println("ingrese 5 palabras:");
             palabra= leer.nextLine();
             for (int i = 0; i < palabra.length(); i++) {
               
           }
           for (int i = 0; i < 20; i++) {
               for (int j = 0; j < 20; j++) {
                   sopaDeLetras[i][(int)Math.random()*10]="a";
               }
           }
       }while(palabra.length()>=3 && palabra.length()<= 5);
        
        
        
        
        
    }
    
}
