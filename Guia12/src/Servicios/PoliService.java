/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Edificio;
import Entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class PoliService extends EdificioService{
    
    public Polideportivo crearPoli(){
        boolean techado=false;
        Scanner leer = new Scanner(System.in);
        Edificio edificio=super.crearEdificio();
        Polideportivo poli= new Polideportivo ();
        
        System.out.println("Ingrese el nombe del Polideportivo");
        poli.setNombre(leer.next());
        System.out.println("Es techado?");
        if (leer.next().equalsIgnoreCase("si")) {
            techado= true;
        }
        poli.setTechado(techado);
        poli.setAlto(edificio.getAlto());
        poli.setAncho(edificio.getAncho());
        poli.setLargo(edificio.getLargo());
        return poli;
    }
    
    public int calcularSuperficie(Edificio edificio){
        int superficie=super.calcularSuperficie(edificio);
        return superficie;
    }
    
    public int calcularVolumen(Edificio edificio){
        int vol=super.calcularVolumen(edificio);
        return vol;
    }
    
}
