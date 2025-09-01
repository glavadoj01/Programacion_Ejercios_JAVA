package ejercicio7.operaciones;

import tema11._00_recursosComunes.ConexionBD;
import tema11.ejercicio7.ficheros.LecturaEscritura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Operaciones {

    private static final String BBDD = "classicmodels";

    public static void mostrarCategorias() {
        String sql = "SELECT productLine FROM productlines";

        try (Connection con = ConexionBD.obtenerConexion(BBDD)) {
            ResultSet rs = con.createStatement().executeQuery(sql);

            System.out.println("\n------------------------------------------------");
            System.out.println("Categorías disponibles:");
            System.out.println("------------------------------------------------");
             while (rs.next()) {
                 System.out.println(rs.getString("productLine"));
             }
            System.out.println("------------------------------------------------\n"); // Añade un salto extra al println

        } catch (SQLException e) {
            System.out.println("Error al mostrar las categorías: " + e.getMessage());
        }

    }


    public static boolean generarFichero(String categoria) {
        String sql = "SELECT productCode, productName, productLine, buyPrice, MSRP " +
                     "FROM products WHERE productLine = ?";

        if (esCategoria(categoria)){
            try (Connection con = ConexionBD.obtenerConexion(BBDD)) {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, categoria);
                ResultSet rs = ps.executeQuery();
                return LecturaEscritura.escribirFichero(categoria, rs);

            } catch (SQLException e) {
                System.out.println("Error al conectar con la base de datos: " + e.getMessage());
                return false;
            }
        } else {
            System.out.println("La categoría '" + categoria + "' no existe.");
            return false;
        }
    }

    private static boolean esCategoria(String categoria) {
        String sql = "SELECT IF( ? IN (SELECT productLine FROM productLines), 1 , 0 )";

        try (Connection con = ConexionBD.obtenerConexion(BBDD)) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoria);
            ResultSet rs = ps.executeQuery();
            rs.next();
            // Si es categoría, rs.getInt() devuelve 1, si no, devuelve 0
            return rs.getInt(1) == 1;


        } catch (SQLException e) {
            System.out.println("Error al verificar la categoría: " + e.getMessage());
            return false;
        }
    }
}
