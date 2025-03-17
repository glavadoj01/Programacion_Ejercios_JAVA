package ejercicio1;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        List<Cliente> listaClientes = new ArrayList<>();
        List<VehiculoAlquilado> listaVehiculosAlquilados = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            Cliente clienteN = new Cliente(String.valueOf(i) + (i) + (i) + (char) ('A' + (i - 1)),
                    "Cliente" + i, "Apellido" + i, "0000" + i);
            listaClientes.add(clienteN);
            Vehiculo vehiculoN = new Vehiculo(String.valueOf(i) + (char) ('A' + (i - 1))+(char) ('A' + (i - 1)),
                    "Marca" + i, "Modelo" + i, 49.99);
            listaVehiculos.add(vehiculoN);
        }

        listaVehiculosAlquilados.add(new VehiculoAlquilado(listaVehiculos.get(0),listaClientes.get(0), LocalDate.now(),3));
        listaVehiculosAlquilados.add(new VehiculoAlquilado(listaVehiculos.get(1),listaClientes.get(1), LocalDate.now(),3));

        for(VehiculoAlquilado e : listaVehiculosAlquilados){
            System.out.println(e);
        }
        System.out.println("Cliente Último Vehiculo: ");
        System.out.println(listaVehiculosAlquilados.getLast().getCliente().getNombreCompleto());
        System.out.println(listaVehiculosAlquilados.getLast().getImporteTotal() + " €");

        for (Vehiculo e : listaVehiculos){
            System.out.println(e);
        }
    }
}
