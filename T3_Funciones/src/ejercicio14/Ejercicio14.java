package ejercicio14;

import java.util.Scanner;

/*
Diseña un programa Java que incluya una función que muestre en pantalla los pares de números primos gemelos
que hay entre 1 y un número pasado como parámetro. Se dice que dos números primos son gemelos si uno de ellos
es igual al otro más dos unidades. Así, los números 3 y 5 son primos gemelos.

Antes de nada, diseña una función que devuelva true o false según un número pasado como parámetro sea primo o no.
        1, 2, 3, 4, 5, ……………..100
*/
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int limite;

        System.out.print("Ingresar la cota superior: ");
        limite = escanear.nextInt();

        for (int i=1; i<=limite-2; i++) {
            if(esPrimo(i)&&esPrimo(i+2)) {
                    System.out.println("El nº " + i + ", y el nº "+ (i+2)+" son primos gemelos");
            }
        }
    }

    public static boolean esPrimo(int num) {
        if (num == 2) {
            return true;
        } else if (num == 1 || num % 2 == 0) {
            return false;   // Nº 1 y num's pares NO
        } else {
            for (int i = 3; i <= (num / 2); i = i + 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        } // Si llega hasta aquí es xq no ha encontrado divisores
        return true;
    }
}