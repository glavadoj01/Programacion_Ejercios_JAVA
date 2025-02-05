package ejercicio1;

/*
La clase VehiculoAlquilado tiene como atributos un vehículo, un cliente, la fecha de alquiler (LocalDate) y
el número de días de alquiler.
Métodos: constructor, getters/setters y getImporteTotal (número de días de alquiler por tarifa)
*/

import java.time.LocalDate;

public class VehiculoAlquilado {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fechaAlquiler;
    private int diasAlquiler;

    public VehiculoAlquilado(Vehiculo vehiculo, Cliente cliente, LocalDate fechaAlquiler, int diasAlquiler) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.diasAlquiler = diasAlquiler;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }
    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }
    public int getDiasAlquiler() {
        return diasAlquiler;
    }
    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    public double getImporteTotal() {
        return this.vehiculo.getTarifa() * this.diasAlquiler;
    }

    @Override
    public String toString() {
        return "VehiculoAlquilado{ " +
                vehiculo + "\t;" +
                cliente + "\t;" +
                "Fecha de Alquiler = " + fechaAlquiler + "\t;" +
                "Dias de alquiler = " + diasAlquiler + '}';
    }
}
