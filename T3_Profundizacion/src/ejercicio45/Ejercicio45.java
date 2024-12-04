package ejercicio45;
/*
Diseña un programa Java que muestre en pantalla una salida como la de la imagen 3. Deben aparecer
los números del 1 al 26.
*/
public class Ejercicio45 {
    public static void main(String[] args) {

        for (int i = 0; i < 26; i++) {
            System.out.println((i + 1) + " ---- " + (char)('F' + (i % 5)));
        }
    }
}
