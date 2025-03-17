package ejercicio7;

import java.util.Scanner;

/*
Diseña un programa Java que incluya una función que reciba como parámetro un entero y devuelva el factorial de
dicho número entero. El factorial de 5 es: 5*4*3*2*1, o bien 5 * el factorial de 4.
Función hecha en: Profundización61
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int a;
        double b; // Para a >= 13; b debe ser double. Probar int b y a=65

        System.out.print("Ingrese el valor de a: ");
        a = escanear.nextInt();
        b = factorial(a);
        System.out.println("El factorial del valor de a es: " + b);
    }

    public static double factorial(int num) {
        double fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
