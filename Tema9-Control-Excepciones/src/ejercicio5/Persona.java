package ejercicio5;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String correo;

    public Persona(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(getNombre(), persona.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNombre());
    }

    @Override
    public int compareTo(Persona o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
