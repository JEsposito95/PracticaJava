/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Carta;
import Entidades.Mazo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class CartaService {
    
    
    
    public Mazo llenarMazo(Mazo mazo){
        
        for (int i = 1; i <= 12; i++) {
           
            if (i!=8 && i!=9) {
                Carta carta= new Carta(i,"espada");
                mazo.getMazo().add(carta);
                Carta carta2= new Carta(i,"basto");
                mazo.getMazo().add(carta2);
                Carta carta3= new Carta(i,"copa");
                mazo.getMazo().add(carta3);
                Carta carta4= new Carta(i,"oro");
                mazo.getMazo().add(carta4);
                
            }
                
            }
        return mazo;
        }
    
    public void barajar(Mazo mazo){
        
        Collections.shuffle(mazo.getMazo());
        
    }
    
    public Carta siguienteCarta(Mazo mazo){
        Carta carta= mazo.getMazo().get(0);
        System.out.println("La siguiente carta es:"+carta);
        mazo.getMazo().remove(0);
       return carta;
    }
    
    public int cartasDisponibles(Mazo mazo){
        int disponibles=mazo.getMazo().size();
        System.out.println("todavia se pueden repartir"+disponibles);
        return disponibles;
    }
    
    public void darCartas(Mazo mazo, Mazo monton){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("cuantas cartas pedis?");
        int dar= leer.nextInt();
        
        if (cartasDisponibles(mazo)>= dar) {            
            for (int i = 0; i < dar; i++) {
                Carta carta= siguienteCarta(mazo);
                monton.getMazo().add(carta);
                
            }
        }else{
            System.out.println("No hay suficientes cartas en el mazo");
        }
    }
    public void cartasMonton(Mazo monton){
        if (monton.getMazo().isEmpty()) {
            System.out.println("No hay cartas en el monton");
        }else{
            System.out.println("las cartas que ya han salido son:"+monton);
        }
        
    }
    
    public void mostrarBaraja(Mazo mazo){
            System.out.println(mazo);
    }
    
    }

    


