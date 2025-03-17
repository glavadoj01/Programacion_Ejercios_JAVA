package ejercicio30;

import java.util.Random;

/*
Diseña un programa Java que contenga una función que devuelva en un array los números primos contenidos en una
matriz de 10x10 de tipo entero. La matriz contiene una serie de números, primos y no primos
*/
public class Ejercicio30 {
    public static void main(String[] args) {
        Random crearRandonm = new Random();
        int[][] matriz = new int[10][10];
        int[] numPrimos;
        int k, primos = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = crearRandonm.nextInt(1000) + 1;
            }
        }
        pintarMatriz(matriz);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esPrimo(matriz[i][j])) {
                    primos++;
                }
            }
        }

        numPrimos = new int[primos];
        k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (esPrimo(matriz[i][j])) {
                    numPrimos[k] = matriz[i][j];
                    k++;
                }
            }
        }
        System.out.println("Los nº's primos son:");
        for (int i = 0; i < numPrimos.length; i++) {
            System.out.print(numPrimos[i]+"\t");
        }
    }

    public static boolean esPrimo(int num) {
        boolean esPrimo = true;

        if (num == 2) {
        }else if (num == 1 || num % 2 == 0) {
            esPrimo = false;
        } else {
            for (int i = 3; i <= (num / 2); i = i + 2) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        return esPrimo;
    }

    public static void pintarMatriz(int[][] matriz) {
        System.out.println("La Matriz es:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
