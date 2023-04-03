/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
    double[][] notasAlumnos = new double[10][4];
        double[] promedios = new double[10];
        int aprobados = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                notasAlumnos[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        
        System.out.println("NOTAS:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + notasAlumnos[i][j]);
            }
            System.out.println("");
        }
        
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j) {
                    case 0:
                        notasAlumnos[i][j] = promedios[i] * 0.1;
                    case 1:
                        notasAlumnos[i][j] = notasAlumnos[i][j] * 0.15;
                    case 2:
                        notasAlumnos[i][j] = notasAlumnos[i][j] * 0.25;
                        break;
                    default:
                        notasAlumnos[i][j] = notasAlumnos[i][j] * 0.5;
                        break;
                }
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                promedios[i] += notasAlumnos[i][j];
            }
        }
        
        System.out.println("PROMEDIOS");
        for (int i = 0; i < 10; i++) {
            System.out.println(promedios[i] + " ");
        }
        
        for (int i = 0; i < 10; i++) {
            if (promedios[i] > 7) {
                aprobados ++;
            }
        }
        
        System.out.println("Cantidad de aprobados " + aprobados);
        System.out.println("Cantidad de desarpbados " + (10-aprobados));
}
}