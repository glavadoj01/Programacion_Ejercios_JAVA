package ejercicio60;

/*Diseña un programa que muestre los números primos existentes entre 1 y 10000*/
public class Ejercicio60 {
    public static void main(String[] args) {
        boolean imprimo;
        int numFINAL = 20;  // El ejercicio dice ¡10000! lo he probado con 20 que si no, el PC de Clase...
        // Para 10000, cambiar esta variable. || En mi casa lo he probado con los diez mil y ejecuta bien y rápido.

        for (int i = 1; i <= numFINAL; i++) {
            imprimo = esPrimo(i);
            if (imprimo) {
                System.out.println(i);
            }
        }
    }

    public static boolean esPrimo(int num) {
        int div = 1;
        boolean esPrimo = false;

        if (num == 2) {
            esPrimo = true;
        } else if (num == 1 || num % 2 == 0) {
        } else {
            for (int i = 3; i <= (num / 2); i = i + 2) {
                if (num % i == 0) {
                    div++;
                }
            }
            if (div == 1) {
                esPrimo = true;
            }
        }
        return esPrimo;
    }
}
