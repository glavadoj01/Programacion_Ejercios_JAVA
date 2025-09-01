package ejercicio4.operaciones;

import tema11._00_recursosComunes.ConexionBD;

import java.sql.*;

public class Operaciones {

    public static void mostrarClientes() {
        System.out.println("============================");
        System.out.println("============================");
        System.out.println("******** CLIENTES **********");
        System.out.println("============================");
        System.out.println("============================");
        try (Connection con = ConexionBD.obtenerConexion("classicmodels")) {
            String sql = "SELECT customerNumber, customerName FROM customers";
            ResultSet rs = con.createStatement().executeQuery(sql);
            System.out.println("Id\tNombre Cliente");
            System.out.println("============================");
            while (rs.next()) {
                System.out.println(rs.getInt("customerNumber") + "\t" + rs.getString("customerName"));
                // System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar clientes: " + e.getMessage());

        }
    }

    public static void mostrarPedidos(int idBusc) {

        try (Connection con = ConexionBD.obtenerConexion("classicmodels")) {
            String sql = "SELECT orderNumber, orderDate, status FROM orders WHERE customerNumber = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idBusc);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n\nPedidos del cliente " + idBusc);
            System.out.println("============================");
            System.out.println("Número de pedido\tFecha de pedido\tEstado");
            System.out.println("============================");
            while (rs.next()) {
                System.out.println(rs.getInt("orderNumber") + "\t" + rs.getDate("orderDate") + "\t" + rs.getString("status"));
                // System.out.println(rs.getInt(1) + "\t" + rs.getDate(2) + "\t" + rs.getString(3));
            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar pedidos: " + e.getMessage());

        }

    }
}
