package ejercicio4;

import tema11.ConectarBD;

import java.sql.*;

/**
 * Ejercicio 4
 * Diseña un programa Java que muestre al usuario una lista de los clientes de la base
 * de datos “classicModels” (número de cliente y nombre), el usuario elegirá uno y el
 * programa mostrará por pantalla todos los pedidos de ese cliente con los datos: número
 * de pedido, fecha de pedido y estado.
 */
public class Ejercicio4 {
    Connection c = null;

    public Ejercicio4(String baseDatos) {

        try {
            c = ConectarBD.getConexion(baseDatos);
            System.out.println("Conexión a la base de datos " + baseDatos + " establecida.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public void listarClientes() {

        try{
            c = ConectarBD.getConexion("classicmodels");
            String sql = "SELECT customerNumber, customerName FROM customers";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Cliente: " + rs.getInt("customerNumber") + " - " + rs.getString("customerName"));
            }

        }catch (SQLException e){
            System.out.println("Error al listar los clientes: " + e.getMessage());
        }
    }

    /**
     * Muestra los pedidos de un cliente con Statement
     * @param customerNumber
     */
    public void pedidosCliente(int customerNumber) {

        try {
            c = ConectarBD.getConexion("classicmodels");
            String sql = "SELECT orderNumber, orderDate, status FROM orders WHERE customerNumber =" + customerNumber;
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Pedido: " + rs.getInt("orderNumber") +
                        " - Fecha: " + rs.getDate("orderDate") +
                        " - Estado: " + rs.getString("status"));
            }

        } catch (SQLException e) {
            System.out.println("Error al listar los pedidos del cliente: " + e.getMessage());
        }
    }
    /**
     * Muestra los pedidos de un cliente con PreparedStatement
     * @param customerNumber
     */
    public void pedidosCliente1(int customerNumber) {

        try {
            c = ConectarBD.getConexion("classicmodels");
            String sql = "SELECT orderNumber, orderDate, status FROM orders WHERE customerNumber = ?";
            PreparedStatement pst = c.prepareStatement(sql);
            pst.setInt(1, customerNumber);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println("Pedido: " + rs.getInt("orderNumber") +
                        " - Fecha: " + rs.getDate("orderDate") +
                        " - Estado: " + rs.getString("status"));
            }

        } catch (SQLException e) {
            System.out.println("Error al listar los pedidos del cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void cerrarConexion() {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
