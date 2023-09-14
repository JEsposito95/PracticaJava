
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Joaquin
 */
public class CondicionalEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un mes del año: ");
        int mes= leer.nextInt();
        String estacion= "Estacion Desconocida";
        if (mes == 1 || mes == 2 || mes==3) {
            estacion = "Verano";
        }
        else if (mes == 4|| mes == 5 || mes==6) {
            estacion = "Otoño";
        }
        else if (mes == 7|| mes == 8 || mes==9) {
            estacion= "Invierno";
        }
        else if (mes == 10|| mes == 11 || mes==12){
            estacion= "Primavera";
        }
        System.out.println("Estacion = "+ estacion);
    }
    
}
