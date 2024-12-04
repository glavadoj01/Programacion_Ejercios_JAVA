package ejercicio5;

import java.util.Scanner;

/*
Diseña un programa Java que incluya una función que devuelva la media aritmética de tres enteros pasados como
parámetro. El valor devuelto debe ser double.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int a, b, c;
        double m;

        System.out.print("Ingrese el valor de a: ");
        a = escanear.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = escanear.nextInt();
        System.out.print("Ingrese el valor de c: ");
        c = escanear.nextInt();

        m = hayarMedia(a, b, c);
        System.out.println("La media es: " + m);
    }

    public static double hayarMedia(int a, int b, int c) {
        return (a + b + c) / (double) 3;
    }
}