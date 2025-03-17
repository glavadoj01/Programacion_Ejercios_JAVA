package ejercicio7;

/* Diseña una aplicación Java que:
a. Solicite al usuario un valor entero “n”, que indique con cuántos números va a
trabajar la propia aplicación.
b. Solicite al usuario estos “n” números que serán de tipo String.
c. Mostrar los valores en orden descendente según su valor numérico. Ojo, si se
teclean dos o más valores idénticos numéricamente, como .1 y 0.1, deben
mostrarse en el mismo orden en el que fueron tecleados.
d. El valor de “n” debe estar comprendido entre 1 y 100.
e. Cada cantidad pasada, tendrá como máximo 100 dígitos.
f. La clase BigDecimal puede trabajar con números grandes. */

import java.math.BigDecimal;
import java.util.*;

public class AppTest {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int n;
        String[] entradaString;

        // A) - D)
        while (true) {
            System.out.print("¿Cuantos nº's vamos a utilizar? (entre 1 y 100)\s\s");
            try {
                n = escanear.nextInt(); // Nº de elementos
                escanear.nextLine();
                if (n > 0 && n <= 100) {
                    break;
                }
                System.out.println("Ingresar valores entre 1 y 100");
            } catch (InputMismatchException e) {
                escanear.nextLine();
                System.out.println("Ingresar valores ENTEROS entre 1 y 100");
            }
        }
        entradaString = new String[n];

        // B) - E)

        int cont = 0;
        while (cont < n) {
            cont = 0;
            System.out.println("Ingresar los N números (" + n + ") separados por espacios:");
            entradaString = escanear.nextLine().split(" ");  // Array de elementos STRINGS
            for (String entrada : entradaString) {
                if (entrada.length() > 100) {
                    System.out.println("Los valores individuales no pueden tener más de 100 dígitos");
                    break; // Sí uno tiene más, rompe el for; por tanto: cont < n
                }
                cont++;  // Si todos tienen menos de 100 dígitos; cont debería ser = n
            }
        }

        // C)
        BigDecimal[] entradaNumeros = new BigDecimal[n];  // Array de elementos Big Decimal
        cont = 0;
        for (String num : entradaString) {
            entradaNumeros[cont] = BigDecimal.valueOf(Double.parseDouble(num));
            cont++;
        }

        Arrays.sort(entradaNumeros, Collections.reverseOrder());
        for (BigDecimal num : entradaNumeros) {
            System.out.println(num);
        }
    }
}
