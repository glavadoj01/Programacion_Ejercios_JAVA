package ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionAlquileres {
	private ArrayList<VehiculoAlquilado> alquilados = new ArrayList<> ();

	public GestionAlquileres() {

		alquilados.add(new VehiculoAlquilado(new Cliente(1, "Ana" ,"Robles Paz"),
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 5));
		alquilados.add(new VehiculoAlquilado(new Cliente(2, "Luis" ,"Santo Paz"),
				new Vehiculo("1111-BMC", "Renault", "Clio",25, true),
				LocalDate.now(), 1));
		alquilados.add(new VehiculoAlquilado(new Cliente(3, "Gema" ,"D�az Paz"),
				new Vehiculo("1233-BMC", "Seat", "Ibiza",20, true),
				LocalDate.now(), 9));
		alquilados.add(new VehiculoAlquilado(new Cliente(4, "Tom�s" ,"Sanz Eno"),
				new Vehiculo("1290-BMC", "Volvo", "XC90", 120, true),
				LocalDate.now(), 11));
		alquilados.add(new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"),
				new Vehiculo("9090-BMC", "Volkswagen", "Golf", 34, true),
				LocalDate.now(), 10));
		alquilados.add(new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"),
				new Vehiculo("9091-BMC", "Volkswagen", "Passat", 54, true),
				LocalDate.of(2021, 1, 14), 10));
		alquilados.add(new VehiculoAlquilado(new Cliente(5, "Eva" ,"Cansino Roble"),
				new Vehiculo("1200-BMC", "Seat", "Ibiza",20, true),
				LocalDate.of(2021, 01, 1), 10));
	}
	
	public Cliente getClienteAlquiler(String matricula) {
		for (VehiculoAlquilado x : alquilados) {
			if (x.getVehiculo().getMatricula().equals(matricula)) {
				return x.getCliente();
			}
		}
		return null;
	}
	
	public int contarAlquileresCliente(int idCliente) {
		int contador = 0;
		for (VehiculoAlquilado x : alquilados) {
			if (x.getCliente().getId() == idCliente) {
				contador++;
			}
		}
		return contador;
	}
	
	public double sumaImporteTodosAlquileres() {
		double suma = 0;
		for (VehiculoAlquilado x : alquilados) {
			suma += x.getImporteAlquiler();
		}
		return suma/(double) alquilados.size ();
	}
	
	public void mostrarAlquileresMatricula(String matricula) {
		for (VehiculoAlquilado x : alquilados) {
			if (x.getVehiculo().getMatricula().equals(matricula)) {
				System.out.println(x);
			}
		}
	}
}
