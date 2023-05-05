/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Entidades.Persona;
import Servicios.PersonaService;
import java.util.Date;

/**
 *
 * @author Joaquin
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        PersonaService PService= new PersonaService();
        Date actual= PService.actual();
        
        Persona p1=PService.crearPersona();
        
        PService.calcularEdad(p1,actual);
        PService.menorQue(p1, 0);
        PService.mostrarPersona(p1);
    }
    
}
