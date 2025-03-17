package ejercicio36;
import java.util.Scanner;
/*
Diseña un programa Java que muestre una salida como la siguiente. Si el usuario teclea el valor 5 se muestra:
1
22
333
4444
55555
*/
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num;

        System.out.println("Ingrese un numero entero: ");
        num = escanear.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.printf("\n");
        }
    }
}
