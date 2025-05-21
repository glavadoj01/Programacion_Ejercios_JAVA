package ejercicio02;

/*
Crea un programa en Java que trabaje con un ArrayList de la claProducto utilizada en los ejercicio7/8 de
    la unidad 5 (copia las clases en este nuevo proyecto). Diseña una nueva clase llamada GestionProductos
    que contendrá como atributo el ArrayList de productos y los métodos:
        - nuevo producto. El producto podrá ser congelado, refrigerado o fresco.
        - eliminar producto. Localizar mediante su ID. Devolver true/false según se haya podido eliminar o no.
        - devolver productos. Devolver el ArrayList al completo.
        - Devolver los productos del tipo…Filtrar según tipo de producto (congelado, fresco o refrigerado).
            Devolver un ArrayList con los productos del tipo seleccionado.
        - eliminar todos los productos congelados. Retornar el número de productos eliminados.
*/

import java.util.ArrayList;

public class AppTest {
    public static void main(String[] args) {
        GestionProductos g = new GestionProductos();


        System.out.println("*******************");
        System.out.println("Mostrar Catalogo:");
        for (Producto p : g.devolverProductos()) {
            System.out.println(p);
        }

        System.out.println("*******************");
        System.out.println("Eliminar Producto \"000001\":");
        if (g.eliminarProducto("000001")) {
            System.out.println("El producto \"000001\" ha sido eliminado.");
        }else {
            System.out.println("El producto \"000001\" no existe.");
        }
        System.out.println("Eliminar Producto \"000010\":");
        if (g.eliminarProducto("000010")) {
            System.out.println("El producto \"000010\" ha sido eliminado.");
        }else {
            System.out.println("El producto \"000010\" no existe.");
        }

        System.out.println("*******************");
        System.out.println("Mostrar Catalogo Congelados:");
        ArrayList<Producto> catalogoCongelados = g.productosSegunTipo("Congelado");
        for (Producto p : catalogoCongelados) {
            System.out.println(p);
        }
        System.out.println("*******************");
        System.out.println("Eliminar todos los congelados; en total se han eliminado: " + g.eliminarCongelados());

        System.out.println("*******************");
        System.out.println("Ingresar Nuevo producto:");
        g.nuevoProducto();

        System.out.println("*******************");
        System.out.println("Mostrar Catalogo:");
        for (Producto p : g.devolverProductos()) {
            System.out.println(p);
        }
    }
}


