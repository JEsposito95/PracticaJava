/*

 */
package guia10;

import Servicio.PracticaNumeros;
import java.util.ArrayList;

/**
 *
 * @author Joaquin
 */
public class practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PracticaNumeros sv= new PracticaNumeros();
        
        ArrayList <Integer> lista=sv.agregar();
         System.out.println("La suma de los numeros de la lista es de:"+sv.sumita(lista));
        sv.promedio(lista);
    }
    
}
