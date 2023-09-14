/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Joaquin
 */
public class Caballo extends Animal {

    @Override
    public void alimentarse() {
        System.out.println("el caballo se alimenta de"+this.alimento);
    }

    public Caballo() {
    }

    public Caballo(String nombre, String alimento,int edad,  String raza) {
        super(nombre, alimento,edad,  raza);
    }
    
}
