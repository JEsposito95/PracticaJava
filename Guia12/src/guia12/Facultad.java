/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia12;

import Entidades.Profesores;

/**
 *
 * @author Joaquin
 */
public class Facultad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesores profesor= new Profesores();
        
        profesor.cambioEstadoCivil();
        System.out.println("el estado civil es: "+profesor.getEstadoCivil());
    }
    
}
