package ejercicio38;
/*
Diseña un programa Java que muestre una salida como la de la imagen 2 del PDF
*/
public class Ejercicio38 {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            System.out.printf("\n%2d-->%4d", (4*i), (4*i*100));
        }
    }
}
