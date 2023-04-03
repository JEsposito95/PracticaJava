/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando.solo;

/**
 *
 * @author Joaquin
 */
public class intercambio_de_numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num= 20;
        int num2= 30;
        int aux;
        aux= num2;
        num2=num;
        num=aux;
        System.out.println("el primer numero es "+num+" el numero 2 es "+ num2);
    }
    
}
