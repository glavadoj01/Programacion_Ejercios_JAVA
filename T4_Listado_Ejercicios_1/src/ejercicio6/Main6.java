package ejercicio6;
/*
Diseña un programa Java que trabaje con la clase Alumno del ejercicio 5, copiándola
y pegándola en este. Crea otra clase llamada GestionAlumnos con las siguientes características:
    - Atributos: Array List de Alumnos
    - Métodos:
            - llenarArray, rellena el array de alumnos con datos.
            - mostrarAlumnos, muestra en pantalla cada alumno y su nota media.
            - mostrarNotas, muestra nº de expediente, nombre y nota media de cada alumno.
            - buscarAlumnoPorNumeroExpediente. Recibe como parámetro un nº de expediente
                y devuelve/retorna al alumno con ese nº expediente, o null si no lo encuentra.
    - Prueba la clase GestionAlumnos.
*/

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        GestionAlumnos listaAlumnos = new GestionAlumnos();
        boolean salir = false;
        int expedienteBuscar;
        int op;

        do {
            menu();
            op = escanear.nextInt();
            switch (op) {
                case 1:
                    listaAlumnos.mostrarAlumnos();
                    break;
                case 2:
                    listaAlumnos.mostrarNotas();
                    break;
                case 3:
                    System.out.print("Introduzca un nº de expediente para buscar: ");
                    expedienteBuscar = escanear.nextInt();
                    Alumno alumnoBuscado = listaAlumnos.buscarAlumnoPorNumeroExpediente(expedienteBuscar);
                    if (alumnoBuscado == null) {
                        System.out.println("No existe el expediente para buscar");
                    } else {
                        System.out.println(alumnoBuscado);
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("ERROR - Opción no valida");
            }
        } while (!salir);
    }

    public static void menu() {
        System.out.println("""
                1 - Mostrar Alumnos
                2 - Mostrar Notas
                3 - Buscar Alumno
                4 - Salir
                Selecciona una opción:
                """);
    }
}
