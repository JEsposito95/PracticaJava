/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Operacion {
    private int n1;
    private int n2;

    public Operacion() {
    }
    
    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero 1");
        n1=leer.nextInt();
        System.out.println("ingrese el numero 2");
        n2=leer.nextInt();
    }
            
    public int sumar(){
        return this.n1+this.n2;
    }
    
    public int restar(){
        return this.n1-this.n2;
    }
    public int multiplicar(){
        if (n1!=0 && n2!=0){
            return this.n1*this.n2;
        }else{
            System.out.println("error al multiplicar por 0");
            return 0;
        }
        
    }
    public int dividir(){
        if (n1!=0 && n2!=0){
            return this.n1/this.n2;
        }else{
            System.out.println("error al dividir por 0");
            return 0;
    }
}
}
