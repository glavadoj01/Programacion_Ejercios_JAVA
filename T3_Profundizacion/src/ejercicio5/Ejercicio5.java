package ejercicio5;
import java.util.Scanner;

/*Diseña un programa Java que pida un número entero comprendido entre 1 y 100 y calcule
la tabla de multiplicar de ese número. Si no está comprendido entre 1 y 100 mostrar un mensaje
de error.*/

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int acu,num,out;

        // ENTRADA DE DATOS
        do {
            System.out.print("Introducir un entero entre 1 y 100: ");
            num = escanear.nextInt();
                    if (num < 1 || num > 100){
                        System.out.println("Error");
                    }
        }while (num < 1 || num > 100);

        //Salida de datos
        acu = 0;
        System.out.println("La tabla de multiplicar del número " + num + " es:");
        do {
            out=acu*num;
            System.out.printf("\n%2d x %3d = %4d", acu, num, out);
            acu++;
        }while (acu<=10);
    }
}
