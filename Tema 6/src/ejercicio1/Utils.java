package ejercicio1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Utils {

    /* Diseña una función que reciba una cadena y muestre cada carácter de la misma
        indicando si es dígito, letra u otro.   */
    public static void verCadaCaracter(String cadena) {
        char[] cadenaArray = cadena.toCharArray();
        for (char c : cadenaArray) {
            if (Character.isLetter(c)) {
                System.out.println(c + "\tEs una letra");
                continue;
            }
            if (Character.isDigit(c)) {
                System.out.println(c + "\tEs una numero");
                continue;
            }
            System.out.println(c + "\tEs un carácter no alfanumérico");
        }
    }

    /* Diseña una función que reciba un array de cadenas y devuelva otro array en el
        que figuren las cadenas del primer array que finalizan con un patrón concreto.
        La función recibe el array y el patrón   */
    public static String[] buscarPatron(String[] cadenas, String patron) {
        String salidas = "";
        for (String cadena : cadenas) {
            if (cadena.endsWith(patron)) {
                salidas = salidas.concat(cadena).concat(";");
            }
        }
        return salidas.split(";");
    }

    /* Diseña una función que reciba una cadena de palabras separadas por un mismo carácter
        (punto y coma, coma, etc.) y devuelva un array de String con cada una de esas palabras.
        La función también debe llevar como parámetro el separador. */
    public static String[] separarCadenaConPatron(String cadenas, String patron) {
        return cadenas.split(patron);
    }

    /* Diseña una función que reciba un array de enteros y un valor. La función ordenará el array,
        lo mostrará y devolverá la posición de ese valor en el array o -1 si no lo encuentra. */
    public static int buscarYOrdenarNumeros(int[] listaEntrada, int valor) {
        Arrays.sort(listaEntrada);

        System.out.println();
        for (Integer num : listaEntrada) {
            System.out.print(num + ";\t");
        }
        System.out.print("\b\b\n");

        return Arrays.binarySearch(listaEntrada, valor)+1; // Para devolver POSICIÓN hay que sumar 1
                                                           // Si no, devuelvo ÍNDICE
    }

    /* Diseña una función que reciba un array de fechas (java.time.LocalDate) y las muestre ordenadas
        de forma ascendente. */
    public static void imprimirFechas(LocalDate[] arrayFechas) {
        Arrays.sort(arrayFechas);
        for (LocalDate fecha : arrayFechas) {
            System.out.println(fecha);
        }
    }

    /* Diseña una función que reciba un array de fechas (java.time.LocalDate), un mes y un año y
        devuelva cuántas de esas fechas pertenecen a ese mes y año. */
    public static int contarFechasEn(LocalDate[] arrayFechas, int mes, int anno) {
        int salida = 0;

        for (LocalDate fecha : arrayFechas) {
            if (fecha.getMonthValue() == mes && fecha.getYear() == anno) {
                salida++;
            }
        }
        return salida;
    }

    /* Diseña una función que reciba un array de horas (java.time.LocalTime) y una hora y devuelva
        cuantas de las horas del array son anteriores a la pasada como parámetro */
    public static int contarHorasAntesDe (LocalTime[] arrayHoras, LocalTime horaLimite) {
        int salida = 0;

        for (LocalTime hora : arrayHoras) {
            if (hora.isBefore(horaLimite)) {
                salida++;
            }
        }
        return salida;
    }
}
