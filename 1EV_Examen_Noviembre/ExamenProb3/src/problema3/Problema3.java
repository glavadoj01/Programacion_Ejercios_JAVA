package problema3;

import java.util.Scanner;

/*Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.*/
public class Problema3 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num, neg = 0, pos = 0, cero = 0;
        float mneg = 0, mpos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce un numero (Van " + (i - 1) + "): ");
            num = escanear.nextInt();
            if (num < 0) {
                neg++;
                mneg += num;
            } else if (num == 0) {
                cero++;
            } else {
                pos++;
                mpos += num;
            }
        }
        if (neg == 0) {
            mneg = 0;
        } else {
            mneg = mneg / neg;
        }
        if (pos == 0) {
            mpos = 0;
        } else {
            mpos = mpos / pos;
        }
        System.out.println();
        System.out.println("Se han introducido un total de " + pos + " nº's positivos, cuya media es igual a: " + mpos);
        System.out.println("Se han introducido un total de " + neg + " nº's negativos, cuya media es igual a: " + mneg);
        System.out.println("Se han introducido un total de " + cero + " nº's cero");
        escanear.close();
    }
}
