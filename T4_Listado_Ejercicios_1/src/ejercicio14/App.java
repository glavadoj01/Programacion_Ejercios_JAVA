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

    public static void main(String[] args) {
        GestionEmpleados listaEmpleados = new GestionEmpleados();
        ArrayList<Empleado> empleadosSalida;
        Empleado empleadoSalida;
        boolean continuar = true;
        char op;


        while (continuar) {
            op = menu();
            switch (op) {
                case 'A':
                    break;
                case 'B':
                    break;
                case 'C':
                    break;
                case 'D':
                    break;
                case 'E':
                    break;
                case 'F':
                    break;
                    case 'G':
                        for (Empleado e : listaEmpleados.getListaEmpleados()) {
                            System.out.println(e);
                        }
                        break;
                default:
                    continuar = false;
            }
        }
        escanear.close();
    }

    public static char menu() {
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
            op = escanear.next().charAt(0);
            System.out.println();
            if ((op >= 'A' && op <= 'G') || op == 'S' ) {
                return op;
            } else if ((op >= 'a' && op <= 'g') || op == 's' ) {
                return (char) (op-32);
            }
            System.out.println("Opción no valida");
        }
    }
}
