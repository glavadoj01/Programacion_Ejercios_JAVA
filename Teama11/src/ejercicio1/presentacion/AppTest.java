package ejercicio1.presentacion;

import tema11.ejercicio1.logica.Operaciones;
import tema11._01_modelos.*;

import java.util.List;
import java.util.Scanner;

/*
1. Diseña un proyecto Java que obtenga:
    a. Un listado de clientes de una localidad que será pasada como parámetro.
        Debes mostrar las columnas: número de cliente, nombre, teléfono y ciudad.
    b. Listado de todas las categorías existentes (categoría y descripción).
    c. Listado de todos los productos de una categoría: código, nombre, precio de compra, de venta y categoría.
    d. Listado de todos los productos con un precio de compra entre dos valores.
*/
public class AppTest {

    static Scanner sc = new Scanner(System.in);

    /**
     * Método principal que inicia la aplicación.
     * Muestra un menú y ejecuta las opciones elegidas por el usuario.
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {

        bucle:
        while (true) {
            switch(menu()) {
                case '1':
                    listadoLocalidad();
                    break;
                case '2':
                    listadoCategorias();
                    break;
                case '3':
                    listadoProductosCategoria();
                    break;
                case '4':
                    listadoProductosPrecio();
                    break;
                default:
                    System.out.println("""
                        \n************************************************
                        Opción 5: Salir
                        ************************************************"""
                    );
                    break bucle;
            }
        }
        sc.close();
    }

    /**
     * Muestra el menú de opciones y devuelve la opción elegida por el usuario.
     * @return Opción elegida por el usuario.
     */
    public static char menu() {
        char opcion;
        while(true) {
            System.out.print("""
                    \t\tMENÚ
                    1. Listado de clientes de una localidad
                    2. Listado de categorías existentes
                    3. Listado de productos de una categoría
                    4. Listado de productos con un precio de compra entre dos valores
                    5. Salir
                    Introduzca una opción:\s"""
            );
            opcion = sc.nextLine().charAt(0);
            if (opcion >= '1' && opcion <= '5') {
                return opcion;
            }
            System.out.println("Opción incorrecta\nIntroduzca una opción válida.\n");
        }
    }

    /**
     * Muestra el listado de Clientes para una Localidad que se pedirá por teclado.
     */
    private static void listadoLocalidad() {
        System.out.println("""
                \n************************************************
                Opción 1: Listado de clientes de una localidad
                ************************************************"""
        );
        System.out.print("Introduzca la localidad: ");
        String localidad = sc.nextLine();
        List<Cliente> listado = Operaciones.obtenerClientesPorLocalidad(localidad);

        System.out.println("\nListado de clientes de " + localidad + ":");
        if (listado.isEmpty()) {
            System.out.println("No se han encontrado clientes en la localidad " + localidad);
        } else {
            for (Cliente cliente : listado) {
                System.out.println("Id Cliente: " + cliente.getCustomerNumber() +
                        ";\tNombre: " + cliente.getCustomerName() +
                        ";\tTeléfono: " + cliente.getPhone() +
                        ";\tCiudad: " + cliente.getCity());
            }
        }
        System.out.println("\n************************************************");
        System.out.println("************************************************\n");
    }

    /**
     * Muestra el listado de categorías existentes.
     */
    private static void listadoCategorias() {
        System.out.println("""
                \n************************************************
                Opción 2: Listado de categorías existentes
                ************************************************"""
        );
        List<Categoria> categorias = Operaciones.obtenerCategorias();
        System.out.println("\nListado de categorías existentes:");
        if (categorias.isEmpty()) {
            System.out.println("No se han encontrado categorías.");
        } else {
            System.out.println("Categoría\t||\tDescripción");
            for (Categoria categoria : categorias) {
                System.out.println(categoria.getNombre() + "\t||\t" + categoria.getDescripcion());
            }
        }
        System.out.println("\n************************************************");
        System.out.println("************************************************\n");
    }

    /**
     * Muestra el listado de productos de una categoría solicitada por teclado.
     */
    private static void listadoProductosCategoria() {
        System.out.println("""
                \n************************************************
                Opción 3: Listado de productos de una categoría
                ************************************************"""
        );
        System.out.print("Introduzca la categoría: ");
        String categoria = sc.nextLine();
        List<Producto> productos = Operaciones.obtenerProductosCategoria(categoria);
        System.out.print("\nListado de productos de la categoria: " + categoria);
        imprimirProductos(productos);

        System.out.println("\n************************************************");
        System.out.println("************************************************\n");
    }

    /**
     * Muestra el listado de productos con precio de compra entre 2 valores
     * solicitados mediante entrada por teclado.
     */
    private static void listadoProductosPrecio() {
        System.out.println("""
                \n************************************************
                Opción 4: Listado de productos con un precio de compra entre dos valores
                ************************************************"""
        );
        System.out.print("Introduzca el precio mínimo: ");
        double precioMinimo = leerDouble();
        System.out.print("Introduzca el precio máximo: ");
        double precioMaximo = leerDouble();

        List<Producto> productos = Operaciones.obtenerProductosPrecios(precioMinimo, precioMaximo);
        System.out.print("\nListado de productos con precio de compra entre " + precioMinimo + " y " + precioMaximo);
        imprimirProductos(productos);

        System.out.println("\n************************************************");
        System.out.println("************************************************\n");
    }

    /**
     * Lee un número double desde la entrada estándar.
     * Previene errores de formato.
     * @return El número leído.
     */
    private static double leerDouble() {
        double numero;
        while (true) {
            try {
                numero = sc.nextDouble();
                sc.nextLine();
                return numero;
            } catch (Exception e) {
                sc.nextLine();
                System.out.print("\nError: " + e.getMessage() + "\nIntroduzca un número válido: ");
            }
        }
    }

    /**
     * Imprime el listado de productos.
     * @param productos Lista de productos a imprimir.
     */
    private static void imprimirProductos(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("\nNo se han encontrado productos en ese rango de precios.");
        } else {
            for (Producto producto : productos) {
                System.out.printf("""
                         \nProducto:\tId Producto: %s;\tNombre: %s;\tPrecio de compra: %.2f;\tPrecio de venta: %.2f;\tCategoría: %s""",
                        producto.getProductCode(),producto.getProductName(),producto.getBuyPrice(),producto.getMSRP(),producto.getProductLine()
                );
            }
            System.out.println();
        }
    }
}
