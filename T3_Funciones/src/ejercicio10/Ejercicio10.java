package ejercicio10;

import java.util.Random;
import java.util.Scanner;

/*
Diseña una función Java que devuelva un entero aleatorio dentro de un rango dado.
Los valores límite del rango están incluidos
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int a, b, c;

        System.out.print("Introducir la cota inferior: ");
        a = escanear.nextInt();
        System.out.print("Introducir la cota superior: ");
        b = escanear.nextInt();

        c = aleatorio(a, b);
        System.out.println(c);
    }

    public static int aleatorio(int a, int b) {
        Random crearRandom = new Random();
        int c;
        c = crearRandom.nextInt(b-a+1) + a;
        return c;
    }
}
