/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import Servicios.RaicesService;

/**
 *
 * @author Joaquin
 */
public class RaicesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesService raices= new RaicesService();
        raices.llenar();
        raices.calcular();
    
    }
    
}