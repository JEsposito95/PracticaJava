/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utn;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class UTN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese titulo del libro: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese ID del libro:");
        int id = leer.nextInt();
        System.out.println("Digite el precio del libro: ");
        double precio = leer.nextDouble();
        System.out.println("El envio es gratuito?");
        String envio= leer.next();
        boolean opc=true;
        if (envio.equals("si")){
            opc= true;
        }
        if (opc) {
            System.out.println("el envio es gratuito");
        } else {
            System.out.println("el envio no es gratuito");
        }
        
        System.out.println("el nombre del libro es: "+nombre);
        System.out.println("el ID del libro es: "+id);
        System.out.println("el precio del libro es:"+precio);
        System.out.println("el envio es gratuito?"+opc);

    }
    
}
