package ejercicio7;

/*
Diseña un programa Java que trabaje con la clase DvdCine creada en el ejercicio anterior.
Crea una clase (GestionDvd) que incluya como atributo un array de objetos pertenecientes
a la clase DvdCine y como métodos las opciones del menú.
El menú de la aplicación sería:
Menú de opciones:
        1. Mostrar la lista de películas (Título y productora)
        2. Mostrar la película de más duración (Título y minutos)
        3. Pedir un género y mostrar el título de las pelis de ese género.
        4. Duración de la peli. Pedir título y mostrar su duración.
*/

import java.util.ArrayList;

public class GestionDvd {
    private ArrayList<DvdCine> listaDvd;

    public GestionDvd() {
        this.listaDvd = new ArrayList<>();
    }

    public void agregarDvd(DvdCine dvd) {
        this.listaDvd.add(dvd);
    }

    public void mostrarLista() {
        for (int i = 0; i < this.listaDvd.size(); i++) {
            System.out.println("Titulo: " + this.listaDvd.get(i).getTitulo() +
                    "\tProductora: " + this.listaDvd.get(i).getProductora());
        }
    }

    public void mostrarMasLarga() {
        DvdCine peliculaMasLarga = this.listaDvd.getFirst();
        for (int i = 0; i < this.listaDvd.size(); i++) {
            if (this.listaDvd.get(i).getDuraccion() > peliculaMasLarga.getDuraccion()) {
                peliculaMasLarga = this.listaDvd.get(i);
            }
        }
        System.out.println("Titulo: " + peliculaMasLarga.getTitulo() +
                "\tDuracción: " + peliculaMasLarga.getDuraccion());
    }

    public void mostrarListaGenero(String generoBuscar) {
        for (int i = 0; i < this.listaDvd.size(); i++) {
            if (this.listaDvd.get(i).getGenero().getName().equalsIgnoreCase(generoBuscar)) {
                System.out.println("Titulo: " + this.listaDvd.get(i).getTitulo());
            }
        }
    }

    public void mostrarDuracion(String titulo) {
        for (int i = 0; i < this.listaDvd.size(); i++) {
            if (this.listaDvd.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Titulo: " + this.listaDvd.get(i).getTitulo() +
                        "\tDuracción: " + this.listaDvd.get(i).getDuraccion());
                return;
            }
        }
        System.out.println("No se encontró el titulo: \"" + titulo +"\"");
    }
}
