package EjercicioQ;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class AccesoArchivo {

    public static List<String> leerArchivo(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();
        // Usamos un bloque try-with-resources para asegurar que el BufferedReader se cierre automáticamente
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return null;
        }
        return lineas;
    }
    // Otra forma de leer el archivo con el paquete java.nio.file
    public static List<String> leerLineas(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();
        try {
            lineas = Files.readAllLines(Paths.get(nombreArchivo));
        }catch (IOException e){
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return null;
        }
        return lineas;
    }
}
