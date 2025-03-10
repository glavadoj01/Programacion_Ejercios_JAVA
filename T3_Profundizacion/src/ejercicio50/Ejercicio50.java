package ejercicio50;
import java.util.Scanner;
/*
Diseña un programa Java que muestre un menú con las siguientes opciones y
programa cada una de ellas. El menú se repetirá hasta pulsar salir.
a. Código ASCII del carácter...
b. Carácter asociado al código ASCII…
c. Listado de minúsculas
d. Listado de mayúsculas
*/
public class Ejercicio50 {
    static Scanner escanear = new Scanner(System.in);

    public static void main(String[] args) {
        char caracter;
        boolean rep = true;

        do {
            System.out.println();
            System.out.println("MENÚ");
            System.out.println("a. Código ASCII de un carácter");
            System.out.println("b. Carácter asociado al código ASCII");
            System.out.println("c. Listado de minusulas");
            System.out.println("d. Listado de mayusculas");
            System.out.println("s. Salir");
            System.out.print("Introduccir letra de la opción: ");
            caracter = escanear.next().charAt(0);
            System.out.println();

            switch (caracter) {
                case 'a':
                    System.out.println("a. Código ASCII de un caracter");
                    darascii();
                    break;
                case 'b':
                    System.out.println("b. Caracter asociado al sigiente código ASCII");
                    darcaracter();
                    break;
                case 'c':
                    System.out.println("c. Listado de minusulas");
                    listamin();
                    break;
                case 'd':
                    System.out.println("d. Listado de mayusculas");
                    listamay();
                    break;
                case 's':
                    System.out.println("s. Salir");
                    rep = false;
                    break;
            }
        } while (rep);
    }

    public static void darascii() {
        char entrada;
        System.out.print("Ingrese un caracter: ");
        entrada = escanear.next().charAt(0);
        System.out.println("El código ASCII de \"" + entrada + "\" es: " + (int) entrada);
    }

    public static void darcaracter() {
        int entrada;
        System.out.print("Ingrese un entero entre 0 y 255 (código ASCII): ");
        entrada = escanear.nextInt();
        System.out.println("El caracter asociado al nº \"" + entrada + "\" es: " + (char) entrada);
    }

    public static void listamin() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char) i);
        }
    }

    public static void listamay() {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i);
        }
    }


}
