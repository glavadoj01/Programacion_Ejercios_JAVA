package ejercicio20;

import java.util.Random;
import java.util.Scanner;

/*
Diseña un programa en Java que trabaje con una matriz de 4X5 de tipo double. El programa llenará la matriz
con valores reales entre 1 y 100 y al mismo tiempo mostrará la matriz en pantalla. Luego, pedirá una fila
al usuario y mostrará los valores de esa fila y su suma.
*/
public class Ejercicio20 {
    public static void main(String[] args) {
        Random crearRandom = new Random();
        Scanner sc = new Scanner(System.in);
        double[][] matriz = new double[6][20];
        int op, sum = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = crearRandom.nextDouble(100.00f-1.00f+0.01f) + 1;
            }
        }
        pintarMatriz(matriz);
        System.out.print("Eliga el número de fila (1-4) que desea sumar: ");
        op = sc.nextInt();

        System.out.print("La fila es: ");
        for (int i = 0; i < matriz[op - 1].length; i++) {
            sum += matriz[op - 1][i];
            System.out.print(String.format("%.2f", matriz[op - 1][i]) + "\t");
        }
        System.out.println("\nLa suma de los elemeentos es: " + sum);
    }

    public static void pintarMatriz(double[][] matriz) {
        System.out.println("La Matriz es:\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format("%.2f", matriz[i][j]) + "\t");
            }
            System.out.print("\n");
        }
    }
}