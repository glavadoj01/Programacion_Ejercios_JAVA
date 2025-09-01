package ejercicio8;

import java.util.Scanner;

public class Menu {
    public static char menu() throws OpcionFueraDeRango {
        Scanner escanear = new Scanner(System.in);
        char op;

        System.out.print("""
                \n\t\tMENÚ
                A - Insertar producto
                B - Eliminar producto (Id)
                C - Consultar producto (Id)
                D - Listar catalogo completo de productos
                S - Salir
                Seleccionar una opción:\s""");
        op = escanear.nextLine().toUpperCase().charAt(0);
        if ((op >= 'A' && op <= 'D') || op == 'S') {
            return op;
        }
        throw new OpcionFueraDeRango("Opción no valida");
    }
}
