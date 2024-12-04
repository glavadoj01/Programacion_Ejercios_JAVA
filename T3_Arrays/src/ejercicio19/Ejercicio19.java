package ejercicio19;

import java.util.Random;

/*
Diseña un programa Java que simule el hecho de tirar un dado 6000 veces. Los
valores posibles son 1, 2, 3, 4, 5 y 6. El programa debe mostrar cuántas veces salió
cada número y el porcentaje que esa cantidad representa sobre el total de tiradas. Se
valorará la utilización de arrays para llevar a cabo los cálculos.
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        Random rand = new Random();
        int intentos = 6000;
        int resultado;
        int[] contarResultado = new int[6];
        float[] porcentaje = new float[contarResultado.length];

        for (int i = 0; i < intentos; i++) {
            resultado = rand.nextInt(6) + 1;
            contarResultado[resultado - 1]++;
        }

        for (int i = 0; i < contarResultado.length; i++) {
            porcentaje[i] = (float) (100 * contarResultado[i]) / intentos;
        }
        System.out.println();
        for (int i = 0; i < contarResultado.length; i++) {
            System.out.println("El número " + (i + 1) + " ha salido un total de " + contarResultado[i] + " veces." +
                    "\n\tLo que supone el " + String.format("%.2f", porcentaje[i]) + "% sobre el total de intentos.");
        }
    }
}
