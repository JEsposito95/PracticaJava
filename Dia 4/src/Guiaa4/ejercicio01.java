/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guiaa4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        String frase;
        do{
            System.out.println("ingrese una frase terminada en un punto.");
            frase=leer.nextLine();
        }while(!frase.endsWith("."));
        
        frase=codificar(frase);
        System.out.println(frase);
    }

    public static String codificar(String frase) {
        String letra;
        String frasenueva="";
        for (int i = 0; i < frase.length(); i++) {
            letra=frase.substring(i, i+1);
            switch (letra) {
                case "a":
                case "A":{
                    letra="@";
                    break;
                }
                case "e":
                case "E":{
                    letra="#";
                    break;
                }
                case "i":
                case "I":{
                    letra="$";
                    break;
                }
                case "o":
                case "O":{
                    letra="%";
                    break;
                }
                case "u":
                case "U":{
                    letra="*";
                    break;
                }
                  
            }
            frasenueva=frasenueva.concat(letra);
        }
        return frasenueva;
    } 
}

