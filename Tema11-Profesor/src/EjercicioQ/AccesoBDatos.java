package EjercicioQ;

import tema11.ConectarBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AccesoBDatos {

    public static ResultSet buscarParticipante(String nombre, String apellidos) throws Exception {

        Connection c = ConectarBD.getConexion("eventos");
        String sql = "SELECT * FROM participante WHERE nombre = ? AND apellidos = ?";
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, nombre);
        ps.setString(2, apellidos);

        return ps.executeQuery();
    }
}
