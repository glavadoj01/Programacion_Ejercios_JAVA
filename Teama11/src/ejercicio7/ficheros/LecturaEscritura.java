package ejercicio7.ficheros;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LecturaEscritura {


    public static boolean escribirFichero(String categoria, ResultSet rs) {

        // Crear el directorio si no existe
        final Path RUTA = Path.of("src/tema11/ejercicio7/salidas");
        if (!Files.exists(RUTA)) {
            try {
                Files.createDirectories(RUTA);
            } catch (IOException e) {
                System.out.println("Error al crear el directorio: " + e.getMessage());
                return false;
            }
        }
        categoria = categoria.replaceAll(" ", "_");
        final Path FICHERO = Path.of(RUTA.toString(), "Productos_Categoria_" + categoria + ".txt");
        try (BufferedWriter bw = Files.newBufferedWriter(FICHERO)) {

            // Escribir la cabecera - OPCIONAL
            bw.write("productCode;productName;productLine;buyPrice;MSRP");
            bw.newLine();

            // Escribir los productos
            while (rs.next()) {
                bw.write(rs.getString("productCode") + ";" +
                        rs.getString("productName") + ";" +
                        rs.getString("productLine") + ";" +
                        rs.getDouble("buyPrice") + ";" +
                        rs.getDouble("MSRP"));
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
            return false;
        } catch (SQLException e) {
            System.out.println("Error al leer el ResultSet: " + e.getMessage());
            return false;
        }

        return true;
    }
}
