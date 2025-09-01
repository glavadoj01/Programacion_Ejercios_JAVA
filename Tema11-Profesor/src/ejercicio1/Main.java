package ejercicio1;

import tema11.ConectarBD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ejercicio1 ej1 = new Ejercicio1();

        ej1.mostrarClientesLocalidad("Boston");
        System.out.println();
        ej1.mostrarCategorias();
        System.out.println();
        ej1.mostrarProductoCategoria("Classic Cars");

        ej1.cerrarConexion();
    }
}
