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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese una frase: ");
        String frase= leer.nextLine();
        System.out.println("La frase en mayusculas: "+frase.toUpperCase());
        System.out.println("LA frase en minusculas: "+ frase.toLowerCase());
        
        
    }
    
}
