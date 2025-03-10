package ejercicio21;

/*Diseña un programa Java que imprima en pantalla los números impares del 1 al 99 y la suma de los mismos.*/
public class Ejercicio21 {
    public static void main(String[] args) {
        int acu = 0;
        for (int i = 1; i <= 99; i+=2) {
            System.out.printf("%d, ",i);
            acu = acu + i;
        }
        System.out.printf("\b\b\nLa suma de los nº's impares desde el 1 hasta el 99 es: %d", acu);
    }
}
