package ejercicio30;
/*
Escribe un programa Java que muestre en pantalla las letras mayúsculas y el código ASCII asociado a cada una de ellas.
*/
public class Ejercicio30 {
    public static void main(String[] args) {
        char letra;

        for (int i = 65; i <= 90; i++) {
            letra = (char) i;
            System.out.printf("La letra %s tiene como código ASCII asociado el nº: %d\n", letra, i);
        }
    }
}
