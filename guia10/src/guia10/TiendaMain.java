/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10;

import Entidades.Tienda;
import Servicio.TiendaService;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class TiendaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TiendaService carniceria= new TiendaService();
        Tienda producto= new Tienda();
        HashMap <String, Integer> tienda= new HashMap();
        
        carniceria.menu(producto,tienda);
        
        
        
        
    }
    
}
