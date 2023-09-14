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
public class Rectangulo implements CalculosFormas {

    protected int base;
    protected int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void calcularArea() {
        
        double areaRectangulo = base * altura;
        System.out.println("El area del rectangulo: " + areaRectangulo);
    }

    @Override
    public void calcularPerimetro() {
        
        double perimetroRectangulo = (base * altura)*2;
        System.out.println("el perimetro del rectangulo es: " + perimetroRectangulo);
    }
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la base del rectangulo");
        int base = leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        int altura = leer.nextInt();
                
        Rectangulo r = new Rectangulo(base, altura);
        
        return r;
    }
}
