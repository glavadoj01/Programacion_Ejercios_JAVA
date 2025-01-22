package ejercicio8;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int op, a, b;
        double r;

        while (!salir) {
            menu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Ingrese el valor del radio: ");
                    r = sc.nextDouble();
                    System.out.printf("\nLa longitud de la circunferencia de radio \"%.2f\" es de: %.2f\n",
                            r, Mates.longitudCircunferencia(r));
                    break;
                case 2:
                    System.out.print("Ingrese un entero: ");
                    a = sc.nextInt();
                    if(Mates.esPar(a)) {
                        System.out.println("El nº " + a + " es par");
                    } else {
                        System.out.println("El nº " + a + " no es par");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese un entero: ");
                    a = sc.nextInt();
                    if(Mates.esPrimo(a)) {
                        System.out.println("El nº " + a + " es primo");
                    } else {
                        System.out.println("El nº " + a + " no es primo");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese un entero: ");
                    a = sc.nextInt();
                    System.out.printf("\nLa suma de divisores de %d es igual a: %d\n", a, Mates.sumaDivisores(a));
                    break;
                case 5:
                    System.out.print("Ingrese un entero: ");
                    a = sc.nextInt();
                    System.out.print("Ingrese otro entero: ");
                    b = sc.nextInt();
                    if(Mates.sonAmigos(a, b)) {
                        System.out.printf("\nLos nº's %d y %d son amigos\n", a, b);
                    } else {
                        System.out.printf("\nLos nº's %d y %d no son amigos\n", a, b);
                    }
                    break;
                case 9:
                    salir = true;
                    break;
                default:
                    System.out.println("Error: Opción no valida");
            }
        }
    }

    public static void menu() {
        System.out.println("""
                \n\t\t MENÚ PRINCIPAL
                1 - Longitud de circunferencia
                2 - Comprobar si un nº es Par
                3 - Comprobar si un nº es Primo
                4 - Hallar la suma de divisores de un nº
                5 - Comprobar si 2 nº's son amigos
                9 - Salir
                """);
        System.out.print("Ingresar una opción: ");
    }
}
