package ejercicio2;

import java.util.Scanner;

/*
Diseña un programa Java que incluya una función que imprima los caracteres existentes entre otros dos caracteres dados.
Es decir, si pasamos las letras a y f. La función imprimirá los valores: a, b, c, d, e, f.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        char a, b;

        System.out.print("Ingrese un carácter: ");
        a = escanear.next().charAt(0);
        System.out.print("Ingrese otro carácter: ");
        b = escanear.next().charAt(0);

        imprimir(a, b);
    }

    public static void imprimir(char caracter1, char caracter2) {
        int mayor, menor;

        mayor = Math.max(caracter1, caracter2);
        menor = Math.min(caracter1, caracter2);

        for (int i = menor; i <= mayor; i++) {
            System.out.print((char) i + "\t");
        }
    }
}
