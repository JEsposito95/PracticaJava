/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import DAO.LibroJpaController;
import entidades.Autor;
import entidades.Libro;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class LibroServicio {
    private LibroJpaController DAO;
    Scanner leer = new Scanner(System.in);
    public LibroServicio() {
        DAO= new LibroJpaController();
    }
    
    public Libro crearLibro(Libro libro){
        DAO.create(libro);
        return libro;
    }
    
    public Libro buscarLibro(){
        System.out.println("Igrese ISBN del libro que desea buscar");
        long ISBN= leer.nextInt();
        return DAO.findLibro(ISBN);
    }
    
    public void buscarXAutor (){
        
        System.out.println("Ingrese el autor del libro");
        DAO.buscarXAutor(leer.nextLine());
        
    }
}
