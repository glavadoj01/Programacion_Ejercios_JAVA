package ejercicio22;

import java.util.Random;
import java.util.Scanner;

/*
Diseña un programa Java que trabaje con una matriz de 5x5 de tipo entero y la rellene con valores al azar entre 1 y 9.
El programa contendrá una función que buscará un valor en la matriz y devolverá cuántas veces aparece
o se repite en la misma.
*/
public class Ejercicio22 {
    public static void main(String[] args) {
        Random crearRandom = new Random();
        Scanner escanear = new Scanner(System.in);
        int[][] matriz_Al_Azar = new int[5][5];
        int buscar, contador;

        for (int i = 0; i < matriz_Al_Azar.length; i++) { // For para elegir una fila
            for (int j = 0; j < matriz_Al_Azar[i].length; j++) {  // For para elegir los elementos/columnas de esa fila
                // Entre 1 y 9 sin incluir ni 1 ni 9 ==  Entre 2 y 8; incluidos 2 y 8  --> Final=8 Inicial=2
                //                                           (final-inicial+1)+inicial
                matriz_Al_Azar[i][j] = crearRandom.nextInt(8 - 2 + 1) + 2;   // nextInt(7)+2
            }
        }
        System.out.print("¿Que nº quieres buscar en la Matriz? ");
        buscar = escanear.nextInt();

        contador = contarNumeros(buscar, matriz_Al_Azar);
        pintarMatriz(matriz_Al_Azar);
        if (contador == 0) {
            System.out.println("El numero no existe en la matriz");
        } else {
            System.out.println("El numero " + buscar + " aparece " + contador + " veces en la matriz");
        }
        escanear.close();
    }

    public static int contarNumeros(int numeroabuscar, int[][] matrizdondebusco) {
        int contador = 0;
        for (int i = 0; i < matrizdondebusco.length; i++) {
            for (int j = 0; j < matrizdondebusco[i].length; j++) {
                if (matrizdondebusco[i][j] == numeroabuscar) {
                    contador++;
                }
            }
        }
        return contador;
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
