/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author mauricio
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
    Circulo c = new Circulo();
    c = c.crearCirculo();
    
    c.calcularArea();
    c.calcularPerimetro();
    
    Rectangulo r = new Rectangulo();
    
    r=r.crearRectangulo();
    
    r.calcularArea();
    
    r.calcularPerimetro();
    
    }
    
}
