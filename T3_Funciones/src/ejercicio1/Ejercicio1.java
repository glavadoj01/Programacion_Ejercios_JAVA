package ejercicio1;

import java.util.Scanner;

/*
Diseña un programa Java que incluya una función que devuelva el mayor de dos números enteros pasados como parámetro.
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int a, b, c;

        System.out.print("Ingrese un nº: ");
        a = escanear.nextInt();
        System.out.print("Ingrese otro nº: ");
        b = escanear.nextInt();

        c = devolverMayor(a, b);
        System.out.println("El nº mayor es: " + c);
    }

    public static int devolverMayor(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }
}
