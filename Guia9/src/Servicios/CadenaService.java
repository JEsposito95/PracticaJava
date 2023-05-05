/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class CadenaService {
    Scanner leer = new Scanner(System.in);
    
    int contador=0;
    
    public void mostrarVocales(Cadena nuevacadena){
        System.out.println("ingrese una frase");
        nuevacadena.setFrase(leer.nextLine());
        
        for (int i = 0; i < nuevacadena.getLongitud(); i++) {
            //if (nuevacadena.getFrase().substring(i, i + 1).equalsIgnoreCase("a")
                    //|| nuevacadena.getFrase().substring(i, i + 1).equalsIgnoreCase("e")
                    //|| nuevacadena.getFrase().substring(i, i + 1).equalsIgnoreCase("i")
                    //|| nuevacadena.getFrase().substring(i, i + 1).equalsIgnoreCase("o")
                    //|| nuevacadena.getFrase().substring(i, i + 1).equalsIgnoreCase("u") 
            switch (nuevacadena.getFrase().substring(i, i + 1).toLowerCase()) {
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
            }
            
        }
        
        System.out.println("la cantidad de vocales es: "+contador);
        //nuevacadena sirve como auxiliar, retornamos un objeto duplicado de tipo Cadena.
                
    }
    
    public void invertirFrase(Cadena nuevacadena){
        for (int i = nuevacadena.getLongitud()-1; i >= 0; i--) {
            System.out.print(nuevacadena.getFrase().substring(i, i+1));
            
    }
        System.out.println(" ");
        
            
        }
        
        public void vecesRepetido(Cadena nuevacadena){
            contador=0;
            String caracter;
            System.out.println("ingrese un caracter");
            caracter= leer.nextLine();
            for (int i = 0; i < nuevacadena.getLongitud(); i++) {
                if(nuevacadena.getFrase().substring(i, i+1).equalsIgnoreCase(caracter)){
                    contador++;
            }
                
            }
            System.out.println("La letra "+caracter+" se encuentra "+contador+" veces en la frase");
        }
        
        
        public void compararLongitud(Cadena nuevacadena){
            System.out.println("ingrese la frase a comparar");
            nuevacadena.setFrase(leer.nextLine());
            if(nuevacadena.getLongitud()>nuevacadena.getLongitud()){
            System.out.println("La primer frase ingresada es mas larga.");
        }else{
            System.out.println("La segunda frase ingresada es mas larga.");
        }
            
            
        }
        public void unirFrase(Cadena nuevacadena){
            System.out.println("ingrese la frase que desea unir con la original");
            nuevacadena.setFrase(nuevacadena.getFrase()+" "+leer.nextLine());
            System.out.println("la frase resultantes es: "+nuevacadena.getFrase());
            
            
        }
        public void reemplazar(Cadena nuevacadena){
            System.out.println("ingrese un caracter");
            String caracter;
            String aux="";
            caracter=leer.nextLine();
            for (int i = 0; i < nuevacadena.getLongitud(); i++) {
                if (nuevacadena.getFrase().substring(i, i+1).equalsIgnoreCase("a")) {
                    aux=aux+caracter;
                    
                }else{
                    aux=aux+nuevacadena.getFrase().substring(i, i+1);
                }
            }
            System.out.println(aux);
        }
        public boolean contiene(Cadena nuevacadena){
            System.out.println("que letra desea saber si se encuentra?");
            String caracter= leer.nextLine();
            if(nuevacadena.getFrase().contains(caracter)){
                System.out.println("el caracter se encuentra en la frase");
                return true;
                
            }else{
                System.out.println("el caracter no se encuentra en la frase");
                return false;
            }
            
        }
        
        
        
        
}
