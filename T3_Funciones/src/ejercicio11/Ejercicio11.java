package ejercicio11;

import java.util.Scanner;

/*
Diseña una función Java que devuelva el nombre de un mes cuyo número será pasado como parámetro.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num;
        String mes;

        System.out.print("Ingrese un numero: ");
        num = escanear.nextInt();

        mes = obtenerMes(num);
        System.out.printf("\nEl mes nº %d es %s", num, mes);
    }

    public static String obtenerMes(int num) {
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        return mes[num - 1];
    }
}
