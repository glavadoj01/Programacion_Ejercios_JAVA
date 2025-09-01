package datosFichero;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AccesoFicheros {


    public static boolean escribir(List<String> productos) {
        try (BufferedWriter br = Files.newBufferedWriter(Path.of("productosMax.csv"))) {
            for (String s : productos) {
                br.write(s);
                br.newLine();
            }
            return true;
        } catch (IOException e) {
            System.out.println("Error de escritura: " + e.getMessage());
            return false;
        }
    }
}
