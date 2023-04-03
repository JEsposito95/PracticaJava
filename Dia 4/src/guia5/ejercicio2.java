/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n= leer.nextInt();
        int[] vector= new int[n];
        int contador=0;
        for(int i=0; i<n;i++){
            System.out.println(vector[i]= (int)(Math.random()*10)); 
        }
        System.out.println("que numero desea localizar en el vector?");
        int posicion= leer.nextInt();
        for(int i=0;i<n;i++){
            if(vector[i]==posicion){
                System.out.println("el numero "+posicion+" se encuentra en la posicion: v["+i+"]");
                contador++;
            }
            
        }
        if(contador>=2){
                System.out.println("el numero se encuentra repetido "+contador+" veces");
            }
    }
    
}
