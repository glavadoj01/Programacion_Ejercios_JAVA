package ejercicio44;
/*
Diseña un programa Java que muestre en pantalla una salida como la de la imagen 2. Deben aparecer los números
del 1 al 26.
*/
public class Ejercicio44 {
    public static void main(String[] args) {

        for (int i = 1; i <= 26; i++) {
            System.out.printf("\n%2d ---- %3d --- %5d", i, ((int) Math.pow(i, 2)), ((int) Math.pow(i, 3)));
        }
    }
}
