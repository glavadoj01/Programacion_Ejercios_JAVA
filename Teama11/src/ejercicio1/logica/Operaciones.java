package ejercicio1.logica;

import tema11._01_modelos.*;
import tema11._00_recursosComunes.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {

    private static final String bbdd = "classicmodels";

    public static List<Cliente> obtenerClientesPorLocalidad(String ciudad) {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT customerNumber, customerName, phone, city FROM customers WHERE city = ?";

        try (Connection con = ConexionBD.obtenerConexion(bbdd);
             PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, ciudad);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCustomerNumber(rs.getInt("customerNumber"));
                cliente.setCustomerName(rs.getString("customerName"));
                cliente.setPhone(rs.getString("phone"));
                cliente.setCity(rs.getString("city"));
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return clientes;
    }

    public static List<Categoria> obtenerCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        String query = "SELECT productLine, textDescription FROM productlines";

        try (Connection con = ConexionBD.obtenerConexion(bbdd)) {
            ResultSet rs = con.createStatement().executeQuery(query);
            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setNombre(rs.getString("productLine"));
                categoria.setDescripcion(rs.getString("textDescription"));
                categorias.add(categoria);
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return categorias;
    }

    public static List<Producto> obtenerProductosCategoria(String categoriaIn) {
        String query = "SELECT productCode, productName, buyPrice, MSRP, productLine FROM products WHERE productLine = '" + categoriaIn + "';";

        return getProductos(query);
    }

    public static List<Producto> obtenerProductosPrecios(double precio1, double precio2) {
        String query = "SELECT productCode, productName, buyPrice, MSRP, productLine FROM products WHERE buyPrice >= " +
                Math.min(precio1,precio2) + " && buyPrice <= " + Math.max(precio1,precio2);

        return getProductos(query);
    }

    private static List<Producto> getProductos(String query) {
        List<Producto> productos = new ArrayList<>();

        try (Connection con = ConexionBD.obtenerConexion(bbdd)) {
            ResultSet rs = con.createStatement().executeQuery(query);
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setProductCode(rs.getString("productCode"));
                producto.setProductName(rs.getString("productName"));
                producto.setBuyPrice(rs.getDouble("buyPrice"));
                producto.setMSRP(rs.getDouble("MSRP"));
                producto.setProductLine(rs.getString("productLine"));
                productos.add(producto);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return productos;
    }

}
