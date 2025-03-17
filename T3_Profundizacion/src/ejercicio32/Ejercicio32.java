package ejercicio32;

import java.util.Scanner;

/*
Diseña un programa Java que solicite al usuario un año y un nombre de mes e imprima en pantalla los días
que tiene el mes tecleado. Tener en cuenta los años bisiestos. Dar la opción de repetir.
*/
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int año;
        String mes, rep ="S";

        while (rep.equals("S")) {
            System.out.print("\nIntroducir un año y mes para ver el nº de días");
            System.out.print("\nIntroducir el número del año: ");
            año = escanear.nextInt();
            System.out.print("\nIntroducir el nombre del mes: ");
            mes = escanear.next().toLowerCase();

            switch (mes) {
                case "enero", "marzo", "mayo", "julio", "agosto", "octubre","diciembre":
                    System.out.printf("\nEl mes de %s del año %d tiene 31 días", mes, año);
                    break;
                case "abril", "junio", "septiembre", "noviembre":
                    System.out.printf("\nEl mes de %s del año %d tiene 30 días", mes, año);
                    break;
                case "febrero":
                    if (esBisiesto(año)) {
                        System.out.printf("\nEl mes de %s del año %d tiene 29 días", mes, año);
                        break;
                    }
                    System.out.printf("\nEl mes de %s del año %d tiene 28 días", mes, año);
                    break;
                default:
                    System.out.println("Introducir una mes valido");
            }

            do {
                System.out.print("\n¿Quiere repetir? S/N: ");
                rep = escanear.next().toUpperCase();
            } while (!(rep.equals("S") || rep.equals("N")));
        }
    }

    public static boolean esBisiesto (int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            return true;
        }
        return false;
    }
}
