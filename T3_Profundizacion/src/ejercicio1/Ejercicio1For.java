package ejercicio1;

//Diseña un programa Java que muestre en pantalla los números enteros del 1 al 100 mediante FOR

public class Ejercicio1For {
    public static void main(String[] args) {
        int acu;

        for (acu = 1; acu <= 100 ; acu++){
            System.out.printf("%d, ", acu);
        }
        System.out.printf("\b\b\n");
    }
}
