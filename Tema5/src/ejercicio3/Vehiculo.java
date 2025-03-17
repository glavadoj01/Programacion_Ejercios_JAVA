package ejercicio3;

public class Vehiculo {
	private String matricula;
	private String marca;
	private String modelo;
	private double tarifa;
	private boolean disponible;
	
	public Vehiculo(String matricula, String marca, String modelo, double tarifa, boolean disponible) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tarifa = tarifa;
		this.disponible = disponible;
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", tarifa=" + tarifa
				+ ", disponible=" + disponible + "]";
	}
}
