package ejercicio10;
import java.util.Scanner;
/*
Ejercicio nº 10:
Diseña un programa Java que solicite un número double, lo convierta a entero y lo imprima.
*/
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner escan = new Scanner(System.in);

        System.out.println("Vamos a truncar un nº decimal");
        System.out.print("Insertar un nº decimal: ");
        double dec = escan.nextDouble();

//        PDF tema 2 => pag 6 (abajo) : Castear/Convertir un nº entre formatos
        int numero = (int) dec;

        System.out.println("El nº " + dec + " introducido,");
        System.out.println("se trunca a : " + numero);
    }
}