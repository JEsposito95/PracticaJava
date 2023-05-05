/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8;


import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author Joaquin
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PersonaService per= new PersonaService();
       PersonaService persona1= new PersonaService();
       PersonaService persona2= new PersonaService();
       PersonaService persona3= new PersonaService();
       PersonaService persona4= new PersonaService();
       
       int contadorF=0;
       int contadorI=0;
       int contadorG=0;
       
       
       
        int imc[];
        imc = new int[4];
        boolean mayorEdad[];
        mayorEdad = new boolean[4];
        
        
        int i=0;
        
        System.out.println("ingrese los datos de la persona 1");
        persona1.crearPersona();
        System.out.println(persona1.calcularIMC());
        switch (persona1.calcularIMC()) {
            case -1:
                System.out.println("está por debajo de su peso ideal");
                contadorF++;
                break;
            case 0:
                System.out.println("está en su peso ideal");
                contadorI++;
                break;
            case 1:
                System.out.println("tiene sobrepeso");
                contadorG++;
                break;
        }
        
        System.out.println( persona1.esMayorDeEdad());
        if (persona3.esMayorDeEdad()==true){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }
        imc[i]= persona1.calcularIMC();
        mayorEdad[i]= persona1.esMayorDeEdad();
        i++;
         
        System.out.println("ingrese los datos de la persona 2");
        persona2.crearPersona();
        System.out.println(persona2.calcularIMC());
        switch (persona2.calcularIMC()) {
            case -1:
                System.out.println("está por debajo de su peso ideal");
                contadorF++;
                break;
            case 0:
                System.out.println("está en su peso ideal");
                contadorI++;
                break;
            case 1:
                System.out.println("tiene sobrepeso");
                contadorG++;
                break;
        }
        System.out.println( persona2.esMayorDeEdad());
        if (persona2.esMayorDeEdad()==true){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }
        imc[i]= persona1.calcularIMC();
        mayorEdad[i]= persona1.esMayorDeEdad();
        i++;
        
         
        System.out.println("ingrese los datos de la persona 3");
        persona3.crearPersona();
        System.out.println(persona3.calcularIMC());
        switch (persona3.calcularIMC()) {
            case -1:
                System.out.println("está por debajo de su peso ideal");
                contadorF++;
                break;
            case 0:
                System.out.println("está en su peso ideal");
                contadorI++;
                break;
            case 1:
                System.out.println("tiene sobrepeso");
                contadorG++;
                break;
        }
        System.out.println( persona3.esMayorDeEdad());
        if (persona3.esMayorDeEdad()==true){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }
        imc[i]= persona1.calcularIMC();
        mayorEdad[i]= persona1.esMayorDeEdad();
        i++;
         
        
        
        System.out.println("ingrese los datos de la persona 4");
        persona4.crearPersona();
        System.out.println(persona4.calcularIMC());
        switch (persona4.calcularIMC()) {
            case -1:
                System.out.println("está por debajo de su peso ideal");
                contadorF++;
                break;
            case 0:
                System.out.println("está en su peso ideal");
                contadorI++;
                break;
            case 1:
                System.out.println("tiene sobrepeso");
                contadorG++;
                break;
        }
        System.out.println( persona4.esMayorDeEdad());
        if (persona4.esMayorDeEdad()==true){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }
        imc[i]= persona1.calcularIMC();
        mayorEdad[i]= persona1.esMayorDeEdad();
        i++;
        
        
        for (int j = 0; j < 4; j++) {
            imc[j]= persona1.calcularIMC();
            mayorEdad[j]= persona1.esMayorDeEdad();
        }
        int suma=0;
        for (int j = 0; j < 4; j++) {
            suma=suma+imc[j];
        }
        System.out.println("el promedio de las personas por debajo de su peso es de: "+ suma/4);
        System.out.println("las personas por debajo del peso ideal son "+contadorF+", las que tienen un peso ideal es de "+contadorI+" y la cantidad de personas por encima de su peso son "+contadorG);
    }
    
}
