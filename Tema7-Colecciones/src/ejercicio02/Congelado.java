package ejercicio02;

import java.time.LocalDate;

// El simpleName es \/ Ese, el nombre de la clase convertido en String
public class Congelado extends Producto {
	
	private double temperaturaCon;

    public Congelado(double temperaturaCon, String idProducto, String descripcion, LocalDate fechaCad, int lote) {
        super(idProducto, descripcion, fechaCad, lote);
        this.temperaturaCon = temperaturaCon;
    }

    public double getTemperaturaCon() {
        return temperaturaCon;
    }
    public void setTemperaturaCon(double temperaturaCon) {
        this.temperaturaCon = temperaturaCon;
    }

    @Override
    public String toString() {
        return "\nProducto Congelado {" +
                super.toString() +
                "\nTemperatura de Congelación Recomendada = " + temperaturaCon +
                "\n}";
    }
}
