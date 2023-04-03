/*
 *dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final
de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas

 */
package Guia3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joaquin
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
       String frase;
        int correcto=0;
        int incorrecto=0;
        
        do{
            
             System.out.println("inserte la frase");
             frase= leer.next();
             if(frase.length()==5){
                 if("X".equals(frase.substring(0, 1))){
                     System.out.println("aca");
                     if("O".equals(frase.substring(4, 5)) ){
                         correcto++;
                     }else{incorrecto++;}
                 }else{incorrecto++;}
             }else{incorrecto++;}
        }while(!frase.equals("&&&&&"));
        incorrecto--;
        System.out.println("la cantidad de secuencias correctas es de: "+correcto+" y las incorrectas es de: "+incorrecto);
    }
    
}
