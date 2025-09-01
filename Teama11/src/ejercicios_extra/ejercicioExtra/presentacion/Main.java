package ejercicios_extra.ejercicioExtra.presentacion;

import tema11.ejercicios_extra.ejercicioExtra.gestion.GestionEmpleados;
import tema11.ejercicios_extra.ejercicioExtra.modelos.Empleado;

import java.util.Scanner;

/**
 * Construir un programa que permita gestionar la tabla employees de la bd Classicmodels.
 * Hay que la tabla employees a un objeto Empleado.
 * Crear una clase gestión desde donde podamos gestionar la colleccion de empleados (insertar, eliminar, modificar, buscar, listar).
 * Crear un menú para gestionar la tabla.
 */

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final GestionEmpleados gs = new GestionEmpleados();

    public static void main(String[] args) {
        while (true) {
            switch (mostrarMenu()) {
                case '1':
                    empleadoNuevo();
                    break;
                case '2':
                    borrarEmpleado();
                    break;
                case '3':
                    modificarEmpleado();
                    break;
                case '4':
                    buscarEmpleado();
                    break;
                case '5':
                    gs.mostrarEmpleados();
                    break;
                default:
                    System.out.println("Saliendo del programa");
                    sc.close();
                    return;
            }
        }
    }

    private static void empleadoNuevo() {
        String nombre, apellido, extension, email, codigoOf, cargo;
        int empId, jefeId;
        System.out.println("Introduzca el ID del empleado: ");
        while (true) {
            try {
                empId = sc.nextInt();
                sc.nextLine();
                break;
            } catch (NumberFormatException e) {
                sc.nextLine();
                System.out.println("El ID del empleado debe ser un número entero. Inténtelo de nuevo.");
            }
        }
        System.out.print("Introduzca el apellido del empleado: ");
        apellido = sc.nextLine();
        System.out.print("Introduzca el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.print("Introduzca la extension del empleado: ");
        extension = sc.nextLine();
        System.out.println("Introduzca el email del empleado: ");
        email = sc.nextLine();
        System.out.println("Introduzca el código de oficina del empleado: ");
        codigoOf = sc.nextLine();
        while (true) {
            System.out.println("Introduzca el Id del jefe del empleado: ");
            try {
                jefeId = sc.nextInt();
                sc.nextLine();
                break;
            } catch (NumberFormatException e) {
                sc.nextLine();
                System.out.println("El ID del jefe debe ser un número entero. Inténtelo de nuevo.");
            }
        }
        System.out.println("Introduzca el cargo del empleado: ");
        cargo = sc.nextLine();

        if (gs.insertarEmpleado(empId, apellido, nombre, extension, email, codigoOf, jefeId, cargo)) {
            System.out.println("Empleado insertado correctamente.");
        } else {
            System.out.println("Error al insertar el empleado.");
        }
    }

    private static void borrarEmpleado() {
        int idEmpleado;
        while (true) {
            System.out.print("Introduzca el ID del empleado a eliminar: ");
            try {
                idEmpleado = sc.nextInt();
                sc.nextLine();

                if (gs.eliminarEmpleado(idEmpleado)) {
                    System.out.println("Empleado eliminado correctamente.");
                } else {
                    System.out.println("Error al eliminar el empleado o el empleado no existe.");
                }
                return;
            } catch (NumberFormatException e) {
                sc.nextLine();
                System.out.println("El ID del empleado debe ser un número entero. Inténtelo de nuevo.");
            }
        }
    }

    private static void modificarEmpleado() {


    }

    private static void buscarEmpleado() {
        int idEmpleado;
        while (true) {
            System.out.print("Introduzca el ID del empleado a buscar: ");
            try {
                idEmpleado = sc.nextInt();
                sc.nextLine();

                Empleado empleado = gs.buscarEmpleado(idEmpleado);
                if (empleado != null) {
                    System.out.println("Empleado encontrado:\n" + empleado);
                } else {
                    System.out.println("Empleado no encontrado.");
                }
                return;
            } catch (NumberFormatException e) {
                sc.nextLine();
                System.out.println("El ID del empleado debe ser un número entero. Inténtelo de nuevo.");
            }
        }
    }

    private static char mostrarMenu() {
        String opcion;
        while (true) {
            System.out.print("""
                    ---------------------------------------------------
                    \t\tMENÚ
                    1. Insertar empleado
                    2. Eliminar empleado
                    3. Modificar empleado
                    4. Buscar empleado
                    5. Listar empleados
                    6. Salir
                    Seleccione una opción:\s""");
            opcion = sc.nextLine();
            if (opcion.charAt(0) >= '1' && opcion.charAt(0) <= '6') {
                return opcion.charAt(0);
            }
            System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 6.");
        }
    }
}
