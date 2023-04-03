/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guiaa4;

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
        String nombre,opc;
        int edad;
        System.out.println("desea ingresar una persona ?");
         opc=leer.nextLine();
        while (!opc.equals("no")) {
            nombre = persona ();
            edad = edades ();
            if (edad<18) {
                System.out.println(" es menor de edad ");
             
            }else {
                System.out.println("es mayor de edad");
            }
            System.out.println("desea ingresa una persona?");
            opc=leer.nextLine();
        }
    }

    public static String persona() {
       String nombre ;
       Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese el nombre");
        nombre=leer.nextLine();
        return nombre ;
    }

  public static int edades() {
       int edades ;
       Scanner leer= new Scanner (System.in);
        System.out.println("Ingrese la edad");
        edades=leer.nextInt();
        //leer.nextLine();
        return edades;
    }
    
}
