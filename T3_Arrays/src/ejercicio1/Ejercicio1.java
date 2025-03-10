package ejercicio1;

import java.util.Random;

/*
Diseña una programa Java que llene mediante un bucle for un array de 10 elementos con valores enteros al azar
entre 1 y 100. El programa nos dirá si el primer elemento del array es igual al último.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Random crearrandom = new Random();
        int[] ejemplo = new int[10];

        for (int i = 0; i < ejemplo.length; i++) {
            ejemplo[i] = crearrandom.nextInt(100) + 1;
            System.out.print(ejemplo[i] + ", ");
        }
        System.out.printf("\b\b\n");

        if (ejemplo[0] == ejemplo[ejemplo.length - 1]) {
            System.out.println("El primer número es igual al último");
        } else {
            System.out.println("El primer número no es igual al último");
        }
    }
}
