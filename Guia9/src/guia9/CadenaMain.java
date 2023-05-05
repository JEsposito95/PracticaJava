/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Entidades.Cadena;
import Servicios.CadenaService;

/**
 *
 * @author Joaquin
 */
public class CadenaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaService servicio= new CadenaService();
        Cadena nuevacadena= new Cadena();
        
        
        servicio.mostrarVocales(nuevacadena);
        servicio.invertirFrase(nuevacadena);
        servicio.vecesRepetido(nuevacadena);
        servicio.compararLongitud(nuevacadena);
        servicio.unirFrase(nuevacadena);
        servicio.reemplazar(nuevacadena);
        servicio.contiene(nuevacadena);
    }
    
}
