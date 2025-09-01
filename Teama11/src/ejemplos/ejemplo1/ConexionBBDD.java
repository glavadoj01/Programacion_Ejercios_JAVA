package ejemplos.ejemplo1;

import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class ConexionBBDD {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);

        System.out.print("Conexión BBDD LocalHost...");
        Properties proiedadesConexion = new Properties();

        proiedadesConexion.put("user", "root");
        proiedadesConexion.put("password", escanear.nextLine());

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ClassicModels",proiedadesConexion);

            System.out.println("¡¡¡Conectado!!!");
            Statement statement = conexion.createStatement();
            ResultSet respuesta = statement.executeQuery("Show tables;");

            System.out.println("\nTablas de la base de datos: Classic Models\n");
            while (respuesta.next()) {
                System.out.println(respuesta.getString(1));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
