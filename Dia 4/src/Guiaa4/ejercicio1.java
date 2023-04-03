/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación matemática
y deben devolver sus resultados para imprimirlos en el main. 

 */
package Guiaa4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        double resultado;
        int opc;
        do{
        System.out.println("ingrese la operacion que desea realizar:");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        opc=leer.nextInt();
            switch (opc) {
                case 1:
                    resultado=sumar(num1,num2);
                    break;
                case 2:
                    resultado=restar(num1,num2);
                    break;
                case 3:
                    resultado=mult(num1,num2);
                    break;
                case 4:
                    resultado= division(num1,num2);
                    break;
                default:
                    resultado=0;
                    System.out.println("Ingrese ocion valida");
            }
            //if(resultado!=0)
                System.out.println("el resultado es: "+resultado);
            
            
        }while(opc!=0);
        
        
    }

    public static int sumar(int num1, int num2) {
        int suma=num1+num2;
    return suma;
}

    public static int restar(int num1, int num2) {
        int resta= num1-num2;
        return resta;
    }

    public static int mult(int num1, int num2) {
         int mult= num1*num2;
         return mult;
    }

    public static double division(int num1, int num2) {
        double div= num1/num2;
        return div;
    }
}
