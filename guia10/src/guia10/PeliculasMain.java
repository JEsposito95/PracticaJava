/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10;

import Entidades.Pelicula;
import Servicio.PeliculaService;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Joaquin
 */
public class PeliculasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaService peli= new PeliculaService();
        ArrayList<Pelicula> lista= peli.crearPelicula();
        peli.mostrar(lista);
        peli.menorAMayor(lista);
        peli.MayorAMenor(lista);
        peli.tituloAlf(lista);
        peli.directorAlf(lista);
    }
    
}
