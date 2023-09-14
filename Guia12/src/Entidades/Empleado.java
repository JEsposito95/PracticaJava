/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public abstract class Empleado extends Persona {
    private int anioIncorporacion;
    private int nroDespacho;

    public Empleado() {
    }

    public Empleado(int anioIncorporacion, int nroDespacho) {
        this.anioIncorporacion = anioIncorporacion;
        this.nroDespacho = nroDespacho;
    }

    public Empleado(int anioIncorporacion, int nroDespacho, String nombre, int id, int dni, String estadoCivil) {
        super(nombre, id, dni, estadoCivil);
        this.anioIncorporacion = anioIncorporacion;
        this.nroDespacho = nroDespacho;
    }

    public int getAnioIncorporacion() {
        return anioIncorporacion;
    }

    public void setAnioIncorporacion(int anioIncorporacion) {
        this.anioIncorporacion = anioIncorporacion;
    }

    public int getNroDespacho() {
        return nroDespacho;
    }

    public void setNroDespacho(int nroDespacho) {
        this.nroDespacho = nroDespacho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public void cambioEstadoCivil() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nuevo estado civil: ");
        super.setEstadoCivil(leer.next());
    }
    
    public abstract void reasignacionDespacho();
}
