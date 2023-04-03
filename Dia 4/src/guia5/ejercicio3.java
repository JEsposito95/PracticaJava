/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("indique longitud del vector");
        int n= leer.nextInt();
        int contador=0;
        int digito1=0,digito2=0,digito3=0,digito4=0,digito5=0;
        
        int num;
        int [] vector= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("ingrese un numero con 5 digitos o menos");
            num=leer.nextInt();
            contador=0;
             do{
               num= Math.round(num/10);
               contador++;
           }while(num!=0);
             
        
        switch (contador) {
            case 1:
                digito1++;
                break;
            case 2:
                digito2++;
                break;
            case 3:
                digito3++;
                break;
            case 4:
                digito4++;
                break;
            case 5:
                digito5++;
                break;
            
                
        }
        }
        System.out.println("la cantidad de numeros de 1 digito son: "+digito1);
        System.out.println("la cantidad de numeros de 2 digito son: "+digito2);
        System.out.println("la cantidad de numeros de 3 digito son: "+digito3);
        System.out.println("la cantidad de numeros de 4 digito son: "+digito4);
        System.out.println("la cantidad de numeros de 5 digito son: "+digito5);
        
        }
    }
    
