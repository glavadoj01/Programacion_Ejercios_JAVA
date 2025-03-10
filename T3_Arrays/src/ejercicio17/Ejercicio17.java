package ejercicio17;

import java.util.Scanner;

/*
Diseña un programa que partiendo de una cantidad de dinero, la reparta en la menor
cantidad de billetes y monedas posible. Utiliza arrays en la resolución.
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aceptados = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] devolver = new int[aceptados.length];
        int num, temp;

        // Introducir Datos
        System.out.print("Ingresar la cantidad de dinero a devolver: ");
        num = sc.nextInt();

        // Proceso - Devolver
        temp = num;
        for (int i = 0; i < aceptados.length; i++) {
            devolver[i] = temp / aceptados[i];
            temp = temp - (devolver[i] * aceptados[i]);
        }

        // Pintar la solucion
        System.out.println("La cantidad minima de billetes y monedas para devolver " + num + "€ es de: ");
        for (int i = 0; i < aceptados.length; i++) {
            System.out.println(devolver[i] + " de " + aceptados[i] +"€");
        }

    }
}
