package logica;

import datosDB.ConexionBD;
import datosFichero.AccesoFicheros;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {
    private static final String BBDD = "classicmodels";

    public static boolean ProdMaxPrecio(int numProd) {
        List<String> productos = new ArrayList<>();
        try (Connection con = ConexionBD.obtenerConexion(BBDD)) {
            String sql = "SELECT * FROM products ORDER BY MSRP LIMIT " + numProd;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String respuesta =
                        rs.getString("productCode") + ";" +
                        rs.getString("productName") + ";" +
                        rs.getString("productLine") + ";" +
                        rs.getString("productScale") + ";" +
                        rs.getString("productVendor") + ";" +
                        rs.getString("productDescription") + ";" +
                        rs.getString("quantityInStock") + ";" +
                        rs.getString("buyPrice") + ";" +
                        rs.getString("MSRP");
                productos.add(respuesta);
            }

            return AccesoFicheros.escribir(productos);

        } catch (SQLException e) {
            System.out.println("Error al realizar la consulta: " + e.getMessage());
            return false;
        }
    }

    public static boolean insertarOfi(String officeCode, String city, String phone, String addressLine1, String addressLine2, String state, String country, String postalCode, String territory) {
        try (Connection con = ConexionBD.obtenerConexion(BBDD)) {
            String sql = "INSERT INTO offices (officeCode, city, phone, addressLine1, addressLine2, state, country, postalCode, territory) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, officeCode);
            ps.setString(2, city);
            ps.setString(3, phone);
            ps.setString(4, addressLine1);
            ps.setString(5, addressLine2);
            ps.setString(6, state);
            ps.setString(7, country);
            ps.setString(8, postalCode);
            ps.setString(9, territory);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al insertar oficina: " + e.getMessage());
            return false;
        }
    }

    public static boolean actualizarSalario(int employeeNumber, String lastName, String firstName) {
        try (Connection con = ConexionBD.obtenerConexion(BBDD)) {
            String sql = "UPDATE employees SET jobTitle = 'CEO' WHERE employeeNumber = ? AND lastName = ? AND firstName = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, employeeNumber);
            ps.setString(2, lastName);
            ps.setString(3, firstName);

            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al actualizar salario: " + e.getMessage());
            return false;
        }
    }
}
