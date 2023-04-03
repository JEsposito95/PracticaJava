/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidades.Rectangulo1;

/**
 *
 * @author Joaquin
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo1 rectangulito= new Rectangulo1();
        rectangulito.calcular_area();
        
        Rectangulo1 rect= new Rectangulo1();
        rect.setLado1(4);
        rect.setLado2(6);
        
        System.out.println("el area del segundo rectangulo es: "+ rect.getLado1()*rect.getLado2());
        
    }
    
}
