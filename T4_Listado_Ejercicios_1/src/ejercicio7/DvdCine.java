package ejercicio7;

/*
Diseña un programa Java que trabaje con la clase DvdCine creada en el ejercicio anterior.
Crea una clase (GestionDvd) que incluya como atributo un array de objetos pertenecientes
a la clase DvdCine y como métodos las opciones del menú. El menú de la aplicación sería:
Menú de opciones:
        1. Mostrar la lista de películas (Título y productora)
        2. Mostrar la película de más duración (Título y minutos)
        3. Pedir un género y mostrar el título de las pelis de ese género.
        4. Duración de la peli. Pedir título y mostrar su duración.
*/

import java.util.ArrayList;
import java.util.Objects;

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
        return Generos.THRILLER.equals(this.genero);
        /* También vale
        return this.genero.equals(Generos.THRILLER);
        return this.genero == Generos.THRILLER;
         */
    }

    public boolean mismaProductora(DvdCine cine) {
        return this.productora.equalsIgnoreCase(cine.getProductora());
    }

    // Métodos sobreescritos
    @Override // Es igual si: Mismo Título & Director (resto no requerido)
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
