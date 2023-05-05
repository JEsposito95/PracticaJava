/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class CafeteraService {
    

    
    Scanner leer = new Scanner(System.in);
    
    public void llenarCafetera(Cafetera Cafe){
        Cafe.setCantidadActual(Cafe.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera Cafe,int taza){
        System.out.println("ingrese la capacidad de la taza: ");
        leer.nextInt();
        if (Cafe.getCantidadActual()<taza){
            taza=Cafe.getCantidadActual();
            System.out.println("la taza no alcanzo a llenarse, tiene: "+taza+" ml de café");
        }else{
            System.out.println("la taza se llenó por completo");
        }
    }
    
    public void vaciarCafetera(Cafetera Cafe){
        Cafe.setCantidadActual(0);
    }
    public void agregarCafe (Cafetera Cafe, int add){
        System.out.println("cuanto cafe desea agregar a la cafetera?");
        Cafe.setCantidadActual(leer.nextInt());
    }
}

