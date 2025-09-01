package _00_recursosComunes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final ConfigLoader config = new ConfigLoader("config.properties");
    private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
    private static final String USER = config.getDbUser();;
    private static final String PASSWORD = config.getDbPassword();

    public static Connection obtenerConexion(String bbdd) throws SQLException {
        return DriverManager.getConnection(URL+bbdd, USER, PASSWORD);
    }
}
