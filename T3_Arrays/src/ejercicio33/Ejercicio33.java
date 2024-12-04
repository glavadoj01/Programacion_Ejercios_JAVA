package ejercicio33;

/*
Diseña un programa Java que a partir de esta matriz int [][] m = {{2,4,5,6,7},{4,2,2,1,1},{5,6,7,8,8,10,12}},
cuente y muestre las veces que se repite cada valor. Los valores de la matriz están comprendidos entre 1 y 12.
*/
public class Ejercicio33 {
    public static void main(String[] args) {
        int[][] m = {{2, 4, 5, 6, 7}, {4, 2, 2, 1, 1}, {5, 6, 7, 8, 8, 10, 12}};
        int cont = 0;

        for (int i = 1; i <= 12; i++) {
            cont = 0;
            for (int j = 0; j < m.length; j++) {
                for (int k = 0; k < m[j].length; k++) {
                    if (m[j][k] == i) {
                        cont++;
                    }
                }
            }
            System.out.println("El nº " + i + " aparece un total de " + cont + " veces");
        }
    }
}