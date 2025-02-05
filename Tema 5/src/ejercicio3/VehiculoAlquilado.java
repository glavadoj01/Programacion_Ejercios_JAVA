package ejercicio3;

import java.time.LocalDate;

public class VehiculoAlquilado {
	
	private Cliente cliente;
	private Vehiculo vehiculo;
	private LocalDate fechaAlquiler;
	private int numeroDias;
	
	
	public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate fechaAlquiler, int numeroDias) {
		this.cliente = cliente;
		this.vehiculo = vehiculo;
		this.fechaAlquiler = fechaAlquiler;
		this.numeroDias = numeroDias;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public LocalDate getFechaAlquiler() {
		return fechaAlquiler;
	}
	public void setFechaAlquiler(LocalDate fechaAlquiler) {
		this.fechaAlquiler = fechaAlquiler;
	}
	public int getNumeroDias() {
		return numeroDias;
	}
	public void setNumeroDias(int numeroDias) {
		this.numeroDias = numeroDias;
	}

	@Override
	public String toString() {
		return "VehiculoAlquilado \n" +
				cliente + "\n" +
				vehiculo + "\n" +
				"fechaAlquiler=" + fechaAlquiler + "\n" +
				"numeroDias=" + numeroDias;
	}
	
	public double getImporteAlquiler() {
		//return this.numeroDias * this.getVehiculo().getTarifa();
		return getNumeroDias() * vehiculo.getTarifa();
	}
}
