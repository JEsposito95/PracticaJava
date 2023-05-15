/*
  Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class PracticaNumeros {
    Scanner leer = new Scanner(System.in);
    ArrayList <Integer> lista= new ArrayList();
    
    public ArrayList <Integer> agregar(){
        int num;
        do {
            System.out.println("ingrese un numero, si desea salir ingrese -99");
            num= leer.nextInt();
            lista.add(num);
            
            
        } while (num!=-99);
        return lista;
    }
    public int sumita(ArrayList<Integer> lista){
        int suma=0;
        Iterator <Integer> it= lista.iterator();
        while(it.hasNext()){
            int valor= it.next();
            //declarar el tipo de dato, como forzandolo para que pueda traer el valor del entero almacenado en la ArrayList;
            if (valor!=-99) {
                suma=suma+valor;
            }
            
        }
       
        return suma;
    }
    public void promedio(ArrayList<Integer> lista){
        double promedio;
        promedio= (sumita(lista)/(lista.size()-1));
        System.out.println(lista.size()-1);
        System.out.println("El promedio de los numeros de la lista es:"+promedio);
    }
}
