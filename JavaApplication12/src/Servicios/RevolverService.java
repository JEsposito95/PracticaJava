/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.RevolverAgua;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class RevolverService {
    
    
    public RevolverAgua llenarRevolver(RevolverAgua revolver){
        revolver.setPosicionActual((int)(Math.random()*6)+1);
        revolver.setPosicionAgua((int)(Math.random()*6)+1);
        return revolver;
    }
    
    public boolean mojar(RevolverAgua revolver){
        if (revolver.getPosicionActual()==revolver.getPosicionAgua()) {
            return true;
        }else{
            return false;
        }
    }
    
    public RevolverAgua siguienteChorro(RevolverAgua revolver){
        if (revolver.getPosicionActual()==6) {
            revolver.setPosicionActual(1);
        }else{
             revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }
       return revolver;
    }
    
}
