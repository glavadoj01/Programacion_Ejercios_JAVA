package ejercicio8;

public class Mates {
    private static final double PI = 3.1415;

    static double longitudCircunferencia(double r) {
        return 2 * PI * r;
    }

    static boolean esPar(int n) {
        return n % 2 == 0;
    }

    static boolean esPrimo(int a) {
        if (esPar(a) && a != 2) {
            return false;
        }
        for (int i = 3; i <= a / 2; i = i + 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int sumaDivisores(int a) {
        int suma = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                suma += i;
            }
        }
        return suma;
    }

    static boolean sonAmigos(int a, int b) {
        return sumaDivisores(a) == b && sumaDivisores(b) == a;
    }
}
