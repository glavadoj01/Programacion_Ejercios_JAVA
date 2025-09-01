package ejercicio3;

import tema11.ConectarBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Diseña un proyecto Java que permita realizar estas tareas sobre la base de datos
 * classicModels (yo he utilizado una copia de la tabla productos).
 * a. Actualizar precios de venta de productos. Incrementar todos un 5%
 * b. Actualizar el precio de venta de un producto. Incrementar un % el precio de
 * venta de un producto identificado por su código.
 * c. Eliminar producto a partir de su código
 * d. Insertar nuevo producto.
 */
public class Ejercicio3 {
    public void incrementarPrecios(double porcentaje) {

        try{
            Connection con = ConectarBD.getConexion("classicmodels");
            String sql = "UPDATE products SET buyPrice = buyPrice * (1 + ? / 100)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, porcentaje);
            int filasActualizadas = ps.executeUpdate();
            System.out.println("Se han actualizado " + filasActualizadas + " filas.");
        }catch (SQLException e){
            System.out.println("Error al incrementar precios: " + e.getMessage());
        }finally {
            try {
                ConectarBD.closeConnection();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public void incremetarPrecioProducto(double porcentaje, String codigo) {
        try{
            Connection con = ConectarBD.getConexion("classicmodels");
            String sql = "UPDATE products SET buyPrice = buyPrice * (1 + ? / 100) WHERE productCode = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, porcentaje);
            ps.setString(2, codigo);
            int filasActualizadas = ps.executeUpdate();
            System.out.println("Se han actualizado " + filasActualizadas + " filas.");
        }catch (SQLException e){
            System.out.println("Error al incrementar precio del producto: " + e.getMessage());
        }finally {
            try {
                ConectarBD.closeConnection();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public void eliminarProducto(String codigo) {
        try{
            Connection con = ConectarBD.getConexion("classicmodels");
            String sql = "DELETE FROM products WHERE productCode = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            int filasEliminadas = ps.executeUpdate();
            System.out.println("Se han eliminado " + filasEliminadas + " filas.");
        }catch (SQLException e){
            System.out.println("Error al eliminar producto: " + e.getMessage());
        }finally {
            try {
                ConectarBD.closeConnection();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public void insertarProducto(String codigo, String nombre, double precio) {
        try{
            Connection con = ConectarBD.getConexion("classicmodels");
            String sql = "INSERT INTO products (productCode, productName, buyPrice) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setDouble(3, precio);
            int filasInsertadas = ps.executeUpdate();
            System.out.println("Se han insertado " + filasInsertadas + " filas.");
        }catch (SQLException e){
            System.out.println("Error al insertar producto: " + e.getMessage());
        }finally {
            try {
                ConectarBD.closeConnection();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
