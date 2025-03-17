package ejercicio18;
import java.util.Scanner;
/*
Utilización de contadores. Diseña un programa Java que pida dos números y muestre
en pantalla los números múltiplos de 3 hay entre ambos. Al final debe imprimir cuántos
múltiplos de 3 se han mostrado.
*/
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int a, b, cont, max, min;
        cont = 0;

        //Entrada de datos
        System.out.println("Introducir 2 numeros enteros para a continuación, mostrar los multiplos de 3 entre ellos.");
        System.out.print("Introducir el 1º nº: ");
        a = escanear.nextInt();
        System.out.print("Introducir el 2º nº: ");
        b = escanear.nextInt();

        // Procesado y Salida de datos
        if (a<b) {
            max = b;
            min = a;
        }
        else {
            max = a;
            min = b;
        }

        System.out.printf("\n\t");
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.printf("%d, ", i);
                cont++;
            }
        }

        System.out.printf("\b\b\n\nEntre el nº %d y el nº %d, hay un total de %d multiplos de 3\n", min, max, cont);
    }
}
