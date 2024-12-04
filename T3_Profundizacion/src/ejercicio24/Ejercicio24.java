package ejercicio24;

/*Diseña un programa Java que muestre los números 1000, 900, 800, 700, 600, **500**, 400,... hasta llegar al cero.
Observa que el valor 500 va entre asteriscos.*/
public class Ejercicio24 {
    public static void main(String[] args) {
        for (int i = 1000; i >= 0; i -= 100) {
            if (i != 500) {
                System.out.printf("%d, ", i);
            } else {
                System.out.printf("**%d**, ", i);
            }
        }
        System.out.printf("\b\b");
    }
}
