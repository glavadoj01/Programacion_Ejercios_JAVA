package ejercicio58;
import java.util.Scanner;
/*
Diseña una aplicación Java que comprueba si una palabra es un palíndromo, es decir,
si se lee igual en los dos sentidos. Por ejemplo, “reconocer” es un palíndromo.
*/
public class Ejercicio58 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        String palabra;
        int longitud, cont = 0;

        System.out.print("Ingrese una palabra para ver sí es o no un palíndromo: ");
        palabra = escanear.next();
        longitud = palabra.length();

        for (int i = 0; i < (longitud-1) / 2; i++) {
            if (palabra.charAt(i) == palabra.charAt(longitud - 1 - i)) {
                cont++;
            }
        }

        if (cont == longitud / 2) {
            System.out.println("La palabra \"" + palabra + "\", es un palindromo");
        } else {
            System.out.println("La palabra \"" + palabra + "\", no es un palindromo");
        }
    }
}
