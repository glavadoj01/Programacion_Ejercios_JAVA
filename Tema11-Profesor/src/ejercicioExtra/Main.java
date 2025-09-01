package ejercicioExtra;

import java.util.Scanner;

/**
 * Construir un programa que permita gestionar la tabla employees de la bd Classicmodels.
 * Hay que descargar la tabla en un ResulSet, leer cada linea e instancias un objeto Empleado y
 * almacenarlo en un ArrayList. Esto es mapear la tabla employees a un objeto Empleado.
 * Crear una clase gestión desde donde podamos gestionar la colleccion de empleados (insertar, eliminar, modificar, buscar, listar).
 * Crear un menú para gestionar la tabla.
 *
 */

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GestionE ge = new GestionE();

        // Insertar un empleado
        int n = ge.obtenerUltimoId();
        ge.insertarEmpleado(new Empleado(n, "Ortiz", "Ramon", "x110",
                "email@suarezf.es", "1", 1002, "Sales Rep"));

        System.out.println(ge.buscarEmpleado(1166));

        ge.eliminarEmpleado(1702);


        ge.modificarEmpleado(ge.buscarEmpleado(n));


        // Eliminar un empleado

        // Modificar un empleadoç

        // Buscar un empleado

        // Listar todos los empleados
        // Listar empleados por nombre
        // Listar empleados por apellidos
        // Listar empleados por oficina
        // Listar empleados por jefe


    }

}
