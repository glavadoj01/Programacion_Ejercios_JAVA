package ejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class AppTest {
    static Scanner escanear = new Scanner(System.in);
    static GestionProductos catalogo = new GestionProductos();

    public static void main(String[] args) {
        char op;

        bucle:
        while (true) {
            try {
                op = menu();
            } catch (OpcionFueraDeRango e) {
                op = '0';
            }
            switch (op) {
                case 'A':
                    consultarId();
                    break;
                case 'B':
                    ventasMin();
                    break;
                case 'C':
                    ventaAnno();
                    break;
                case 'D':
                    guardarAnno();
                    break;
                case 'E':
                    mostrartodos();
                    break;
                case 'S':
                    break bucle;
                default:
                    System.out.println("Opción no valida");
            }
        }
        escanear.close();
    }

    private static void mostrartodos() {
        for (Producto p : catalogo.getCatalogo()) {
            System.out.println(p);
        }
    }

    public static char menu() throws OpcionFueraDeRango {
        char ops;
        System.out.print("""
                \n\t\tMENÚ
                A - Consultar ID
                B - Listar poor ventas mínimas
                C - Listar ventas por año
                D - Guardar ventas de un año
                E - Mostrar todos los productos
                S - Salir
                Seleccionar una opción:\s""");
        ops = escanear.nextLine().toUpperCase().charAt(0);
        if ((ops >= 'A' && ops <= 'E') || ops == 'S') {
            return ops;
        }
        throw new OpcionFueraDeRango("Opción no valida");
    }

    private static void consultarId() {
        System.out.print("Ingrese el id del producto: ");
        String id = escanear.nextLine();
        Producto p = catalogo.buscarProducto(id);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("No existe el producto con el Id: '" + id + '\'');
        }
    }

    public static void ventasMin() {
        int min = -1;
        System.out.print("Ingrese el nº mínimo de ventas: ");
        try {
            min = escanear.nextInt();
            escanear.nextLine();
        } catch (Exception e) {
            System.out.println("Ingresar un nº entero");
        }
        if (min <= 0) {
            System.out.println("Ingresar un nº entero positivo");
        } else {
            ArrayList<Producto> pVentMin = catalogo.productosConNVentas(min);
            if (pVentMin.isEmpty()) {
                System.out.println("No existen productos con ventas superiores a: '" + min + '\'');
            } else {
                for (Producto p : pVentMin) {
                    System.out.println(p);
                }
            }
        }
    }

    private static void ventaAnno() {
        int a = 0;
        System.out.print("Ingrese el año para buscar: ");
        try {
            a = escanear.nextInt();
            escanear.nextLine();
        } catch (Exception e) {
            System.out.println("Ingrese un numero valido");
        }

        System.out.println("Nº de Ventas\tProducto");
        for (Producto p : catalogo.getCatalogo()) {
            System.out.println(p.getVentas().getOrDefault(a,0) + "\t\t\t\t" + p.getNombre());
        }

    }

    private static void guardarAnno() {
        int a = 0;
        System.out.print("Ingrese el año para buscar: ");
        try {
            a = escanear.nextInt();
            escanear.nextLine();
        } catch (Exception e) {
            System.out.println("Ingrese un numero valido");
        }
        if (catalogo.ficheroVentasAnno(a)) {
            System.out.println("El fichero para el año '" + a + "' se ha guardado");
        } else {
            System.out.println("El fichero no se ha guardado");
        }
    }
}


