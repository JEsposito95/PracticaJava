/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Entidades.Juego;
import Entidades.RevolverAgua;
import Servicios.JuegoService;
import Servicios.JugadorService;
import Servicios.RevolverService;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class JuegoRevolverAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a la Ruleta Rusa (Pium Pium)");
        System.out.println("Ingrese el numero de jugadores");
        int num= leer.nextInt();
        if (num<1 || num>6) {
            num=6;
        }
        Juego juego= new Juego(num);
        JuegoService js= new JuegoService();
        JugadorService jugS= new JugadorService();
        RevolverAgua revolver= new RevolverAgua();
        RevolverService rs= new RevolverService();
        
        js.llenarJuego(revolver);
        System.out.println(juego.getJugadores());
        js.ronda(revolver, juego.getJugadores());
        System.out.println(juego.getJugadores());
    }
    
}
