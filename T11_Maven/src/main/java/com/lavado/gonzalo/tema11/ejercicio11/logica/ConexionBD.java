package com.lavado.gonzalo.tema11.ejercicio11.logica;

import com.lavado.gonzalo.tema11.configProperties.ConfigLoader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final ConfigLoader config = new ConfigLoader("config1.properties");
    private static final String URL = "jdbc:mysql://localhost:3306/classicmodels";
    private static final String USER = config.getDbUser();
    private static final String PASSWORD = config.getDbPassword();



    public Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }


}
