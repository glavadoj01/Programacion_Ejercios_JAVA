package EjercicioP;

public class Participante {
    private int id;
    private String nombre;

    public Participante(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    @Override
    public String toString() {
        return "Participante [id=" + id + ", nombre=" + nombre + "]";
    }

}
