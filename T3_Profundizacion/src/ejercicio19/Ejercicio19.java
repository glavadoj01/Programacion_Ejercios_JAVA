package ejercicio19;
import java.util.Scanner;
/*
Más contadores. Diseña un programa Java que solicite números enteros al usuario y
cuente los pares que han sido tecleados. Dejará de solicitar números cuando se teclee el
-9999.
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, cont;

        cont = 0;
        do {
            System.out.print("\nPara salir introducir -9999;\nPara continuar introducir un entero: ");
            num = escanear.nextInt();
            if (num % 2 == 0) {
                cont++;
            }
        } while (num != -9999);
        System.out.printf("\nSe han inroducido un total de %d nº's pares.", cont);
    }
}
