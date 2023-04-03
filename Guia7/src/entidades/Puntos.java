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
public class Puntos {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    
    public void crearPuntos(){
        System.out.println("ingrese el primer punto");
        Scanner leer = new Scanner(System.in);
        int x;
        int y;
        float aux;
        aux=leer.nextFloat();
        x= (int) Math.floor(aux);
        y=(int) Math.round((aux-x)*10);
        x1=x;
        y1=y;
        
        System.out.println("ingrese el segundo punto");
        aux=leer.nextFloat();
        x= (int) Math.floor(aux);
        y= (int) Math.round((aux-x)*10);
        x2=x;
        y2=y;
        
        
    }
    
    public double distancia(){
            return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(x1-x2, 2));
        }
    
}
