package ejercicio15;

/*
- Cliente.
    - Atributos.
        - DNI, nombre, dirección, teléfono y email. Todos String.
    - Métodos.
        - constructor, getters, setters y toString.
*/

public class Cliente {
    private String DNI;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Cliente(String DNI, String nombre, String direccion, String telefono, String email) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
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
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "{DNI = " + DNI +
                ";\tNombre = " + nombre +
                ";\tDirección = " + direccion +
                ";\tTeléfono = " + telefono +
                ";\tEmail = " + email + "\t}";
    }
}
