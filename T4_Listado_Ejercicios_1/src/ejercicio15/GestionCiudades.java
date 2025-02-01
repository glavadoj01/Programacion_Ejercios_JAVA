package ejercicio15;

/*
a. buscarCiudadPorId. Recibe una Id y retorna la ciudad con esa Id o null si no existe.
b. buscarCiudadMasPoblada. Retorna la ciudad más poblada.
c. mostrarCiudadesDelPais. Recibe un país como argumento e imprime las ciudades de ese país.
d. comparaCiudades. Metodo estático que recibe dos objetos ciudad (Ciudad) como parámetro y retorna true o
                       false si son iguales o no. Dos ciudades son iguales si tienen el mismo id y nombre.
e. mostrarVariasCiudades. Recibe varios Ids como argumentos y muestra
							las ciudades (toString) asociadas a esas ids. (varagrs)
f. mostrarCiudadesPaises. Recibe varios códigos de país como argumentos y muestra
							las ciudades (toString) pertenecientes a esos países.
*/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestionCiudades {

    private ArrayList<Ciudad> listaCiudades;

    public GestionCiudades() {
        listaCiudades = new ArrayList<>();
        cargarDatosPrueba();
    }

    public Ciudad buscarCiudadPorId(String idEntr) {
        for (Ciudad p : listaCiudades) {
            if (p.getId().equals(idEntr)) {
                return p;
            }
        }
        return null;
    }

    public Ciudad buscarCiudadMasPoblada() {
        Ciudad ciudadM = listaCiudades.getFirst();
        for (Ciudad p : listaCiudades) {
            if (p.getPoblacion() > ciudadM.getPoblacion()) {
                ciudadM = p;
            }
        }
        return ciudadM;
    }

    public void mostrarCiudadesDelPais(String pais) {
            int contador = 0;
            for (Ciudad p : listaCiudades) {
                if (p.getPais().equalsIgnoreCase(pais)) {
                    System.out.println(p);
                    contador++;
                }
            }
            if (contador == 0) {
                System.out.println("No se encontrarón ciudades del pais: " + pais);
            }
    }

    public static boolean compararCiudades(Ciudad c1, Ciudad c2) {
        return c1.equals(c2);
    }

    public void mostrarVariasCiudades(String... idsEntr) {
        for (String id : idsEntr) {
            Ciudad c = buscarCiudadPorId(id);
            if (c == null) {
                System.out.println("No se encontró la ciudad con id " + id);
            } else {
                System.out.println(c);
            }
        }
    }

    public void mostrarCiudadesPaises(String... paises) {
        for (String pais : paises) {
            System.out.println("\nCiudades de " + pais);
            mostrarCiudadesDelPais(pais);
        }
    }

    public void mostrarTodos() {
        for (Ciudad ciudad : listaCiudades) {
            System.out.println(ciudad);
        }
    }

    public void cargarDatosPrueba() {
        try {
            List<String> lines = Files.readAllLines(
                    Paths.get("src/ejercicio15/ciudades.csv"),
                    StandardCharsets.UTF_8);
            for (String string : lines) {
                listaCiudades.add(new Ciudad(string));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
