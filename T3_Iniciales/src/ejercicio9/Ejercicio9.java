package ejercicio9;

import java.util.Scanner;

/*
Diseña un programa Java que pida un número comprendido entre 1 y 7.
Y que luego escriba el día de la semana asociado al número.
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        //Def métodos y variables
        Scanner escanear = new Scanner(System.in);
        int a;
        //Entrada de datos
        a = 0;
        while (a < 1 || a > 7) {
            System.out.print("Introducir un nº entero entre el 1 y el 7: ");
            a = escanear.nextInt();
            System.out.println();
        }
        //Salida de resultados
        switch (a) {
            case 1:
                System.out.println("El nº " + a + " corresponde con el lunes.");
                break;
            case 2:
                System.out.println("El nº " + a + " corresponde con el martes.");
                break;
            case 3:
                System.out.println("El nº " + a + " corresponde con el miércoles.");
                break;
            case 4:
                System.out.println("El nº " + a + " corresponde con el jueves.");
                break;
            case 5:
                System.out.println("El nº " + a + " corresponde con el viernes.");
                break;
            case 6:
                System.out.println("El nº " + a + " corresponde con el sábado.");
                break;
            default:
                System.out.println("El nº " + a + " corresponde con el domingo.");
        }
    }
}
