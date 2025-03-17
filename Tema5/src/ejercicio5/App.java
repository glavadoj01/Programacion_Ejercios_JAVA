package ejercicio5;


import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner escanear = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        app.iniciar();
        escanear.close();
    }

    public void iniciar() {
        ArrayList<Examen> coleccionExamenes = new ArrayList<>();
        int op;
        char s;

        for (int i = 1; i <= 20; i++) {
            coleccionExamenes.add(new Examen(i));
        }
        while (true) {
            op = menu();
            if (op == 9999) {
                break;
            }
            System.out.println("¿Mostrar soluciones (S/N) ? ");
            s = escanear.next().toUpperCase().charAt(0);
            if (s == 'S') {
                System.out.println(coleccionExamenes.get(op - 1).toString2());
            } else {
                System.out.println(coleccionExamenes.get(op - 1).toString());
            }
        }
    }

    private static int menu() {
        int op;
        while (true) {
            System.out.print("Introduce número de exámen entre 1 y 20. Teclear 9999 para salir : ");
            op = escanear.nextInt();
            if ((op >= 1 && op <= 20) || op == 9999) {
                return op;
            }
            System.out.println("\nError - Opción no valida");
        }
    }

}
