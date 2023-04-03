/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;
import entidades.Libro;
/**
 *
 * @author Joaquin
 */
public class Ejericio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro rellenarLibro= new Libro();
        rellenarLibro.CargarLibro();
        System.out.println(rellenarLibro.toString());
    }
    
}
