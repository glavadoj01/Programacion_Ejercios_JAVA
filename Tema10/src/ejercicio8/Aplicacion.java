package ejercicio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aplicacion {
    static Scanner sc = new Scanner(System.in);
    static GestionProductos catalogo = new GestionProductos();

    public static void main(String[] args) {
        char op;
        boolean cont = true;
        Producto productoBusc;

        while (cont) {
            try {
                op = Menu.menu();
                switch (op) {
                    case 'A':
                        if (productoNuevo()) {
                            System.out.println("Producto creado");
                        } else {
                            System.out.println("El producto no puede ser creado");
                        }
                        break;
                    case 'B':
                        if (borrarProducto()) {
                            System.out.println("Producto borrado");
                        } else {
                            System.out.println("El producto no se ha borrado");
                        }
                        break;
                    case 'C':
                        productoBusc = buscarProducto();
                        if (productoBusc != null) {
                            System.out.println(productoBusc);
                        } else {
                            System.out.println("No se ha encontrado el producto con ese Id");
                        }
                        break;
                    case 'D':
                        mostrarCatalogo();
                        break;
                    default:
                        System.out.println("S - SALIR\n**************************************************");
                        if (catalogo.guardar()) {
                            cont = false;
                        } else {
                            System.out.println("Error de guardado");
                        }
                }
            } catch (OpcionFueraDeRango e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }

    public static boolean productoNuevo() {
        int id;
        String nombre;
        double precio;
        String proveedor;

        System.out.println("A - PRODUCTO DE NUEVO\n**************************************************");
        System.out.println("Ingrese el Id:");
        try {
            id = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ingrese el Id correctamente");
            return false;
        } finally {
            sc.nextLine();
        }
        if (catalogo.existeProducto(id)) {
            System.out.println("El producto ya existe");
            return false;
        }
        System.out.println("Ingrese el nombre:");
        nombre = sc.nextLine();

        System.out.println("Ingrese el precio:");
        try {
            precio = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error al ingresar el precio");
            return false;
        } finally {
            sc.nextLine();
        }

        System.out.println("Ingrese el proveedor:");
        proveedor = sc.nextLine();

        return catalogo.agregarProducto(new Producto(id, nombre, precio, proveedor));
    }

    public static boolean borrarProducto() {
        int id;
        System.out.println("B - BORRAR PRODUCTO\n**************************************************");
        System.out.println("Ingrese el Id:");
        try {
            id = sc.nextInt();
            sc.nextLine();
            return catalogo.eliminarProducto(catalogo.consultararProducto(id));
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static Producto buscarProducto() {
        int id;
        System.out.println("C - BUSCAR PRODUCTO\n**************************************************");
        System.out.println("Ingrese el Id:");
        try {
            id = sc.nextInt();
            sc.nextLine();
            return catalogo.consultararProducto(id);
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static void mostrarCatalogo() {
        System.out.println("D - LISTAR CATALOGO\n**************************************************");
        catalogo.listarCatalogoProductos();
    }
}
