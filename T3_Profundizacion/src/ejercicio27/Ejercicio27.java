package ejercicio27;

import java.util.Scanner;

/*
Diseña un programa en Java que compruebe si un número dado es perfecto o no. Se dice que un número es perfecto
si es igual a la suma de sus divisores, obviamente sin incluir al propio número.

Los 4 primeros nº's perfectos son: 6, 28, 496 y 8128.
Fuentes: Wikipedia y el canal de YouTube de Eduardo Saenz de Cabezón, Dr en Matemáticas, investigador y divulgador.
(https://www.youtube.com/@Derivando)
*/
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int n, s;
        String rep;

        while (true) {
            System.out.println("Ingrese un nº entero: ");
            n = escanear.nextInt();

            s = sumaDivisores(n);
            if (n == s) {
                System.out.println("El nº " + n + ", es perfecto.");
            } else {
                System.out.println("El nº " + n + ", NO es perfecto.");
            }

            System.out.println("Salir $");
            rep = escanear.next();
            if (rep.equalsIgnoreCase("$")) {
                break;
            }
        }
    }

    public static int sumaDivisores(int a) {
        int suma = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
