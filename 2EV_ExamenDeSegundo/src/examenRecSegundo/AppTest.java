package examenRecSegundo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AppTest {
    static Scanner sc = new Scanner(System.in);
    static Gestion listaEmpleados = new Gestion();

    public static void main(String[] args) {
        int op;

        do {
            op = menu();
            switch (op) {
                case 1:
                    cargar();
                    break;
                case 2:
                    nuevo();
                    break;
                case 3:
                    buscarId();
                    break;
                case 4:
                    buscarNombre();
                    break;
                case 5:
                    buscarClase();
                    break;
                case 6:
                    eliminar();
                    break;
                case 7:
                    orden1();
                    break;
                case 8:
                    orden2();
                    break;
                case 9:
                    guardar();
                    break;
                case 10:
                    consultar();
                    break;
                default:
                    System.out.println("Hasta la próxima");
            }
        } while (op != 11);
        sc.close();
    }

    public static int menu() {
        int op;

        while (true) {
            System.out.print("""
                    \n\n\t\tMENÚ
                    1. Cargar
                    2. Nuevo Trabajador
                    3. Buscar Trabajador por Id
                    4. Buscar Trabajador por Nombre
                    5. Buscar Trabajador por Clase (Comercial o Producción)
                    6. Eliminar Trabajador por Id
                    7. Mostrar lista ordenada por Id
                    8. Mostrar lista ordenada por Nombre
                    9. Guardar en fichero (WIP)
                    10. Consultar BBDD (WIP)
                    11. Salir
                    Seleccionar una opción:\s""");
            try {
                op = sc.nextInt();
                sc.nextLine();
                if (op >= 1 && op <= 11) {
                    return op;
                }
                System.out.println("\nOpción no valida");
            } catch (Exception e) {
                System.out.println("\n\n Error - Insertar opción numérica");
            }
        }
    }

    public static void cargar() {

    }
    public static void nuevo() {
        String nombre, departamento, puesto;
        int id, anno, mes, dia;
        double km, salarioB;

        System.out.print("Ingrese el nombre del nuevo trabajador");
        nombre = sc.nextLine();
        System.out.print("Ingrese el Id del trabajador");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la fecha de nacimiento del trabajador");
        System.out.print("Año: ");
        anno = sc.nextInt();
        sc.nextLine();
        System.out.print("Mes numérico: ");
        mes = sc.nextInt();
        sc.nextLine();
        System.out.print("Día: ");
        dia = sc.nextInt();
        sc.nextLine();
        while (true) {
            System.out.print("Ingrese el departamento del trabajador (Comercial o Producción): ");
            departamento = sc.nextLine().toUpperCase();
            if (departamento.charAt(0) == 'C' || departamento.charAt(0) == 'P') {
                break;
            } else {
                System.out.println("Departamento no valido");
            }
        }
        if (departamento.charAt(0) == 'C') {
            System.out.print("Introducir el nº de Km que realiza el comercial");
            km = sc.nextDouble();
            sc.nextLine();
            System.out.print("Introducir Salario Base");
            salarioB = sc.nextDouble();
            sc.nextLine();

            listaEmpleados.nuevoTrabajador(new Comercial(id,nombre, LocalDate.of(anno,mes,dia),km,salarioB));
        } else {
            System.out.print("Introducir el puesto del trabajador");
            puesto = sc.nextLine().toUpperCase();
            System.out.println();
            System.out.print("Introducir Salario Base");
            salarioB = sc.nextDouble();
            sc.nextLine();

            listaEmpleados.nuevoTrabajador(new Produccion(id,nombre,LocalDate.of(anno,mes,dia),puesto,salarioB));
        }
    }
    public static void buscarId() {
        Trabajador salida;
        System.out.print("Ingrese el id del trabajador a buscar");
        int id = sc.nextInt();
        sc.nextLine();
        salida = listaEmpleados.buscarTrabajador(id);
        if (salida == null) {
            System.out.println("Trabajador no encontrado");
        } else {
            System.out.println(salida);
        }
    }
    public static void buscarNombre() {
        Trabajador salida;
        System.out.println("Ingrese el nombre del trabajador");
        String nombre = sc.nextLine();
        salida=listaEmpleados.buscarTrabajadorNombre(nombre);
        if (salida == null) {
            System.out.println("Trabajador no encontrado");
        } else {
            System.out.println(salida);
        }
    }
    public static void buscarClase() {
        List<Trabajador> salida;
        while(true) {
            System.out.println("Ingrese el nombre del departamento (comercial o produccion)");
            String dep = sc.nextLine().toUpperCase();
            if (dep.equals("COMERCIAL") || dep.equals("PRODUCCION")) {
                salida=listaEmpleados.buscarTrabajadoresClase(dep);
                for (Trabajador t: salida) {
                    System.out.println(t);
                }
                break;
            }
            System.out.println("Departamento no valido");
        }
    }
    public static void eliminar() {
        Trabajador salida;
        System.out.println("Ingrese el id del trabajador");
        int id = sc.nextInt();
        salida = listaEmpleados.buscarTrabajador(id);
        if (salida == null) {
            System.out.println("Trabajador no encontrado");
        }else {
            listaEmpleados.eliminarTrabajador(id);
        }
    }
    public static void orden1(){
        listaEmpleados.mostrarListaOrdenNatural();
    }
    public static void orden2(){
        listaEmpleados.mostrarListaOrdenNombre();
    }
    public static void guardar() {
        
    }
    public static void consultar(){

    }
}
