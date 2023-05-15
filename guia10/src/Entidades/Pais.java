/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Comparator;

/**
 *
 * @author Joaquin
 */
public class Pais {
    private String pais;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
     public static Comparator<Pais> compararPais= new Comparator<Pais>(){
        @Override
        public int compare(Pais p1, Pais p2){
            return p1.getPais().compareTo(p2.getPais());
        }
    };

    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + '}';
    }

    public Comparator<Pais> getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
