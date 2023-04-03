/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado
a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor
y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guiaa4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros:");
        double euro= leer.nextDouble();
        System.out.println("ingrese el tipo de divisa:");
        String divisa=leer.next();
        
        total(divisa,euro);
        
        
    }

    public static void total(String divisa, double euro) {
        switch (divisa) {
            case "libra":
                System.out.println(euro+" euros en libras son: "+euro*0.86);
                break;
            case "dolar":
                System.out.println(euro+" euros en dolares son: "+euro*1.28611);
                break;
            case "yenes":
                System.out.println(euro+" euros en yenes son: "+euro*129.852);
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }
    }

   
    
}
