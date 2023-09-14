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
public class PersonalDeServicio extends Empleado {
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion) {
        this.seccion = seccion;
    }

    public PersonalDeServicio(String seccion, int anioIncorporacion, int nroDespacho) {
        super(anioIncorporacion, nroDespacho);
        this.seccion = seccion;
    }

    public PersonalDeServicio(String seccion, int anioIncorporacion, int nroDespacho, String nombre, int id, int dni, String estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombre, id, dni, estadoCivil);
        this.seccion = seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
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
    public void reasignacionDespacho() {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nuevo nro de despacho:");
        this.setNroDespacho(leer.nextInt());
    }
    
    public void cambioDeSeccion(){
        Scanner leer = new Scanner(System.in);
        System.out.println("a que seccion cambiar el personal?");
        this.setSeccion(leer.next());
    }
}
