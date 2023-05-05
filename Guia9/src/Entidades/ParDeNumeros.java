/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Joaquin
 */
public class ParDeNumeros {
    private double n1;
    private double n2;

    public ParDeNumeros() {
        this.n1= Math.random()*10;
        this.n2=Math.random()*10;
    }

    public ParDeNumeros(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    
    }
    
    

