package datosDB;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CredencialesBD {
    private final Properties properties = new Properties();

    public CredencialesBD(String filePath) {
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
}
