package ejercicio11;

/*
Diseña un programa que partiendo de un array como este
String [] cadenas = {"asimilar", "dromedario", "calvinista", "lagartija", "tiovivo", "salamandra"};
muestre en pantalla cuál de las cadenas del array contiene más vocales. Utiliza una función.
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        String[] cadenas = {"asimilar", "dromedario", "calvinista", "lagartija", "tiovivo", "salamandra"};
        int[] n_vocales = new int[cadenas.length];
        int vocales_max = 0, pos = 0;

        for (int i = 0; i < n_vocales.length; i++) {
            n_vocales[i] = contarvocales(cadenas[i]);
            if (n_vocales[i] > vocales_max) {
                vocales_max = n_vocales[i];
                pos = i;
            }
        }

        System.out.println("La palabra con más vocales es \"" + cadenas[pos] + "\".\nY tiene un total de " + vocales_max + " vocales.");

    }

    public static int contarvocales(String palabra) {
        int vocales = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i'
                    || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                vocales++;
            }
        }
        return vocales;
    }
}
