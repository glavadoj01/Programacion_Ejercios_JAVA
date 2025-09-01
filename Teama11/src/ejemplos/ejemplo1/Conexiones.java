package ejemplos.ejemplo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexiones {
    private static Connection con = null;

    public static Connection conexionConBBDD (String nombreBBDD) throws SQLException {
        try {
            if (con == null) {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + nombreBBDD,"root","root");
            }
            return con;
        } catch (SQLException e) {
            throw new SQLException("Error al conectar con la base de datos " + nombreBBDD);
        }
    }

    public static void cerrarConexionBBDD () throws SQLException {
        if (con != null) {
            con.close();
            con = null;
        }
    }
}
