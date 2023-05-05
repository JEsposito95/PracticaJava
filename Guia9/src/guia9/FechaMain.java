/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Servicios.FechaService;
import java.util.Date;

/**
 *
 * @author Joaquin
 */
public class FechaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fecha= new FechaService();
        Date fechas= fecha.fechaNacimiento();
        //Date actual= fecha.fechaActual();
        
        
        System.out.println("la fecha actual es: "+fecha.fechaActual());
        System.out.println("la edad es de: "+fecha.diferencia(fechas));
    }
    
}
