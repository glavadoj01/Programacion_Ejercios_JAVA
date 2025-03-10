package ejercicio7;

import java.time.LocalDate;

public class Congelado extends Producto {
    private double tempCong;

    public Congelado(String idproducto, String descripcion, LocalDate fechaCad, int nLote, double tempCong) {
        super(idproducto, descripcion, fechaCad, nLote);
        this.tempCong = tempCong;
    }

    public double getTempCong() {
        return tempCong;
    }
    public void setTempCong(double tempCong) {
        this.tempCong = tempCong;
    }

    @Override
    boolean estaCaducado() {
        return getFechaCad().isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        return "\nProducto Congelado {" +
                super.toString() +
                "\nTemperatura de Congelación Recomendada = " + getTempCong() +
                "\n}";
    }
}
