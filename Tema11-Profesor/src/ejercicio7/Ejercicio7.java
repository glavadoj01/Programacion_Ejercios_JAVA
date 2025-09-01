package ejercicio7;

import tema11.ConectarBD;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Ejercicio 7
 * Diseña una aplicación Java que genere un archivo de texto con los productos de una
 * categoría concreta de la base de datos “classicModels”. Cada registro de la tabla
 * debe corresponderse con una línea del archivo. Utiliza el punto y coma (;) como
 * separador de columnas en el archivo. Usa solo los campos código, nombre, categoría,
 * precio de venta y de compra. El archivo tendrá el nombre
 * Productos_Categoria_XXXX.txt, donde XXXX será la categoría elegida.
 */
public class Ejercicio7 {
    Connection c = null;

    public Ejercicio7(String bd){
        try {
            c = ConectarBD.getConexion(bd);
            System.out.println("Conexión a la base de datos " + bd + " establecida.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public void muestraCategorias(){
        try{
            String sql = "SELECT productLine FROM productlines";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                System.out.println("Categoría: " + rs.getString(1));
            }
        }catch(SQLException e){
            System.out.println("Error al listar las categorías: " + e.getMessage());
        }
    }

    public ResultSet muestraProductos(String categoria){
        try{
            String sql = "SELECT productCode, productName, productLine, buyPrice, MSRP FROM products" +
                    " WHERE productLine = '" + categoria + "'";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        }catch(SQLException e){
            System.out.println("Error al listar los productos: " + e.getMessage());
        }

        return null;
    }

    public void guardaResulset(ResultSet rs, String categoria){

        String f = "Productos_Categoria_" + categoria + ".txt";
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("src/tema11/ejercicio7/" + f));
            while (rs.next()) {
                bw.write(rs.getString(1) + ";" +
                        rs.getString(2) + ";" +
                        rs.getString(3) + ";" +
                        rs.getDouble(4) + ";" +
                        rs.getDouble(5));
                bw.newLine();
            }
        }catch(IOException e){
            System.out.println("Error al guardar el resultado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error al guardar el resultado: " + e.getMessage());
        }finally {
            try {
                if (bw != null) {
                    bw.close();
                    System.out.println("Archivo " + f + " creado.");
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar el archivo: " + e.getMessage());
            }
        }
    }

    public void cerrarConexion(){
        try {
            if (c != null) {
                c.close();
                System.out.println("Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
