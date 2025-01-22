package ejercicio9;

/*
Diseña también una clase llamada GestionProgramas que contendrá:
        - un ArrayList de 25 elementos de la clase Programa
        - métodos que sirvan para programar las funciones del siguiente menú:
Menú
1. Insertar nuevo programa (controlar elementos libres)
2. Mostrar lista de software
3. Filtrar por licencia
4. Filtrar por función
5. Eliminar el último elemento
6. Buscar programa por nombre y retornar programa
7. Salir
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main9 {
    static Scanner escanear = new Scanner(System.in);

    public static void main(String[] args) {
        GestionProgramas listaGestion = new GestionProgramas();
        ArrayList<ProgramaSoftware> salidaLista = new ArrayList<>();
        ProgramaSoftware salidaPrograma;
        String buscar;
        boolean salir = false;
        int op;

        while (!salir) {
            menu();
            op = escanear.nextInt();
            escanear.nextLine();
            System.out.println();
            switch (op) {
                case 1:
                    insertarProgramaNuevo();
                    break;
                case 2:
                    listaGestion.mostrarLista();
                    break;
                case 3:
                    salidaLista.clear();
                    System.out.print("Ingresar un tipo de licencia para buscar: ");
                    buscar = escanear.next();
                    salidaLista = listaGestion.filtarLicencia(buscar);
                    if (salidaLista.isEmpty()) {
                        System.out.println("No existe ningún programa con esa licencia");
                    } else {
                        for (ProgramaSoftware programa : salidaLista) {
                            System.out.println(programa);
                        }
                    }
                    break;
                case 4:
                    salidaLista.clear();
                    System.out.print("Ingresar un tipo de Función para buscar: ");
                    buscar = escanear.next();
                    salidaLista = listaGestion.filtarFuncion(buscar);
                    if (salidaLista.isEmpty()) {
                        System.out.println("No existe ningún programa con ese tipo de Función");
                    } else {
                        for (ProgramaSoftware programa : salidaLista) {
                            System.out.println(programa);
                        }
                    }
                    break;
                case 5:
                    listaGestion.eliminarUltimoPrograma();
                    break;
                case 6:
                    System.out.print("Ingresar el nombre de un programa para buscar: ");
                    buscar = escanear.nextLine();
                    salidaPrograma = listaGestion.buscarNombre(buscar);
                    if (salidaPrograma == null) {
                        System.out.println("No existe un programa con ese nombre");
                    } else {
                        System.out.println(salidaPrograma);
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("ERROR - Opción no valida");
            }
        }
    }

    public static void menu() {
        System.out.println("""
                \n\t\tMENÚ
                1. Insertar nuevo programa
                2. Mostrar lista de software
                3. Filtrar por licencia
                4. Filtrar por función
                5. Eliminar el último elemento
                6. Buscar programa por nombre y retornar programa
                7. Salir
                Introducir opción numérica:""");
    }

    public static void insertarProgramaNuevo() {
        ProgramaSoftware nuevo = new ProgramaSoftware();
        String valor;
        int num;

        System.out.print("Ingrese el nombre del programa: ");
        valor = escanear.nextLine();
        nuevo.setNombre(valor);

        System.out.print("Introduzca la versión del programa: ");
        valor = escanear.nextLine();
        nuevo.setVersion(valor);

        while (true) {
            Funcion.mostrarFunciones();
            System.out.print("Introduzca la Función del programa: ");
            valor = escanear.nextLine().toUpperCase();
            if (Funcion.esFuncionPrograma(valor)) {
                break;
            }
            System.out.println("ERROR - Elegir función enumerada");
        }
        nuevo.setFuncion(Funcion.valueOf(valor));


        System.out.println("Introduzca la Desarrolladora: ");

        while (true) {
            Licencia.mostrarLicenciass();
            System.out.print("Introduzca la Licencia del programa: ");
            valor = escanear.nextLine().toUpperCase();
            if (Licencia.esLicenciaPrograma(valor)) {
                break;
            }
            System.out.println("ERROR - Elegir función enumerada");
        }
        nuevo.setLicencia(Licencia.valueOf(valor));
    }
}
