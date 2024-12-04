package ejercicio53;

import java.util.Scanner;

/*
Diseña un programa que muestre en pantalla una imagen como la que se observa.
Solicita el nº de filas, en la imagen 5. El número de filas coincide con el de asteriscos por fila.
    *****
   *****
  *****
 *****
*****
*/
public class Ejercicio53 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero: ");
        num = escanear.nextInt();
        System.out.println("--------------------------");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" "); // Pimta $num-1  espacios
            }
            for (int k = 1; k <= num; k++) {
                System.out.print("*"); // Pinta $num asteriscos (*)
            }
            System.out.println();
        }


    }
}
