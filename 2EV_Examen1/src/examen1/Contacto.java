package examen1;

/*
Se pide construir un desarrollo software para llevar una agenda de contactos.
Para ello tenemos una clase llamada Contacto, con los atributos:
        id que es un entero que identifica cada contacto,
        nombre y teléfono que son textos.
Implementar su/sus constructores, getters y setters que se necesiten y un toString para enseñar el valor de cada objeto.
*/

import java.util.Objects;

public class Contacto {
    private int id;
    private String nombre;
    private String telefono;
    private static int contador = 0;

    public Contacto(int id, String nombre, String telefono) {
        contador++;
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Contacto(String nombre, String telefono) {
        contador++;
        this.id = contador;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // Metodos GET
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public static int getContador() {
        return contador;
    }

    // Metodos SET (Se omiten setID para consistencia del contador y el ordenamiento)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Contacto{ " +
                "Id = " + id + ";\t" +
                "Nombre = " + nombre + ";\t" +
                "Teléfono = " + telefono + '}';
    }

    @Override // Sí solo sí Id & Nombre (se omite tlf) || El metodo ArrayList.remove utiliza este metodo
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return getId() == contacto.getId() && Objects.equals(getNombre(), contacto.getNombre());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre());
    }
}
