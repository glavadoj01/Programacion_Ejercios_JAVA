package ejercicio49;

import java.util.Random;

/*
Diseña un programa que genere 10 números al azar mediante el metodo nextInt() de
la clase Random. El programa mostrará al final cuántos de esos números son positivos
y cuántos negativos.
*/
public class Ejercicio49 {
    public static void main(String[] args) {
        Random generador = new Random();
        int num, pos = 0, neg = 0;

        for (int i = 1; i <= 10; i++) {
            num = generador.nextInt();
            if (num < 0) {
                neg++;
            } else if (num > 0) {
                pos++;
            }
        }
        System.out.println("De los 10 nº's, " + neg + " han sido negativos.");
        System.out.println("De los 10 nº's, " + pos + " han sido positivos.");
        System.out.println("De los 10 nº's, el cero has alido un total de: " + (10-pos-neg) + "veces");

    }
}
