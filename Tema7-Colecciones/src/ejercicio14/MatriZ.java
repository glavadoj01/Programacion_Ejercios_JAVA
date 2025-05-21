package ejercicio14;

/*
Diseña una aplicación Java que permita:
    a. Guardar una matriz cuadrada de datos enteros en un arrayList.
    b. Pedir al usuario el número de filas y generar los valores enteros de forma aleatoria.
        Los valores generados deben estar comprendidos entre 0 y 9.
    c. Mostrar la matriz en pantalla.
    d. Calcular y mostrar la suma de las dos diagonales.
*/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MatriZ {

    public static ArrayList<Integer> guardarMatrizComoArrayList(int[][] entrada) {
        ArrayList<Integer> salida = new ArrayList<>();

        for (int i = 0; i < entrada.length; i++) {
            for (int j = 0; j < entrada[i].length; j++) {
                salida.add(entrada[i][j]);
            }
        }
        return salida;
    }

    public static int[][] generarMatriz() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int nFilas;

        while (true) {
            System.out.println("Ingrese el nº de filas entre 1 y 10");
            try {
                nFilas = sc.nextInt();
                if (nFilas >= 1 && nFilas <= 10) {
                    sc.close();
                    break;
                }
                System.out.println("Ingresar un entero entre 1 y 10");
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Introducir un dígito entero");
            }
        }
        int[][] matrizNueva = new int[nFilas][nFilas];
        for (int i = 0; i < matrizNueva.length; i++) {
            for (int j = 0; j < matrizNueva[i].length; j++) {
                matrizNueva[i][j] = rand.nextInt(10);
            }
        }
        return matrizNueva;
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.print("Matriz");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("\nFila " + (i + 1) + ':');
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t" + matriz[i][j]);
            }
        }
        System.out.println();
    }

    public static int sumaDiagonales(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i] + matriz[matriz.length - 1 - i][i];
        }
        return suma;
    }
}

