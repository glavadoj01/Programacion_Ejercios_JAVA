package ejercicio02;

import java.time.LocalDate;

public class Fresco extends Producto {
	private LocalDate fechaEnvasado;
	private String paisOrigen;

	public Fresco(LocalDate fechaEnvasado, String paisOrigen, String idProducto, String descripcion, LocalDate fechaCad,
			int lote) {
		super(idProducto, descripcion, fechaCad, lote);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public LocalDate getFechaEnvasado() {
		return fechaEnvasado;
	}
	public void setFechaEnvasado(LocalDate fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	@Override
	public String toString() {
		return "Producto Fresco {" +
				super.toString() +
				"\nFecha de Envasado = " + fechaEnvasado +
				"\nPais de Origen = " + paisOrigen +
				"\n}";
	}
}
