/*
    Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import Entidades.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class TiendaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    private void agregar(Tienda tienda, HashMap<String,Integer> mapa){
       
        
        String nombre;
        int precio;
        String salida;
        
        do{
        
        System.out.println("Ingrese el nombre del producto");
        nombre= leer.next();
        System.out.println("ingrese el precio del producto");
        precio= leer.nextInt();
        
        mapa.put(nombre, precio);
        System.out.println("desea ingresar otro producto? S/N");
        salida= leer.next();
        tienda.setProducto(mapa);
        }while(salida.equalsIgnoreCase("S"));
           
        
        
    }
    
    private void modificar(Tienda tienda, HashMap<String,Integer> mapa){
        
        System.out.println("ingrese el nombre del producto que desea modificar");
        String mod= leer.next();
        if (tienda.getProducto().containsKey(mod)) {
            System.out.println("Ingrese el nuevo precio");
            tienda.getProducto().replace(mod, leer.nextInt());
        }else{
            System.out.println("el producto ingresado es inexistente");
        }
        
        
    }
    
    private void eliminar(Tienda tienda, HashMap<String,Integer> mapa){
        System.out.println("ingrese el nombre del producto a eliminar");
        String elim= leer.next();
        if (tienda.getProducto().containsKey(elim)) {
            System.out.println("producto eliminado");
            tienda.getProducto().remove(elim);
        }else{
            System.out.println("el producto ingresado es inexistente o ya ha sido eliminado");
        }
    }
    
    private void mostrar(Tienda tienda, HashMap<String,Integer> mapa){
        System.out.println(tienda);
        }
    
    public void menu(Tienda tienda,HashMap<String,Integer> mapa){
        int opc;
        do{
            System.out.println("Ingrese la opcion deseada:");
            System.out.println("1)Agregar un producto");
            System.out.println("2)Modificar el precio de algun producto");
            System.out.println("3)Eliminar producto");
            System.out.println("4)Mostrar productos");
            System.out.println("5)Salir");
            opc=leer.nextInt();
            switch (opc) {
                case 1:
                    agregar(tienda,mapa);
                    break;
                case 2:
                    modificar(tienda,mapa);
                    break;
                case 3:
                    eliminar(tienda,mapa);
                    break;
                case 4:
                    mostrar(tienda,mapa);
                    break;
                    
            }
        } while (opc!=5);
         
    }
   
    }

