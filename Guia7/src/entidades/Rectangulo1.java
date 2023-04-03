/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule
y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6
y imprime el área del rectángulo. */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Rectangulo1 {
    
    private int lado1;
    private int lado2;
    
    Scanner leer = new Scanner(System.in);
    public void calcular_area(){
        System.out.println("ingrese alto del rectangulo: ");
        lado1=leer.nextInt();
        System.out.println("ingrese ancho del rectangulo: ");
        lado2=leer.nextInt();
        System.out.println("el area del rectangulo es de: "+lado1*lado2);
    }
    
}
