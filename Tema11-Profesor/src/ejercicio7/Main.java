package ejercicio7;

import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear una instancia de Ejercicio7
        Ejercicio7 ej = new Ejercicio7("classicmodels");

        // Mostrar las categorías disponibles
        ej.muestraCategorias();

        // Elegir una categoría (por ejemplo, "Classic Cars")
        String categoriaElegida = sc.nextLine();

        // Obtener los productos de la categoría elegida
        ResultSet rs = ej.muestraProductos(categoriaElegida);

        // Generar el archivo con los productos
        ej.guardaResulset(rs, categoriaElegida);

        ej.cerrarConexion();
    }
}
