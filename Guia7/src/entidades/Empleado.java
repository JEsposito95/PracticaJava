/*
 Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado
en función de su edad y salario actual. El aumento salarial debe ser del 10% 
si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }
    
    Scanner leer = new Scanner(System.in);
    
    public double calcular_aumento(){
      
        System.out.println("ingrese el nombre del empleado");
        nombre = leer.nextLine();
        System.out.println("ingrese el salario del empleado");
        salario = leer.nextInt();
        System.out.println("ingrese la edad del empleado");
        edad = leer.nextInt();

        if (edad > 30) {
            salario += salario * 0.10;
        } else {
            salario += salario * 0.05;
        }
        return salario;

       
    }
}
