/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantas familias?");
        int familias=leer.nextInt();
        int hijos=0;
        int sumahijos=0;
        int edad=0;
        int sumaedad=0;
        int promedio=0;
        for(int i=0; i<familias;i++){
            System.out.println("la familia numero "+(i+1)+" cuantos hijos tiene?");
          hijos= leer.nextInt();
          sumahijos+=hijos;
          for(int j=0; j<hijos; j++){
              System.out.println("cual es la edad de cada uno de ellos?");
              edad= leer.nextInt();
              sumaedad+=edad;
          }
          //sumaedad+=edad;
            
          
        }
        System.out.println("sumahijos: "+sumahijos);
            System.out.println("sumaedad: "+sumaedad);
        promedio=sumaedad/sumahijos;
        System.out.println("la edad promedio es: "+promedio);
    }
    
}
