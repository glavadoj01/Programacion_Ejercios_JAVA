package ejercicio17;
import java.util.Scanner;
/*
Utilización de acumuladores. Diseña un programa Java que pida un número entero al usuario y sume
los valores que van desde 1 a ese número e imprima el resultado.
*/
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, sum;

        System.out.print("Introducir un nº entero positivo (N), para realizar el sumatorio desde 1 hasta N: ");
        do {
            num = escanear.nextInt();
            if (num < 1 ) {
                System.out.println("Error - Introducir un entero positivo");
            }
        } while (num < 1);

        if (num % 2 == 0) {
            sum = (num + 1)*(num/2);
            System.out.printf("El sumatorio desde 1 hasta %d, es igual a: %d", num, sum);
        }
        else {
            sum = ((num + 1)*(num/2)) + ((num/2)+1);
            System.out.printf("El sumatorio desde 1 hasta %d, es igual a: %d", num, sum);
        }
    }
}
