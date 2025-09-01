package ejercicio1;

import tema11.ConectarBD;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio1 {
    Connection c = null;
    public Ejercicio1() {
        try{
            c= ConectarBD.getConexion("classicmodels");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void mostrarClientesLocalidad(String nombreLocalidad) {

        try{
            Statement st = c.createStatement();
            String sql = "SELECT customerNumber, customerName, phone, city FROM customers" +
                    " WHERE city = '" + nombreLocalidad + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + ", " + rs.getString(2) +
                        " " + rs.getString(3) + ", " + rs.getString(4));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void mostrarCategorias(){

        try{

            Statement st = c.createStatement();
            String sql = "SELECT * FROM productlines";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString(1) + ", " + rs.getString(2));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarProductoCategoria(String categoria) {
        try{
            Statement st = c.createStatement();
            String sql = "SELECT productCode, productName, buyPrice, productLine FROM products" +
                    "  WHERE productLine = '" + categoria + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getInt(1) + ", " + rs.getString(2) +
                        " " + rs.getString(3) + ", " + rs.getString(4));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }







    public void cerrarConexion() {
        try{
            if (c != null) {
                ConectarBD.closeConnection();
            }
        } catch (SQLException e) {
            System.out.println();
        }
    }
}
