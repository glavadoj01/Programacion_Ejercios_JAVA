package ejercicio6;

import java.util.Scanner;

/*
Diseña un programa Java que solicite el número de elementos de un array de números enteros. Luego creará
el array con ese número de elementos , y lo llenará con los impares del 3 en adelante. Mostrar el array.
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num;
        int[] array;

        System.out.print("Ingrese el número de elementos: ");
        num = escanear.nextInt();
        array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = (2 * i) + 3;
        }

        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.printf("\b\b\n");
    }
}
