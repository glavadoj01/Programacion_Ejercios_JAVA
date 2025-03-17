package ejercicio21;

/*
Diseña un programa Java que trabaje con una matriz de 3x3 como esta int [][] m = {{4,5,6},{10,1,12},{14,2,3}};
de tipo entero. El programa mostrará cada fila de la matriz y la suma de sus valores (de cada fila).
*/
public class Ejercicio21 {
    public static void main(String[] args) {
        int[][] m = {{4, 5, 6}, {10, 1, 12}, {14, 2, 3}};
        int suma;

        for (int i = 0; i < m.length; i++) { // For elegir Fila de matriz
            suma = 0;
            for (int j = 0; j < m[i].length; j++) { // For elementos de la columna/array
                suma += m[i][j];
                System.out.print(m[i][j] + ", ");
            }
            System.out.print("\b\b\nLa suma de la fila " + i + " es: " + suma + "\n");
        }
    }
}                   // mi,j
//    4   5   6      |     m0,0    m0,1    m0,2
//    10  1   12     |     m1,0    m1,1    m1,2
//    14  2   3      |     m2,0    m2,1    m2,2