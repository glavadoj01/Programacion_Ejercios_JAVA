package ejercicio15;
import java.util.Scanner;
/*
Diseña un programa que muestre en pantalla un menú con las opciones: pares, impares y salir.
La opción pares muestra los pares entre 40 a 60, la opción impares muestra los impares entre 99 y 77.
El menú se mostrará tras cada opción hasta que el usuario elija salir. Utiliza los tres tipos de bucles.
*/
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        byte rep;
        int temp;


        // Repetición
        do {

            // MENÚ - Entrada Verificada
            do {
                System.out.println("ELEGIR UNA OPCIÓN NUMÉRICA");
                System.out.println("1 - Pares");
                System.out.println("2 - Impares");
                System.out.println("0 - SALIR");
                rep = escanear.nextByte();
                if (rep != 0 && rep != 1 && rep != 2){
                    System.out.println("ERROR: Introducir opción numércia valida.");
                }
            }while (rep != 0 && rep != 1 && rep != 2);

            //Salidas según opción del menú
            switch (rep) {
                case 1:
                    System.out.println("1 - Pares");
                    System.out.println("Los nº's pares emtre 40 y 60 son:");
                    for (temp = 40; temp <= 60; temp++,temp++){
                        System.out.printf("%d, ", temp);
                        System.out.print(temp + ", ");
                    }
                    System.out.printf("\b\b\n");
                    break;
                case 2:
                    System.out.println("2 - Impares");
                    System.out.println("Los nº's imppares emtre 99 y 77 son:");
                    temp = 99;
                    while (temp >= 77) {
                        System.out.printf("%d ,", temp);
                        temp--;temp--;
                    }
                    System.out.printf("\b\b\n");
                    break;
                default:   //Opción 0: No hace nada, simplemente sale

            }              // Salida Switch

        }while (rep != 0); //Salida Repetición
    }                      //Cierre MAIN
}                          //Cierre Class
