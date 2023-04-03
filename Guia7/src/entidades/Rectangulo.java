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
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    Scanner leer = new Scanner(System.in);
    public void crearRectangulo(){
        System.out.println("ingrese la base");
        this.base= leer.nextInt();
        System.out.println("Ingrese la altura");
        this.altura= leer.nextInt();
    }
    
    public double superficie(){
        return this.altura*this.base;
    }
    
    public double perimetro(){
       return (this.base+this.altura)*2;
    }
    
    public void dibujar(){
        for (int i = 1; i <= this.altura; i++) {
            for (int j = 1; j <= this.base; j++) {
               if(i>1 && j>1 && i<this.altura && j<this.base){
                   System.out.print("  ");
            }else{
                   System.out.print("* ");
               }
               
        }
             System.out.println("");
               }
                
        
    }
}
