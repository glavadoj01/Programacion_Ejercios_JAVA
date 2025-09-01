package examen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarBD {
    private static Connection con = null;

    public static Connection getConexion(String bd) throws SQLException {
        if (con == null) {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + bd,
                        "root", "60231023");

        }
        return con;
    }

    public static void closeConnection() throws SQLException {
        if (con != null) {
            con.close();
            con = null;
        }
    }
}
