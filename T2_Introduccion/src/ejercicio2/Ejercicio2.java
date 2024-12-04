package ejercicio2;
import java.util.Scanner;
/*
Ejercicio nº 2:
    Diseña un programa que calcule el área de un círculo.
    El programa pedirá el radio y mostrará el área.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduccir el valor del radio:");
        int r = sc.nextInt();
        float PI = 3.14f;
        float area = r*r*PI;

        System.out.println("El área del circulo de radio " + r + " es igual a: " + area);
    }
}