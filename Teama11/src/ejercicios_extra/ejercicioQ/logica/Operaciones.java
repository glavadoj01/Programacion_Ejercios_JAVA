package ejercicios_extra.ejercicioQ.logica;


import _00_recursosComunes.ConexionBD;

import java.io.*;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import java.util.stream.Collectors;


public class Operaciones {

    static final File RUTA = Path.of("src/tema11/ejercicios_extra/ejercicioQ/participantes.csv").toFile();

    public static Map<String, String> cargarDatos() {

        if (!RUTA.exists()) {
            System.out.println("El archivo '" + RUTA + "' no existe.");
            return null;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
            return br.lines()
                    .map(linea -> linea.split(","))
                    .collect(Collectors.toMap(
                            participante -> participante[0].trim(), // Id
                            participante -> participante[1].trim() + " " + participante[2].trim() // Nombre y Apellido
                    ));

        } catch (IOException e) {
            System.out.println("Error al cargar los datos desde el archivo: " + e.getMessage());
            return null;
        }
    }

    public static void mostrarParticipantesAleatorios(Map<String, String> map) {
        System.out.println("Participantes aleatorios\nId - Nombre Apellido");
        map.entrySet().stream()
                .limit(20) // Limita a 20 participantes aleatorios
                .forEach(entry -> System.out.println(entry.getKey() + '\t' + entry.getValue()));
    }

    public static void mostrarDatosParticipante(int id) {
        String sql = "select * from participante where id = ?";
        try (Connection con = ConexionBD.obtenerConexion("eventos")) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

           if (rs.next()) {
                System.out.println("Id: " + rs.getString("id") +
                                   "; Nombre: " + rs.getString("nombre") +
                                   "; Apellido: " + rs.getString("apellidos") +
                                   "; Email: " + rs.getString("email"));
           } else {
                System.out.println("No se encontró un participante con el ID: " + id);
           }

        } catch (SQLException e) {
            System.out.println("Error al consultar la base de datos: " + e.getMessage());
        }
    }
}
