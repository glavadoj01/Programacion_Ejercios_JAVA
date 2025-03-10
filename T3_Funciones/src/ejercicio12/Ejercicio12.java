package ejercicio12;

import java.util.Scanner;

/*
Diseña una función que devuelva verdadero o falso según el número pasado como parámetro sea primo o no.
Recuerda que un número primo sólo tiene como divisores a la unidad y a sí mismo.
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();

        if (esPrimo(num)){
            System.out.printf("El número %d es primo",num);
        }else {
            System.out.printf("El número %d no es primo",num);
        }

    }

    public static boolean esPrimo(int num) {
        if (num == 2) {
            return true;
        } else if (num == 1 || num % 2 == 0) {
            return false;   // Nº 1 y num's pares NO
        } else {
            for (int i = 3; i <= (num / 2); i = i + 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        } // Si llega hasta aquí es xq no ha encontrado divisores
        return true;
    }
}
