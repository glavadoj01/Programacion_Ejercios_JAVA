package ejercicio18;

import java.util.Scanner;

/*
Diseña una función en Java que reciba una contraseña como parámetro (cadena de
caracteres) y devuelva true o false según la citada contraseña sea válida o no. Se
considera válida una contraseña cuando:
Una contraseña es correcta si:
a. Longitud mínima de 10 caracteres
b. Solo contiene letras y números
c. Contiene al menos dos números.
*/
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contrasenna;
        boolean esCorrecta;

        do {
            System.out.print("Introduzca una contraseña: ");
            contrasenna = sc.nextLine();
            esCorrecta = verificarContrasenna(contrasenna);

            if (esCorrecta) {
                System.out.println("La contraseña es valida");
                break;
            } else {
                if (contrasenna.length()<10){
                    System.out.println("ERROR - La contraseña debe tener 10 o más carácteres alfanuméricos");
                } else if (contarNumeros(contrasenna)<2) {
                    System.out.println("ERROR - La contraseña debe tener al menos 2 dígitos");
                } else {
                    System.out.println("ERROR - La contraseña solo puede contener nº's y letras");
                }
            }
        } while (true);
    }

    public static boolean verificarContrasenna(String contrasenna) {
        int numeros, letras;
        boolean devolver = false;

        numeros = contarNumeros(contrasenna);
        letras = contarLetras(contrasenna);
        if (contrasenna.length() >= 10 && contrasenna.length() == (numeros + letras) && numeros >= 2) {
            devolver = true;
        }
        return devolver;
    }

    private static int contarNumeros(String contrasena) {
        int salida = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if (contrasena.charAt(i) >= '0' && (contrasena.charAt(i) <= '9')) {
                salida++;
            }
        }
        return salida;
    }

    private static int contarLetras(String contrasena) {
        int salida = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if ((contrasena.charAt(i) >= 'a' && contrasena.charAt(i) <= 'z')
                    || (contrasena.charAt(i) >= 'A' && contrasena.charAt(i) <= 'Z')) {
                salida++;
            }
        }
        return salida;
    }
}
