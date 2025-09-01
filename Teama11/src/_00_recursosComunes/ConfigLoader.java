package _00_recursosComunes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {
    private final Properties properties = new Properties();

    public ConfigLoader(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) {
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo de configuración: " + e.getMessage());
        }
    }

    public String getDbUser() {
        return properties.getProperty("db.user");
    }

    public String getDbPassword() {
        return properties.getProperty("db.password");
    }

    // Solo para propósitos de prueba
    public static void main(String[] args) {
        ConfigLoader config = new ConfigLoader("config.properties");
        System.out.println("Usuario: " + config.getDbUser());
        System.out.println("Contraseña: " + config.getDbPassword());
    }
}
