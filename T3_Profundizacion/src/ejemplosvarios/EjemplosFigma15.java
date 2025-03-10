package ejemplosvarios;

import java.util.Scanner;

/*
Diseña un programa que muestre en pantalla un menú con las opciones:
pares, impares y salir.
La opción pares muestra los pares entre 40 a 60
La opción impares muestra los impares entre 99 y 77.
El menú se mostrará tras cada opción hasta que el usuario elija salir.
Utiliza los tres tipos de bucles.*/
public class EjemplosFigma15 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        char opcion;

        do {
            // Para asegurar una opcion valida
            do {
                System.out.println("Menú:");
                System.out.println("a. Pares");
                System.out.println("b. Impares");
                System.out.println("s. Salir");
                opcion = escanear.next().charAt(0); // Queremos la 1ª posicion/caracter, posicion cero.
                if (opcion >= 'A' && opcion <= 'Z') { // Es la ventaja de los diagramas, que es más abstracto
                    opcion = (char) ((int) opcion + 32);
                /* Es un caracter ASCII
                1º lo paso a nº/codigo ASCII
                2º le sumo 32 (distancia mayus - mins)
                3º lo vuelvo char de nuevo
                */
                }
                //Repetir el menú hasta que haya opcion valida
            } while (opcion != 'a' && opcion != 'b' && opcion != 's');

            switch (opcion) {
                case 'a':
                    funcionPares();
                    break;
                case 'b':
                    funcionImpares();
                    break;
                default:
                    // default es opcion Salir, no hace nada
            }
        } while (opcion != 's');
        //Fin
    }

    public static void funcionPares() {

        for (int i = 40; i <= 60; i = i + 2) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void funcionImpares() {

        for (int i = 99; i >= 77; i = i - 2) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
