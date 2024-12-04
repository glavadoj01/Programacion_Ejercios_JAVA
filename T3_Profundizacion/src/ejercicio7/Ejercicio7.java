package ejercicio7;
import java.util.Scanner;

/*
Diseña un programa Java que dibuje tantas filas de 10 asteriscos en pantalla como
indique un entero solicitado al usuario.
*/

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num,acu, ast;

        // ENTRADA DATOS
        do {
            System.out.print("Introducir un entero positivo: ");
            num = escanear.nextInt();
            if (num < 1 ) {
                System.out.println("Error");
            }
        }while (num < 1);

        //SALIDA DATOS
        acu = 1;
        ast = 10;
        do {
            for (int i = 1; i <= ast; i++) {
                System.out.print("* ");
            }
            System.out.print("\n");
            acu++;
        }while (acu <= num);
    }
}
