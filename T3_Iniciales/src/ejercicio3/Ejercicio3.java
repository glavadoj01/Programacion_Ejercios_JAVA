package ejercicio3;

import java.util.Scanner;

/* Diseña un programa Java que solicite un número entero al usuario e indique
si dicho número es positivo o negativo */
public class Ejercicio3 {
    public static void main(String[] args) {
        //Def de métodos y variables
        Scanner escanear = new Scanner(System.in);
        int a;
        //Entrada de datos
        System.out.print("Introducir un nº entero positivo o negativo: ");
        a = escanear.nextInt();
        //Salida de datos
        if (a < 0) {
            System.out.println("El nº " + a + " es negativo.");
        } else if (a == 0) {
            System.out.println("El nº " + a + " es nulo.");
        } else {
            System.out.println("El nº " + a + " es positivo.");
        }
    }
}