package ejercicio1;

import java.io.FileWriter;
import java.io.IOException;

public class Escritura {
    public static void CharAChar(String entrada    ) {
        FileWriter salida = null;
        try {
            salida = new FileWriter("src/tema10/ejercicio1/pruebaSalida.txt");
            for (char c : entrada.toCharArray()) {
                salida.write(c);
            }
            System.out.println("Escritura completada");
        }
        catch (IOException e) {
            System.out.println("Error de escritura");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                salida.close();
            }
            catch (Exception e) {
                System.out.println("Error de escritura");
                System.out.println(e.getMessage());
            }
        }
    }
}
