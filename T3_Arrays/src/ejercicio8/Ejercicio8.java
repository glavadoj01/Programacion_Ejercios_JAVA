package ejercicio8;

import java.util.Random;
import java.util.Scanner;

/*
Diseña un programa que llene un array de 10 elementos con valores al azar entre 1 y 1000 mediante un bucle while.
Luego el programa dará al usuario la opción de obtener la media de los valores del array y el menor de
los valores del array.

Diseña una función para cada caso, ambas llevarán como argumento de entrada el array.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Random crearRandom = new Random();
        Scanner escanear = new Scanner(System.in);
        int[] a = new int[10];
        char op = '0';
        int i = 0;

        while (i < a.length) {
            a[i] = crearRandom.nextInt(1000) + 1;
            i++;
        }

        do {
            System.out.println("Opciones:");
            pintarArray(a);
            System.out.println("A - Cálcular la media de los valores");
            System.out.println("B - Hayar el menor de los valores");
            System.out.print("Elegir una opción: ");
            op = escanear.next().charAt(0);

            if (op >= 'a' && op <= 'z') {  // Si es Minus => Pasar a Mayus
                op = (char) ((int) op - 32);
            }
            if (op == 'A' || op == 'B') {  // Si es opcion valida Romper Do-While ; Si no, volver a mostrar menú
                break;
            }
            System.out.println("Error - Elegir opción valida");
        } while (true);

        switch (op) {
            case 'A':
                funcionMedia(a);
                break;
            default:
                funcionMenor(a);
        }

    }

    public static void funcionMedia(int[] arrayMedias) {
        int sum = 0;
        for (int i = 0; i < arrayMedias.length; i++) {
            sum += arrayMedias[i];
        }
        sum = sum / arrayMedias.length;

        pintarArray(arrayMedias);
        System.out.println("La media de los elementos del array es: " + sum);
        return;
    }

    public static void funcionMenor(int[] arrayMenor) {
        int pos = 0, menor = arrayMenor[0];

        for (int i = 0; i < arrayMenor.length; i++) {
            if (arrayMenor[i] < menor) {
                menor = arrayMenor[i];
                pos = i + 1;
            }
        }

        pintarArray(arrayMenor);
        System.out.println("El elemento menor es: " + menor + "\nY ocupa la posición: " + pos + " (indice " + (pos - 1) + ")");
    }

    public static void pintarArray(int[] array) {
        System.out.print("\nEl array es:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b\n");

    }
}
