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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner leer= new Scanner (System.in);
      int num1;
      int num2;
        System.out.println("ingrese el primer numero");
        num1= leer.nextInt();
        System.out.println("ingrse el segundo numero");
        num2=leer.nextInt();
        
        System.out.println("la suma es"+num1+num2);
    }
    
}
