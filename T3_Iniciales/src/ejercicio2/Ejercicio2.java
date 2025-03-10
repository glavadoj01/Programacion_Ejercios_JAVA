package ejercicio2;

import java.util.Scanner;

/*
Diseña un programa Java que solicite dos números enteros y muestre
un mensaje indicando si son iguales o no.
*/
public class Ejercicio2 {
    public static void main(String[] args) {

        //Def. métodos y variables
        Scanner escanear = new Scanner(System.in);
        int a, b;

        //Entrada de datos
        System.out.print("Introducir el primer nº entero: ");
        a = escanear.nextShort();
        System.out.print("Introducir el segundo nº entero: ");
        b = escanear.nextShort();

        //Salida de resultados
        if (a == b) {
            System.out.println("El primer nº '" + a + "', es igual que el segundo nº '" + b + "'");
        } else {
            System.out.println("El primer nº '" + a + "', es distinto del segundo nº '" + b + "'");
        }
    }
}
