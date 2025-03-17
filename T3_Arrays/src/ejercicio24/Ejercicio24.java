package ejercicio24;

/*Partiendo de la matriz del ejercicio anterior, diseña una aplicación que:
a. muestre la matriz
b. intercambie los valores de la primera y última columna de cada fila
c. muestre la matriz de nuevo
*/
public class Ejercicio24 {
    public static void main(String[] args) {
        int[][] m = {{2, 4, 5, 6, 7}, {4, 2, 2, 1, 1}, {5, 6, 7, 8, 8, 10, 12}};
        int temp;

        pintarMatriz(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                temp = m[i][0];                         // Guardo el 1º aparte
                m[i][0] = m[i][m[i].length - 1];        // Pongo el último en el 1º
                m[i][m[i].length - 1] = temp;           // Pongo el k tengo guardado (el 1º) en el último
            }
        }
        pintarMatriz(m);
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
