/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidades.Empleado;

/**
 *
 * @author Joaquin
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado aumento= new Empleado();
        
        System.out.println("el salario con aumento del empleado es de: "+aumento.calcular_aumento());
    }
    
}
