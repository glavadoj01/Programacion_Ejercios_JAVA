package ejercicios_extra.ejercicioExtra.bbdd;

import tema11._00_recursosComunes.ConfigLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final ConfigLoader config = new ConfigLoader("config.properties");
    private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
    private static final String BBDD = "classicmodels";
    private static final String USER = config.getDbUser();;
    private static final String PASSWORD = config.getDbPassword();





    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL+BBDD, USER, PASSWORD);
    }
}
