package ejemplos;

import java.util.IllegalFormatCodePointException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Capturas1 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int a, b, r;

        while (true) {
            while (true) {
                try {
                    System.out.print("Ingresar un entero: ");
                    a = escanear.nextInt();
                    break;
                } catch (IllegalFormatCodePointException e) {
                    escanear.nextLine();
                    System.out.println("Error - Utilizar punto decimal");
                } catch (Exception e) {
                    escanear.nextLine();
                    System.out.println(e.getMessage());
                }
            }

            while (true) {
                try {
                    System.out.print("Ingresar otro entero: ");
                    b = escanear.nextInt();
                    break;
                } catch (IllegalFormatCodePointException e) {
                    escanear.nextLine();
                    System.out.println("Error - Utilizar punto decimal");
                } catch (InputMismatchException e) {
                    escanear.nextLine();
                    System.out.println("Error - Ingresar un entero");
                }
            }


            try {
                r = a / b;
                System.out.println("El resultado es: " + r);
                break;
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por CERO");
            } catch (InputMismatchException e) {
                System.out.println("Error - Ingresar un entero");
            }

        }
        escanear.close();
    }
}
