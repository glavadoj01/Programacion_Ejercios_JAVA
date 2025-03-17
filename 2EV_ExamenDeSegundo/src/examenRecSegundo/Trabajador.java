package examenRecSegundo;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Trabajador implements Comparable<Trabajador> {
    protected int id;
    protected String nombre;
    protected LocalDate fechaNacimiento;

    abstract double calcularSalario();

    public Trabajador(int id, String nombre, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    @Override
    public String toString() {
        return "\nId = " + id +
                "\nNombre = " + nombre +
                "\nFecha de Nacimiento = " + fechaNacimiento;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return getId() == that.getId() && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getFechaNacimiento(), that.getFechaNacimiento());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getFechaNacimiento());
    }
    @Override
    public int compareTo(Trabajador o) {
        if (this.id > o.getId()) {
            return 1;
        }
        if (this.id < o.getId()) {
            return -1;
        }
        return 0;
    }
}
