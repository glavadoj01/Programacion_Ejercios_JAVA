package ejercicio13;

import java.util.Scanner;

/*
Diseña un programa Java que incluya una función que devuelva la suma de los dígitos
de un número entero pasado como parámetro.
*/
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, sum = 0;
        String temp;

        System.out.print("Ingrese un numero: ");
        num = escanear.nextInt();

        temp = String.valueOf(num);
        for (int i = 0; i < temp.length(); i++) {
            sum += Integer.parseInt(temp.charAt(i) + "");
        }
        System.out.println("La suma de los numeros es: " + sum);
    }
}
