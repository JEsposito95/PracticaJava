/*
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package Servicios;

import java.util.Collections;
import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;
import java.util.Scanner;

public class CineServicio {

    Scanner leer = new Scanner(System.in);

    public void crearEspectador(Espectador espectador) {
        System.out.println("Ingresar nombre");
        espectador.setNombre(leer.next());
        System.out.println("ingresar edad");
        espectador.setEdad(leer.nextInt());
        System.out.println("Ingresar dinero");
        espectador.setDinero(leer.nextInt());
    }

    public void crearPelicula(Pelicula pelicula) {
        System.out.println("Ingresar título de la película");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingresar director");
        pelicula.setDirector(leer.next());
        System.out.println("Ingresar duración en minutos");
        pelicula.setDuracion(leer.nextInt());
        System.out.println("ingresar edad minima");
        pelicula.setEdadMinima(leer.nextInt());
    }

    public void crearSala(Sala sala, Pelicula pelicula, Espectador espectador) {

        crearPelicula(pelicula);
        sala.setPelicula(pelicula);
        Espectador[][] matriz = new Espectador[8][6];
        ArrayList<Espectador> lista = new ArrayList();
        Espectador[] vector = new Espectador[48];
        String opcion;
        int contador = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = null;
            }
        }

        for (int i = 0; i < 48; i++) {
            vector[i] = null;
        }

        do {
            crearEspectador(espectador);

            if (espectador.getDinero() > 850 && espectador.getEdad() > pelicula.getEdadMinima()) {
                vector[contador] = espectador;
                contador++;
            }

            System.out.println("Desea ingresar otro espectado?s/n");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("s") && contador < 48);

        for (int i = 0; i < 48; i++) {
            lista.add(vector[i]);
        }
        Collections.shuffle(lista);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = lista.get(0);
                lista.remove(0);
            }
        }

    }
}
