package ejercicio6;

import java.util.Scanner;

/*
Diseña un programa Java que incluya una función que devuelva true o false si dos números pasados como
parámetros son amigos o no. Crea también una función que devuelva la suma de los divisores de un número entero.
Función hecha en: Profundización28
*/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int a, b;
        boolean c;

        System.out.print("Ingrese el valor de a: ");
        a = escanear.nextInt();
        System.out.print("Ingrese el valor de b: ");
        b = escanear.nextInt();

        c=sonAmigos(a,b);
        if (c) {
            System.out.println("Los nº's son amigos");
        } else {
            System.out.println("Los nº's no son amigos");
        }
    }

    public static boolean sonAmigos(int num1, int num2) {
        int sum1, sum2;
        sum1 = sumaDivisores(num1);
        sum2 = sumaDivisores(num2);

        if (sum1 == num2 && sum2 == num1) {
            return true;
        }
        return false;
    }

    public static int sumaDivisores(int num) {
        int sum = 0;

        for (int i = 1; i <= (num / 2); i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
