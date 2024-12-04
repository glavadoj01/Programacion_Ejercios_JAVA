package ejercicio33;
import java.util.Scanner;
/*
Diseña un programa Java que solicite dos caracteres (por separado) y muestre cuál de ellos tiene
un código ASCII mayor. Dar la opción de repetir.
*/
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int ascii1, ascii2;
        char cosa1, cosa2;
        char rep = 'S';

        while (rep == 'S' || rep == 's') {
            // ENtradas
            System.out.println("\nIntroducir 2 caracteres para ver cuales son sus códigos ASCII (ordenados de mayor a menor)");
            System.out.print("Introducir el 1º caracter: ");
            cosa1 = escanear.next().charAt(0);
            System.out.print("Introducir el 2º caracter: ");
            cosa2 = escanear.next().charAt(0);

            // Procesado con salida
            ascii1 = (int) cosa1;
            ascii2 = (int) cosa2;
            if (ascii1 > ascii2) {
                System.out.printf("\nEl código ASCII mayor es el de:\t\"%s\"\t;el cual es: %3d", cosa1, ascii1);
                System.out.printf("\nEl código ASCII menor es el de:\t\"%s\"\t;el cual es: %3d", cosa2, ascii2);
            }
            else {
                System.out.printf("\nEl código ASCII mayor es el de:\t\"%s\"\t;el cual es: %3d", cosa2, ascii2);
                System.out.printf("\nEl código ASCII menor es el de:\t\"%s\"\t;el cual es: %3d", cosa1, ascii1);
            }

            // Repetición
             do {
                System.out.print("\n¿Quiere repetir? S/N: ");
                rep = escanear.next().charAt(0);
                if (rep != 'S' && rep != 'N' && rep != 's' && rep != 'n') {
                    System.out.println("Error");
                }
            } while (rep != 'S' && rep != 'N' && rep != 's' && rep != 'n');
        }
    }
}
