package ejercicio2;

import java.util.Random;

/*
Diseña un programa Java que cree un array de 10 elementos de tipo entero y lo rellene con valores al azar
entre 1 y 10 mediante un bucle for. Luego mostrará el array con utilizando un bucle while.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Random crearrandom = new Random();
        int i, n = 10;
        int[] ejemplo = new int[n];

        for (i = 0; i < ejemplo.length; i++) {
            ejemplo[i] = crearrandom.nextInt(10) + 1;
        }

        i = 0;
        while (i < n) {
            System.out.print(ejemplo[i] + ", ");
            i++;
        }
        System.out.printf("\b\b\n");
    }
}
