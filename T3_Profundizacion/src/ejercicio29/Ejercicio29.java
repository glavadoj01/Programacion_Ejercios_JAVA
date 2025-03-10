package ejercicio29;
import java.util.Scanner;
/*
Diseña un programa Java que lea del teclado un carácter (char) y muestre el código ASCII asociado a ese carácter.
Dar la opción de repetir.
*/
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        String rep = "S";
        char entrada;
        int salida;

        do {
            //Entrada Datos
            System.out.print("Ingresar un caracter para obtener su código ASCII asociado: ");
            entrada = escanear.next().charAt(0);

            // Procesado de datos
            salida = (int) entrada;    // Convierte el Char en Int según el estandar ASCII

            System.out.printf("\nEl código ASCII de \"%s\" es: %d", entrada, salida);


            // Repetición
            do {
                System.out.print("\n¿Quiere repetir el proceso? (S/N): ");
                rep = escanear.next().toUpperCase();

                if (!(rep.equals("S") || rep.equals("N"))) {
                    System.out.print("\nError, introducir opción valida (S o N): ");
                }
            } while (!(rep.equals("S") || rep.equals("N")));
        } while (rep.equals("S"));
    }
}
