package ejercicio10;

/*
Diseña un programa Java que gestione un Parking con capacidad para 200 vehículos.
        a. Cada vez que entra un vehículo en el parking guardamos su matrícula, el
            instante en que entró en milisegundos y decrementamos el contador de plazas
            disponibles.
        b. Cuando un vehículo deja el parking libera una plaza.
        c. El precio del segundo es de 0,015 euros. Antes de salir, el propietario debe
            pagar el importe en función del tiempo que el vehículo estuvo en el parking.

En definitiva, debemos crear:
        - clase Vehículo con los atributos matrícula e instante de entrada (LocalDateTime).
        - clase Parking.
                - Atributos:
                    - arrayList de 200 vehículos como máximo.
                    - plazas libres
                - Métodos:
                    - entradaVehículo
                    - salidaVehículo
                    - mostrarVehiculosParking
                    - mostrarPlazasDisponibles
*/

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main10 {
    static Scanner escanear = new Scanner(System.in);
    static Parking listaGestion = new Parking();

    public static void main(String[] args) {
        boolean salir = false;
        int opcion;

        while (!salir) {
            opcion = menu();
            switch (opcion) {
                case 1:
                    crearVehiculo();
                    break;
                case 2:
                    sacarVehiculo();
                    break;
                case 3:
                    listaGestion.mostrarVehiculosParking();
                    break;
                case 4:
                    System.out.println("Actualmente, hay " +
                            listaGestion.mostrarPlazasDisponibles() + " plazas disponibles");
                    break;
                default:
                    salir = true;
            }
        }
        escanear.close();
    }

    public static void crearVehiculo() {
        String matricula;
        if (listaGestion.mostrarPlazasDisponibles() > 0) {
            System.out.println("Ingrese la matricula del vehiculo");
            matricula = escanear.nextLine();
            listaGestion.entradaVehiculo(matricula);
        } else {
            System.out.println("¡El Parking está completo!");
        }
    }

    public static void sacarVehiculo() {
        boolean confirmacion = false;

        if (listaGestion.getVehiculosEstacionados().isEmpty()) {
            System.out.println("El Parking se encuentra vacío");
        } else {
            System.out.println("Ingrese la mátricula del vehiculo que desea sacar: ");
            String matriculaSalida = escanear.nextLine();
            for (Vehiculo aparcado : listaGestion.getVehiculosEstacionados()) {
                if (aparcado.getMatricula().equals(matriculaSalida)) {
                    System.out.println("El vehiculo se encuentra registrado");
                    cobrarVehiculo(aparcado);
                    listaGestion.salidaVehiculo(aparcado);
                    confirmacion = true;
                    break;
                }
            }
            if (!confirmacion) {
                System.out.println("El vehiculo no se encuentra registrado");
            }
        }
    }

    public static int menu() {
        int opcion;
        while (true) {
            System.out.print("""
                    
                    \t\tMENÚ
                    1. Entrada de Vehículo
                    2. Salida de Vehículo
                    3. Mostrar Lista de Vehículos Estacionados
                    4. Mostrar Plazas Disponibles
                    5. Salir
                    Seleccionar una opción:\s""");
            opcion = escanear.nextInt();
            escanear.nextLine();
            if (opcion >= 1 && opcion <= 5) {
                break;
            } else {
                System.out.println("Opción no valida");
            }
        }
        System.out.println();
        return opcion;
    }

    public static void cobrarVehiculo(Vehiculo aparcado) {
        final double tarifa = 0.015; // € por segundo estacionado
        Duration periodo = Duration.between(aparcado.getHoraEntrada(), LocalDateTime.now());
        double tiempo = (double) periodo.toSeconds();

        System.out.printf("El importe asciende a %.2f €\n", (tarifa * tiempo));
    }
}
