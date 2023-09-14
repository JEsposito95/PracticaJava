/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de USD tiene Guillermo");
        float usdGuillermo= leer.nextFloat();
        float usdLuis = usdGuillermo /2;
        float usdJuan=  (usdGuillermo+usdLuis)/2;
        
        float total= usdGuillermo+usdJuan+usdLuis;
        
        System.out.println("dolares de Luis: "+usdLuis);
        System.out.println("dolares de Juan: "+usdJuan);
        System.out.println("La suma de todos los dolares es de: "+total);
        
    }
    
}
