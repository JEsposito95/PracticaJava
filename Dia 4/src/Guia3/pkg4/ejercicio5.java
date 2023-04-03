/*
Escriba un programa en el cual se ingrese un valor límite positivo,
y a continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.
 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println("ingrese el limite positivo");
        int limite= leer.nextInt();
        int num;
        int suma=0;
        do{
            System.out.println("ingrese un numero a sumar");
            num= leer.nextInt();
            suma+=num;
            System.out.println("la suma total es de: "+suma);
    }while(suma <= limite);
    
}
}
