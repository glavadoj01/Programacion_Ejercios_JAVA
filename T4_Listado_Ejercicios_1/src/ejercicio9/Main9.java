package ejercicio9;

/*
Diseña también una clase llamada GestionProgramas que contendrá:
        - un ArrayList de elementos de la clase Programa
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

import java.time.LocalDate;
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
                    salidaPrograma = crearProgramaNuevo();
                    listaGestion.agregarProgramaEnLista(salidaPrograma);
                    break;
                case 2:
                    listaGestion.mostrarLista();
                    break;
                case 3:
                    Licencia.mostrarLicencias();
                    salidaLista.clear();
                    System.out.print("Ingresar un tipo de Licencia (expresión entre paréntesis) para buscar: ");
                    buscar = escanear.next().toUpperCase();
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
                    Funcion.mostrarFunciones();
                    salidaLista.clear(); // Como uso la variable "salidaLista" en dos apartados,
                                        // o por si repite el mismo varias veces, pues la vacío
                    System.out.print("Ingresar un tipo de Función (expresión entre paréntesis) para buscar: ");
                    buscar = escanear.next().toUpperCase(); // Pregunto al usuario y guardo el String que quiere buscar
                    salidaLista = listaGestion.filtarFuncion(buscar); // Hasta aquí me da igual que luego sea un enum o lo que sea
                    // el usuario introduce un String, se lo paso a mi metodo y me devuelve una lista de programas que tienen esa función
                    // Y si no hay ninguno? => Devuelve "empety" o null, o algo así.
                    if (salidaLista.isEmpty()) { //Si la lista que sale esta vacia, imprime esto, y si no
                        System.out.println("No existe ningún programa con ese tipo de Función");
                    } else { // imprimo todos los que hayan salido
                        for (ProgramaSoftware programa : salidaLista) {
                            // para cada "Objeto Programa" que llamo aquí "programa" tmb (muy original) en la lista: "salidaLista"
                            // for each = por cada
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
        escanear.close();
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

    public static ProgramaSoftware crearProgramaNuevo() {
        ProgramaSoftware nuevo = new ProgramaSoftware();
        String valor;
        double num;
        int[] fechas = new int[3];

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

        System.out.println("Ingrese el año de lanzamiento: ");
        fechas[0] = escanear.nextInt();
        System.out.println("Ingrese el mes de lanzamiento: ");
        fechas[1] = escanear.nextInt();
        System.out.println("Ingrese el día de lanzamiento: ");
        fechas[2] = escanear.nextInt();
        nuevo.setAnnoLanzamiento(LocalDate.of(fechas[0], fechas[1], fechas[2]));

        System.out.println("Introduzca la Desarrolladora: ");
        valor = escanear.nextLine();
        nuevo.setDesarrolladora(valor);

        while (true) {
            Licencia.mostrarLicencias();
            System.out.print("Introduzca la Licencia del programa: ");
            valor = escanear.nextLine().toUpperCase();
            if (Licencia.esLicenciaPrograma(valor)) {
                break;
            }
            System.out.println("ERROR - Elegir función enumerada");
        }
        nuevo.setLicencia(Licencia.valueOf(valor));

        System.out.println("Introduzca el precio del programa: ");
        num = escanear.nextDouble();
        nuevo.setPrecio(num);

        return nuevo;
    }
}
