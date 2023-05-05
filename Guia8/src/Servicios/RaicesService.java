/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class RaicesService {
    Raices raiz= new Raices();
    Scanner leer = new Scanner(System.in);
    double discriminante;
    
    public void llenar(){
        System.out.println("ingrese los valores de a, b y c");
        raiz.setA(leer.nextInt());
        raiz.setB(leer.nextInt());
        raiz.setC(leer.nextInt());
    }
    
    public double getDiscriminante(){
        return (Math.pow(raiz.getB(), 2)) - 4 * raiz.getA() * raiz.getC();
    }
    
    public boolean tieneRaices(){
        if(getDiscriminante()>0){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean tieneRaiz(){
        if(getDiscriminante() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void obtenerRaices(){
        if(this.tieneRaices()){
            System.out.println((-raiz.getB()-Math.sqrt(getDiscriminante()))/(2*raiz.getA()))  ;
            System.out.println((-raiz.getB()+Math.sqrt(getDiscriminante()))/(2*raiz.getA()))  ;
        }
    }
    //(-b±√((b^2)-(4*a*c)))/(2*a) 
    public void obtenerRaiz(){
       if(this.tieneRaiz()){
           System.out.println((-raiz.getB()+Math.sqrt(getDiscriminante()))/(2*raiz.getA()))  ;
       } 
    }
  
    public void calcular() {

        if (tieneRaiz()) {
            System.out.println("tiene una raiz");
            obtenerRaiz();
        } else if (tieneRaices()) {
            System.out.println("tiene dos raices");
            obtenerRaices();
        } else {
            System.out.println("no hay soluciones posibles");
        }
    }
}
