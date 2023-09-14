/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Joaquin
 */
public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String alimento;
    protected String raza;
    
    public abstract void alimentarse();

    public Animal() {
    }

    public Animal(String nombre,String alimento, int edad,  String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
        
    
}
