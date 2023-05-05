/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class FechaService {
    Scanner leer = new Scanner(System.in);
    
    public Date fechaNacimiento(){
        int dia;
        int mes;
        int año;
        System.out.println("ingerese fecha de nacimiento");
        System.out.println("dia");
        dia = leer.nextInt();
        System.out.println("mes");
        mes = leer.nextInt();
        System.out.println("año");
        año = leer.nextInt();
        Date fechaNacimiento = new Date();
        fechaNacimiento.setDate(dia);
        fechaNacimiento.setMonth(mes - 1);
        fechaNacimiento.setYear(año);

        return fechaNacimiento;
    }

    
    public Date fechaActual(){
        Date fechaActual= new Date();
        
        return fechaActual;
    }
    
    public int diferencia(Date fechaNacimiento){
        Date fechaActual= fechaActual();
        return fechaActual.getYear()-fechaNacimiento.getYear();
    }
}
