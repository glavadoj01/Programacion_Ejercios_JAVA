package ejercicio12;

public class Persona  implements Comparable<Persona> {
    private String dni;
    private String nombre;
    private Trabajo puesto;
    private int edad;

    public Persona(String dni, String nombre, Trabajo puesto, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.puesto = puesto;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public Trabajo getPuesto() {
        return puesto;
    }
    public int getEdad(){ return edad; }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPuesto(Trabajo puesto) {
        this.puesto = puesto;
    }
    public void setEdad(int edad) {this.edad = edad;}

    @Override // Como vamos a comparar "Strings", estos ya implementan su propio compareTo
    public int compareTo(Persona o) {
        return this.dni.compareTo(o.getDni());
    }

    @Override
    public String toString() {
        return "\nPersona {" +
                "\nDNI = " + getDni() +
                "\nNombre = " + getNombre() +
                "\n" + getPuesto() +
                "\nEdad = " + getEdad() +
                "\n}";
    }
}
