package ejercicio2;
/*
Diseña una clase llamada Cliente con las siguientes características:
        - Atributos: DNI, nombre, y teléfono.
        - Métodos: constructor, getters y setters.
*/
public class Cliente {
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;

    public Cliente(String dni, String nombre, String apellido, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
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
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{\n" +
                "DNI = " + dni + '\t' +
                "Nombre = " + nombre + '\t' +
                "Apellido = " + apellido + '\n' +
                "Teléfono = " + telefono + '}';
    }
}