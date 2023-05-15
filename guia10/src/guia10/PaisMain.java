/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10;

import Entidades.Pais;
import Servicio.PaisService;
import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Joaquin
 */
public class PaisMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisService sv= new PaisService();
        Pais pais= new Pais();
        HashSet <Pais> lista= sv.Llenarlista();
        
        sv.mostrarAlf(lista);
        sv.buscarYEliminar(lista);
    }
    
}
