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
public class Circunferencia {
    private double Radio;

    public Circunferencia(double Radio) {
        this.Radio = Radio;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el radio de la circunferencia");
        this.Radio= leer.nextDouble();
    }
    public double area(){
        return Math.pow(Math.PI * this.Radio,2);
        
    }
    public double perimetro(){
        return 2* Math.PI*this.Radio;
    }
}
