/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Joaquin
 */
public class EdificioDeOficinas extends Edificio {
    private int nroOficinas;
    private int personasPorOfi;
    private int nroPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int nroOficinas, int personasPorOfi, int nroPisos) {
        this.nroOficinas = nroOficinas;
        this.personasPorOfi = personasPorOfi;
        this.nroPisos = nroPisos;
    }

    public EdificioDeOficinas(int nroOficinas, int personasPorOfi, int nroPisos, int ancho, int alto, int largo) {
        super(ancho, alto, largo);
        this.nroOficinas = nroOficinas;
        this.personasPorOfi = personasPorOfi;
        this.nroPisos = nroPisos;
    }

    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getPersonasPorOfi() {
        return personasPorOfi;
    }

    public void setPersonasPorOfi(int personasPorOfi) {
        this.personasPorOfi = personasPorOfi;
    }

    public int getNroPisos() {
        return nroPisos;
    }

    public void setNroPisos(int nroPisos) {
        this.nroPisos = nroPisos;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
}
