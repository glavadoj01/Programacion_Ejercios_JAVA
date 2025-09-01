package com.lavado.gonzalo.tema11.ejercicio11.presentacion;

/*
Diseña un programa Java que muestre en pantalla las tablas de la base de datos classicModels consultando los metadatos.
*/

import com.lavado.gonzalo.tema11.ejercicio11.logica.ConexionBD;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        ConexionBD conexionBD = new ConexionBD();

        try (Connection conexion = conexionBD.obtenerConexion()) {
            DatabaseMetaData metaDatos = conexion.getMetaData();
            ResultSet tablas = metaDatos.getTables("classicmodels", null, "%", new String[]{"TABLE"});

            System.out.println("Tablas en la base de datos classicModels:");
            while (tablas.next()) {
                String nombreTabla = tablas.getString("TABLE_NAME");
                System.out.println("Tabla: " + nombreTabla);

                ResultSet columnas = metaDatos.getColumns("classicmodels", null, nombreTabla, "%");
                while (columnas.next()) {
                    String nombreColumna = columnas.getString("COLUMN_NAME");
                    String tipoColumna = columnas.getString("TYPE_NAME");
                    System.out.println("    Columna: " + nombreColumna + " (" + tipoColumna + ")");
                }
                columnas.close();
            }
            tablas.close();
        } catch (SQLException e) {
            System.out.println("Error al conectar o consultar la base de datos: " + e.getMessage());
        }
    }
}