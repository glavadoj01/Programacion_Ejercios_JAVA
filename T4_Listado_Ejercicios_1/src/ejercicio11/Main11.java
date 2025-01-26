package ejercicio11;

/*
Diseña un programa Java que sirva para gestionar los vehículos de una empresa de alquiler.

  - De cada vehículo se guarda matrícula, marca, modelo, potencia, consumo
    medio y precio de alquiler diario. Diseña la clase Vehículo con los atributos
    que se han indicado, getters/setters y constructor. Diseña también un segundo
    constructor que reciba como parámetros la matrícula y el precio diario de
    alquiler.

  - Diseña una segunda clase llamada GestionVehiculos, que tendrá un array list vehículos como atributo.
        Esta clase tendrá los métodos:
            + filtrarPorConsumo: recibe un parámetro double relativo al consumo y devolverá una lista de
                                 los vehículos con un consumo igual o inferior al pasado.
            + mostrarTodos: que imprimirá en pantalla datos de todos los vehículos.
            + precioMedioAlquiler: devolverá un double con este dato.

  - Desde el main crea un objeto de la clase GestionVehiculos y llama a sus métodos
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Main11 {
    static Scanner escanear = new Scanner(System.in);

    public static void main(String[] args) {
        GestionVehiculos catalogoAlquiler = new GestionVehiculos();
        ArrayList<Vehiculo> listaFiltrada = new ArrayList<>();
        boolean continuar = true;
        int opcion;
        double consumo;

        while (continuar) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el consumo máximo buscado: ");
                    consumo = escanear.nextDouble();
                    escanear.nextLine();
                    listaFiltrada = catalogoAlquiler.filtarPorConsumo(consumo);
                    listaFiltrada.forEach( vehiculo -> {
                        System.out.println(vehiculo);
                    });
                    break;
                case 2:
                    catalogoAlquiler.mostrarTodos();
                    break;
                case 3:
                    System.out.printf("\nEl precio medio de los vehículos en catálogo es de %.2f € al día\n", catalogoAlquiler.precioMedioAlquiler());
                    break;
                default:
                    continuar = false;
            }
        }
    }

    public static int menu() {
        int op;
        while (true) {
            System.out.print("""
                    \n\t\tMENÚ
                    1 - Filtrar por consumo máximo
                    2 - Mostrar Catálogo
                    3 - Mostrar Precio Medio de Alquiler en el catálogo
                    4 - Salir
                    Seleccionar una opción numérica:\s""");
            op = escanear.nextInt();
            escanear.nextLine();
            if (op >= 1 && op <= 4) {
                System.out.println();
                return op;
            }
            System.out.println("Error - Selección no valida");
        }
    }
}
