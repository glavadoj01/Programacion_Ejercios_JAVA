package ejemplosVariosPizarra;

import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        String[] Dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        String entrada;

        System.out.print("Introduzca un día de la semana para saber que nº es: ");
        entrada = escanear.nextLine().toLowerCase();

        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.equals(Dias[i])) {
                System.out.println("El " + entrada + " es el dia nº " + (i + 1) + " de la semana");
            }
        }
    }
}
