package ejercicio52;

import java.util.Scanner;

/*
Diseña un programa Java al que pasemos una cantidad de euros (valor entero) y descomponga esa cantidad
en el menor número de billetes y monedas posibles de las existentes en nuestro sistema monetario.
Ejemplo:
Cantidad: 29
**************
De 500-->0
De 200-->0
De 100-->0
De  50-->0
De  20-->1
De  10-->0
De   5-->1
De   2-->2
*/
public class Ejercicio52 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        float euros;
        int centimos, vuelta;

        System.out.print("Ingrese el valor de euros a cambiar: ");
        euros = escanear.nextFloat();
        centimos = (int) (euros * 100);

        System.out.println("Cantidad: " + euros);
        System.out.println("***************");

        vuelta = centimos / 50000;
        System.out.println("De  500 --> " + vuelta);
        centimos = centimos % 50000;

        vuelta = centimos / 20000;
        System.out.println("De  200 --> " + vuelta);
        centimos = centimos % 20000;

        vuelta = centimos / 10000;
        System.out.println("De  100 --> " + vuelta);
        centimos = centimos % 10000;

        vuelta = centimos / 5000;
        System.out.println("De   50 --> " + vuelta);
        centimos = centimos % 5000;

        vuelta = centimos / 2000;
        System.out.println("De   20 --> " + vuelta);
        centimos = centimos % 2000;

        vuelta = centimos / 1000;
        System.out.println("De   10 --> " + vuelta);
        centimos = centimos % 1000;

        vuelta = centimos / 500;
        System.out.println("De    5 --> " + vuelta);
        centimos = centimos % 500;

        vuelta = centimos / 200;
        System.out.println("De    2 --> " + vuelta);
        centimos = centimos % 200;

        vuelta = centimos / 100;
        System.out.println("De    1 --> " + vuelta);
        centimos = centimos % 100;

        vuelta = centimos / 50;
        System.out.println("De 0.50 --> " + vuelta);
        centimos = centimos % 50;

        vuelta = centimos / 20;
        System.out.println("De 0.20 --> " + vuelta);
        centimos = centimos % 20;

        vuelta = centimos / 10;
        System.out.println("De 0.10 --> " + vuelta);
        centimos = centimos % 10;

        vuelta = centimos / 5;
        System.out.println("De 0.05 --> " + vuelta);
        centimos = centimos % 5;

        vuelta = centimos / 2;
        System.out.println("De 0.02 --> " + vuelta);
        centimos = centimos % 2;

        System.out.println("De 0.01 --> " + centimos);
    }
}
