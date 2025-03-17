package ejercicio7;
import java.util.Scanner;
/*
Ejercicio nº 7:
Diseña un programa Java que solicite una cantidad en pulgadas y la convierta en centímetros.
Y también en metros
*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.print("Insertar una medida en pulgadas (inch):");
        float pulgadas = escanear.nextFloat();

        float cm = pulgadas * 2.54f;
        float m = cm / 100;

        System.out.println("La medida de valor " + pulgadas + " inch, es equivalente a:");
        System.out.println(cm + " cm");
        System.out.println(m + " m");
    }
}
