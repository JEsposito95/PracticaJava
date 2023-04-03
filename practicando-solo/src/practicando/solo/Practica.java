package practicando.solo;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joaquin
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
      Scanner pedro= new Scanner(System.in);
        System.out.println("ingresa tu nombre:");
	String nombre= pedro.next();
        System.out.println("ingresa tu edad:");
        int edad= pedro.nextInt();
        
        System.out.println("mi nombre es: "+nombre+" y mi edad es: "+edad);
       
	}
}


    

