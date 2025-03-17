package problema4;

import java.util.Scanner;

/*
Realizar un juego para adivinar un número N que has definido dentro del programa.
Para ello pedir ir pidiendo números indicando “mayor” o “menor” según sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta.
*/
public class Problema4 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int N = 123, num, cont = 0;

        do {
            System.out.print("Intenta adivinar el nº predefinido: ");
            num = escanear.nextInt();
            if (num > N) {
                System.out.println("Has fallado. El nº " + num + ", es mayor que el nº predefinido.");
            } else if (num < N) {
                System.out.println("Has fallado. El nº " + num + ", es menor que el nº predefinido.");
            } else {
                System.out.println("¡Has acertado! El nº predefinido era: " + num);
                cont++;
                System.out.println("Se han requerido un total de " + cont + " intentos.");
                break;
            }
            cont++;
        } while (true);
        escanear.close();
    }
}
