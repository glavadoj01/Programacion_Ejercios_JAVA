package ejercicio14;

/*Diseña un programa que muestre en pantalla un menú con tres opciones: sumar, restar y salir.
Programa cada opción y utiliza un bucle para que pueda repetirse el menú hasta que el usuario elija salir.
Solicita dos números para llevar a cabo cada opción del menú.*/

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int rep;
        float a,b,c;

        do {
            // ENTRADA DE DATOS MENÚ
            do {
                System.out.println("ELEGIR UNA OPCIÓN NUMÉRICA");
                System.out.println("1 - SUMAR");
                System.out.println("2 - RESTAR");
                System.out.println("0 - SALIR");
                rep = escanear.nextByte();

                if (rep != 0 && rep != 1 && rep != 2) {
                    System.out.println("Error");
                }
                else if ((rep == 1 || rep ==2)){
                    System.out.print("Introducir el primer  nº: ");
                    a = escanear.nextFloat();
                    System.out.print("Introducir el segundo nº: ");
                    b = escanear.nextFloat();

                    //SALIDA RESULTADO
                    switch (rep) {
                        case 1:
                            c = a + b;
                            System.out.printf("1 - SUMAR: %.2f + %.2f = %.2f\n", a, b, c);
                            break;
                        default:
                            c = a - b;
                            System.out.printf("2 - RESTAR: %.2f - %.2f = %.2f\n", a, b, c);
                    }
                }


            } while (rep != 0 && rep != 1 && rep != 2);


        } while (rep != 0);
    }
}
