package ejercicio4;

import java.time.LocalDate;

public class Persona implements Comparable<Persona> {
    private String id;
    private String nombre;
    private LocalDate fechaNacimiento;

    public Persona(String id, String nombre, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
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
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        if (this.fechaNacimiento.isBefore(o.getFechaNacimiento())) {
            return -1;
        }
        if (this.fechaNacimiento.isAfter(o.getFechaNacimiento())){
            return 1;
        }
        return 0;
    }
    /*  Equivalenteménte podemos llamar al compareTo de la clase LocalDate directamente
        return this.fechaNacimiento.compareTo(o.getFechaNacimiento());
    */
}
