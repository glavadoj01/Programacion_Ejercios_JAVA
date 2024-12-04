package ejercicio1;

import java.util.Scanner;

/*
Diseña un programa Java que permita convertir un valor de segundos en horas y minutos.
Luego debe imprimir un mensaje tipo: 3661 Segundos son: 1 horas ; 1 minutos ; 1 segundos
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        // Definición de métodos y variables
        Scanner escanear = new Scanner(System.in);
        int segundos, horas, minutos, seg;

        // Entrada de datos:
        System.out.print("Introducir una cantidad en segundos para ser convertida: ");
        segundos = escanear.nextInt();

        //Procesado de datos:
        horas = segundos / 3600;
        minutos = segundos % 3600 / 60;
        seg = segundos % 60;

        //Presentación de resultados:
        System.out.println("Segundos: " + segundos);
        System.out.println("** " + segundos + " segundos son:");
        System.out.println(horas + " horas");
        System.out.println(minutos + " minutos");
        System.out.println(seg + " segundos");

    }
}
