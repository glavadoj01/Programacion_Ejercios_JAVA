package ejercicio06;

/*
Sus atributos son: título, tipo (deportes, prensa general, motor,...), editorial, periodicidad, número de ejemplares.
Crea su constructor, getters y setters.
*/

public class Publicacion {
    protected String titulo;
    protected String tipo;
    protected String editorial;
    protected String periodicidad;
    protected int numEjemplares;

    public Publicacion(String titulo, String tipo, String editorial, String periodicidad, int numEjemplares) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getPeriodicidad() {
        return periodicidad;
    }
    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }
    public int getNumEjemplares() {
        return numEjemplares;
    }
    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    @Override
    public String toString() {
        return "Publicación{" +
                "\tTitulo = " + titulo +
                "\tTipo = " + tipo +
                "\tEditorial = " + editorial +
                "\tPeriodicidad = " + periodicidad +
                "\tNº de Ejemplares = " + numEjemplares +
                "\t}";
    }
}
