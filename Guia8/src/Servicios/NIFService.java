/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class NIFService {
    Scanner leer = new Scanner(System.in);
    
    public void crearNif(NIF nif, String[] letras){
        System.out.println("ingrese su DNI:");
        nif.setDni(leer.nextLong());
        nif.setLetra (letras[(int)(nif.getDni()%23)]); 
        
    }
    public void mostrar(NIF nif){
        System.out.println(nif.getDni()+"-"+nif.getLetra());
    }
}
