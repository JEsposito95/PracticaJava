/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverAgua;

/**
 *
 * @author Joaquin
 */
public class JugadorService {
    RevolverService sv= new RevolverService();
    
    public boolean disparo(RevolverAgua revolver, Jugador player){
        if (sv.mojar(revolver)) {
            player.setMojado(true);
            return true;
        }else{
            sv.siguienteChorro(revolver);
            return false;
        }
    }
    
    
}
