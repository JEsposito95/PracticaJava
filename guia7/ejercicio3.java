/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7;

import entidades.Operacion;

/**
 *
 * @author Joaquin
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //la "M" se crea con un nombre que prefieras,
       Operacion M= new Operacion();
       M.crearOperacion();
        System.out.println(M.sumar());
       System.out.println(M.restar());
       System.out.println(M.dividir());
       System.out.println(M.multiplicar());
    }
    
}
