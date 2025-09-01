package EjercicioQ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operaciones op = new Operaciones();
        op.rellenaMap();
        op.muestraMap();
        System.out.println("--------------------------------------------------");
        System.out.println("20 elementos al azar:");
        op.muestra20ElementosAlAzar();
        System.out.println("Elige un participante por DNI:");
        op.buscarParticipante(sc.nextLine());
    }
}
