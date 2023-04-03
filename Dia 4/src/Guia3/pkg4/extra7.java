/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de numeros");
        int n=leer.nextInt();
        int num;
        int i=1;
        int max=0;
        int min=0;
        boolean primero=false;
        double promedio;
        int aux=0; 
        while(i<=n && i!=0){
            System.out.println("ingrese un numero");
            num=leer.nextInt();
            aux+=num;
            if(num>max){
                max=num;
            }
            //hace que el primer numero ingresado se guarde en la variable minimo, despues cambia en la linea 40
            //y no entra mas en este if.
            if(primero==false){
                min=num;
                primero=true;
            }
            if(num<min){
                min=num;
            }
            i++;
    }
    promedio=aux/i;
        System.out.println("el valor minimo es: "+min);
        System.out.println("el valor maximo es: "+max);
        System.out.println("el promedio es: "+promedio);
}
}
