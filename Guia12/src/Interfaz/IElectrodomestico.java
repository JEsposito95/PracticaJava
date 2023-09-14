/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author Joaquin
 */
public interface IElectrodomestico {
    String comprobarConsumoEnergetico(String letra);
    
    String comprobarColor(String color);
    
    Electrodomestico crearElectrodomestico(Electrodomestico electrodomestico);
    
    double precioFinal(Electrodomestico electrodomestico, Lavadora lavadora, Televisor televisor);
}
