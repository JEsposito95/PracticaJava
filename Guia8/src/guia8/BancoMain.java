/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaService;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class BancoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria Cuenta= new CuentaBancaria();
        CuentaBancariaService CuentaServicio= new CuentaBancariaService();
        
       boolean salir= false;
       
       
        do{
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una opcion:");
        System.out.println("1. Crear cuenta");
        System.out.println("2. Ingresar dinero");
        System.out.println("3. Retiro de dinero");
        System.out.println("4. Retiro express");
        System.out.println("5. Consultar saldo");
        System.out.println("6. Consultar datos");
        System.out.println("7. Salir");
        int opciones= leer.nextInt();
        
        
        switch(opciones){
            case 1:
                CuentaServicio.crearCuenta(Cuenta);
                break;
            case 2:
                CuentaServicio.ingresar(Cuenta, 0);
                break;
            case 3:
                CuentaServicio.retirar(Cuenta, 0);
                break;
            case 4:
                CuentaServicio.extraccionRapida(Cuenta);
                break;
            case 5:
                System.out.println("Su saldo actual es de: "+Cuenta.getSaldoActual());
                break;
            case 6:
                System.out.println("DNI: "+Cuenta.getDniCliente());
                System.out.println("Numero de cuenta: "+Cuenta.getNumeroCuenta());    
                break;
            case 7:
                salir= true;
                break;
            default:
                System.out.println("ingrese una opcion valida");
        }
        
        }while(salir==false);
        
        }
}
    

