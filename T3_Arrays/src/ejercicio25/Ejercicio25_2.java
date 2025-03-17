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
public class Ejercicio25_2 {
    static String[][] alumnos = new String[20][5];

    public static void main(String[] args) {

        llenarAlumnos();
        imprimirMatriz();
    }

    public static void llenarAlumnos() {
        Random rand = new Random();

        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i][0] = "Alumno" + (i + 1);
            for (int j = 1; j < alumnos[i].length - 1; j++) {  // Entre 1 y 10 (incluidos ambos)
                alumnos[i][j] = String.valueOf(rand.nextDouble((10 - 1 + 0.01f)) + 1);
            }
            hayarMedia(i);
        }
    }

    public static void hayarMedia(int i) {
        alumnos[i][alumnos[i].length - 1] = String.valueOf(
                (Double.parseDouble(alumnos[i][1]) + Double.parseDouble(alumnos[i][2])
                        + Double.parseDouble(alumnos[i][3])
                ) / (double) 3
        );
    }

    public static void imprimirMatriz() {
        System.out.println("Alumno\t\t1ªEv.\t2ªEv.\t3ªEv.\tMedia");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print(alumnos[i][0] + "\t");
            if (i<9) {  // Para que queden bien alineados
                System.out.print("\t");
            }
            for (int j = 1; j < alumnos[i].length; j++) {
                System.out.printf("%2.2f\t", Double.valueOf(alumnos[i][j]));
            }
            System.out.print("\n");
        }
    }
}
