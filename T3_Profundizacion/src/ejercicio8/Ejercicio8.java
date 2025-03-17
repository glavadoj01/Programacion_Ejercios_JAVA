package ejercicio8;
import java.util.Scanner;

/*Diseña un programa Java que solicite un entero positivo e imprima los números que van desde ese
entero hasta uno. Un número por cada línea.*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num;

        // ENTRADA DE DATOS
        do {
            System.out.print("Introducir un entero positivo: ");
            num = escanear.nextInt();
            if (num < 1) {
                System.out.println("Error");
            }
        } while (num < 1);

        // SALIDA DATOS
        do {
            System.out.println(num);
            num--;
        }while (num >= 1);
    }
}