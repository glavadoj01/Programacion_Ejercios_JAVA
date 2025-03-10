package ejercicio1;

/*
Cliente tiene los atributos DNI, nombre, apellidos y teléfono, todos String.
Métodos: constructor, getters, setters y al menos getNombreCompleto.
*/

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;

    public Cliente(String dni, String nombre, String apellidos, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellidos;
    }

    @Override
    public String toString() {
        return "Cliente{ " +
                "DNI = " + dni + "\t; " +
                "Nombre =" + nombre + "\t; " +
                "Apellidos = " + apellidos + "\t; " +
                "Teléfono = " + telefono + '}';
    }
}
