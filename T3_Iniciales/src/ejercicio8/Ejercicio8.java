package ejercicio8;

import java.util.Scanner;

/*
Diseña un programa Java que solicite nombre y edad de una persona e indique si
la persona es menor de edad (menor de 18 años), adulto (entre 18 y 65 años, incluidos)
o mayor de edad (más de 65 años). El mensaje tipo será: “Paco tienes 12 años, eres menor
de edad”.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        //Def métodos y variables
        Scanner escanear = new Scanner(System.in);
        int edad;
        String nombre;
        //Entrada de datos
        System.out.print("Introduce el nombre de la persona: ");
        nombre = escanear.nextLine();
        System.out.print("Introduce la edad de " + nombre + " :");
        edad = escanear.nextInt();
        //Salida de resultados
        if (edad < 18) {
            System.out.println(nombre + " tiene " + edad + " años. Es menor de edad.");
        } else if (edad < 66) {
            System.out.println(nombre + " tiene " + edad + " años. Es adulto/a.");
        } else {
            System.out.println(nombre + " tiene " + edad + " años. Es una persona jubilada.");
        }
    }
}
