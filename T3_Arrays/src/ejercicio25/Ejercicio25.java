package ejercicio25;

import java.util.Random;

/*
Diseña un programa Java que guarde los nombres de 20 alumnos de una clase y sus
notas a lo largo de las tres evaluaciones de un curso académico en sendos arrays.
Se pide:
        - mostrar a cada alumno y sus tres notas.
        - mostrar a cada alumno y la media de sus notas (double). ¿? Con un float vale
Notas:
        - para llenar el array de los nombres de los alumnos utiliza “Alumno1”,“Alumno2”... y hazlo mediante un bucle.
        - para las notas genera valores aleatorios de tipo double entre 1 y 10.
*/
public class Ejercicio25 {           // ¿? Entonces entre 1 y 10 sería de 2 a 9? (según la lógica del último día)
    public static void main(String[] args) {
        Random rand = new Random();
        String[] nombres = new String[20];
        float[][] notas = new float[20][4];


        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "Alumno" + (i + 1);
            for (int j = 0; j < notas[i].length - 1; j++) {             // Entre 1 y 10 (incluidos ambos)
                notas[i][j] = rand.nextFloat((10 - 1 + 0.01f)) + 1;     // Final=10 Inicial=1   Elemento=0.01
                notas[i][notas[i].length - 1] += notas[i][j];           // Cuando es INT --> Elemento=1
            }                                                           // Para decimales Elemento == Último decimal
            notas[i][notas[i].length - 1] = notas[i][notas[i].length - 1] / 3;      //                    o precisión
        }

        System.out.println("Alumno\t\t1ªEv.\t2ªEv.\t3ªEv.\tMedia");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print(nombres[i] + "\t");
            if (nombres[i].length() < 8) {
                System.out.print("\t");
            }
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("%.2f\t", notas[i][j]);
            }
            System.out.print("\n");
        }
    }
}
