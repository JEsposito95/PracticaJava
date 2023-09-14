/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Estudiante extends Persona {
    private ArrayList<Curso> curso;

    public Estudiante() {
    }

    public Estudiante(ArrayList<Curso> curso) {
        this.curso = curso;
    }

    public Estudiante(ArrayList<Curso> curso, String nombre, int id, int dni, String estadoCivil) {
        super(nombre, id, dni, estadoCivil);
        this.curso = curso;
    }

    public ArrayList<Curso> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<Curso> curso) {
        this.curso = curso;
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
    
    public void matriculacion(){
        Scanner leer = new Scanner(System.in);
        Curso curso= new Curso();
        System.out.println("en que curso desea matricular al estudiante?");
        curso.setNombre(leer.next());
        this.curso.add(curso);        
        
    }
}
