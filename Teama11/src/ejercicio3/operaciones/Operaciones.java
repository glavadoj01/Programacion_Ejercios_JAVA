package ejercicio3.operaciones;

import tema11._00_recursosComunes.ConexionBD;

import java.sql.*;

public class Operaciones {

    private static final String bbdd = "classicmodels";

    /** Actualiza todos los precios en un +5%
     *
     */
    public static void actualizarPreciosVenta() {
        try (Connection c = ConexionBD.obtenerConexion(bbdd)) {
            String sql = "UPDATE products SET MSRP = MSRP*1.05";
            Statement stmt = c.createStatement();
            stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());

        }
    }

    /** Actualiza el precio de venta de un producto
     *
     * @param codigo código del producto
     * @param porcentaje porcentaje de incremento
     * @return nº de filas afectadas
     * @throws SQLException Excepción SQL
     */
    public static int actualizarPrecioVenta(String codigo, double porcentaje) throws SQLException {
        String sql = "UPDATE products SET MSRP = MSRP*? WHERE productCode = ?";
        try (Connection c = ConexionBD.obtenerConexion(bbdd)) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setDouble(1, 1+(porcentaje/100));
            ps.setString(2, codigo);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    /** Elimina un producto
     *
     * @param codigo código del producto
     * @return nº de filas afectadas
     * @throws SQLException Excepción SQL
     */
    public static int eliminarProducto(String codigo) throws SQLException {
        String sql = "DELETE FROM products WHERE productCode = ?";
        try (Connection c = ConexionBD.obtenerConexion(bbdd)) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, codigo);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }

    /** Inserta un producto
     *
     * @param codigo código del producto
     * @param nombre nombre del producto
     * @param categoria categoría del producto
     * @param escala escala del producto
     * @param vendedor proveedor del producto
     * @param descripcion descripción del producto
     * @param stock stock del producto
     * @param precioC precio de compra del producto
     * @param precioV precio de venta del producto
     * @return nº de filas afectadas
     * @throws SQLException Excepción SQL
     */
    public static int insertarProducto(String codigo, String nombre, String categoria, String escala, String vendedor, String descripcion, int stock, double precioC, double precioV) throws SQLException {
        String sql = "INSERT INTO products (productCode, productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, MSRP) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection c = ConexionBD.obtenerConexion(bbdd)) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, codigo);
            ps.setString(2, nombre);
            ps.setString(3, categoria);
            ps.setString(4, escala);
            ps.setString(5, vendedor);
            ps.setString(6, descripcion);
            ps.setInt(7, stock);
            ps.setDouble(8, precioC);
            ps.setDouble(9, precioV);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    }
}
