package ejercicio2;

import tema11.ConectarBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Diseña un proyecto Java que permita insertar filas en la tabla “categoriasproductos”.
 * Los datos se solicitarán al usuario.
 * a. Mediante Statement.
 * b. Mediante PreparedStatement.
 */
public class Ejercicio2 {
        // Método para insertar con Statement
    public static void insertarConStatement() {
        try {
            Connection con = ConectarBD.getConexion("classicmodels");
            String sql = "INSERT INTO productlines (productLine, textDescription) VALUES ('UNO', 'sljfsñdlkfjdlñkfj')";

            Statement st = con.createStatement();

            int n = st.executeUpdate(sql);
            if (n > 0) {
                System.out.println("Se han insertado " + n + " filas.");
            } else {
                System.out.println("No se han insertado filas.");
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Método para insertar con PreparedStatement
    public static void insertarConPreparedStatement() {

        try{
            Connection con = ConectarBD.getConexion("classicmodels");
            String sql = "INSERT INTO productlines (productLine, textDescription) VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "DOS");
            ps.setString(2, "sljfsñdlkfjdlñkfj");

            int n = ps.executeUpdate();

            if (n > 0) {
                System.out.println("Se han insertado " + n + " filas.");
            } else {
                System.out.println("No se han insertado filas.");
            }
            ps.close();
            con.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
