package ejercicio13;

import java.util.Scanner;

/*
Diseña un programa Java que solicite al usuario un número entero entre 1 y 7 y muestre el día de la semana
correspondiente a ese número. Dar la opción de repetir.
*/
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        String[] nombres = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int num;
        char op;

        do {
            while (true) {
                System.out.print("Ingrese el nº de un dia de la semana para ver a que dia corresponde: ");
                num = escanear.nextInt();
                if (num > 0 && num < 8) {
                    break;
                }
                System.out.println("ERROR - Ingresar un nº entre 1 y 7");
            }

            System.out.println("El dia de la semana nº " + num + " es: " + nombres[num - 1]);

            while (true) {
                System.out.println("¿Quiere repetir? S/N");
                op = escanear.next().charAt(0);
                if (op >= 'a' && op <= 'z') {
                    op = (char) ((int) op - 32);
                }
                if (op == 'S' || op == 'N') {
                    break;
                }
            }
        } while (op == 'S');
    }
}
