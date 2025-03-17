package ejercicio57;

import java.util.Scanner;

/*
Diseña una aplicación Java que partiendo de una cadena de caracteres, muestre en pantalla
cuántas mayúsculas, minúsculas y dígitos tiene.
*/
public class Ejercicio57 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        String entrada;
        int longitud, may=0, min=0, dig=0;

        System.out.println("Ingrese una cadena de caracteres: ");
        entrada = escanear.next();
        longitud = entrada.length();

        for (int i = 0; i < longitud; i++) {
            if (Character.isLetter(entrada.charAt(i))) {
                if (entrada.charAt(i) >= 'a' && entrada.charAt(i) <= 'z') {
                    min++;
                }else may++;
            }else if (Character.isDigit(entrada.charAt(i))) {
                dig++;
            }
        }
        System.out.printf("\nLa cadaena de caracteres %s\ntiene:\n%d mayusuculas\n%d minusculas\n%d digitos", entrada, may, min, dig);
    }
}
