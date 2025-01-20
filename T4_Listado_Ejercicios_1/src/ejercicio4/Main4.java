package ejercicio4;

import java.util.ArrayList;
/*
Diseña un programa Java que trabaje con una clase llamada DvdCine.
a. Su atributos serán: título, director, productora, actores principales, género, resumen y duración.
b. Debe incluir un constructor que reciba como parámetros los atributos.
c. Crea un método llamado esThriller que devuelva true o false según la película sea o no de este género.
d. Crea todos los métodos gets/sets.
e. Crea un método llamada mismaProductora que reciba un objeto de la clase DvdCine como parámetro.
   Este método devuelve true o false si el objeto utilizado con el método es de la misma productora que el pasado como parámetro.
f. Crea objetos y prueba estos métodos.
 */

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> listaActores = new ArrayList<>();
        listaActores.add("Ana");
        listaActores.add("Bob");
        listaActores.add("Carlos");
        listaActores.add("Dan");
        listaActores.add("Jose");
        listaActores.add("Luis");
        listaActores.add("Maria");
        DvdCine cine1 = new DvdCine("Hola World", "Mario", "ies",
                listaActores, Generos.ACCION, "Resumen opcional", 120);
        System.out.println(cine1);
        if (cine1.esThriller()) {
            System.out.println("El cine 1 es un Thriller");
        } else {
            System.out.println("El cine 1 no es un Thriller");
        }

        DvdCine cine2 = new DvdCine("Adios World", "Angel",
                "ies", listaActores, Generos.THRILLER, "The End of the World", 180);

        if (cine1.mismaProductora(cine2)) {
            System.out.println("El cine 2 es de la misma Productora que el Cine 1");
        } else {
            System.out.println("El cine 2 no es de la misma Productora que el Cine 1");
        }
        if (cine2.esThriller()) {
            System.out.println("El cine 2 es un Thriller");
        } else {
            System.out.println("El cine 2 no es un Thriller");
        }

        if (cine1.equals(cine2)) {
            System.out.println("El cine 1 y 2 son el mismo cine");
        } else {
            System.out.println("El cine 1 y 2 no son el mismo cine");
        }
    }
}
