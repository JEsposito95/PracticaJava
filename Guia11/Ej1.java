/*

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package main;

import Entidades.Perro;
import Entidades.PersonaConPerro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tecno
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Perro> listaperros=new ArrayList<>();
        List<PersonaConPerro> listapersonas=new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        System.out.println("Persona1----------------------------------------------------");
        PersonaConPerro persona1= new PersonaConPerro();
        persona1.setNombre("Marcos");
        persona1.setApellido("Romano");
        persona1.setEdad(38);
        persona1.setDni(45000000);
        Perro perro1=new Perro();
        perro1.setNombre("Tincho");
        perro1.setRaza("Pincher");
        perro1.setEdad(4);
        perro1.setTamano(0.3);
        System.out.println(persona1.toString());
        System.out.println("Persona2----------------------------------------------------");
        PersonaConPerro persona2= new PersonaConPerro();
        persona2.setNombre("Joaco");
        persona2.setApellido("Esposito");
        persona2.setEdad(28);
        persona2.setDni(38000000);
        Perro perro2=new Perro();
        perro2.setNombre("Negro");
        perro2.setRaza("Callejero fino");
        perro2.setEdad(6);
        perro2.setTamano(0.5);
        System.out.println(persona2);
        listaperros.add(perro1);
        listaperros.add(perro2);
        listapersonas.add(persona1);
        listapersonas.add(persona2);
        System.out.println("!!!!!!!!!!!!!!!Hay dos perros para adoptar¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
       

        for (PersonaConPerro aux: listapersonas) {
            System.out.println(aux.getNombre());
            System.out.println("Que perro desea adoptar. Elija Raza");
            System.out.println(listaperros);
            String op=leer.nextLine();
            for (Perro listaperro : listaperros) {
                if (listaperro.getRaza().equalsIgnoreCase(op)) {
                    aux.setPerro(listaperro);
                }
                
            }
            if (aux.getPerro()!=null) {
                listaperros.remove(aux.getPerro());
            }
            
        }
          System.out.println(listapersonas);  
    }
    
}
