package ejercicio35;
import java.util.Scanner;
/*
Diseña un programa que solicite un entero y muestre en pantalla uno a uno los dígitos que forman ese número entero
*/
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num;
        String todo, temp;

        // Entrada Datos
        System.out.print("Ingresar un número entero: ");
        num = escanear.nextInt();

        // Proceso Datos
        todo = String.valueOf(num);

        // Salida Datos
        System.out.printf("\nEl número %d tiene %d digitos.\n", num, todo.length());
        for (int i = 0; i < todo.length(); i++) {
            System.out.printf("\t%s", todo.charAt(i));
        }
    }
}
