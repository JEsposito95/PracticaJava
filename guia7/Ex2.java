/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidades.Puntos;

/**
 *
 * @author Joaquin
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos punto= new Puntos();
        
       punto.crearPuntos();
        System.out.println("la distancia entre los puntos es: " + punto.distancia());
                
                
    }
    
}
