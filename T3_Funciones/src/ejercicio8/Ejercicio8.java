package ejercicio8;

import java.util.Scanner;

/*
Diseña un programa en Java que trabaje con dos funciones
a. gradosCK, pasará un valor de temperatura de grados centígrados a Kelvin.
b. gradosCF, pasará un valor de temperatura de grados centígrados a Fahrenheit.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        float t1, t2;
        int op;

        System.out.print("Introducir una temperatura en ºC: ");
        t1 = escanear.nextFloat();
        System.out.println("Para convertir a ºF : 1");
        System.out.println("Para convertir a escala absoluta: 2");
        op = escanear.nextInt();

        switch (op) {
            case 1:
                t2 = gradosCF(t1);
                System.out.println("La temperatura de " + t1 + " ºC, corresponde a: " + t2 + " ºF");
                break;
            case 2:
                t2 = gradosCK(t1);
                System.out.println("La temperatura de " + t1 + " ºC, corresponde a: " + t2 + " K");
                break;
            default:
                System.out.println("ERROR - Ingresar opción valida");
        }
    }

    public static float gradosCF(float temperaturaCentigrado) {
        return ((temperaturaCentigrado + 1.8f) + 32);
    }

    public static float gradosCK(float temperaturaCentigrado) {
        return (temperaturaCentigrado + 273.15f);
    }
}
