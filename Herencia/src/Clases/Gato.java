/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Joaquin
 */
public class Gato extends Animal {

    @Override
    public void alimentarse() {
        System.out.println("este gato se alimenta de"+this.alimento);
    }

    public Gato() {
    }

    public Gato(String nombre,String alimento, int edad,  String raza) {
        super(nombre,alimento, edad,  raza);
    }
    
}
