package ejercicio14;

/*
a. buscarEmpleadoPorId. Recibe un Id de empleado y retorna el empleado con esa Id o null si no lo encuentra.
b. empleadosCorreo. Muestra todos los empleados cuyo correo electrónico contenga una cadena pasada como parámetro.
		Utiliza el metodo “contains” de la clase String. Busca información sobre el mismo.
c. filtrarPorSalario. Muestra id, nombre, apellidos y salario de los empleados cuyo salario está comprendido entre
		un valor mínimo y un máximo pasados como parámetros.
d. actualizaSalario. Actualizar el salario de un empleado. El metodo recibe la Id y el nuevo salario. Retorna true
		si se llevó a cabo el cambio, false en caso contrario.
e. nacidosEn. Recibe un año y muestra los empleados nacidos en ese año (toString).
f. nacidosEn. Recibe un año y un mes y muestra los empleados nacidos ese año y mes (toString).
*/

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner escanear = new Scanner(System.in);
    static GestionEmpleados listaEmpleados = new GestionEmpleados();

    public static void main(String[] args) {
        ArrayList<Empleado> empleadosSalida;
        Empleado empleadoSalida;
        boolean continuar = true, conf;
        char op;

        while (continuar) {
            op = menu();
            switch (op) {
                case 'A':
                    empleadoSalida = buscarId();
                    if (empleadoSalida == null) {
                        System.out.println("No se ha encontrado un empleado con ese Id");
                    } else {
                        System.out.println(empleadoSalida);
                    }
                    break;
                case 'B':
                    empleadosSalida = buscarCorreo();
                    if (empleadosSalida.isEmpty()) {
                        System.out.println("No se ha encontrado un empleado con ese correo o similar");
                    } else {
                        imprArrayList(empleadosSalida);
                    }
                    break;
                case 'C':
                    empleadosSalida = buscarSalario();
                    if (empleadosSalida.isEmpty()) {
                        System.out.println("No se han encontrado empleados con ese rango de salario");
                    } else {
                        imprArrayList2(empleadosSalida);
                    }
                    break;
                case 'D':
                    conf = actualizarSalario();
                    if (conf) {
                        System.out.println("El salario se ha actualizado correctamente");
                    } else {
                        System.out.println("No se ha actualizado el salario");
                    }
                    break;
                case 'E':
                    empleadosSalida = porAnno();
                    if (empleadosSalida.isEmpty()) {
                        System.out.println("No se han encontrado empleados nacidos durante ese año");
                    } else {
                        imprArrayList(empleadosSalida);
                    }
                    break;
                case 'F':
                    empleadosSalida = porMesAnno();
                    if (empleadosSalida.isEmpty()) {
                        System.out.println("No se han encontrado empleados nacidos durante ese año y mes");
                    } else {
                        imprArrayList(empleadosSalida);
                    }
                    break;
                case 'G':
                    listaEmpleados.mostrarTodos();
                    break;
                default:
                    continuar = false;
            }
        }
        escanear.close();
    }

    private static Empleado buscarId() {
        System.out.print("Ingresar Id para buscar: ");
        String num = escanear.nextLine();

        return listaEmpleados.buscarEmpleadoPorId(num);
    }

    private static ArrayList<Empleado> buscarCorreo() {
        System.out.print("Ingresar Correo para buscar: ");
        String correo = escanear.nextLine();

        return listaEmpleados.empleadosCorreo(correo);
    }

    private static ArrayList<Empleado> buscarSalario() {
        System.out.print("Ingresar la cota mínima de Salario: ");
        double a = escanear.nextInt();
        escanear.nextLine();

        System.out.print("Ingresar la cota máxima de Salario: ");
        double b = escanear.nextInt();
        escanear.nextLine();

        return listaEmpleados.filtrarPorSalario(a,b);
    }

    private static boolean actualizarSalario() {
        System.out.print("Ingrese el Id del empleado: ");
        String id = escanear.nextLine();

        System.out.print("Ingrese el Salario nuevo: ");
        double sal = escanear.nextDouble();
        escanear.nextLine();

        return listaEmpleados.actualizarS(id,sal);
    }

    private static ArrayList<Empleado> porAnno() {
        System.out.print("Ingresar un año: ");
        int ano = escanear.nextInt();
        escanear.nextLine();

        return listaEmpleados.nacidosEn(ano);
    }

    private static ArrayList<Empleado> porMesAnno() {
        System.out.print("Ingresar un año: ");
        int ano = escanear.nextInt();
        escanear.nextLine();

        System.out.print("Ingresar un mes (1-12): ");
        int mes = escanear.nextInt();
        escanear.nextLine();

        return listaEmpleados.nacidosEn(ano,mes);
    }

    private static char menu() {
        char op;
        while (true) {
            System.out.print("""
                    \n\t\tMENÚ
                    A - Buscar Empleado por Id
                    B - Buscar por Correo
                    C - Filtrar por Salario
                    D - Actualizar el salario de un empleado
                    E - Filtrar por año de nacimiento
                    F - Filtrar por año y mes de nacimiento
                    G - Mostrar Todos
                    S - Salir
                    Seleccionar una opción:\s""");
            op = escanear.nextLine().charAt(0);
            if((op >= 'A' && op <= 'G') || op == 'S') {
                return op;
            } else if ((op >= 'a' && op <= 'g') || op == 's') {
                return (char) (op - 32);
            }
            System.out.println("Opción no valida");
        }
    }

    private static void imprArrayList(ArrayList<Empleado> empleados) {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }

    private static void imprArrayList2(ArrayList<Empleado> empleados) {
        for (Empleado e : empleados) {
            System.out.println("Empleado{Id = " + e.getId() + ",\tNombre = " + e.getNombre() +
                                ",\tApellido = " + e.getApellido() + ",\tSalario = " + e.getSalario());
        }
    }
}
 