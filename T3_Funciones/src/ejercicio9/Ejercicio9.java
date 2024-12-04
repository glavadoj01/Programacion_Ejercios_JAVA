package ejercicio9;

import java.util.Random;

/*
Diseña una función Java que devuelva al azar un carácter del alfabeto.
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        char azar;

        azar = generarCaracter();
        System.out.println("Se ha generado al azar el carácter: " + azar);
    }

    public static char generarCaracter() {
        Random generarRandom = new Random();
        int salida;

        salida = generarRandom.nextInt(91 - 65 + 1) + 65;
                        // CodigoLetraMasGrande menos CodigoLetraMasPeque mas 1
        if (salida == 91) {
            salida = 133; // Incluye la Ñ, ya que se encuentra fuera del rango correlativo [65-90]
        }

        return (char) salida;
    }
}