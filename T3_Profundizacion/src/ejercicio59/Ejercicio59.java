package ejercicio59;

import java.util.Scanner;

/*Diseña un programa Java que comprueba si un número dado es o no primo. */
public class Ejercicio59 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, div = 1;
        boolean esPrimo = false;

        do {
            System.out.println("Introducir un nº entero positivo para comprobar si es o no, un nº primo: ");
            try {
                num = escanear.nextInt();
                if (num < 1) {
                    System.out.println("Error - Se requiere un nº positivo");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Error - Se requiere un nº entero");
            }
            escanear.nextLine();
        } while (true);


        if (num == 2) {
            esPrimo = true;
        } else if (num == 1 || num % 2 == 0) {
        } else {
            for (int i = 3; i <= (num / 2); i = i + 2) {
                if (num % i == 0) {
                    div++;
                }
            }
            if (div == 1) {
                esPrimo = true;
            }
        }

        if (esPrimo) {
            System.out.println("El nº " + num + ", es primo");
        } else {
            System.out.println("El nº " + num + ", no es primo");
        }

    }
}
