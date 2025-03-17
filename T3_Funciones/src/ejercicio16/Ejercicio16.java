package ejercicio16;

import java.util.Scanner;

/*
Diseña una función que imprima en pantalla los N primeros términos de la serie de
Fibonacci. El valor de N será pasado como parámetro. La serie de Fibonacci es la
siguiente: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144. Como se puede ver, cada
número de la serie se obtiene sumando los dos anteriores.
*/
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sumaIn;
        int[] sucesion;

        System.out.print("Ingrese el número de términos: ");
        num = sc.nextInt();

        sucesion = generarSucesion(num);
        pintarArray(sucesion);

        System.out.println("\narray moodel\n");
        sumaIn = fibonacciMoodel(10);
        System.out.println("\n"+sumaIn);
    }

    public static int[] generarSucesion(int num) {
        int[] salida = new int[num];

        salida[0] = 0;      // Termino 1
        if (num >= 2) {    //  Termino 2
            salida[1] = 1;
        }

        for (int i = 2; i < num; i++) {    // Terminos del 3 al N
            salida[i] = salida[i - 1] + salida[i - 2];
        }
        return salida;
    }

    public static void pintarArray(int[] array) {
        int sum = 0;
        System.out.printf("\nLos %d priméros términos de la sucesión de Fibonacci son:\n", array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
            sum += array[i];
        }
        System.out.print("\nLa suma de los terminos es: " + sum);
    }

    public static int fibonacciMoodel(int n) {
        // Casos base
        if (n <= 0) {       // El ejemplo no va :(
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Caso recursivo
        else {
            System.out.print((fibonacciMoodel(n - 1) + fibonacciMoodel(n - 2)) + "\t");
            return fibonacciMoodel(n - 1) + fibonacciMoodel(n - 2);
        }
    }
}
