package examen;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccesoBdatos {
    Connection c = null;

    public AccesoBdatos(){
        try {
            c = ConectarBD.getConexion("classicmodels");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public int ejecutaInsert(String sql, String[] params){
        try {

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, params[0].trim());
            ps.setString(2, params[1].trim());
            ps.setString(3, params[2].trim());
            ps.setString(4, params[3].trim());
            ps.setString(5, params[4].trim());
            ps.setString(6, params[5].trim());
            ps.setInt(7, Integer.parseInt(params[6].trim()));
            ps.setDouble(8, Double.parseDouble(params[7]));
            ps.setDouble(9, Double.parseDouble(params[8]));

            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
        return 0;
    }

    public int ejecutaUpdate(String sql, String[] params) {
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(params[0]));
            ps.setString(2, params[1].trim());

            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
        return 0;
    }

    public ResultSet ejecutaSelect(String sql, String[] params) {
        try {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, params[0].trim());
            ps.setString(2, params[1].trim());
            ps.setDouble(3, Double.parseDouble(params[2]));
            ps.setDouble(4, Double.parseDouble(params[3]));

            return ps.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }
        return null;
    }
}
