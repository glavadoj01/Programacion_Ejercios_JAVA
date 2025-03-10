package ejercicio29;
import java.util.Random;
/*
Diseña un programa Java que contenga una función que reciba como parámetro dos matrices con el mismo número de filas
y columnas y devuelva otra matriz que será la suma de las dos anteriores. Se suman valores situados en las mismas
posiciones de ambas matrices.
*/
public class Ejercicio29 {
    public static void main(String[] args) {
        int[][] a = new int[2][5];
        int[][] b = new int[a.length][a[0].length];
        int[][] c;

        a = llenarMatrizAlAzar(a);
        pintarMatriz(a);
        b = llenarMatrizAlAzar(b);
        pintarMatriz(b);

        c = sumar(a, b);
        pintarMatriz(c);

    }

    public static int[][] llenarMatrizAlAzar(int[][] matriz) {
        Random crearRandonm = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = crearRandonm.nextInt(10) + 1;
            }
        }
        return matriz;
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

    public static int[][] sumar(int[][] m1, int[][] m2) {
        int[][] m = new int[m1.length][m1[0].length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return m;
    }
}
