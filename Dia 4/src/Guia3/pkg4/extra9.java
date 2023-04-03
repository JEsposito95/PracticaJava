/*
 Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
y el número de restas realizadas es el cociente.

 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros para restar:");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        int resto= num1-num2;
        int cociente=1;
        while(num2<=resto){
            resto-=num2;
            cociente++;
        }
        System.out.println("el resto es: "+resto);
        System.out.println("el cociente es: "+cociente);
    }
    
}
