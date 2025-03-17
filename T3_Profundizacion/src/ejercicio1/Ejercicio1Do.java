package ejercicio1;

//Diseña un programa Java que muestre en pantalla los números enteros del 1 al 100 mediante Do - While

public class Ejercicio1Do {
    public static void main(String[] args) {
        int a;
        a = 1;

        do {
            System.out.printf("%d, ",a);
            a++;
        } while (a <= 100);
        System.out.printf("\b\b\n");
    }
}
