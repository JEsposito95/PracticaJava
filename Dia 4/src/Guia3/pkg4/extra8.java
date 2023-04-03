/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura
y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int par=0;
        int impar=0;
        int total=0;
        do {
            System.out.println("ingrese numeros que no sean multiplos de 5");
            num= leer.nextInt();
            if(num>=0 && num%5!=0){
                if(num % 2 == 0){
                par++;
            }else{
                impar++;
            }
            total++;
        }
    
            }while(num % 5!= 0);
        System.out.println("la cantidad de numeros pares es: "+par);
        System.out.println("la cantidad de numeros impares es: "+impar);
        System.out.println("la cantida de numeros total es: "+total);
        }
}
        

