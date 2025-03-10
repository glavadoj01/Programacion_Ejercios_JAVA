package ejercicio12;
import java.util.Scanner;

/*Diseña un programa Java que calcule el IMC (índice de masa corporal) de una persona conocidas su altura y peso.
Dar la opción de repetir.*/

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        float mas, alt, imc;
        byte rep;

        do {

            // Entrada de datos
            System.out.print("Introducir la altura de la persona en metros: ");
            alt = escanear.nextFloat();
            System.out.print("Introducir el peso de la persona en kilos: ");
            mas = escanear.nextFloat();

            //Cálculo IMC
            imc = mas / ((float) Math.pow(alt,2));

            //Salida
            System.out.printf("El IMC de la persona es %.2f [Kg/m2]\n", imc);

            //Repetición
            do {
                System.out.println("Para  salir  introduzca 0");
                System.out.println("Para repetir introduzca 1");
                rep = escanear.nextByte();
                if (rep != 1 && rep !=0) {
                    System.out.println("Error");
                }
            } while (rep != 1 && rep != 0);



        } while (rep==1);
    }
}
