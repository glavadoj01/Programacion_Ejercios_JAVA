package ejercicio5;

import java.util.Scanner;

/*Diseña un programa Java que solicite dos números enteros y los imprima
en pantalla en orden ascendente.*/
public class Ejercicio5 {
    public static void main(String[] args) {
        //Def metodos y variables
        Scanner escanear = new Scanner(System.in);
        int a, b;
        //Peticion de datos
        System.out.print("Introducir el primer nº : ");
        a = escanear.nextInt();
        System.out.print("Introducir el segundo nº: ");
        b = escanear.nextInt();
        //Salida de datos
        if (a < b) {
            System.out.println();
            System.out.println("Los nº's en orden ascendente son: ");
            System.out.println(b + "   |   " + a);
        } else if (a == b) {
            System.out.println();
            System.out.println("Los dos nº's son iguales");
            System.out.println(b + "   |   " + a);
        } else {
            System.out.println();
            System.out.println("Los nº's en orden descendente son: ");
            System.out.println(a + "   |   " + b);
        }
    }
}
