package ejercicio25;
import java.util.Scanner;
/*Diseña un programa Java que solicite un número real y lo divida entre 1, 2, 3… hasta 10. Debe mostrarse
cada operación que se realiza y su resultado.*/
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        float num;

        System.out.println("Ingrese un número real: ");
        num = escanear.nextFloat();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%f / %d = %f\n", num, i, (num/i));
        }
    }
}
