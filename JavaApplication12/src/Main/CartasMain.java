/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Mazo;
import Servicios.CartaService;

/**
 *
 * @author Joaquin
 */
public class CartasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CartaService cs= new CartaService();
        Mazo mazo= new Mazo();
        Mazo monton= new Mazo();
        mazo=cs.llenarMazo(mazo);
        cs.barajar(mazo);
        System.out.println("Te toco: "+cs.siguienteCarta(mazo));
        
        
        cs.cartasDisponibles(mazo);
        cs.darCartas(mazo, monton);
        cs.cartasMonton(monton);
        cs.cartasDisponibles(mazo);
        cs.darCartas(mazo, monton);
        cs.cartasMonton(monton);
        cs.mostrarBaraja(mazo);
    }
    
    
    
}
