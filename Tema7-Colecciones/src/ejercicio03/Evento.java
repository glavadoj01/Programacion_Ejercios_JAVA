package ejercicio03;

/*
a. Atributos:
    i. Fecha evento, clase DateTime/LocalDate.
    ii. Descripción, String
    iii. Precio, double
    iv. Lugar, String.
b. Métodos.
    i. Constructor
    ii. Getters y setters
    iii. Redefine toString.
*/

import java.time.LocalDate;

public class Evento implements Comparable<Evento> {
    private LocalDate fechaEvento;
    private String descripcion;
    private double precio;
    private String lugar;

    public Evento(LocalDate fechaEvento, String descripcion, double precio, String lugar) {
        this.fechaEvento = fechaEvento;
        this.descripcion = descripcion;
        this.precio = precio;
        this.lugar = lugar;
    }

    public LocalDate getFechaEvento() {
        return fechaEvento;
    }
    public void setFechaEvento(LocalDate fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "\tFecha Evento = " + fechaEvento +
                "\tDescripción = " + descripcion +
                "\tPrecio = " + precio +
                "\tLugar = " + lugar + "\t}";
    }

    @Override
    public int compareTo(Evento o) {
        return this.fechaEvento.compareTo(o.getFechaEvento());
    }
}
