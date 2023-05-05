/*
 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class PeliculaService {
    
    
    
    public ArrayList<Pelicula> crearPelicula(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> lista = new ArrayList();
        
        
        String nombre;
        String director;
        int horas;
        
        String opc;
        do {
            System.out.println("ingrese el titulo de la pelicula:");
            nombre= leer.next();
            System.out.println("ingrese el director de la pelicula: ");
            director= leer.next();
            System.out.println("ingrese la duracion de la pelicula en horas:");
            horas= leer.nextInt();
            
            Pelicula pelicula= new Pelicula(nombre,director,horas);
            lista.add(pelicula);
            
            System.out.println("desea ingresar otra pelicula? S/N");
            opc= leer.next();
        } while (!(opc.equalsIgnoreCase("n")));
    
   return lista;
}
    
    public void mostrar(ArrayList<Pelicula> pelicula){
        System.out.println(pelicula);
    }
    
    public void mostrarLarga(ArrayList<Pelicula> pelicula){
        System.out.println("las peliculas de mas de una hora de duracion son:");
       for(Pelicula peli: pelicula){
           if (peli.getHoras() > 1){
               System.out.println(peli);
           }
       }
    }
    
    public void menorAMayor(ArrayList<Pelicula> pelicula){
        
            Collections.sort(pelicula, Pelicula.compararDuracion);
            System.out.println(pelicula);
        
    }
    public void MayorAMenor(ArrayList <Pelicula> pelicula){
       Collections.sort(pelicula, Pelicula.compararDuracion);
       Collections.reverse(pelicula);
       System.out.println("la lista al reves es: "+pelicula);
    }
    
    public void tituloAlf(ArrayList <Pelicula> pelicula){
        Collections.sort(pelicula, Pelicula.compararTitulo);
      
       System.out.println("ordenados por titulo: "+pelicula);
    }
    
    public void directorAlf(ArrayList <Pelicula> pelicula){
        Collections.sort(pelicula, Pelicula.compararDirector);
      
       System.out.println("ordenados por director: "+pelicula);
    }
}