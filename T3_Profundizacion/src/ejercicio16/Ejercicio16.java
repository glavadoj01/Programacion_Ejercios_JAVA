package ejercicio16;

import java.util.Scanner;

/*
Diseña un programa Java que solicite dos números enteros al usuario y nos diga si el primero es divisor del segundo.
El número 2 es divisor de 16 ya que al dividir 16 entre 2 el resto de la división es cero. Dar la opción de repetir.
*/
public class Ejercicio16 {
    public static void main(String[] args) {
        int a, b;
        String rep;

        do {
            Scanner escanear = new Scanner(System.in);
            boolean esEntero1 = false, esEntero2 = false;
            System.out.println("\nIntroduccir dos nº's para ver si el 1º es divisor del 2º.");

            //Entrada A alternativa
            a = 0;
            System.out.print("Introducir el  primer entero positivo: ");
            do {
                while (!esEntero1) {
                    try {
                        a = escanear.nextInt();
                        esEntero1 = true;
                    } catch (Exception e) {
                        System.out.print("\n ERROR - Introducir un entero: ");
                    }
                    escanear.nextLine();
                }
                if (a == 0) {
                    System.out.println("Error - El nº cero no puede ser un divisor de ningún nº.");
                    esEntero1 = false;
                } else if (a < 1) {
                    System.out.println("Error - El divisor debe ser un nº entero positivo.");
                    esEntero1 = false;
                }
            } while (a < 1);

            // ENTRADA B
            b = 0;
            System.out.print("Introducir el segundo entero: ");
            do {
                while (!esEntero2) {
                    try {
                        b = escanear.nextInt();
                        esEntero2 = true;
                    } catch (Exception e) {
                        System.out.print("\n ERROR - Introducir un entero: ");
                    }
                    escanear.nextLine();
                }
                if (b == 0) {
                    System.out.print("\nError - El nº cero no tiene divisores, introducir un entero distinto de cero: ");
                    esEntero2 = false;
                }
            } while (b == 0);


            // Salida
            if (b % a == 0) {
                System.out.printf("\nEl nº %d es divisor del nº %d.\n", a, b);
            } else {
                System.out.printf("\nEl nº %d no es divisor del nº %d.\n", a, b);
            }

            // Repetición Y/N
            System.out.println("\n¿Desea repetir la pregunta?");
            System.out.println("S -> Repetir");
            System.out.println("N -> Salir");
            do {
                rep = escanear.next().toUpperCase();
                if (!(rep.equals("S") || rep.equals("N"))) {
                    System.out.print("Error, introducir opción valida (S o N): ");
                }
             } while (!(rep.equals("S") || rep.equals("N")));
            escanear.close();
        } while (rep.equals("S"));
    }
}
