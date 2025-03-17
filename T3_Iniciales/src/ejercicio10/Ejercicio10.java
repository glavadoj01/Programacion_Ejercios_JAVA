package ejercicio10;

import java.util.Scanner;

/*
Diseña un programa Java que solicite un número entero entre 1 y 12 y escriba
el mes asociado a dicho número.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        //Def métodos y variables
        Scanner escanear = new Scanner(System.in);
        int a;
        //Entrada de datos
        a = 0;
        while (a < 1 || a > 12) {
            System.out.print("Introducir el nº de un mes: ");
            a = escanear.nextInt();
        }
        //Salida de datos
        System.out.println();
        switch (a) {
            case 1:
                System.out.println("El mes nº 1 es Enero.");
                break;
            case 2:
                System.out.println("El mes nº 2 es Febrero.");
                break;
            case 3:
                System.out.println("El mes nº 3 es Marzo.");
                break;
            case 4:
                System.out.println("El mes nº 4 es Abril.");
                break;
            case 5:
                System.out.println("El mes nº 5 es Mayo.");
                break;
            case 6:
                System.out.println("El mes nº 6 es Junio");
                break;
            case 7:
                System.out.println("El mes nº 7 es Julio.");
                break;
            case 8:
                System.out.println("El mes nº 8 es Agosto.");
                break;
            case 9:
                System.out.println("El mes nº 9 es Septiembre.");
                break;
            case 10:
                System.out.println("El mes nº 10 es Octubre.");
                break;
            case 11:
                System.out.println("El mes nº 11 es Noviembre.");
                break;
            default:
                System.out.println("El mes nº 12 es Diciembre");
        }
    }
}
