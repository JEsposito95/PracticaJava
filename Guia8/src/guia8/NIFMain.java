/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import Entidades.NIF;
import Servicios.NIFService;

/**
 *
 * @author Joaquin
 */
public class NIFMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIF usuario= new NIF();
        NIFService servicio= new NIFService();
        String [] letras= new String [23];
        letras[0] = "T";
        letras[1] = "R";
        letras[2] = "W";
        letras[3] = "A";
        letras[4] = "G";
        letras[5] = "M";
        letras[6] = "Y";
        letras[7] = "F";
        letras[8] = "P";
        letras[9] = "D";
        letras[10] = "X";
        letras[11] = "B";
        letras[12] = "N";
        letras[13] = "J";
        letras[14] = "Z";
        letras[15] = "S";
        letras[16] = "Q";
        letras[17] = "V";
        letras[18] = "H";
        letras[19] = "L";
        letras[20] = "C";
        letras[21] = "K";
        letras[22] = "E";
        
        
        servicio.crearNif(usuario, letras);
        servicio.mostrar(usuario);
    }
    
}
