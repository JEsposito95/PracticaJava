/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9,
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E

 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            
            
            for (int j = 0; j < 10; j++) {
                
                 for (int k = 0; k < 10; k++) {
                     if(i==3){
                         System.out.print("e-");
                     }else{
                         System.out.print(i+"-");
                     }
                     if(j==3){
                         System.out.print("e-");
                     }else{
                         System.out.print(j+"-");
                     }
                     if(k==3){
                         System.out.print("e");
                     }else{
                         System.out.print(k);
                     }
                
                
            
               System.out.println("");
            }
                 System.out.println("");
            }
           
           
        }
        }
}

