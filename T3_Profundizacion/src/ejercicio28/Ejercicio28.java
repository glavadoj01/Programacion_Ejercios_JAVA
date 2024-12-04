package ejercicio28;

import java.util.Scanner;
/*
Diseña un programa en Java que compruebe si dos números son amigos. Se dice que dos números son amigos si
la suma de los divisores del primero es igual al segundo y viceversa. Prueba con 220 y 284, son amigos.
*/
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num1, num2, sum1, sum2;

        // Entrada Datos
        System.out.println();
        System.out.println("Introducir 2 numeros enteros para comprobar si son nº's amigos");
        System.out.printf("Introducir el  primer numero entero: ");
        num1 = escanear.nextInt();
        System.out.printf("Introducir el segundo numero entero: ");
        num2 = escanear.nextInt();
        System.out.println();

        // Procesado Datos
        sum1 = sumaDivisores(num1);
        sum2 = sumaDivisores(num2);

        // Salida Resultados
        if (sum1 == num2 && sum2 == num1) {
            System.out.printf("Los n's %d y %d son amigos.", num1, num2);
        } else {
            System.out.printf("Los n's %d y %d no son amigos.", num1, num2);
        }
    }

    public static int sumaDivisores(int a) {
        int suma = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
