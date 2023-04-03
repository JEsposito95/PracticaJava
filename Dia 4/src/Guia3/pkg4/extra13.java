/*
 Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3
 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el largo de la escalera");
        int largo= leer.nextInt();
        for(int i=1; i<=largo; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
    
}
