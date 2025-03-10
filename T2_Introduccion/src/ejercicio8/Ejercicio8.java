package ejercicio8;
import java.util.Scanner;
/*
Ejercicio nº 8:
Diseña un programa Java que pida tres números de típo double
y calcule la media aritmética de los mismos.
*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner escan = new Scanner(System.in);

        System.out.println("Vamos a introducir tres nº's reales");
        System.out.print("¿Cual es el primer  nº? ");
        double n1 = escan.nextDouble();

        System.out.print("¿Cual es el segundo nº? ");
        double n2 = escan.nextDouble();

        System.out.print("¿Cual es el tercer  nº? ");
        double n3 = escan.nextDouble();

        double med = ( n1 + n2 + n3 ) / 3;
        System.out.println("La media aritmética de los tres nº's es: " + med);
    }
}
