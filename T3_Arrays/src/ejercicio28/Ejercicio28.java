package ejercicio28;

import java.util.Random;

/*
Diseña un programa Java que llene una matriz de 5x5 de tipo entero con valores al azar entre 1 y 10.
Hecho esto el programa calculará y mostrará la suma de los valores de las diagonales de la matriz (por separado).
*/
public class Ejercicio28 {
    public static void main(String[] args) {
        Random crearRandonm = new Random();
        int[][] matriz = new int[5][5];
        int suma;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = crearRandonm.nextInt(10) + 1;
            }
        }

        pintarMatriz(matriz);
        suma = 0;
        System.out.println("La suma de la primera diagonal es: "); // 00 + 11 + 22 + 33 + 44  =: [i][i]
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
            System.out.print(matriz[i][i] + " + ");
        }
        System.out.print("\b\b= " + suma);

        suma = 0;
        System.out.println("\nLa suma de la segunda diagonal es: ");    //  04 + 13 + 22 + 31 + 40
        for (int i = 0 ; i < matriz.length; i++) {                      // fila: i | col: 4 - i
            suma += matriz[i][matriz.length-1-i];                       //  4 == matriz.length-1
            System.out.print(matriz[i][matriz.length-1-i] + " + ");
        }
        System.out.print("\b\b= " + suma);
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
/*      00   01   02   03   04
        10   11   12   13   14
        20   21   22   23   24
        30   31   32   33   34
        40   41   42   43   44
*/

