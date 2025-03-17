package ejercicio9;

import java.util.Scanner;

/*
Diseña un programa Java que trabaje con un array de 10 elementos, como este int [] a= {1,66,15,33,2,34,65,39,15,78}.

a. El programa contendrá una función que buscará un valor en el array y devolverá la primera posición donde fue
encontrado o -1 en caso de no encontrarlo. La función llevará dos parámetros, el elemento buscado y el array.

b. Diseña también una función que cuente las veces que aparece o se repite un valor en el array. La función llevará
dos parámetros, el elemento buscado y el array.
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int[] a = {1, 66, 15, 33, 2, 34, 65, 39, 15, 78};
        int num = 0, pos, apa;


        do {
            try {
                System.out.print("\nIngrese el numero que desee buscar en la memoria: ");
                num = escanear.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("ERROR - Ingresar un entero");
                escanear.nextLine();
            }
        } while (true); // Escanear NextInt()

        pos = buscarPrimeraPosicion(num, a);

        if (pos != -1) {
            apa = contarApariciones(num, a);
            System.out.println("\nEl nº " + num + ", aparece por primera vez en la posición " + pos + ".\nY un total de " + apa + " veces.");
            System.out.println("NOTA: El valor posición, corresponde a la posicion ordinal; no al indice del array.");
        } else {
            System.out.println("\nEl nº " + num + ", no aparece nignuna vez en el array.");
        }
    }

    public static int buscarPrimeraPosicion(int num, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                return i + 1;
            }
        }
        return -1;
    }

    public static int contarApariciones(int num, int[] a) {
        int count = 0;

        System.out.print("El array es:    ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
            if (a[i] == num) {
                count++;
            }
        }
        System.out.print("\b\b\n");
        return count;
    }
}
