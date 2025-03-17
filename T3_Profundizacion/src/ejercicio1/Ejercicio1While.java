package ejercicio1;

//Diseña un programa Java que muestre en pantalla los números enteros del 1 al 100 mediante While

public class Ejercicio1While {
    public static void main(String[] args) {
        int a;
        a = 1;

        while(a <= 100) {
            System.out.printf("%d, ", a);
            a++;
        }
        System.out.printf("\b\b\n");
    }
}
