package ejercicio7;

import java.util.Scanner;

/*
Diseña un programa Java que pida tres números de típo double y calcule
la media aritmética de los mismos. Hecho esto el programa dirá si la media
es superior, igual o inferior a 10.
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        //Def métodos y variables
        Scanner escanear = new Scanner(System.in);
        double a, b, c, media;
        //Entrada de datos
        System.out.print("Introducir el primer nº decimal: ");
        a = escanear.nextDouble();
        System.out.print("Introducir el segundo nº decimal: ");
        b = escanear.nextDouble();
        System.out.print("Introducir el tercer nº decimal: ");
        c = escanear.nextDouble();
        System.out.println();
        //Procesado de datos
        media = (a + b + c) / 3;
        //Salida de datos
        System.out.printf("La media aritmética de los nº's : %s, %s y %s; es igual a: %.4f %n", a, b, c, media);
        if (media > 10) {
            System.out.println("Ademas, la media es mayor que 10.");
        } else if (media == 10) {
            System.out.println("Ademas, la media es igual a 10.");
        } else {
            System.out.println("Ademas, la media es menor que 10.");
        }
    }
}

