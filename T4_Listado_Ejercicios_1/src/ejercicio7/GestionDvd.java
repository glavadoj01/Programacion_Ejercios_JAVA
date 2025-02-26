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
    private ArrayList<DvdCine> listaDvd = new ArrayList<>();

    public GestionDvd() {
        insertarDatosPrueba();
    }

    public void insertarDatosPrueba() {

        // Crear Objetos DvdCine y Listas de Actores
        ArrayList<String> listaActores1 = new ArrayList<>();
        listaActores1.add(0,"Ian McKellen");
        listaActores1.add(1, "Martin Freeman");
        DvdCine dvd1 = new DvdCine ("El hobbit. La desolación de Smaug", "Peter Jackson", "New Line Cinema. & Metro-Goldwyn-Mayer", listaActores1, Generos.CIENCIAFICCION, "Bla...", 123);
        listaDvd.add(dvd1);

        ArrayList<String> listaActores2 = new ArrayList<>();
        listaActores2.add(0,"Al Pacino");
        listaActores2.add(1, "Marlon Brando");
        DvdCine dvd2 = new DvdCine ("El Padrino", "Francis Ford Copola", "Paramount Pictures" , listaActores2, Generos.DRAMA, "Bla...", 175);
        listaDvd.add(dvd2);

        ArrayList<String> listaActores3 = new ArrayList<>();
        listaActores3.add(0,"Di Caprio");
        DvdCine dvd3 = new DvdCine ("Titanic", "Francis Ford Copola", "Paramount Pictures. 20th Century Fox" , listaActores3, Generos.DRAMA, "Bla...", 123);
        listaDvd.add(dvd3);

        ArrayList<String> listaActores4 = new ArrayList<>();
        listaActores4.add(0,"------");
        DvdCine dvd4 = new DvdCine ("El Rey León", "WD", "Walt Dysney", listaActores4, Generos.ANIMACION, "Bla...", 86);
        listaDvd.add(dvd4);

        ArrayList<String> listaActores5 = new ArrayList<>();
        listaActores5.add(0,"--");
        DvdCine dvd5 = new DvdCine ("Los Vengadores", "--", "Marvel Studios. Walt Dysney", listaActores5, Generos.CIENCIAFICCION, "Bla...", 114);
        listaDvd.add(dvd5);

        ArrayList<String> listaActores6 = new ArrayList<>();
        listaActores6.add(0,"--");
        DvdCine dvd6 = new DvdCine ("Avatar", "Francis Ford Copola", "20th Century Fox", listaActores6, Generos.CIENCIAFICCION, "Bla...", 126);
        listaDvd.add(dvd6);

        ArrayList<String> listaActores7 = new ArrayList<>();
        listaActores7.add(0,"--");
        DvdCine dvd7 = new DvdCine ("Harry Potter. Las reliquias de la muerte", "--", "Warner Bros.", listaActores7, Generos.CIENCIAFICCION, "Bla...", 131);
        listaDvd.add(dvd7);

        ArrayList<String> listaActores8 = new ArrayList<>();
        listaActores8.add(0,"--");
        DvdCine dvd8 = new DvdCine ("El señor de los anillos. El retorno del rey", "Francis Ford Copola", "New Line Cinema", listaActores8, Generos.CIENCIAFICCION, "Bla...", 175);
        listaDvd.add(dvd8);

        ArrayList<String> listaActores9 = new ArrayList<>();
        listaActores9.add(0,"--");
        DvdCine dvd9 = new DvdCine ("Toy Story 3", "----", "Dysney/Pixar", listaActores9, Generos.ANIMACION, "Bla...", 78);
        listaDvd.add(dvd9);

        ArrayList<String> listaActores10 = new ArrayList<>();
        listaActores10.add(0,"--");
        DvdCine dvd10 = new DvdCine ("The Dark Knight Rises", "--", "Warner Bros.", listaActores10, Generos.CIENCIAFICCION, "Bla...", 99);
        listaDvd.add(dvd10);
    }

    public void agregarDvd(DvdCine dvd) {
        this.listaDvd.add(dvd);
    }

    public void mostrarLista() {
        for (DvdCine a : listaDvd){
            System.out.println("Titulo: " + a.getTitulo() +
                    "\tProductora: " + a.getProductora());
        }
    }

    public void mostrarMasLarga() {
        DvdCine peliculaMasLarga = this.listaDvd.getFirst();
        for (DvdCine a : listaDvd) {
            if (a.getDuraccion() > peliculaMasLarga.getDuraccion()) {
                peliculaMasLarga = a;
            }
        }
        System.out.println("La pelicula más larga es: " + peliculaMasLarga.getTitulo() +
                ";\tDuracción: " + peliculaMasLarga.getDuraccion());
    }

    public void mostrarListaGenero(String generoBuscar) {
        Generos generoObjeto = Generos.valueOf(generoBuscar.toUpperCase());
        ArrayList<DvdCine> peliculasGenero = new ArrayList<>();

        for (DvdCine a : listaDvd){
            if (a.getGenero() == generoObjeto){
                peliculasGenero.add(a);
            }
        }

        for (DvdCine b : peliculasGenero){
            System.out.println("Titulo: " + b.getTitulo() +
                    ";\tProductora: " + b.getProductora() +
                    ";\tGenero: " + b.getGenero());
        }
    }

    public int mostrarDuracion(String titulo) {
        for (DvdCine a : listaDvd) {
            if (a.getTitulo().equalsIgnoreCase(titulo)) {
                return a.getDuraccion();
            }
        }
        return 0;
    }
}
