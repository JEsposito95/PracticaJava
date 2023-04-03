/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla
el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado
por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.

 */
package Guia3.pkg4;

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
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese dos numeros por teclado");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        String salida;
       int opcion;
        do{
        System.out.println("ingrese una opcion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        opcion= leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("la suma es: "+(num1+num2));
                break;
                
            case 2: 
                System.out.println("la resta es: "+(num1-num2));
                break;
                
            case 3:
                System.out.println("la multiplicacion es:"+(num1*num2));
                break;
                
            case 4: 
                System.out.println("la division es: "+(num1/num2));
                break;
                
            case 5: 
                System.out.println("Esta seguro que quiere salir del programa? (S/N)");
                salida= leer.next();
           
            if (salida.equals("s")){
                opcion=5;
            } else{opcion=0;
            }
             break;    
            default:
                System.out.println("Opcion incorrecta, ingrese un numero del 1 al 5");
        }
        
    }while (opcion != 5);
    
}
}
