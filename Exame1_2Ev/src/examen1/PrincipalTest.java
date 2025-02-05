package examen1;

import java.util.Scanner;

public class PrincipalTest {
    static Scanner escanear = new Scanner(System.in);
    static Agenda agenda = new Agenda();

    public static void main(String[] args) {
        boolean continuar = true;
        char op;

        while (continuar) {
            op = menu();
            switch (op) {
                case '1':
                    nuevoC();
                    break;
                case '2':
                    buscarC();
                    break;
                case '3':
                    modificarC();
                    break;
                case '4':
                    eliminarC();
                    break;
                case '5':
                    agenda.listadoDeContactos();
                    break;
                case '6':
                    borrarTODO(); // Mayúsculas para dar énfasis, CUIDADO
                    break;
                default:
                    continuar = false;
            }
        }
    }

    private static char menu() {
        char op;
        while (true) { // Siempre uso print en lugar de println para preguntar al usuario
            System.out.print("""
                    \n\t\tMENÚ
                    1 Nuevo contacto
                    2 Buscar contacto
                    3 Modificar contacto
                    4 Eliminar contacto
                    5 Listado de contactos
                    6 Vaciar agenda
                    7 Salir
                    Seleccionar una opción:\s""");
            op = escanear.nextLine().charAt(0);
            if (op >= '1' && op <= '7') {
                return op;
            }
            System.out.println("\nError - Opción no valida"); // Aprovecho y dejo un espacio ádemas de la línea nueva
        }
    }

    private static void nuevoC() {
        String nombre, telefono;
        System.out.println("***NUEVO CONTACTO***");
        System.out.print("\nIngresar Nombre: ");
        nombre = escanear.nextLine();
        System.out.print("\nIngresar Telefono: ");
        telefono = escanear.nextLine();

        agenda.nuevoContacto(new Contacto(nombre, telefono));
    }

    public static void buscarC() {
        char c;
        int id;
        String nombre;
        Contacto contactoBuscado;

        while (true) { // Selector por Id o Nombre
            System.out.println("¿Buscar por Id o por Nombre?");
            System.out.print("Responder I o N: ");
            c = escanear.nextLine().charAt(0);
            if (c == 'I' || c == 'N') {

                break;
            }
            else if (c == 'i' || c == 'n') {
                c = (char) (c-32);
                break;
            }
            System.out.println("\nError - Opción no valida");
        }
        // Para buscar por Id
        if (c == 'I') {
            System.out.print("Ingresar Id para buscar: ");
            id = escanear.nextInt();
            escanear.nextLine();

            contactoBuscado = agenda.buscarContacto(id);
        }
        // Para buscar por nombre
        else {
            System.out.print("Ingresar Nombre para buscar: ");
            nombre = escanear.nextLine();

            contactoBuscado = agenda.buscarContacto(nombre);
        }

        // Resultado
        if (contactoBuscado == null) {
            System.out.println("Contacto no encontrado");
        } else {
            System.out.println(contactoBuscado);
        }
    }

    public static void modificarC() {
        Contacto contactoM;
        int id;
        String nombre, telefono;


        System.out.print("Ingrese un id para modificar el contacto: ");
        id = escanear.nextInt();
        escanear.nextLine();
        contactoM = agenda.buscarContacto(id);
        if (contactoM == null) {
            System.out.println("Contacto no encontrado");
        }else {
            System.out.println(contactoM);
            System.out.print("\nIntroducir nuevo Nombre: ");
            nombre = escanear.nextLine();
            System.out.print("Introducir nuevo Telefono: ");
            telefono = escanear.nextLine();

            agenda.modificarContacto(contactoM, nombre, telefono);
            System.out.println(contactoM);
        }
    }

    public static void eliminarC() {
        Contacto contactoE;
        boolean eliminado = false;
        int id;
        char conf;

        System.out.print("Ingrese un id para eliminar el contacto: ");
        id = escanear.nextInt();
        escanear.nextLine();
        contactoE = agenda.buscarContacto(id);

        if (contactoE == null) {
            System.out.println("Contacto no encontrado");
        } else {
            System.out.println(contactoE);
            System.out.print("\n¿Seguro que quiere eliminar este contacto? (S/N)\s\s");
            conf = escanear.nextLine().charAt(0);
            if (conf == 'S' || conf == 's') {
                eliminado = agenda.eliminarContacto(contactoE);
            }

            if (eliminado) {
                System.out.println("Contacto eliminado");
            } else {
                System.out.println("Proceso abortado");
            }
        }
    }

    public static void borrarTODO() {
        char conf;

        System.out.print("\n¿Seguro que quiere vaciar la agenda? (S/N)\s\s");
        conf = escanear.nextLine().charAt(0);
        if (conf == 'S' || conf == 's') {
            agenda.vaciarAgenda();
        } else {
            System.out.println("Proceso abortado");
        }
    }
}
