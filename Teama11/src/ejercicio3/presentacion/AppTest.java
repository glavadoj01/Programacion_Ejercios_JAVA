package ejercicio3.presentacion;

/*
Diseña un proyecto Java que permita realizar estas tareas sobre la base de datos classicModels
Nota: utilizar una copia de la tabla productos.
    a. Actualizar precios de venta de productos. Incrementar todos un 5%
    b. Actualizar el precio de venta de un producto.
            Incrementar un % el precio de venta de un producto identificado por su código.
    c. Eliminar producto a partir de su código
    d. Insertar nuevo producto.
*/

import tema11.ejercicio3.operaciones.Operaciones;

import java.sql.SQLException;
import java.util.Scanner;

public class AppTest {

    private static final Scanner sc = new Scanner(System.in);

    /** Inicializa la aplicación
     * @param args argumentos de la línea de comandos ¿?
     */
    public static void main(String[] args) {
        char op = '0';
        while (op != 'e') {
            op = menu();
            switch (op) {
                case 'a' -> Operaciones.actualizarPreciosVenta();
                case 'b' -> actualizarPrecioVenta();
                case 'c' -> eliminarProducto();
                case 'd' -> insertarProducto();
                case 'e' -> System.out.println("Fin del programa.");
            }
        }
        sc.close();
    }

    /** Actualiza el precio de venta de un producto
     *
     */
    private static void actualizarPrecioVenta() {
        double porcentaje;
        String codigo;
        int res;
        System.out.println("Opción b. Actualizar el precio de venta de un producto");
        System.out.print("Introduce el código del producto: ");
        codigo = sc.nextLine();
        System.out.print("Introduce el porcentaje de incremento: ");
        try {
            porcentaje = Double.parseDouble(sc.nextLine());
            res = Operaciones.actualizarPrecioVenta(codigo, porcentaje);
            if (res > 0) {
                System.out.println("El precio de venta del producto con código " + codigo + " se ha actualizado correctamente.");
            } else {
                System.out.println("No se ha podido actualizar el precio de venta del producto con código " + codigo + ".");
            }
        } catch (NumberFormatException e) {
            sc.nextLine();
            System.out.println("Error: El porcentaje debe ser un número.");
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        }
    }

    /** Elimina un producto a partir de su código
     *
     */
    private static void eliminarProducto() {
        String codigo;
        int res;
        System.out.println("Opción c. Eliminar producto");
        System.out.print("Introduce el código del producto: ");
        codigo = sc.nextLine();
        try {
            res = Operaciones.eliminarProducto(codigo);
            if (res > 0) {
                System.out.println("El producto con código " + codigo + " se ha eliminado correctamente.");
            } else {
                System.out.println("No se ha podido eliminar el producto con código " + codigo + ".");
            }
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        }
    }

    /** Inserta un nuevo producto
     *
     */
    private static void insertarProducto() {
        String codigo, nombre, categoria, escala, vendedor, descripcion;
        double precioC, precioV;
        int stock, res;

        System.out.println("Opción d. Insertar nuevo producto");
        System.out.print("Introduce el código del producto: ");
        codigo = sc.nextLine();
        System.out.print("Introduce el nombre del producto: ");
        nombre = sc.nextLine();
        System.out.print("Introduce la categoría del producto: ");
        categoria = sc.nextLine();
        System.out.print("Introduce la escala del producto: ");
        escala = sc.nextLine();
        System.out.print("Introduce el vendedor del producto: ");
        vendedor = sc.nextLine();
        System.out.print("Introduce la descripción del producto: ");
        descripcion = sc.nextLine();
        System.out.print("Introduce el precio de compra del producto: ");
        try {
            precioC = Double.parseDouble(sc.nextLine());
            System.out.print("Introduce el precio de venta del producto: ");
            precioV = Double.parseDouble(sc.nextLine());
            System.out.print("Introduce la cantidad en stock del producto: ");
            stock = Integer.parseInt(sc.nextLine());
            res = Operaciones.insertarProducto(codigo, nombre, categoria, escala, vendedor, descripcion, stock, precioC, precioV);
            if (res > 0) {
                System.out.println("El producto con código " + codigo + " se ha insertado correctamente.");
            } else {
                System.out.println("No se ha podido insertar el producto con código " + codigo + ".");
            }
        } catch (NumberFormatException e) {
            sc.nextLine();
            System.out.println("Error: El precio debe ser un número.");
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
        }
    }

    /** Muestra el menú de opciones
     *
     * @return char con la opción elegida
     */
    private static char menu() {
        char op;
        while (true) {
            System.out.println("""
                
                \t\tMENÚ
                a. Actualizar precios de venta de productos (+5%)
                b. Actualizar el precio de venta de un producto (en %).
                c. Eliminar producto
                d. Insertar nuevo producto
                e. Salir
                Elegir opción:\s""");
            op = sc.nextLine().toLowerCase().charAt(0);
            if (op >= 'a' && op <= 'e') {
                return op;
            }
            System.out.println("Opción incorrecta. Vuelve a intentarlo.");
        }

    }
}
