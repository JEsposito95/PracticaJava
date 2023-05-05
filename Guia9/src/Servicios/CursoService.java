/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class CursoService {
    Scanner leer = new Scanner(System.in);
    
    
    public void cargarAlumnos(String[] alumnos){
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("ingrese el nombre del alumno " +(i+1)+ " :");
            alumnos[i]= leer.nextLine();
        }
    }
    
    public Curso crearCurso(){
        Curso curso1= new Curso();
        System.out.println("ingrese el nombre del curso:");
        curso1.setNombreCurso(leer.nextLine());
        System.out.println("ingrese las horas por dia:");
        curso1.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("ingrese la cantidad de dias por semana:");
        curso1.setCantidadDiasPorSemana(leer.nextInt());
       String turn;
        do{
            
            System.out.println("ingrese el turno: mañana o tarde");
            turn= leer.nextLine();
            leer.nextLine();
            if(!turn.equals("maniana")&&!turn.equals("tarde")){
                System.out.println("ingrese mañana o tarde");
                leer.nextLine();
            }
        }while( !turn.equals("maniana")&& !turn.equals("tarde"));
       
        
        System.out.println("ingrese el precio por hora");
        curso1.setPrecioPorHora(leer.nextInt());
        String [] aux= new String[5];
        cargarAlumnos(aux);
        curso1.setAlumnos(aux);
        return curso1;
    }
    
    public void calcularGananciaSemanal(Curso curso1){
        int ganancia;
        ganancia= curso1.getCantidadHorasPorDia()*curso1.getPrecioPorHora()*5*curso1.getCantidadDiasPorSemana();
        System.out.println("la ganancia semanal es de: "+ganancia);
    }
    
}
