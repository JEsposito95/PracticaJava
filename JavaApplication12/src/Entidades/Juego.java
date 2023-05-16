/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Joaquin
 */
public class Juego {
    private ArrayList <Jugador> jugadores ;
    private RevolverAgua revolver ;

    public Juego() {
    }
    
    public Juego(int numero){
        jugadores=new ArrayList<Jugador>();
        for (int i = 1; i <= numero; i++) {
            jugadores.add(new Jugador());
        }
        revolver= new RevolverAgua();
    }
    

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverAgua getRevolver() {
        return revolver;
    }

    public void setRevolver(RevolverAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    
    
}
