/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.HashMap;

/**
 *
 * @author Joaquin
 */
public class Tienda {
    private HashMap <String,Integer> producto;

    public Tienda() {
        this.producto= new HashMap();
    }

    public HashMap<String, Integer> getProducto() {
        return producto;
    }

    public void setProducto(HashMap<String, Integer> producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Tienda{" + "producto=" + producto.toString() + '}';
    }
    
    
}
