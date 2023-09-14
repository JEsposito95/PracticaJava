/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import DAO.AutorJpaController;
import entidades.Autor;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class AutorServicio {
    private AutorJpaController DAO;

    Scanner leer = new Scanner(System.in);
    public AutorServicio() {
        DAO = new AutorJpaController();
    }
    
    public Autor crearAutor(Autor autor){
        DAO.create(autor);
        return autor;
    }
    
    //BUSCAR POR NOMBRE
public Autor buscarXnombre(String nombre){
        return DAO.buscarPorNombre(nombre);

    }
    
    
    
    
    
}
