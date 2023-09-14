/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import Interfaz.IElectrodomestico;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class TelevisorService extends ElectrodomesticoService implements IElectrodomestico {

    @Override
    public Electrodomestico crearElectrodomestico(Electrodomestico electrodomestico) {
        Scanner leer = new Scanner(System.in);
        Televisor televisor=(Televisor) super.crearElectrodomestico();
        System.out.println("Ingrese la resolucion del TV en pulgadas:");
        televisor.setResolucion(leer.nextInt());
        System.out.println("El TV tiene sitetizador TDT?");
        String rta= leer.next();
        if (rta.equalsIgnoreCase("si")) {
            televisor.setSitentizadorTDT(true);
        }else{
             televisor.setSitentizadorTDT(false);
        }
        return televisor;
    }

    @Override
    public double precioFinal(Electrodomestico electrodomestico, Lavadora lavadora, Televisor televisor) {
        double precio= super.precioFinal(electrodomestico, lavadora, televisor);
        if (televisor.getResolucion()>40) {
            precio= televisor.getPrecio()+(televisor.getPrecio()*0.3);
        }
        if (televisor.isSitentizadorTDT()) {
            precio= televisor.getPrecio()+500;
        }
        televisor.setPrecio(precio);
        return precio;
    }
    
    
}
    
