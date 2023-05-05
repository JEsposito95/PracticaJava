/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Joaquin
 */
public class ArreglosService {
    public void inicializarA(double[] arregloA){
        for (int i = 0; i < 49; i++) {
            arregloA[i]= Math.random()*20+1;
        }
        //Arrays.fill(arregloA, Math.random()*10);
      
        
    }
    
    
    
    public void mostrar(double[] arregloA){
        System.out.println("mostramos arregloA");
        System.out.println(Arrays.toString(arregloA));
    }
    
    public void ordenar(double[] arreglos){
        Arrays.sort(arreglos);
    }
    public void inicializarB(double[] arregloA, double [] arregloB){
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        for (int i = 10; i < 19; i++) {
            arregloB[i+1]= 0.5;
        }
    }
}
