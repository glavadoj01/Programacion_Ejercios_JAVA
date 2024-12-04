package ejercicio3;
import java.util.Scanner;
/*
Ejercicio nº 3:
    Diseña un programa Java que calcule y muestre el perímetro de un rectángulo.
    El programa debe solicitar la medida de los lados del rectángulo.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introducir el valor de la Base del rectángulo:");
        int base = sc.nextInt();
        System.out.println("Introducir el valor de la Altura del rectángulo:");
        int altura = sc.nextInt();


        while (base == altura) {
            System.out.println("La altura debe ser diferente de la base; si no, es un cuadrado");
            System.out.println("Introducir un valor para la altura diferente a la base");
            altura = sc.nextInt();
        }
        /*
        Perimetro = Suma de todos los lados
        */
        int p = 2 * base + 2 * altura;
        System.out.println("El rectángulo de base " + base);
        System.out.println("y de altura " + altura);
        System.out.println("tiene como perimetro " + p);
    }
}