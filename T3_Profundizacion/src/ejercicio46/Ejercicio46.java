package ejercicio46;
import java.util.Random;
/*
Diseña un programa que genere e imprima 10 números al azar entre 1 y 50 mediante la clase Random.
*/
public class Ejercicio46 {
    public static void main(String[] args) {
        Random generador = new Random();
        int num;

        for (int i = 1; i <= 10; i++) {
            num = generador.nextInt(50) + 1;
            System.out.println(num);
        }
    }
}
