/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joaquin
 */
public class Mazo {
    private ArrayList<Carta> mazo;

    public Mazo() {
        this.mazo= new ArrayList <Carta>();
    }

    public Mazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Mazo{" + "mazo=" + mazo + '}'+ "\n" ;
    }
    
    
}
