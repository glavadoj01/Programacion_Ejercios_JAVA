package ejercicio6;
import java.util.Scanner;
/*Diseña un programa Java que pida un número entero positivo al usuario y muestre cada número desde 1 hasta
el número tecleado. Es decir, si el usuario teclea el 7, el programa imprimirá: 1, 2, 3, 4, 5, 6, 7*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num,acu;

        // ENTRADA DE DATOS
        do {
            System.out.print("Introducir un entero positivo: ");
            num = escanear.nextInt();
            if (num <1 ) {
                System.out.println("Error");
            }
        }while (num < 1);

        // SALIDA DATOS
        acu = 1;
        do {
            System.out.printf("%d, ",acu);
            acu++;
        }while (acu <= num);
        System.out.printf("\b\b");
    }
}
