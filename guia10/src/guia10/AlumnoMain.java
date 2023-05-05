/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class AlumnoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList <String> perros = new ArrayList();
        boolean noEsta= true;
        do {
            System.out.println("ingrese la raza del perro: ");
            perros.add(leer.next());
            System.out.println("Desea ingresar otro perro? S/N");
        } while (!leer.next().equalsIgnoreCase("n"));
        
        System.out.println(perros);
        
        Iterator iteratorPerro = perros.iterator();
        
        System.out.println("Que perro desea buscar?");
        String perroABuscar= leer.next();
        
        
        while(iteratorPerro.hasNext()){
            if (iteratorPerro.next().equals(perroABuscar)) {
                iteratorPerro.remove();
                Collections.sort(perros);
                System.out.println(perros);
                noEsta= false;
            }
           
            }
            
           if (noEsta) {
               System.out.println("No esta en la lista");
               Collections.sort(perros);
               System.out.println(perros);
        }
               
            
        
        
    }
    
}
