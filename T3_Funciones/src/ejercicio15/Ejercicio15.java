package ejercicio15;

import java.util.Scanner;

/*
Diseña un programa Java que trabaje con una función que devuelva el número de vocales (cuántas) que tiene una
cadena pasada como parámetro.
*/
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entradaTeclado;

        System.out.print("Digite uma frase: ");
        entradaTeclado = sc.nextLine();

        System.out.println("La cadena de caracteres cuenta con "
                + contarVocales(entradaTeclado) + " caracteres que son vocales");
    }

    private static int contarVocales(String frase) {
        int salida = 0;
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                salida++;
            }
        }
        return salida;
    }
}