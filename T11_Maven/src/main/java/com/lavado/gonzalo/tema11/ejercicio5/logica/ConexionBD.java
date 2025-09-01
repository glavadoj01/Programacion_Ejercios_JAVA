package com.lavado.gonzalo.tema11.ejercicio5.logica;

import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.lavado.gonzalo.tema11.configProperties.ConfigLoader;

import java.sql.*;
import java.util.stream.Stream;

public class ConexionBD {

    private static final ConfigLoader config = new ConfigLoader("config1.properties");
    private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
    private static final String USER = config.getDbUser();
    private static final String PASSWORD = config.getDbPassword();



    private Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void addConsulta(PdfPTable table, float precioMinimo, float precioMaximo) throws SQLException {
        try (Connection con = new ConexionBD().obtenerConexion()) {
            String query = "SELECT productCode, productName, productVendor, MSRP FROM products WHERE MSRP BETWEEN ? AND ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setFloat(1, precioMinimo);
            ps.setFloat(2, precioMaximo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Stream.of(rs.getString("productCode"),
                                rs.getString("productName"),
                                rs.getString("productVendor"),
                                String.valueOf(rs.getFloat("MSRP")))
                        .forEach(column -> {
                                    PdfPCell cell = new PdfPCell(new Phrase(column));
                                    cell.setBorderWidth(1);
                                    table.addCell(cell);
                        }
                );
            }
        }
    }
}
