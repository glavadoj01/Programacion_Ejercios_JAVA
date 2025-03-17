package ejercicio6;

import java.util.Scanner;

/*Diseña un programa Java que pida un número entero y escriba en pantalla si
es par o no. Recuerda utilizar el operador % que devuelve el resto de una división entera.*/
public class Ejercicio6 {
    public static void main(String[] args) {
        //Def métodos y variables
        Scanner escanear = new Scanner(System.in);
        int a;
        //Entrada de datos
        System.out.print("Introducir un nº entero: ");
        a = escanear.nextInt();
        //Salida de datos
        if ((a % 2) == 0) {
            System.out.println("El nº " + a + " es par.");
        } else {
            System.out.println("El nº " + a + " es impar.");
        }
    }
}