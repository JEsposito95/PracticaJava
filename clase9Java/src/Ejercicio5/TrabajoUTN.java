package Ejercicio5;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class TrabajoUTN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la primera calificacion");
        int nota1=leer.nextInt();
        System.out.println("Ingrese la segunda califiacion");
        int nota2=leer.nextInt();
        System.out.println("ingrese la tercer calificacion");
        int nota3=leer.nextInt();
        suma= nota1+nota2+nota3;
        System.out.println("La suma de las 3 calificaciones es: "+suma);
    }
    
}
