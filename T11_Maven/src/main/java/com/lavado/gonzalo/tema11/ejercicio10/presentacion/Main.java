package com.lavado.gonzalo.tema11.ejercicio10.presentacion;

/*
Diseña un programa Java que muestre en pantalla las tablas de la base de datos classicModels consultando los metadatos.
*/

import com.lavado.gonzalo.tema11.ejercicio10.logica.ConexionBD;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        ConexionBD conexionBD = new ConexionBD(); // Llamada a constructor vacío (métodos no estáticos)

        try (Connection conexion = conexionBD.obtenerConexion()) {
            DatabaseMetaData metaDatos = conexion.getMetaData();
            ResultSet tablas = metaDatos.getTables("classicmodels", null, "%", new String[]{"TABLE"});

            System.out.println("Tablas en la base de datos classicModels:");
            while (tablas.next()) {
                String nombreTabla = tablas.getString("TABLE_NAME");
                System.out.println(nombreTabla);
            }
            tablas.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar o consultar la base de datos: " + e.getMessage());
        }
    }
}