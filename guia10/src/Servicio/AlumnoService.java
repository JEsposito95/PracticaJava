/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class AlumnoService {
    public ArrayList<Alumno> crearAlumno(){
        Scanner leer = new Scanner(System.in);
        ArrayList<Alumno> lista = new ArrayList();
        ArrayList<Integer> notas= new ArrayList();
        
        String nombre;
        int n1,n2,n3;
        
        
        do {
            System.out.println("Ingrese nombre del alumno: ");
            nombre= leer.next();
            System.out.println("Ingrese sus 3 notas: ");
            n1= leer.nextInt();
            n2= leer.nextInt();
            n3= leer.nextInt();
            notas.add(n1);
            notas.add(n2);
            notas.add(n3);
            
            Alumno alumno= new Alumno(nombre,notas);
            lista.add(alumno);
            System.out.println("desea ingresar otro alumno?");
        } while (!leer.next().equalsIgnoreCase("n"));
        return lista;
        
    }
}
