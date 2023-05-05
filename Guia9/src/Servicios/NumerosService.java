/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class NumerosService {
    Scanner leer = new Scanner(System.in);
    double mayor;
    double menor;
        public void mostrarValores(ParDeNumeros numeros){
            System.out.println("el primer numero es: "+numeros.getN1());
            System.out.println("el segundo numero es: "+numeros.getN2());
        }
        
        public double devolverMayor(ParDeNumeros numeros){
            
            if(numeros.getN1()>numeros.getN2()){
                menor= numeros.getN2();
                return mayor=numeros.getN1();
            }else{
                menor= numeros.getN1();
                return mayor=numeros.getN2();
                
            }
            
        }
              
        public void calcularPotencia(ParDeNumeros numeros){
            System.out.println("el mayor: "+mayor);
            System.out.println("el menor: "+menor);
            numeros.setN1(Math.round(numeros.getN1()));
            numeros.setN2(Math.round(numeros.getN2()));
            //if(numeros.getN1()>numeros.getN2()){
             //   System.out.println("el resultado de la potencia es: "+Math.pow(numeros.getN1(),numeros.getN2()));
            //}else{
            //    System.out.println("el resultado de la potencia es: "+Math.pow(numeros.getN2(), numeros.getN1()));
            //}
            System.out.println("el resultado de la potencia es: "+Math.pow(mayor, menor));
        }
        
        public void calcularRaiz(ParDeNumeros numeros){
            menor=Math.abs(menor);
            System.out.println("el resultado de la raiz es: "+Math.sqrt(menor));
        }
        
}
