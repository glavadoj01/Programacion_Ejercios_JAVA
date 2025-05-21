package ejercicio5;

import tema9.recursoscomunes.Utiles;

import java.util.HashMap;

public class SorteaTOR2000 {
    static HashMap<String, Persona> alumnos = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("**************************************");
        System.out.println("Cargando FALLO TEST");
        cargarDatos("src/tema9/ejercicio5/NombreCorreoSS.txt");
        System.out.println("\n**************************************");
        System.out.println("Cargando OK");
        cargarDatos("src/tema9/ejercicio5/NombreCorreo.txt");
        for (Persona persona : alumnos.values()) {
            System.out.println(persona);
        }
        System.out.println("**************************************");
    }


    public static void cargarDatos(String ruta) {
        String[] registro;

        for (String dato : Utiles.leerDatos(ruta)) {
            registro = dato.split(";");
            alumnos.put(registro[0], new Persona(registro[0], registro[1]));
        }

    }
}
