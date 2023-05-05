/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import Entidades.Cafetera;
import Servicios.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class CafeteraMain {
   
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera Cafe = new Cafetera();
        CafeteraService CafeServicio = new CafeteraService();
    
        boolean salir= false;
       
        
    do{
        System.out.println("Menu de opciones");
        System.out.println("1. Llenar Cafetera");
        System.out.println("2. Servir taza");
        System.out.println("3. Vaciar cafetera");
        System.out.println("4. Agregar Cafe");
        System.out.println("5. Salir");
         int opcion= leer.nextInt();
        
        switch(opcion){
            case 1:
                CafeServicio.llenarCafetera(Cafe);
                break;
            case 2:               
                CafeServicio.servirTaza(Cafe, 0);
                break;
            case 3:
                CafeServicio.vaciarCafetera(Cafe);
                break;
            case 4:
                CafeServicio.agregarCafe(Cafe, 0);
                break;
            case 5:
                salir=true;
                break;
            default:
                System.out.println("Ingrese una opcion valida: ");
        }
    }   while(salir==false) ;
    
    
    
    
    }
    
}
