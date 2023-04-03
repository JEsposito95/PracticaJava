/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Cuenta {
    
    private int saldo=1000;
    private String titular;

    public Cuenta() {
    }
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public void retirar_dinero() {
        String opcion;
        do {
            System.out.println("cuanto dinero desea retirar?");
            int retiro = leer.nextInt();

            if (saldo >= retiro) {
                saldo -= retiro;
            } else {
                System.out.println("usted no tiene suficiente saldo");
            }
            System.out.println("el saldo disponible es de: " + saldo);
            System.out.println("desea realizar otro retiro? S/N");
             opcion = leer.next();
             
                 if (!opcion.equals("S") && !opcion.equals("N")){
                     do{
                         System.out.println("ingrese una opcion valida");
                 opcion= leer.next(); 
                    }  while(!opcion.equals("S") && !opcion.equals("N"));
                      
                 }
             
             
            //opcion= opcion.toUpperCase();
        } while ("S".equals(opcion));

    }
}
