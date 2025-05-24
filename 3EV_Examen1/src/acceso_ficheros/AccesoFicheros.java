package acceso_ficheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AccesoFicheros {

    private static final String RUTA_FICHEROS = "assets";

    public static List<String> lecturaFichero(String file) {
        try (BufferedReader br = Files.newBufferedReader(Path.of(RUTA_FICHEROS,file))) {

            List<String> list = new ArrayList<>();
            String linea;

            while ((linea = br.readLine()) != null) {
                list.add(linea);
            }

            return list;

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return null;
        }
    }
}
