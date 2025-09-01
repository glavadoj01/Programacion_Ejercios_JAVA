package ejercicios_extra.ejercicioP.logica;

import tema11._00_recursosComunes.ConexionBD;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Operaciones {
    public static Map<String, String> getParticipantes() {

        String sql = "SELECT id, nombre, apellidos FROM participante";
        try (Connection con = ConexionBD.obtenerConexion("eventos")) {
            ResultSet rs = con.createStatement().executeQuery(sql);
            Map<String, String> participantes = new HashMap<>();

            while (rs.next()) {
                String id = rs.getString("id");
                String nombreApellidos = rs.getString("nombre") + " " + rs.getString("apellidos");
                participantes.put(id, nombreApellidos);
            }
            return participantes;

        } catch (SQLException e){
            System.out.println("Error al obtener los participantes: " + e.getMessage());
            return null;
        }
    }

    public static boolean guardarParticipantes(Map<String, String> map) {
        final Path RUTA = Path.of("src/tema11/ejercicios_extra/ejercicioP/resultados");
        final Path NOMBRE_ARCHIVO = Path.of(RUTA.toString(), "participantes.txt");

        if (!Files.exists(RUTA)) {
            try {
                Files.createDirectories(RUTA);
            } catch (IOException e) {
                System.out.println("Error al crear el directorio: " + e.getMessage());
                return false;
            }
        }

        try (OutputStream fos = Files.newOutputStream(NOMBRE_ARCHIVO, StandardOpenOption.CREATE)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String linea = entry.getKey() + ';' + entry.getValue() + System.lineSeparator();
                fos.write(linea.getBytes());
            }
            return true;

        } catch (IOException e) {
            System.out.println("Error al guardar los participantes en el archivo: " + e.getMessage());
            return false;
        }

    }
}
