
import Clases.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "carne", 10, "Doberman");
        Animal perro2 = new Perro("Tedy", "croquetas", 15, "Chihuahua");
        Animal gato1 = new Gato("Pelusa", "galletas", 15, "Siames");
        Animal caballo1 = new Caballo("Spark", "pasto", 23, "Fino");
        
        
        perro1.alimentarse();
        perro2.alimentarse();
        gato1.alimentarse();
        caballo1.alimentarse();
    }
    
}
