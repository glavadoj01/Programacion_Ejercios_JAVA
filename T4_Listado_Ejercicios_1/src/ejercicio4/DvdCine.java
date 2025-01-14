package ejercicio4;

import java.util.ArrayList;
import java.util.Objects;

/*
Diseña un programa Java que trabaje con una clase llamada DvdCine.
a. Su atributos serán: título, director, productora, actores principales, género, resumen y duración.
b. Debe incluir un constructor que reciba como parámetros los atributos.
c. Crea un método llamado esThriller que devuelva true o false según la película sea o no de este género.
d. Crea todos los métodos gets/sets.
e. Crea un método llamada mismaProductora que reciba un objeto de la clase DvdCine como parámetro.
   Este método devuelve true o false si el objeto utilizado con el método es de la misma productora que el pasado como parámetro.
f. Crea objetos y prueba estos métodos.
 */

public class DvdCine {
    private String titulo;
    private String director;
    private String productora;
    private ArrayList<String> actores;
    private Generos genero;
    private String resumen;
    private int duraccion;

    // Constructor de Objeto
    public DvdCine(String titulo, String director,
                   String productora, ArrayList<String> actores, Generos genero,
                   String resumen, int duraccion) {
        this.titulo = titulo;
        this.director = director;
        this.productora = productora;
        this.actores = actores;
        this.genero = genero;
        this.resumen = resumen;
        this.duraccion = duraccion;
    }

    // Métodos GET
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getProductora() {
        return productora;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public Generos getGenero() {
        return genero;
    }

    public String getResumen() {
        return resumen;
    }

    public int getDuraccion() {
        return duraccion;
    }

    // Métodos SET
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void setDuraccion(int duraccion) {
        this.duraccion = duraccion;
    }

    // Métodos especiales
    public boolean esThriller() {
        return Generos.Thriller.equals(this.genero);
        /* También vale
        return this.genero.equals(Generos.Thriller);
         */
    }

    public boolean mismaProductora(DvdCine cine) {
        return this.productora.equals(cine.getProductora());
    }

    // Métodos sobreescritos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DvdCine dvdCine = (DvdCine) o;
        return Objects.equals(titulo, dvdCine.titulo) && Objects.equals(director, dvdCine.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, director);
    }
}
