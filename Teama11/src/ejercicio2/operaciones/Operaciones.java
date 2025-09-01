package ejercicio2.operaciones;

import tema11._00_recursosComunes.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Operaciones {

    private static final String bbdd = "classicmodels";

    public static int conStatement(String mombre, String descripcion) {

        String sql = "INSERT INTO productlines (productLine, textDescription) VALUES ('" + mombre + "', '" + descripcion + "')";
        try (Connection con = ConexionBD.obtenerConexion(bbdd)) {
            Statement st = con.createStatement();
            return st.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static int conPreparedStatement(String mombre, String descripcion) {

        String sql = "INSERT INTO productlines (productLine, textDescription) VALUES ( ?, ?)";

        try (Connection con = ConexionBD.obtenerConexion(bbdd)) {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, mombre);
            ps.setString(2, descripcion);
            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
