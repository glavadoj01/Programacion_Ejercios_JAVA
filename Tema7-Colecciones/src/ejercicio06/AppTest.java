package ejercicio06;

/*
Crea una clase llamada Publicación destinada a guardar datos de periódicos y revistas.
Sus atributos son: título, tipo (deportes, prensa general, motor,...), editorial, periodicidad, número de ejemplares.
Crea su constructor, getters y setters. Diseña una aplicación Java que trabaje con la clase GestionPublicaciones que
contendrá un HashMap que pueda almacenar publicaciones utilizando como clave el título de la publicación.
En esta clase programa los métodos añadir publicación, eliminar publicación y listar publicaciones.
*/

public class AppTest {
    public static void main(String[] args) {
        GestionPublicaciones catalogo = new GestionPublicaciones();

        System.out.println("*****************");
        System.out.println("Listar catálogo vacío:");
        catalogo.listarPublicaciones();

        System.out.println("*****************");
        for (int i = 1; i <= 5; i++) {
            catalogo.agregarPublicacion(new Publicacion("Titulo" + i, "Tipo Genérico 1", "Editorial 01", "Quinquenal", 200 + i));
        }
        for (int i = 6; i <= 10; i++) {
            catalogo.agregarPublicacion(new Publicacion("Titulo" + i, "Tipo Genérico 2", "Editorial 02", "Semestral", 200 + i));
        }
        System.out.println("Listar catálogo:");
        catalogo.listarPublicaciones();
    }
}
