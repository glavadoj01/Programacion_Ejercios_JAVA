package calculadora;

import java.util.Scanner;

public class Calculadora {
    static Scanner escanear = new Scanner(System.in);

    public static void main (String[] args) {
        char caracter;
        boolean rep = true;
        float num1;

        do {
            do {
                System.out.println();
                System.out.println("MENÚ");
                System.out.println("a. Sumar");
                System.out.println("b. Restar");
                System.out.println("c. Multiplicar");
                System.out.println("d. Dividir");
                System.out.println("s. Salir");
                System.out.print("Introduccir letra de la opción: ");
                caracter = escanear.next().charAt(0);
                if (caracter >= 'A' && caracter <= 'Z') {
                    caracter = (char) ((int) caracter + 32);
                }
                if (caracter != 'a' && caracter != 'b' && caracter != 'c' && caracter != 'd' && caracter != 's') {
                    System.out.println("\nERROR - Introducir opción valida\n");
                }
            } while (caracter != 'a' && caracter != 'b' && caracter != 'c' && caracter != 'd' && caracter != 's');

            System.out.println();
            switch (caracter) {
                case 'a':
                    System.out.println("a. Sumar");
                    num1 = intro();
                    sumar(num1);
                    break;
                case 'b':
                    System.out.println("b. Restar");
                    num1 = intro();
                    restar(num1);
                    break;
                case 'c':
                    System.out.println("c. Multiplicar");
                    num1 = intro();
                    multiplicar(num1);
                    break;
                case 'd':
                    System.out.println("d. Dividir");
                    num1 = intro();
                    dividir(num1);
                    break;
                case 's':
                    System.out.println("s. Salir");
                    rep = false;
                    break;
            }
        } while (rep == true);
    }


    public static float intro() {
        float num;
        System.out.println("Introducir un nº: ");
        num = escanear.nextFloat();
        return num;
    }

    public static void sumar(float num1) {
        float suma, num2;

        num2 = intro();
        suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + suma);

    }

    public static void restar(float num1) {
        float resta, num2;

        num2 = intro();
        resta = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + resta);
    }

    public static void multiplicar(float num1) {
        float mult, num2;

        num2 = intro();
        mult = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + mult);
    }

    public static void dividir(float num1) {
        float div, num2;

        do {
            num2 = intro();
            if (num2 == 0) {
                System.out.println("Error - El divisor no puede ser cero");
            }
        } while (num2 == 0);

        div = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + div);
    }

}
