package acceso_datos;

import modelos.Producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccesoBdatos {


    public static boolean ejecutarInsert(String instruccion, String parametros) {
        String[] param = parametros.split(", ");
        try (Connection con = ConectarBD.getConexion()) {
            PreparedStatement ps = con.prepareStatement(instruccion);
            for (int i = 0; i < param.length; i++) {
                try {
                    int value = Integer.parseInt(param[i]);
                    ps.setInt(i + 1, value); // Si es un int, lo asigna como entero

                } catch (NumberFormatException e) {
                    ps.setString(i + 1, param[i]); // Si no es un int, lo asigna como String
                }
            }
            return ps.execute();

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la inserción: " + e.getMessage());
            return false;
        }
    }

    public static int ejecutarUpdate(String instruccion, String parametros) {
        String[] param = parametros.split(", ");
        try (Connection con = ConectarBD.getConexion()) {
            PreparedStatement ps = con.prepareStatement(instruccion);
            for (int i = 0; i < param.length; i++) {
                try {
                    int value = Integer.parseInt(param[i]);
                    ps.setInt(i + 1, value); // Si es un int, lo asigna como entero

                } catch (NumberFormatException e) {
                    ps.setString(i + 1, param[i]); // Si no es un int, lo asigna como String
                }
            }
            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la actualización: " + e.getMessage());
            return -1;
        }
    }

    public static List<Producto> ejecutarSelect(String instruccion, String parametros) {
        String[] param = parametros.split(", ");
        try (Connection con = ConectarBD.getConexion()) {
            PreparedStatement ps = con.prepareStatement(instruccion);
            for (int i = 0; i < param.length; i++) {
                try {
                    int value = Integer.parseInt(param[i]);
                    ps.setInt(i + 1, value); // Si es un int, lo asigna como entero

                } catch (NumberFormatException e) {
                    ps.setString(i + 1, param[i]); // Si no es un int, lo asigna como String
                }
            }
            ResultSet rs = ps.executeQuery();

            List<Producto> productos = new ArrayList<>();
            while (rs.next()) {
                productos.add(new Producto(
                        rs.getString("codigoProducto"),
                        rs.getString("nombreProducto"),
                        rs.getString("categoriaProducto"),
                        rs.getString("escala"),
                        rs.getString("vendedor"),
                        rs.getString("descripcion"),
                        rs.getInt("unidadesStock"),
                        rs.getDouble("precioCompra"),
                        rs.getDouble("precioVenta")
                ));
            }
            return productos;

        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
            return null;
        }

    }
}
