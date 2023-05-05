/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9;

import Entidades.Curso;
import Servicios.CursoService;

/**
 *
 * @author Joaquin
 */
public class CursoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CursoService servicio= new CursoService();
        Curso curso1= servicio.crearCurso();
        
        servicio.calcularGananciaSemanal(curso1);
    }
    
}
