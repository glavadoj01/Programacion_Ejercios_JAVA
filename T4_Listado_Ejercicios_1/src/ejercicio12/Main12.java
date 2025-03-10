package ejercicio12;

/*
Diseñar una clase llamada Password con las características:
        - Atributos:
                - Longitud. Por defecto, será de 8.
                - Contraseña
        - Constructores:
                - Un constructor por defecto. Generará una contraseña de 8 caracteres.
                - Un constructor con la longitud que nosotros le pasemos.
        - Métodos:
                - esFuerte(): devuelve un booleano indicando si la contraseña es fuerte o no.
                                Para que sea fuerte debe tener más de 2 mayúsculas, más de 1
                                minúscula y más de 3 dígitos.
                - generarPassword(): genera la contraseña del objeto con la longitud que tenga.
                                [Privado]
                - get para contraseña y longitud.
*/

import java.util.Scanner;

public class Main12 {
    static Scanner escanear = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        char op;
        int num;
        String ej;

        while (continuar) {
            op = menu();
            switch (op) {
                case 'A':
                    // Generar Contraseña por defecto
                    Password contrasena1 = new Password();
                    break;
                case 'B':
                    // Generar Contraseña con longitud
                    System.out.print("\nIngresar longitud: ");
                    num = escanear.nextInt();
                    escanear.nextLine();
                    Password contrasena2 = new Password(num);
                    break;
                case 'C':
                    // Verificar Sí es Fuerte
                    System.out.print("\nIngresar una contraseña: ");
                    ej = escanear.nextLine();
                    Password contrasena3 = new Password(ej);
                    if (contrasena3.esFuerte()) {
                        System.out.println("La contraseña generada es Fuerte");
                    } else {
                        System.out.println("La contraseña generada no es Fuerte");
                    }
                    break;
                case 'D':
                    // Generar Contraseña 2025
                    System.out.print("\nIngresar una longitud: ");
                    num = escanear.nextInt();
                    escanear.nextLine();
                    Password contrasena4 = new Password(num, "2025");
                    break;
                default:
                    continuar = false;
            }
        }
        escanear.close();
    }

    public static char menu() {
        char op;
        while (true) {
            System.out.print("""
                    \n\t\tMENÚ
                    A - Generar Contraseña por defecto
                    B - Generar Contraseña con longitud
                    C - Verificar Sí es Fuerte
                    D - Generar Contraseña 2025 (WIP)
                    S - Salir
                    Seleccionar una opción:\s""");
            op = escanear.next().charAt(0);
            escanear.nextLine();
            if ((op >= 'A' && op <= 'D') || op == 'S') {
                return op;
            } else if ((op >= 'a' && op <= 'd') || op == 's') {
                op = (char) (op - 32);
                return op;
            }
            System.out.println("ERROR: Opción no valida");
        }
    }
}
