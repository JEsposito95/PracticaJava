/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Joaquin
 */
public class PaisService {
    Scanner leer = new Scanner(System.in);
    
    public HashSet<Pais> Llenarlista(){
        boolean salir=false;
        String nombre;
        String rta;
        HashSet<Pais> listaPaises= new HashSet();
        do {
            
            System.out.println("Ingrese un pais");
            nombre=leer.next();  
            Pais pais= new Pais(nombre);
            listaPaises.add(pais);
            System.out.println("desea ingresar otro pais?");
            rta= leer.next();
            
            
            if (rta.equalsIgnoreCase("no")) {
                
                System.out.println(listaPaises);
                
            }            
        } while (rta.equalsIgnoreCase("si"));
        return listaPaises;
    }
    
    public void mostrarAlf(HashSet<Pais> lista){
        System.out.println("La lista ordenada alfabeticamente:");
        ArrayList <Pais> listaOrdenada= new ArrayList(lista);
        listaOrdenada.sort(Pais.compararPais);
                           //nombre del objeto que se encuentra dentro de la del HashSet, 
                           //y nombre que se le dio al Comparator() de ese objeto creado en la entidad.
        System.out.println(listaOrdenada);
    }
    
    public HashSet<Pais> buscarYEliminar(HashSet<Pais> lista){
        Iterator iteradorPaises=  lista.iterator();
        String eliminar;
        System.out.println("ingrese el pais que desea eliminar:");
        eliminar=leer.next();
        boolean bandera= false;
        while(iteradorPaises.hasNext()){
            Pais aux=(Pais) iteradorPaises.next();
            if(aux.getPais().equals(eliminar)){
                iteradorPaises.remove();
                bandera= true;
            }
                    
        }if (bandera==false) {
            System.out.println("El pais "+eliminar+" no se encuentra en la lista");
        }
        
        System.out.println(lista);
        return lista;
    }
    
}
