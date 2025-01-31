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

    public ArrayList<Ciudad> getListaCiudades() {
        return listaCiudades;
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
