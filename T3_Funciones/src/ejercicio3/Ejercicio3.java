package ejercicio3;

import java.util.Scanner;

/*
Diseña un programa Java que incluya una función que devuelva true o false, según el año pasado como parámetro
sea bisiesto o no.
Función hecha en: Profundización31
*/
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int anno;
        boolean bisiesto;

        System.out.print("Introduzca un año: ");
        anno = escanear.nextInt();

        bisiesto = esBisiesto(anno);
        if (bisiesto) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    public static boolean esBisiesto(int año) {
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            return true;
        }
        return false;
    }
}
