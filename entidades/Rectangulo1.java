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

    public Rectangulo1() {
    }

    public Rectangulo1(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    
    Scanner leer = new Scanner(System.in);
    public void calcular_area(){
        System.out.println("ingrese alto del rectangulo: ");
        lado1=leer.nextInt();
        System.out.println("ingrese ancho del rectangulo: ");
        lado2=leer.nextInt();
        System.out.println("el area del rectangulo es de: "+lado1*lado2);
    }
    
}
