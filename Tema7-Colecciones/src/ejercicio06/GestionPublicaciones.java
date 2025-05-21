package ejercicio06;

/*
La clase GestionPublicaciones que contendrá un HashMap que pueda almacenar publicaciones utilizando
como clave el título de la publicación.

En esta clase programa los métodos añadir publicación, eliminar publicación y listar publicaciones.
*/

import java.util.HashMap;
import java.util.Map;

public class GestionPublicaciones {
    protected Map<String,Publicacion> listaPublicaciones;

    public GestionPublicaciones() {
        this.listaPublicaciones = new HashMap<>();
    }

    public void agregarPublicacion(Publicacion pub) {
        this.listaPublicaciones.put(pub.getTitulo(), pub);
    }

    public boolean eliminarPublicacion(String titulo) {
        if (this.listaPublicaciones.containsKey(titulo)) {
            this.listaPublicaciones.remove(titulo);
            return true;
        }
        return false;
    }

    public void listarPublicaciones() {
        for (String key : listaPublicaciones.keySet()) {
            System.out.println(this.listaPublicaciones.get(key));
        }
    }
}
