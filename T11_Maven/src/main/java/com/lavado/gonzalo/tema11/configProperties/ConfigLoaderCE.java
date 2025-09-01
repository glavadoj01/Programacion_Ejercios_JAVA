package com.lavado.gonzalo.tema11.configProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoaderCE {
    private final Properties properties = new Properties();

    public ConfigLoaderCE(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo de configuración: " + e.getMessage());
        }
    }

    public String getCEUser() {
        return properties.getProperty("ce.user");
    }

    public String getCEPassword() {
        return properties.getProperty("ce.password");
    }

}
