/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        final int salario= 1000;
        int comision =150;
        int cantVentas;
        float salarioMensual, precioCarro, porcVenta, totalPrecio;
        
        System.out.println("Digite la cantidad de carros vendidos");
        cantVentas= leer.nextInt();
        System.out.println("digite el precio del carro");
        precioCarro= leer.nextFloat();
        
        comision= comision* cantVentas;
        totalPrecio=precioCarro* cantVentas;
        porcVenta= totalPrecio * (float)0.05;
        salarioMensual= salario+comision+porcVenta;
        
        System.out.println("El salario mensual es: "+salarioMensual);
        
        
    }
    
}
