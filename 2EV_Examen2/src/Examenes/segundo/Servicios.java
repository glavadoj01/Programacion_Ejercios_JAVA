package Examenes.segundo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Servicios implements Comparable<Servicios> {
    private int idServicio;
    private Empleado empleado;
    private LocalDate fechaInicio;
    private String cliente;

    public Servicios(int idServicio, Empleado empleado, LocalDate fechaInicio, String cliente) {
        this.idServicio = idServicio;
        this.empleado = empleado;
        this.fechaInicio = fechaInicio;
        this.cliente = cliente;
    }

    public int getIdServicio() {
        return idServicio;
    }
    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getCliente() {
        return cliente;
    }
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    abstract double costeMaterial();
    abstract double costeManoObra();
    abstract double costeTotal();
    abstract String detalleServicio();

    @Override
    public String toString() {
        return "\tIdServicio=" + idServicio +
                "\tEmpleado=" + empleado +
                "\tFecha de Inicio = " + fechaInicio +
                "\tCliente = " + cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Servicios servicios = (Servicios) o;
        return getIdServicio() == servicios.getIdServicio() && Objects.equals(getCliente(), servicios.getCliente());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdServicio(), getCliente());
    }

    @Override
    public int compareTo(Servicios o) {
        if (this.fechaInicio.isBefore(o.getFechaInicio())) {
            return -1;
        }
        if (this.fechaInicio.isAfter(o.getFechaInicio())) {
            return 1;
        }
        return 0;
    }

    public String mostrarServicio() {
        return detalleServicio();
    }
}
