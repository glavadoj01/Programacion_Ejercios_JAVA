package ejercicio12;

import java.util.Random;
import java.util.Scanner;

/*
Diseña un programa Java que llene mediante un bucle for un array de 10 elementos enteros con valores
al azar entre 1 y 100. Hecho esto, el programa pedirá al usuario una posición de inicio y otra de fin
y sumará los valores del array entre esas posiciones (incluidas). Controlar que las posiciones sean válidas.
Diseña una función que reciba como parámetro el array, las posiciones de inicio y fin
y devuelva la suma de esos valores.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        Random crearRandom = new Random();
        int[] array = new int[10];
        int inicio, fin, suma = 0;

        // Llenar array con valores entre 1 y 100 (incluidos)
        for (int i = 0; i < array.length; i++) {
            array[i] = crearRandom.nextInt(100) + 1;
        }

        pintarArray(array);
        System.out.println("Vamos a sumar los valores entre dos posiciones (no indices)");
        while (true) {
            System.out.print("Introducir posición de inicio: ");
            inicio = escanear.nextInt();
            if (inicio >= 1 && inicio <= array.length) {
                break;
            }
            System.out.println("ERROR - Introducir una posicion valida");
        }

        while (true) {
            System.out.print("Introducir posición de fin: ");
            fin = escanear.nextInt();
            if (fin >= inicio && fin <= array.length) {
                break;
            } else if (fin < inicio) {
                System.out.println("ERROR - Introducir una posicion valida (igual o superior a la inicial)");
            } else {
                System.out.println("ERROR - Introducir una posicion valida (igual o menor a 10");
            }
        }

        suma=hayarsuma(array,inicio,fin);
        pintarArray(array);
        System.out.println("La suma entre los elementos nº " + inicio + ", y nº " + fin + " es igual a: " + suma);
    }

    public static void pintarArray(int[] array) {
        System.out.print("\nEl array es:  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b\n");
    }

    public static int hayarsuma(int[] array, int inicio, int fin) {
        int suma = 0;
        for (int i = (inicio-1); i <= (fin-1); i++) {
            suma += array[i];
        }
        return suma;
    }
}