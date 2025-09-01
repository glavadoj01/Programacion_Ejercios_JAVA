package presentacion;

import logica.Operaciones;

import java.util.Scanner;

public class Main {
    // Lo suelo poner aquí por si quisiéramos insertar otra oficina (datos), lo haría desde los métodos de esta clase
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        bucleMenu:
        while (true) {
            switch (mostrarMenu()) {
                case 'A':
                    System.out.println("Opción A seleccionada.");
                    consultarProdMax();
                    break;
                case 'B':
                    System.out.println("Opción B seleccionada.");
                    insertarNuevaOf();
                    break;
                case 'C':
                    System.out.println("Opción C seleccionada.");
                    actualizarSalario();
                    break;
                default:
                    System.out.println("Opción D - Saliendo del programa");
                    break bucleMenu;
            }
        }
        sc.close();
    }

    private static void consultarProdMax() {
        int numProd = 10;
        if (Operaciones.ProdMaxPrecio(numProd)) {
            System.out.println("El fichero se ha generado con éxito");
        } else {
            System.out.println("El fichero no se ha generado");
        }
    }

    private static void insertarNuevaOf() {
        String officeCode = "8";
        String city = "Zafra";
        String phone = "+34 555 556 557";
        String addressLine1 = "Crt. Fuente del Maestre S/N";
        String addressLine2 = "Edificio E";
        String state = "Badajoz";
        String country = "Spain";
        String postalCode = "06200";
        String territory = "EMEA";

        if (Operaciones.insertarOfi(officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory)) {
            System.out.println("La oficina se insertado con éxito");
        } else {
            System.out.println("La oficina no se ha insertado");
        }
    }

    private static void actualizarSalario() {
        int employeeNumber =1216;
        String lastName ="Patterson";
        String firstName ="Steve";

        if (Operaciones.actualizarSalario(employeeNumber, lastName, firstName)) {
            System.out.println("Empleado actualizado con éxito");
        } else {
            System.out.println("Empleado no actualizado");
        }
    }

    public static char mostrarMenu() {
        char op;
        while (true) {
            System.out.print("""
                ============================================
                \t\tMENÚ DE OPCIONES
                A. - Consultar los 10 productos con mayor precio de venta
                B. - Insertar oficina nueva
                C. - Actualizar empleado
                D. Salir
                Seleccione una opción:\s""");

            try {
                op = sc.nextLine().toUpperCase().charAt(0);
                System.out.println(); // Línea en blanco para mejorar la legibilidad
                if (op >= 'A' && op <= 'D') {
                    return op; // Sí y solo sí la opción es válida
                }
                System.out.println("Opción no válida.\nElegir una opción entre A y D.");
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("\nError: Debe seleccionar al menos una opción");
            }
        }
    }
}
