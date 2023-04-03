/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

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
        Scanner leer = new Scanner(System.in);
        int matriz [][] = new int [3][3];
int contador=0;
for (int i =0 ;i<3;i++){
    for (int j = 0; j < 3; j++) {
        matriz[i][j]= leer.nextInt();
    }
}
for (int i =0 ;i<3;i++){
    for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j]+"  ");
    }
            
    System.out.println("  ");
}

        System.out.println("**********");

for (int i =0 ;i<3;i++){
    for (int j = 0; j < 3; j++) {
        System.out.print(matriz[j][i]+"  ");
        
    }
    System.out.println(" ");
}
for (int i =0 ;i<3;i++){
    for (int j = 0; j < 3; j++) {
        if (matriz[i][j]==(matriz[j][i])*-1)
            contador++ ;
    }
}
if (contador==9)
            System.out.println("La matriz es antisimétrica");
else{
    System.out.println("La matriz no es antisimétrica");
}
    }
    
}
