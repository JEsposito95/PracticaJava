/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;




/**
 *
 * @author Joaquin
 */
public class Lavadora extends Electrodomestico {
    
    protected int carga;

    public Lavadora() {
    }
    
    
    
    public Lavadora(double precio, String color, String consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga= carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    }

    
    
   
    

