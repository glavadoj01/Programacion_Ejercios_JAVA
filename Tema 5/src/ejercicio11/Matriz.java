package ejercicio11;

import java.util.Random;

public class Matriz implements InterfaceMatriz {
    private int[][] matriz;

    public Matriz(int nFilas, int nColumnas, int vMin, int vMax) {
        Random rand = new Random();
        matriz = new int[nFilas][nColumnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(vMin, vMax+1);
            }
        }
    }

    @Override
    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Fila: " + (i+1) + "\s\s|\t");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("\b\n");
        }
    }

    @Override
    public int getMaximo() {
        int max = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }

    @Override
    public double getMedia() {
        double media = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                media += matriz[i][j];
            }
        }
        return media /((double) matriz.length*matriz[0].length);
    }
}