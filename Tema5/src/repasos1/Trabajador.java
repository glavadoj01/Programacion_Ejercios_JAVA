package repasos1;

import java.time.LocalDate;

public abstract class Trabajador implements Comparable<Trabajador> {
    int id;
    String nombre;
    LocalDate fechaNacimiento;
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
    final public int compareTo(Trabajador o) {
        return this.nombre.compareTo(o.getNombre());
    }
}
