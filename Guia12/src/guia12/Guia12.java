
import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Servicios.LavadoraService;
import Servicios.TelevisorService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class Guia12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico electrodomestico= new Electrodomestico();
        LavadoraService ls= new LavadoraService();
        TelevisorService tv= new TelevisorService();
        
        Lavadora lavadora= ls.crearLavadora(electrodomestico);
        Televisor tele= (Televisor) tv.crearElectrodomestico(electrodomestico);
        
        System.out.println("el precio final de la lavora es: "+ls.precioFinal(electrodomestico, lavadora, tele));
        System.out.println("el precio final del TV es: "+tv.precioFinal(electrodomestico, lavadora, tele));
    }
    
}
