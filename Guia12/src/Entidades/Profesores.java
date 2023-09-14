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
public class Profesores extends Empleado {
    private String departamento;

    public Profesores() {
    }
    

    public Profesores(String departamento) {
        this.departamento = departamento;
    }

    public Profesores(String departamento, int anioIncorporacion, int nroDespacho) {
        super(anioIncorporacion, nroDespacho);
        this.departamento = departamento;
    }

    public Profesores(String departamento, int anioIncorporacion, int nroDespacho, String nombre, int id, int dni, String estadoCivil) {
        super(anioIncorporacion, nroDespacho, nombre, id, dni, estadoCivil);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
    
    public void cambioDepto(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nuevo departamento del profesor");
        this.setDepartamento(leer.next());
        
    }

    
    
}
