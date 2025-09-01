package EjercicioP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tema11.ConectarBD;

public class GestionBD {
    private Connection c = null;

    public GestionBD() {
        try {
            c = ConectarBD.getConexion("classicmodels");        // Constructor
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }
    public ResultSet leerParticipantes() throws SQLException {

        String sql = "Select id, concat_ws(', ',nombre, apellidos) as nombreApellido  from participante";

        Statement st = c.createStatement();

        return st.executeQuery(sql);
    }

    public void cerrarConexion(){
        try {
            if (c != null && !c.isClosed()) {
                ConectarBD.closeConnection();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
