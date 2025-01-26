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

import java.util.ArrayList;

public class Parking {
    private ArrayList<Vehiculo> vehiculosEstacionados;
    private int plazasLibres;

    public Parking() {
        this.vehiculosEstacionados = new ArrayList<>();
        plazasLibres = 200;
    }

    public void entradaVehiculo(String matriculaEntrada) {
        vehiculosEstacionados.add(new Vehiculo(matriculaEntrada));
        plazasLibres--;
    }

    public void salidaVehiculo(Vehiculo vehiculoSalida) {
        vehiculosEstacionados.remove(vehiculoSalida);
        plazasLibres++;
    }

    public void mostrarVehiculosParking() {
        if (vehiculosEstacionados.isEmpty()) {
            System.out.println("El Parking se encuentra vacío");
        } else {
            for (Vehiculo vehiculoAparcado : vehiculosEstacionados) {
                System.out.println(vehiculoAparcado);
            }
        }
    }

    public int mostrarPlazasDisponibles() {
        return plazasLibres;
    }

    public ArrayList<Vehiculo> getVehiculosEstacionados() {
        return vehiculosEstacionados;
    }
}
