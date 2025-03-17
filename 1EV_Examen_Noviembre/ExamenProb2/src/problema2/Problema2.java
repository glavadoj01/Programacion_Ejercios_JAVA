package problema2;

import java.util.Scanner;

/*
Solicita al usuario una palabra.
Después debes indicar cuantas letras tiene la palabra y cuantas letras “a”.
El programa sigue hasta que el usuario desee salir.
*/
public class Problema2 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        String palabra;
        int longitud, n_as;
        char rep;

        do {
            n_as = 0;
            System.out.print("Introduce una palabra: ");
            palabra = escanear.next();

            longitud = palabra.length();
            for (int i = 0; i < longitud; i++) {
                if (palabra.charAt(i) == 'a') {
                    n_as++;
                }
            }
            System.out.printf("La palabra \"%s\" tiene un total de %d caracteres.\nDe los cuales, %d son letras \"a\"\n", palabra, longitud, n_as);

            do {
                System.out.println("¿Quiere probar de nuevo? S/N");
                rep = escanear.next().charAt(0);
                if (rep >= 'A' && rep <= 'Z') {
                    rep = (char) ((int) rep + 32);
                }
            } while (rep != 's' && rep != 'n');

        } while (rep == 's');
        escanear.close();
    }
}
