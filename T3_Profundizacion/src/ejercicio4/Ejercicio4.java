package ejercicio4;

// Diseña un programa Java que muestre en pantalla los impares del 333 al 999.

public class Ejercicio4 {
    public static void main(String[] args) {

        int a=333;

        do {
            System.out.println(a);
            a=a+2;
        } while (a<=999);
    }
}
