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
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int sumaFila=0;
        int sumaColumna=0;
        int contador=0;
        int matriz [][]= new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num=leer.nextInt();
                if(num > 0 && num < 10){
                    matriz[i][j]=num;
                }else{
                    System.out.println("ingrese un numero valido por favor");
                }
                
            }
            
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila+=matriz[i][j];
                sumaColumna+=matriz[j][i];
                if (sumaFila==sumaColumna){
                    contador++;
                    if (contador==3){
                        System.out.println("es magica!");
                    }else{
                        System.out.println("no es magica :(");
                    }
                }
            }
        }
    }
    
}
