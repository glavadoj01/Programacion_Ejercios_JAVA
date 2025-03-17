package ejercicio47;
import java.util.Random;
/*
Diseña un programa que genere e imprima 10 números al azar entre 1 y 50 mediante la clase Random.
Al final el programa debe mostrar el mayor de todos ellos.
*/
public class Ejercicio47 {
    public static void main(String[] args) {
        Random generador = new Random();
        int num, mayor = 0;

        for (int i = 1; i <= 10; i++) {
            num = generador.nextInt(50) + 1;
            System.out.println(num);
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El nº mayor de los generados es: " + mayor);
    }
}


/*
* Los char, los guardas a la vez + o -, como nº ASCII y como Caracter
*
*
* */