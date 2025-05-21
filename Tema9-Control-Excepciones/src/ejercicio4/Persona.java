package ejercicio4;

import java.util.Objects;

public class Persona implements Comparable<Persona> {
    private String DNI;
    private String nombre;

    public Persona(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override // SOLO DNI
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(getDNI(), persona.getDNI());
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(getDNI());
    }

    @Override
    public String toString() {
        return "Persona {" +
                "DNI = " + DNI +
                "\tNombre = " + nombre +
                "\t}";
    }

    @Override // Ordenación Natural Por DNI
    public int compareTo(Persona o) {
        return this.getDNI().compareTo(o.getDNI());
    }
}
