package Examenes.segundo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    GestionServicios g;
    List<Servicios> lista;

    public static void main(String[] args) {

        Main p = new Main();
        p.init();

    }

    private void init() {
        boolean salir = false;
        int opcion;

        g = new GestionServicios();
        lista = new ArrayList<>();
        do {
            showMenu();
            opcion = sc.nextInt();
            sc.nextLine(); //limpia el buffer;
            switch (opcion) {
                case 1://Nuevo Servicio
                    Servicios s = insertarNuevoServicio();
                    g.addServicio(s);
                    break;
                case 2://mostrar todos los empleados
                    g.mostrarEmpleados();
                    break;
                case 3://Buscar servicio por nombre empleado
                    System.out.println("Introduce nombre del empleado:");
                    lista =g.buscarServiciosPorEmpleado(sc.nextLine());
                    for (Servicios srv : lista) {
                        System.out.println(srv.mostrarServicio());
                    }
                    break;
                case 4://Buscar Servicios por Cliente
                    System.out.println("Introduce nombre del cliente:");
                    lista =g.buscarServiciosPorCliente(sc.nextLine());
                    for (Servicios srv : lista) {
                        System.out.println(srv.mostrarServicio());
                    }
                    break;
                case 5://Devuelve lista Servicios de una clase(TrabajoPintura o RevisionAlarma)
                    System.out.println("Introduce clase");
                    lista = g.ListarServiciosTipo(sc.nextLine());
                    for (Servicios srv : lista) {
                        System.out.println(srv.toString());
                    }
                    break;
                case 6://Buscar si un servicio si está repetido, 1=no repetido, >1 si
                    System.out.println("Introduce Id de un servicio:");
                    Servicios s1 = g.buscarServicio(sc.nextInt());
                    if (g.buscarRepetidos(s1) > 1) {
                        System.out.println("Si hay servicios repetidos");
                    } else {
                        System.out.println("No hay servicios repetidos");
                    }
                    break;
                case 7://Eliminar servicio por Id
                    System.out.println("Introduce Id del servicio:");
                    if (g.eliminarServicio(sc.nextInt())) {
                        System.out.println("Eliminado servicio");
                    } else {
                        System.out.println("No se encuentra id");
                    }
                    break;
                case 8://Mostrar lista ordenada por fecha de inicio del servicio(orden natural inverso)
                    g.ordenarServicios();;
                    break;
                case 9://Mostrar lista ordenada por cliente
                    g.ordenarServiciosPorCliente();
                    break;
                case 10://Guardar
                    g.guardarServicios();
                    break;
                case 11://Salir
                    salir = true;
                    break;
                default:
                    System.out.println("Debe elegir una opción del menú.");
            }

        } while (!salir);

    }

    private Servicios insertarNuevoServicio() {
        int idServicio, id, numeroSensores;
        String nombre, cliente, tipo;
        LocalDate fecha_inicio;
        double metrosCuadrados, precioMetroCuadrado;

        System.out.println("Nuevo Servicio\n" +
                "Tipo de Servicio (RevisionAlarma, TrabajoPintura):");
        System.out.println("IdServicio:");
        idServicio = sc.nextInt();//si el id se calcula automaticamente no hay que enviarlo
        System.out.println("Nuevo trabajador, Id:");
        id = sc.nextInt();
        sc.nextLine();//limpia el buffer
        System.out.println("Nombre del trabajador:");
        nombre = sc.nextLine();
        Empleado e = new Empleado(id, nombre);
        System.out.println("Fecha inicio (dd/mm/yyyy):");
        fecha_inicio = LocalDate.parse(sc.nextLine(), Util.FORMATO);//dd/mm/yyyy
        System.out.println("Cliente:");
        cliente = sc.nextLine();
        System.out.println("El servicio es RevisionAlarma S/N?");
        if (sc.nextLine().toUpperCase().equals("S")) {
            System.out.println("Numero de sensores:");
            numeroSensores = sc.nextInt();
            sc.nextLine();
            return new RevisionAlarma(idServicio, e, fecha_inicio, cliente, numeroSensores);
        } else { //en caso contrario es de Produccion
            System.out.println("metros cuadrados:");
            metrosCuadrados = sc.nextDouble();
            System.out.println("precio metro cuadrado:");
            precioMetroCuadrado = sc.nextDouble();
            sc.nextLine();
            return new TrabajoPintura(idServicio, e, fecha_inicio, cliente, metrosCuadrados, precioMetroCuadrado);
        }
    }

    private void showMenu() {

        System.out.println("-----MENU-----\n" +
                "1 Nuevo Servicio\n" +
                "2 Mostrar todos los empleados\n" +
                "3 Buscar Servicios de un empleado\n" +
                "4 Buscar Servicios de un cliente\n" +
                "5 Buscar Servicios de un tipo\n" +
                "6 Buscar si un Servicio está repetido\n" +
                "7 Eliminar Servicio por Id\n" +
                "8 Mostrar lista ordenada por fecha\n" +
                "9 Mostrar lista ordenada por cliente\n" +
                "10 Guardar\n" +
                "11 Salir\n");
    }

}
