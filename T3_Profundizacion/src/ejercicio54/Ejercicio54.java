package ejercicio54;

import java.util.Scanner;

/*
Diseña un programa que muestra en pantalla una figura como la de la imagen. Solicita filas, en la imagen 6.
*
**
* *
*  *
*   *
******
*/
public class Ejercicio54 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, esp;

        System.out.print("Ingrese un numero: ");
        num = escanear.nextInt();
        System.out.println("________________________");

        for (int i = 1; i <= num; i++) {
            if (i == 1 || i == num) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 1; j <= (i - 2); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
