/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;
import entidades.Circunferencia;
/**
 *
 * @author Joaquin
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circunferencia C = new Circunferencia(10.0);
        C.crearCircunferencia();
        System.out.println(C.area());
        System.out.println(C.perimetro());
    }
    
}
