/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Jugador;
import Entidades.RevolverAgua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class JuegoService {
    RevolverService sv= new RevolverService();
    JugadorService js= new JugadorService();
    
    public RevolverAgua llenarJuego(RevolverAgua revolver){
        revolver= sv.llenarRevolver(revolver);
        return revolver;
    }
    
    public void ronda(RevolverAgua revolver, ArrayList <Jugador> players){
        Scanner leer = new Scanner(System.in);
        int index= (int) (Math.random()*players.size());
        Jugador jugadorActual= players.get(index);
        while (!js.disparo(revolver, jugadorActual)){
            index++;
            System.out.println("Turno del "+jugadorActual.getNombre());
            System.out.println("Press enter para disparar");
            String piumpium=leer.nextLine();
            if (index >= players.size()) {
                index = 0;
            }
            jugadorActual= players.get(index);
        }
        System.out.println(jugadorActual.getNombre()+" fue mojadito");
    }
}
