package ejercicio26;
import java.util.Scanner;

/*Diseña un programa en Java que calcule la suma de los divisores de un número entero que pasaremos por teclado.
No incluir como divisor al propio número.*/
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, cont, sum;

        System.out.printf("Introducir un numero entero para sumar sus divisores: ");
        num = escanear.nextInt();
        System.out.println();
        sum = 0;
        cont = 0;
        for (int i = 1; i <= (num/2); i++) {
            if (num % i == 0) {
                sum = sum + i;
                cont = cont + 1;
                System.out.printf("%d, ", i);
            }
        }
        System.out.printf("\b\b\nEl nº %d tiene un total de %d divisores.\nLa suma de todos los divisores es: %d\n", num, cont, sum);
    }
}
