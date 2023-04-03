/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class Libro {
    private int Isbn;
    private String Titulo;
    private String Autor;
    private int NumeroDePaginas;
    //inicializa el objeto con valores por default.
    public Libro() {
    }

    public Libro(int Isbn, String Titulo, String Autor, int NumeroDePaginas) {
        this.Isbn = Isbn;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }
    
    public void CargarLibro(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el ISBN");
        this.Isbn= leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el Titulo del libro");
        this.Titulo= leer.nextLine();
        System.out.println("Ingrese el autor");
        this.Autor= leer.nextLine();
        System.out.println("ingrease el numero de paginas");
        this.NumeroDePaginas= leer.nextInt();
    }

    @Override
    public String toString() {
        return "Libro{" + "Isbn=" + Isbn + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDePaginas=" + NumeroDePaginas + '}';
    }
    
    
}
