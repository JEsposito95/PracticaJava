/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class PersonaService {
    Persona per= new Persona();
    Scanner leer = new Scanner(System.in);
    
    public boolean esMayorDeEdad(){
       if(per.getEdad()>= 18){
           return true;
       }else{
           return false;
       }
    }
    
    public void crearPersona(){
        System.out.println("Ingreso de datos");
        System.out.println("Nombre: ");
        per.setNombre(leer.nextLine());
        System.out.println("Edad: ");
        per.setEdad(leer.nextInt());
        System.out.println("Sexo: H-> hombre M-> mujer O-> otro");
        per.setSexo(leer.next());
        while(!per.getSexo().equals("M")&&!per.getSexo().equals("H")&& !per.getSexo().equals("O")){
            System.out.println("Ingrese opcion valida");
            per.setSexo(leer.next());
        }
        System.out.println("Altura: ");
        per.setAltura(leer.nextInt());
        System.out.println("Peso: ");
        per.setPeso(leer.nextInt());
        
    }
    double formula;
    public int calcularIMC(){
        formula= per.getPeso()/ (Math.pow(per.getAltura(), 2));
        if (formula < 20){
            return -1;
        }else if(formula > 20 && formula < 25){
            return 0;
        }else
        return 1;
    }
}
