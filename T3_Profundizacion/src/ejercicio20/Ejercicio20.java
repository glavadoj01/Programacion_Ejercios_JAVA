package ejercicio20;


/*Diseña un programa Java que imprima en pantalla los números del 1 al 10 y la suma
de los mismos.*/
public class Ejercicio20 {
    public static void main(String[] args) {
        int i, acu;

        acu = 0;
        for (i = 1; i <=10; i++) {
            System.out.printf("%d, ", i);
            acu = acu + i;
        }
        System.out.printf("\b\b\nLa suma de los nº's del 1 al 10 es %d", acu);
    }
}
