/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Interfaces.CalculosFormas;
import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class Circulo implements CalculosFormas {
    
    protected int radio;
    protected int diametro;
    protected double pi = Math.PI;
    

    public Circulo() {
    }

    public Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
        
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPi() {
        return pi;
    }
    
    

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    @Override
    public void calcularArea() {
        
        double areaCirculo = pi * Math.pow(radio, 2); 
        System.out.println("El area del Circulo es: " + areaCirculo);
    }

    @Override
    public void calcularPerimetro() {
        
        double perimetroCirculo = pi * diametro;
        System.out.println("El perimetro del circulo es: " + perimetroCirculo);
    
    }
    
    public Circulo crearCirculo(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del circulo");
        int r = leer.nextInt();
        
        System.out.println("Ingrese el diametro del circulo");
        int d = leer.nextInt();
       
       Circulo c = new Circulo(r, d);
        
        return c;
    }
}
