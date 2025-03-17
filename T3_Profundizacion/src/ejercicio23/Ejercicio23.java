package ejercicio23;
/*Diseña un programa Java que muestre los números 100, 90, 80, 70... hasta 0.*/
public class Ejercicio23 {
    public static void main(String[] args) {

        for (int i = 100; i >=0; i -= 10) {
            System.out.printf("%d, ", i);
        }
        System.out.printf("\b\b");
    }
}
