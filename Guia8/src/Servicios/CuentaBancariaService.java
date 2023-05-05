/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */

public class CuentaBancariaService {
    Scanner leer = new Scanner(System.in);
    
    
    public void crearCuenta(CuentaBancaria Cuenta){
        System.out.println("ingrese numero de cuenta: ");
        Cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("lingrese dni");
        Cuenta.setDniCliente(leer.nextInt());
        System.out.println("ingrese saldo");
        Cuenta.setSaldoActual(leer.nextDouble());
        System.out.println(Cuenta.toString());
    }
    
    
    
    
    
   public void ingresar(CuentaBancaria Cuenta, double intro){
       
       System.out.println("cuanto dinero desea ingresar?");
       intro= leer.nextDouble();
       Cuenta.setSaldoActual(Cuenta.getSaldoActual()+intro);
   }
   
   public void retirar(CuentaBancaria Cuenta, double retiro){
       System.out.println("cuanto dinero desea retirar?");
       retiro= leer.nextDouble();
       if(Cuenta.getSaldoActual() > retiro){
           Cuenta.setSaldoActual(Cuenta.getSaldoActual()-retiro);
       }else{
           System.out.println("no posee tanto dinero en la cuenta, se retirara el total de "+Cuenta.getSaldoActual()+" y el saldo quedara en 0");
           Cuenta.setSaldoActual(0);
       }   
   }
   
   public void extraccionRapida(CuentaBancaria Cuenta){
        Cuenta.setSaldoActual(Cuenta.getSaldoActual()*0.8);
    }
   
   
    }
    

