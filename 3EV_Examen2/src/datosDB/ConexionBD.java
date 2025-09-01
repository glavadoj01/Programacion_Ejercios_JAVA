package datosDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final CredencialesBD config = new CredencialesBD("config.properties");
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = config.getDbUser(); // Usuario: root
    // Mi contraseña no es por defecto => Cambiar aquí o en el archivo config.properties
    private static final String PASSWORD = config.getDbPassword();

    /**
     * Obtiene una conexión a la base de datos especificada.
     *
     * @param BBDD Nombre de la base de datos a la que conectarse.
     * @return Una conexión a la base de datos.
     * @throws SQLException Si ocurre un error al establecer la conexión.
     */
    public static Connection obtenerConexion(String BBDD) throws SQLException {
        return DriverManager.getConnection(URL+BBDD, USER, PASSWORD);
    }
}
