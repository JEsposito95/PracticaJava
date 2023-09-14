/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Edificio;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class EdificioService {
    
    public Edificio crearEdificio(){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese ancho del edificio");
        int ancho= leer.nextInt();
        System.out.println("ingrese alto del edificio");
        int alto= leer.nextInt();
        System.out.println("ingrese largo del edificio");
        int largo= leer.nextInt();
        Edificio edificio= new Edificio(ancho, alto, largo);
        
        return edificio;
    }
    public int calcularSuperficie(Edificio edificio){
        int superficie= edificio.getAlto()*edificio.getAncho();
        return superficie;
    }
    
    public int calcularVolumen(Edificio edificio){
        int volumen= edificio.getAlto()*edificio.getAncho()*edificio.getLargo();
        return volumen;
    }
    
}
