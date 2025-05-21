package ejercicio12;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        GestionNumeros pruebas = new GestionNumeros();

        System.out.println("*********************");
        System.out.println("Añadir nº 35 (Los pregenerados van de 1 a 10");
        pruebas.agregarNumero(35);
        System.out.println("*********************");
        System.out.println("Añadir Colección List{20,30,40)");
        pruebas.agregarColeccion(List.of(20, 30, 40));
        System.out.println("*********************");
        System.out.println("Mostrar el ArrayList:");
        System.out.println(pruebas);
        System.out.println("*********************");
        System.out.println("*********************");
        System.out.println("Orden Natural (0)");
        pruebas.ordenarLista(0);
        System.out.println(pruebas);
        System.out.println("*********************");
        System.out.println("*********************");
        System.out.println("Orden Reverso (1)");
        pruebas.ordenarLista(1);
        System.out.println(pruebas);
        System.out.println("*********************");
        System.out.println("Tamaño de la lista: " + pruebas.tamLista());
        System.out.println("*********************");
        System.out.println("Obtener pares:");
        System.out.println(pruebas.obtenerPares());
        System.out.println("*********************");
        System.out.println("Suma total de la lista: " + pruebas.sumaTotal());
        System.out.println("*********************");
        System.out.println("Eliminar nº 20: ");
        if (pruebas.eliminaNumero(20)) {
            System.out.println("Nº 20 eliminado");
        } else {
            System.out.println("Mº 20 no eliminado");
        }
        System.out.println("*********************");
        System.out.println("Eliminar nº 70: ");
        if (pruebas.eliminaNumero(70)) {
            System.out.println("Nº 70 eliminado");
        } else {
            System.out.println("Mº 70 no eliminado");
        }
        System.out.println("*********************");
        System.out.println("Eliminar múltiplos de 3 (al menos hay 3 pregenerados)");
        System.out.println("Se han eliminado un total de " + pruebas.eliminarMultiplos(3) + " elementos");
        System.out.println("*********************");
        System.out.println("Obtener Array de Pares:");
        Integer[] pares = pruebas.devolverArray();
        System.out.println(Arrays.toString(pares));
    }
}
