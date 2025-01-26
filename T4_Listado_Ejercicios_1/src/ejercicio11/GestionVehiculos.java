package ejercicio11;

/*
Diseña una segunda clase llamada GestionVehiculos, que tendrá un array list vehículos como atributo.
Esta clase tendrá los métodos:
    + filtrarPorConsumo: recibe un parámetro double relativo al consumo y devolverá una lista de
                         los vehículos con un consumo igual o inferior al pasado.
    + mostrarTodos: que imprimirá en pantalla datos de todos los vehículos.
    + precioMedioAlquiler: devolverá un double con este dato.
*/

import java.util.ArrayList;
import java.util.Random;

public class GestionVehiculos {
    private ArrayList<Vehiculo> catalogoVehiculos;

    public GestionVehiculos() {
        this.catalogoVehiculos = new ArrayList<>();
        cargarAutosPrueba(); // Muestra de 4 vehículos completos y 10 parciales
    }

    public ArrayList<Vehiculo> filtarPorConsumo(double consumoMaximo) {
        ArrayList<Vehiculo> listaFiltrada = new ArrayList<>();
        for (Vehiculo vehiculo : catalogoVehiculos) {
            if (vehiculo.getConsumoMedio() <= consumoMaximo) {
                listaFiltrada.add(vehiculo);
            }
        }
        return listaFiltrada;
    }

    public void mostrarTodos() {
        if (catalogoVehiculos != null) {
            for (Vehiculo vehiculo : catalogoVehiculos) {
                System.out.println(vehiculo);
            }
        } else {
            System.out.println("No hay vehículos en el catalogo");
        }
    }

    public double precioMedioAlquiler() {
        if (catalogoVehiculos.isEmpty()) {
            return 0;
        }

        double precio = 0;
        for (Vehiculo vehiculo : catalogoVehiculos) {
            precio += vehiculo.getPrecioDiario();
        }
        return precio/(catalogoVehiculos.size());
    }

    public void cargarAutosPrueba() {
        Random rand = new Random();
        catalogoVehiculos.add(new Vehiculo("11111A", "Dacia", "Duster", 150, 32,45));
        catalogoVehiculos.add(new Vehiculo("22222B", "Dacia", "Duster", 150, 32,45));
        catalogoVehiculos.add(new Vehiculo("33333C", "Ford", "Mondeo", 120, 40,20));
        catalogoVehiculos.add(new Vehiculo("44444B", "Seat", "Panda", 666, 15,30));
        catalogoVehiculos.add(new Vehiculo("12345A",20));
        catalogoVehiculos.add(new Vehiculo("12345B",20));
        catalogoVehiculos.add(new Vehiculo("12345C",20));
        catalogoVehiculos.add(new Vehiculo("12345D",20));
        catalogoVehiculos.add(new Vehiculo("12345E",20));
        catalogoVehiculos.add(new Vehiculo("12345F",20));
        catalogoVehiculos.add(new Vehiculo("12345G",40));
        catalogoVehiculos.add(new Vehiculo("12345H",40));
        catalogoVehiculos.add(new Vehiculo("12345I",50));
        catalogoVehiculos.add(new Vehiculo("12345J",60));

        for (int i = 1; i <= 14; i=i+2 ) {
            catalogoVehiculos.get(i).setDisponible(false);
        }

        for (int i = 4; i <= 13; i++ ) {
            catalogoVehiculos.get(i).setConsumoMedio(rand.nextDouble(10,50));
            catalogoVehiculos.get(i).setPotencia(rand.nextDouble(100,300));
        }
    }
}
