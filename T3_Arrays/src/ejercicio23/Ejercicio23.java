package ejercicio23;

/*
Diseña un programa que trabaje con una matriz como esta:
int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}};
- muestra los valores de la matriz por filas, junto al número de columnas de cada fila.
- muestra la suma de cada fila
- muestra el mayor de los valores de la matriz
*/
public class Ejercicio23 {
    public static void main(String[] args) {
        int[][] m = {{2, 4, 5, 6, 7}, {4, 2, 2, 1, 1}, {5, 6, 7, 8, 8, 10, 12}};
        int sum, mayor = 0;

        for (int i = 0; i < m.length; i++) {
            System.out.print("\nLa fila " + (i + 1) + " tiene " + m[i].length + " elementos/columnas, los cuales son:\t");
            sum = 0;
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
                sum += m[i][j];
                if (m[i][j] > mayor) {
                    mayor = m[i][j];
                }
            }
            System.out.print("\nLa suma de la fila " + (i + 1) + " es igual a " + sum);
        }
        System.out.println("\nEl mayor es " + mayor);
    }
}
