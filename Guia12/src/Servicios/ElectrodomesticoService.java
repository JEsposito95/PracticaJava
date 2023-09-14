/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Interfaz.IElectrodomestico;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public abstract class ElectrodomesticoService implements IElectrodomestico{
     
    public String comprobarConsumoEnergetico(String letra){
        letra= letra.toLowerCase();
        if (!(letra.equals("a")||letra.equals("b")||letra.equals("c")||letra.equals("d")||
                letra.equals("e")||letra.equals("f"))) {
            letra= "f";
        }
        return letra;
        }
    
    public String comprobarColor(String color){
        if (!(color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")
                ||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("gris"))) {
            color="blanco";
        }
        return color;
    }
    
    public Electrodomestico crearElectrodomestico(){
        Scanner leer = new Scanner(System.in);
        System.out.println("el precio inicial es de $1000: ");
        
        
        System.out.println("ingrese el color: ");
        String color= leer.next();
        
        System.out.println("ingrese el consumo energetico:");
        String consumo= leer.next();
        
        System.out.println("ingrese el peso:");
        int peso= leer.nextInt();
        Electrodomestico electrodomestico= new Electrodomestico(1000, color, consumo, peso);
        //color, consumo energetico, peso
        return electrodomestico;
    }
    
    @Override
    public double precioFinal(Electrodomestico electrodomestico, Lavadora lavadora, Televisor televisor){
        double precio= 1000;
        switch(electrodomestico.getConsumoEnergetico()){
            case "a":
                electrodomestico.setPrecio(precio+1000);
                break;
            case "b":
                electrodomestico.setPrecio(precio+800);
                break;
            case "c":
                electrodomestico.setPrecio(precio+600);
                break;
            case "d":
                electrodomestico.setPrecio(precio+500);
                break;
            case "e":
                electrodomestico.setPrecio(precio+300);
                break;
            case "f":
                electrodomestico.setPrecio(precio+100);
                break;
            default:
                electrodomestico.setPrecio(precio+100);
                break;
        }
        
        if (electrodomestico.getPeso()>1 && electrodomestico.getPeso()< 19) {
            electrodomestico.setPrecio(precio+100);
        }else if(electrodomestico.getPeso()>20 && electrodomestico.getPeso()<49){
            electrodomestico.setPrecio(precio+500);
        }else if(electrodomestico.getPeso()>50 && electrodomestico.getPeso()<79){
            electrodomestico.setPrecio(precio+800);
        }else{
            electrodomestico.setPrecio(precio+1000);
        }
        return precio;
    }
}
