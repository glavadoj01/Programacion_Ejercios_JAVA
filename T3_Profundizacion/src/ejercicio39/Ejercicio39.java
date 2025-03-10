package ejercicio39;
/*
Diseña un programa Java que muestre una salida como la de la imagen 3
*/
public class Ejercicio39 {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            System.out.printf("\n%2d-->%4d-->%5d", (4*i), (4*i*100), (4*i*1000));
        }
    }
}
