/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado
tiene 4 elementos por lado se deberá dibujar lo siguiente:

 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el diametro del cuadrado:");
        int diametro=leer.nextInt();
       
        for(int i=1;i<=diametro;i++){
            for(int j=1;j<=diametro;j++){
                if(i>1 && i<diametro && j>1 && j<diametro){
                    System.out.print("  ");
                }else{
                    System.out.print("x ");
                }
            }
            System.out.println("");
        }
    }
    
}
