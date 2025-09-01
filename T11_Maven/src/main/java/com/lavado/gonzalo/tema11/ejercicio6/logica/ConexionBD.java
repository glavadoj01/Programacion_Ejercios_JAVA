package com.lavado.gonzalo.tema11.ejercicio6.logica;

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

    public static void addConsulta(PdfPTable table, String poblacion) throws SQLException {
        try (Connection con = new ConexionBD().obtenerConexion()) {
            String query = "SELECT customerNumber, customerName, phone, city, country  FROM customers WHERE city = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, poblacion);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Stream.of(rs.getString("customerNumber"),
                            rs.getString("customerName"),
                            rs.getString("phone"),
                            rs.getString("city"),
                            rs.getString("country")
                    ).forEach(column -> {
                                PdfPCell cell = new PdfPCell(new Phrase(column));
                                cell.setBorderWidth(1);
                                table.addCell(cell);
                    }
                );
            }
        }
    }
}
