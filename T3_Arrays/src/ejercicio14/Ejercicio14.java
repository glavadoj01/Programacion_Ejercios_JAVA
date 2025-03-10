package ejercicio14;
/*
Diseña un programa Java que solicite al usuario un número entero entre 1 y 12 y
muestre el nombre del mes correspondiente a ese número. Diseña para ello una
función que reciba un número de mes (entre 1 y 12) y devuelva el mes asociado.
*/

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String nombre;

        do {
            System.out.print("Introducir un nº entre 1 y 12: ");
            try {
                num = sc.nextInt();
                if (num > 0 && num < 13) {
                    break;
                } else {
                    System.out.println("ERROR - Introduccir un nº entre 1 y 12");
                }
            } catch (Exception e) {
                System.out.println("ERROR - Introduccir un nº entero");
                sc.nextLine();
            }
        } while (true);

        nombre = obtenermes(num);
        System.out.println("El mes nº " + num + ", corresponde al mes de " + nombre);
    }

    public static String obtenermes(int num) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
                "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return meses[num-1];
    }
}
