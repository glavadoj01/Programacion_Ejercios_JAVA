package ejercicio41;
import java.util.Scanner;
/*
Diseña un programa que muestre en pantalla una salida como la de la segunda imagen 2 del PDF.
El número de filas puede variar.
*/
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero entero: ");
        num = escanear.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.printf("\n%d-->", i);
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }
    }
}
