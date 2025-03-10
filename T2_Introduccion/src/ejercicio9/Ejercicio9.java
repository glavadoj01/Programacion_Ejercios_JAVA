package ejercicio9;
import java.util.Scanner;
/*
Ejercicio nº 9:
Diseña un programa que solicite un número entero al usuario y muestre:
el valor del cuadrado, del cubo y de la cuarta potencia del número introducido.
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escan = new Scanner(System.in);

        System.out.print("Introducir un nº entero: ");
        int a1 = escan.nextInt();

        int a2 = a1 * a1;
        int a3 = a2 * a1;
        int a4 = a3 * a1;

        System.out.println("El valor de las sucesivas potencias es:");
        System.out.println(a1 + "^2 = " + a2);
        System.out.println(a1 + "^3 = " + a3);
        System.out.println(a1 + "^4 = " + a4);
    }
}