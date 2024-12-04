package ejercicio35;
/*
Partiendo de la matriz int [][] m = {{20,30,11,5},{12,13,17,19},{2,4,7,55}};
diseña una aplicación Java que genere una salida como la que se muestra en el PDF.
*/
public class Ejercicio35 {
    public static void main(String[] args) {
        int [][] m = {{20,30,11,5},{12,13,17,19},{2,4,7,55}};
        boolean[][] matrizbool = new boolean[m.length][m[0].length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                matrizbool[i][j]=esPrimo(m[i][j]);
            }
        }

        System.out.println("¿Son primos los valores de la matriz?\n");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+"-->"+matrizbool[i][j]+"\t");
            }
            System.out.print("\n");
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
