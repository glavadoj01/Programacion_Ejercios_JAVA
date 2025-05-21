package ejercicio14;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println("***********************************");
        System.out.println("Guardar matriz como ArryList");
        int[][] matriz0 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        ArrayList<Integer> listaMatriz0 = MatriZ.guardarMatrizComoArrayList(matriz0);
        System.out.println("***********************************");

        System.out.println("***********************************");
        System.out.println("Pedir al usuario la dimensión de una matriz al azar:");
        int[][] matrizTest = MatriZ.generarMatriz();
        System.out.println("***********************************");

        System.out.println("**********************************");
        System.out.println("Mostrar matriz:");
        MatriZ.mostrarMatriz(matrizTest);
        System.out.println("***********************************");

        System.out.println("**********************************");
        System.out.println("La suma de las diagonales es: " + MatriZ.sumaDiagonales(matrizTest));
    }
}
