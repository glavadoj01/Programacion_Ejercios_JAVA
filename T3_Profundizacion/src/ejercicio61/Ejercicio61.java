package ejercicio61;
import java.util.Scanner;
/*
Diseña un programa que calcule y muestre el factorial de un número.
Ej.:   5! = 1*2*3*4*5
*/
public class Ejercicio61 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, factI = 1;
        double factD = 1;
        long factL = 1; // Probe con int y num65 al azar y me dio cero. Se llenó la memoria (varias veces)

        do {
            System.out.print("Introducir un nº entero positivo (por ejemplo 65): ");
            try{
                num = escanear.nextInt();
                if (num < 1) {
                    System.out.println("Error - Se requiere un nº positivo");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Error - Se requiere un nº entero");
            }
            escanear.nextLine();
        } while (true);

        for (int i = 1; i <= num; i++) {
            factI = factI * i;
            factD = factD * i;
            factL = factL * i;
        }

        System.out.println("EL factorial de " + num + " (int), es igual a: " + factI); // Este falla a partir de 13! (incluido)
        System.out.println("EL factorial de " + num + " (long), es igual a: " + factL);
        System.out.println("EL factorial de " + num + " (double), es igual a: " + factD);
        System.out.println();
        System.out.println("Para nº's grandes, el más correcto es el tipo \"Double\"");
        System.out.println("Ej. 65! ~~ 8E90 https://www.wolframalpha.com/input?i=65%21&lang=es");
    }
}
