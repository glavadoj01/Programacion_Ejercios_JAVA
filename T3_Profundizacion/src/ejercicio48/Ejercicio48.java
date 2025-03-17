package ejercicio48;

import java.util.Random;

/*
Diseña un programa que genere e imprima 10 números al azar entre 1 y 500 mediante
la clase Random. Al final el programa debe mostrar el menor y el mayor de todos ellos.
*/
public class Ejercicio48 {
    public static void main(String[] args) {
        Random generador = new Random();
        int num, mayor = 0, menor = 501;

        for (int i = 1; i <= 10; i++) {
            num = generador.nextInt(500) + 1;
            System.out.println(num);
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor){
                menor = num;
            }
        }
        System.out.println("El nº mayor de los generados es: " + mayor);
        System.out.println("El nº menor de los generados es: " + menor);
    }
}
