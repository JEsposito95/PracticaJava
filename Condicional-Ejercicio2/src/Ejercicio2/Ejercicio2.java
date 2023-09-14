/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Digite un mes del año: ");
        int mes= leer.nextInt();
        String estacion= "Estacion Desconocida";
        
        switch (mes) {
            case 1: case 2: case 3:
                estacion="Verano";
                break;
            case 4: case 5: case 6:
                estacion= "Otoño";
                break;
            case 7: case 8: case 9:
                estacion= "Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "Invierno";
                break;
        }
        System.out.println("Estacion = "+ estacion);
    }
   
    
}
