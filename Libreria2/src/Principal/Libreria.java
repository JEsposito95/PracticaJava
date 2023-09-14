/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.Collection;

import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;

/**
 *
 * @author Joaquin
 */
public class Libreria {

    public static void main(String[] args) {
        AutorServicio AS = new AutorServicio();
        EditorialServicio ES = new EditorialServicio();
        LibroServicio LS= new LibroServicio();
        
//       
//       Editorial editorial= new Editorial(); 
//       editorial.setNombre("cachirla");
//       ES.crearEditorial(editorial);
       
       
      // Autor autor= new Autor();
      // autor.setNombre("Stifen");
      // AS.crearAutor(autor);
        //Libro libro = new Libro();

//        libro.setAutor(AS.buscarXnombre("Stifen"));
//        libro.setTitulo("jokins");
//        libro.setAnio(2021);
//        libro.setEjemplares(10);
//        libro.setEjemplaresPrestados(4);
//        libro.setEjemplaresRestantes(libro.getEjemplares()-libro.getEjemplaresPrestados());
//        libro.setEditorial(editorial);
//        
       
       //joaco
        
        //autor=AS.buscarXnombre("Cacas");
        //System.out.println("El autor buscado es="+autor.toString());
//        LS.crearLibro(libro);
//        Libro libroBuscado= new Libro();
//        libroBuscado=LS.buscarLibroxAutor();
//        System.out.println(libroBuscado);
          
          LS.buscarXAutor();
    }
        
        
        //encontrar un libro, escribiendo el autor, asignarle el autor a un libro, y para eso necesito setear
        //un autor creado de la bd al libro.
        
        
    }


