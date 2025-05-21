package recursoscomunes;

import java.util.Scanner;

public class Menu {
    static Scanner escanear = new Scanner(System.in);

    public static void cerrar() {
        escanear.close();
    }

    public static char mostrar() throws ExcepcionFueraMenu2 {
        String salida;
        System.out.print("""
                \n\t\tMENÚ
                A - Mostrar Ciudad por Id
                B - Mostrar Ciudad más poblada
                C - Mostrar Ciudades de un Pais
                D - Comparar Ciudades
                E - Mostrar varias Ciudades por Id
                F - Mostrar varias Ciudades por Id de Pais
                G - Mostrar Todos
                S - Salir
                Seleccionar una opción:\s""");
        salida = escanear.nextLine().toUpperCase();

        if ((salida.charAt(0) >= 'A' && salida.charAt(0) <= 'G') || salida.charAt(0) == 'S') {
            return salida.charAt(0);
        }
        throw new ExcepcionFueraMenu2("ERROR - Opción no valida (Fuera de Menú)");
    }
}
