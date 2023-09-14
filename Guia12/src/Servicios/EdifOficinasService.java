/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class EdifOficinasService extends EdificioService {
     public EdificioDeOficinas crearEdificioOfi(){
         Scanner leer = new Scanner(System.in);
       EdificioDeOficinas ediOfi= new EdificioDeOficinas();
       Edificio edificio= super.crearEdificio();
         System.out.println("Ingrese el numero de oficinas"); 
         ediOfi.setNroOficinas(leer.nextInt());
         System.out.println("Ingrese personas por oficina");
         ediOfi.setPersonasPorOfi(leer.nextInt());
         System.out.println("Ingrese cantidad de pisos");
         ediOfi.setNroPisos(leer.nextInt());
         ediOfi.setAlto(edificio.getAlto());
         ediOfi.setLargo(edificio.getLargo());
         ediOfi.setAncho(edificio.getAncho());
          return ediOfi;
    }
     
     public int calcularSuperficie(Edificio edificio){
        int superficie= super.calcularSuperficie(edificio);
        return superficie;
     }
     
      public int calcularVolumen(Edificio edificio){
        int vol=super.calcularVolumen(edificio);
        return vol;
    }
}
