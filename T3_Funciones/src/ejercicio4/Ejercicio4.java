package ejercicio4;

import java.util.Scanner;

/*
Diseña un programa Java que incluya una función que devuelva el carácter asociado a un código ASCII
pasado como parámetro.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int codigo;
        char caracter;

        System.out.print("Ingrese el código ASCii del carácter: ");
        codigo = escanear.nextInt();
        caracter = convertirEnCaracter(codigo);

        System.out.println("El caracter es: " + caracter);
    }

    public static char convertirEnCaracter(int codigo) {
        return (char) codigo;
    }
}