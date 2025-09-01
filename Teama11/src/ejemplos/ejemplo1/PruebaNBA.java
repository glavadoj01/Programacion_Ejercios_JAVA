package ejemplos.ejemplo1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaNBA {
    public static void main(String[] args) {
        try {
            Connection c = Conexiones.conexionConBBDD("nba");
            System.out.println("Conexión establecida");
            Statement st = c.createStatement();
            String sql = "select * from jugadores";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                String equipo = rs.getString("Nombre_equipo");
                System.out.println("Nombre: " + nombre + "\tEquipo: " + equipo);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                Conexiones.cerrarConexionBBDD();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
