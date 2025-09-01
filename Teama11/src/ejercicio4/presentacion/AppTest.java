package ejercicio4.presentacion;

/*
Diseña un programa Java que muestre al usuario una lista de los clientes de la base
    de datos “classicModels” (número de cliente y nombre), el usuario elegirá uno y
    el programa mostrará pantalla todos los pedidos de ese cliente con los datos:
        + Número de pedido
        + Fecha de pedido
        + Estado.
*/

import static tema11.ejercicio4.operaciones.Operaciones.*;
import java.util.Scanner;

public class AppTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int idBusc;
        char cont;

        do {
            idBusc = mostrarMenu();
            if (idBusc > 0) {
                mostrarPedidos(idBusc);
            }
            System.out.println("============================");
            System.out.println("¿Continuar? (S/N)");
            cont = sc.nextLine().toLowerCase().charAt(0);
        } while (cont != 'n');
        sc.close();
    }

    public static int mostrarMenu() {
        mostrarClientes();
        System.out.print("Insertar el id del cliente a buscar (-1 para salir): ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
    }
}
