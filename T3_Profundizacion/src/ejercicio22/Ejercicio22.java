package ejercicio22;

import java.util.Scanner;

/*Diseña un programa en Java que pida números al usuario. La condición de fin será la introducción del cero.
El programa deberá mostrar la suma de todos ellos y cuántos han sido tecleados.*/
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, sum = 0, cont = 0;

        System.out.println("PARA SALIR INTRODUZCA EL Nº CERO");
        do {
            System.out.print("Ingrese un numero entero: ");
            num = escanear.nextInt();
            sum += num;
            cont++;
            if (num==0){
                break;
            }
        } while (true);
        System.out.printf("En total se han introducido %d enteros, cuya suma total es de %d", cont, sum);
    }
}
