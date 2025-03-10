package ejercicio31;

import java.util.Scanner;

/*
Diseña un programa que solicite un año y muestre si es bisiesto o no. Se dice: un año es bisiesto si
es divisible entre cuatro y no es divisible entre 100 ó es divisible entre 400. Dar la opción de repetir.
*/
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int año;
        boolean esBisiesto = false;
        String rep = "S";

        do {

            System.out.print("\nIntroducir un año para ver si es bisiesto: ");
            año = escanear.nextInt();

            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                esBisiesto = true;
                System.out.println("El año " + año + " es bisiesto");
            } else {
                System.out.println("El año " + año + " no es bisiesto");
            }

            do {
                System.out.print("\n¿Quiere repetir? S/N: ");
                rep = escanear.next().toUpperCase();
            } while (!(rep.equals("S") || rep.equals("N")));



        } while (rep.equals("S"));
    }
}
