package ejercicio13;

/*
Diseña un programa Java que sirva para gestionar productos que se venden en una ferretería.

De cada producto se guarda un código, nombre, tipo (pintura, herramienta, recambio, cinta,...), precio de venta, precio de compra y unidades disponibles.
Crea una clase Producto con los atributos nombrados, los métodos getters, setters y el constructor.

Diseña también una clase llamada GestionProductos que tendrá un array list de productos como atributo.
Esta clase llevará los siguientes métodos:
    a. Constructor. Llenará el array de productos con valores al azar.
    b. filtrarPorPrecioVenta. Pasar un precio y mostrar todos productos con precio superior al pasado.
    c. filtrarPorTipo. Pasar un tipo de producto y mostrar los que coinciden con él.
    d. mostrarDiferencia. Mostrar nombre de producto, precio de compra, precio de venta y la diferencia entre ambos.
    e. mostrarProductoPosicion. Recibe como parámetro una posición y muestra el producto que está en esa posición del array.
    f. cambiarPor. Este método recibe un producto y una posición y sustituirá en el array el producto situado
                           en la posición indicada por el producto pasado como parámetro.
                           Devuelve verdadero o falso, según se haya podido hacer el cambio o no.

En el main crea un objeto de la clase GestionProductos y prueba sus métodos.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main13 {
    static Scanner escanear = new Scanner(System.in);

    public static void main(String[] args) {
        GestionProductos catalogoProductos = new GestionProductos();
        ArrayList<Producto> listaSalida;
        Producto productoSalida1, productoSalida2;

        boolean continuar = true, cambio;
        char op;
        double precio;
        String nombre1, nombre2;
        int pos;

        while (continuar) {
            op = menu();
            switch (op) {
                case 'a':
                    catalogoProductos.mostrarTodos();
                    break;
                case 'b':
                    System.out.println("Ingrese un precio para buscar");
                    precio = escanear.nextDouble();
                    escanear.nextLine();
                    listaSalida = catalogoProductos.filtarPorPrecioVenta(precio);
                    listaSalida.forEach(producto -> {
                        System.out.println(producto);
                    });
                    break;
                case 'c':
                    Tipo.mostrarTipos();
                    System.out.print("Ingrese un tipo de producto para buscar: ");
                    nombre1 = escanear.nextLine().toLowerCase();
                    if (Tipo.esUnTipo(nombre1)) {
                        listaSalida = catalogoProductos.filtarPorTipo(Tipo.valueOf(nombre1));
                        listaSalida.forEach(producto -> {
                            System.out.println(producto);
                        });
                    } else {
                        System.out.println("No existe el \"Tipo\" buscado");
                    }
                    break;
                case 'd':
                    cambio = true;
                    productoSalida1 = catalogoProductos.getCatalogoProductos().getFirst();
                    while (cambio) {
                        System.out.print("Ingrese el código de un producto: ");
                        nombre1 = escanear.nextLine().toUpperCase();
                        for (Producto producto : catalogoProductos.getCatalogoProductos()) {
                            if (producto.getCodigo().equals(nombre1)) {
                                productoSalida1 = producto;
                                cambio = false;
                                break;
                            }
                        }
                        if (cambio) {
                            System.out.println("No existe el \"Código\" buscado");
                        }
                    }
                    cambio = true;
                    while (cambio) {
                        System.out.print("Ingrese el código de otro producto: ");
                        nombre2 = escanear.nextLine().toUpperCase();
                        for (Producto producto : catalogoProductos.getCatalogoProductos()) {
                            if (producto.getCodigo().equals(nombre2)) {
                                productoSalida2 = producto;
                                catalogoProductos.mostrarDiferencia(productoSalida1, productoSalida2);
                                cambio = false;
                                break;
                            }
                        }
                        if (cambio) {
                            System.out.println("No existe el \"Código\" buscado");
                        }                    }
                    break;
                case 'e':
                    System.out.print("Ingrese una posición para ver el producto asociado: ");
                    pos = escanear.nextInt();
                    escanear.nextLine();
                    catalogoProductos.mostrarProducto(pos);
                    break;
                case 'f':
                    System.out.println("Ingrese un producto (posición) para remplazar los datos: ");
                    pos = escanear.nextInt();
                    escanear.nextLine();
                    productoSalida1 = editarProducto();
                    cambio = catalogoProductos.cambiarPor(productoSalida1, pos);
                    if (cambio) {
                        System.out.println("El producto se ha actualizado correctamente");
                    } else {
                        System.out.println("ERROR - ¡El producto no se ha actualizado correctamente!");
                    }
                    break;
                default:
                    continuar = false;
            }
        }
        escanear.close();
    }

    public static char menu() {
        char opcion;
        while (true) {
            System.out.print("""
                    \n\t\tMENÚ
                    a - Mostrar productos
                    b - Filtrar por precio de venta
                    c - Filtrar por tipo de producto
                    d - Mostrar diferencia de precios entre dos productos
                    e - Buscar producto por posición
                    f - Editar producto
                    g - Salir
                    Seleccionar una opción:\s""");
            opcion = escanear.next().charAt(0);
            escanear.nextLine();
            System.out.println();
            if (opcion >= 'a' && opcion <= 'g') {
                return opcion;
            } else if (opcion >= 'A' && opcion <= 'G') {
                opcion = (char) (opcion + 32);
                return opcion;
            }
            System.out.println("ERROR - Ingrese una opción valida");
        }
    }

    public static Producto editarProducto() {
        Tipo tipo1;
        System.out.print("Ingrese el código nuevo: ");
        String codigo = escanear.nextLine().toUpperCase();
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = escanear.nextLine().toLowerCase();
        nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
        while (true) {
            System.out.print("Ingrese el tipo de producto: ");
            String tipoN = escanear.nextLine().toLowerCase();
            if (Tipo.esUnTipo(tipoN)) {
                tipo1 = Tipo.valueOf(tipoN);
                break;
            }
            System.out.println("ERROR - Tipo no valido en catálogo");
        }
        System.out.print("Ingrese el precio de Venta: ");
        double precioVenta = escanear.nextDouble();
        System.out.print("Ingrese el precio de Compra: ");
        double precioCompra = escanear.nextDouble();
        System.out.print("Ingrese el número de unidades del producto: ");
        int unidadesDisponibles = escanear.nextInt();

        return new Producto(codigo, nombre, tipo1, precioVenta, precioCompra, unidadesDisponibles);
    }
}
