package ejercicio34;
import java.util.Scanner;
/*
Diseña un programa Java que solicite al usuario un carácter y nos diga si está entre las mayúsculas,
las minúsculas, los dígitos o en ninguno de esos grupos.
*/
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        char entrada;

        System.out.print("Ingresar un cáracter alfanumérico: ");
        entrada = escanear.next().charAt(0);

        if (entrada >= 'a' && entrada <= 'z') {
            System.out.printf("El cáracter \"%s\" es una letra minuscula",entrada);
        }
        else if (entrada >= 'A' && entrada <= 'Z') {
            System.out.printf("El cáracter \"%s\" es una letra mayuscula",entrada);
        }
        else if (entrada >= '0' && entrada <= '9') {
            System.out.printf("El cáracter \"%s\" es un digito",entrada);
        }
        else {
            System.out.printf("El cáracter \"%s\" no es un caracter alfanumérico",entrada);
        }
    }
}
