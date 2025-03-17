package ejercicio8;

import java.time.LocalDate;

public class Refrigerado extends Producto {

	private String codigo;

	public Refrigerado(String codigo, String idProducto, String descripcion, LocalDate fechaCad, int lote) {
		super(idProducto, descripcion, fechaCad, lote);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "\nProducto Refrigerado {" +
				super.toString() +
				"\nCódigo del Organismo de Supervisión Alimentaria = " + codigo +
				"\n}";
	}
}