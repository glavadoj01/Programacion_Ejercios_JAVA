package ejercicio17;

import java.util.Scanner;

/*Diseña una función Java que devuelva el carácter central (String) de una cadena
pasada como parámetro. Si la longitud de la cadena es un número par devolverá dos
caracteres y si es impar sólo uno. Puedes utilizar el método subString de la clase
String.*/
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;
        char[] salida;

        System.out.print("Introducir una frase (o string): ");
        entrada = sc.nextLine();

        salida = caracterCentral(entrada);
        if (salida.length == 1) {
            System.out.println("El carácter central es: " + salida[0]);
        } else {
            System.out.println("Los carácteres centrales son: \"" + salida[0] + "\" y \"" + salida[1] + "\"");
        }
    }

    public static char[] caracterCentral(String entrada) {
        char[] c;
        if (entrada.length() % 2 == 0) {
            c = new char[2];
            c[0] = entrada.charAt((entrada.length() / 2)-1);
            c[1] = entrada.charAt((entrada.length() / 2));
        } else {
            c = new char[1];
            c[0] = entrada.charAt((entrada.length() / 2));
        }
        return c;
    }
}
