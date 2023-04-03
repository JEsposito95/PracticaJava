/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;
import entidades.Rectangulo;
/**
 *
 * @author Joaquin
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangulo R= new Rectangulo();
       R.crearRectangulo();
        System.out.println("el perimetro es: "+R.perimetro());
        System.out.println("la superficie es: "+R.superficie());       
       R.dibujar();
    }
    
}
