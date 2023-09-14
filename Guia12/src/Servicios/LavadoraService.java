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
public class LavadoraService extends ElectrodomesticoService implements IElectrodomestico {
     
    @Override
    public Electrodomestico crearElectrodomestico(Electrodomestico electrodomestico) {
         Scanner leer = new Scanner(System.in);
        System.out.println("el precio inicial es de $1000: ");
        
        
        System.out.println("ingrese el color: ");
        String color= leer.next();
        
        System.out.println("ingrese el consumo energetico:");
        String consumo= leer.next();
        
        System.out.println("ingrese el peso:");
        int peso= leer.nextInt();
        
        //color, consumo energetico, peso
        electrodomestico= new Electrodomestico(1000, color, consumo, peso); 
        
        return electrodomestico;
    }
    
    
    public Lavadora crearLavadora(Electrodomestico electrodomestico){
        Scanner leer = new Scanner(System.in);
        Lavadora lavadora= (Lavadora) super.crearElectrodomestico();
        System.out.println("cuanta carga soporta la lavadora?");
        lavadora.setCarga(leer.nextInt());
        return lavadora;
    }

   @Override
    public String comprobarConsumoEnergetico(String letra) {
        letra= letra.toLowerCase();
        if (!(letra.equals("a")||letra.equals("b")||letra.equals("c")||letra.equals("d")||
                letra.equals("e")||letra.equals("f"))) {
            letra= "f";
        }
        return letra;
    }

    @Override
    public String comprobarColor(String color) {
        if (!(color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("negro")
                ||color.equalsIgnoreCase("rojo")||color.equalsIgnoreCase("gris"))) {
            color="blanco";
        }
        return color;
    }

   

    @Override
    public double precioFinal(Electrodomestico electrodomestico, Lavadora lavadora, Televisor televisor) {
        
        switch(lavadora.getConsumoEnergetico()){
            case "a":
                lavadora.setPrecio(lavadora.getPrecio()+1000);
                break;
            case "b":
                lavadora.setPrecio(lavadora.getPrecio()+800);
                break;
            case "c":
                lavadora.setPrecio(lavadora.getPrecio()+600);
                break;
            case "d":
                lavadora.setPrecio(lavadora.getPrecio()+500);
                break;
            case "e":
                lavadora.setPrecio(lavadora.getPrecio()+300);
                break;
            case "f":
                lavadora.setPrecio(lavadora.getPrecio()+100);
                break;
            default:
                lavadora.setPrecio(lavadora.getPrecio()+100);
                break;
        }
        
        if (lavadora.getPeso()>1 && lavadora.getPeso()< 19) {
            lavadora.setPrecio(lavadora.getPrecio()+100);
        }else if(lavadora.getPeso()>20 && lavadora.getPeso()<49){
            lavadora.setPrecio(lavadora.getPrecio()+500);
        }else if(lavadora.getPeso()>50 && lavadora.getPeso()<79){
            lavadora.setPrecio(lavadora.getPrecio()+800);
        }else{
            lavadora.setPrecio(lavadora.getPrecio()+1000);
        }
        
        if (lavadora.getCarga()>30) {
            lavadora.setPrecio(lavadora.getPrecio()+500);
        }
        double precio= lavadora.getPrecio();
        
        return precio;
    }

   

    
     
    }

