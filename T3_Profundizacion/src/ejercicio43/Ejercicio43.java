package ejercicio43;
/*
Diseña un programa Java que muestre en pantalla una salida como la de la imagen 1. Deben aparecer las letras
de la A a la Z (a,z).
*/
public class Ejercicio43 {
    public static void main(String[] args) {

        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i + " ----- " + (char) (i+32));
        }
    }
}
