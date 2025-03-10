package ejercicio7;

import java.time.LocalDate;

public class Fresco extends Producto {
    private LocalDate fechaEnvasado;
    private String paisOrigen;

    public Fresco(String idproducto, String descripcion, LocalDate fechaCad, int nLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(idproducto, descripcion, fechaCad, nLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }
    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    public String getPaisOrigen() {
        return paisOrigen;
    }
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "\nProducto Fresco {" +
                super.toString() +
                "\nFecha Envasado = " + getFechaEnvasado() +
                "\nPais de Origen = " + getPaisOrigen() +
                "\n}";
    }

    @Override
    boolean estaCaducado() {
        return getFechaCad().isBefore(LocalDate.now());
    }
}
