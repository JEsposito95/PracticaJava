/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        int dia;
        int mes;
        int año;
        Persona p1= new Persona();
        System.out.println("ingrese el nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("ingrese la fecha de nacimiento");
        System.out.println("dia:");
        dia= leer.nextInt();
        System.out.println("mes:");
        mes= leer.nextInt();
        System.out.println("año:");
        año=leer.nextInt();
        
        Date nacimiento= new Date();
        nacimiento.setDate(dia);
        nacimiento.setMonth(mes);
        nacimiento.setYear(año);
        
        p1.setEdad(nacimiento);
        return p1;
        
    }
    public Date actual(){
         Date actual= new Date();
         return actual;
    }
    public void calcularEdad(Persona p1, Date actual){
        Date fechaActual= actual();
        int edad;
        edad= actual.getYear()+1900-p1.getEdad().getYear();
        System.out.println("la edad es:"+edad);
    }
     public boolean menorQue(Persona p1,int edad){
        System.out.println("ingerese la edad que quiere consultar:");
        edad= leer.nextInt();
        if (p1.getEdad().getYear()<edad){
            System.out.println("es menor que la edad");
            return true;
        }
        System.out.println("es mayor que la edad");
        return false;
    }
    public void mostrarPersona(Persona p1){
        System.out.println("Nombre: "+p1.getNombre());
        //System.out.println("Edad: "+actual.getYear()+1900-p1.getEdad().getYear());
    }
}
