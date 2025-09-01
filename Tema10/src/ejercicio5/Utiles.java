package ejercicio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Utiles {

    public static boolean AgregarDatos(String ruta, ArrayList<String> datosExtra) {
        try {
            ArrayList<String> entrada = new ArrayList<>(Files.readAllLines(Paths.get(ruta)));
            entrada.addAll(datosExtra);
            return escribirDatos(entrada, ruta);
        }catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean escribirDatos(ArrayList<String> entrada, String ruta) {
        if (entrada == null || !Files.exists(Paths.get(ruta))) {
            System.out.println("No se puede escribir el archivo");
            return false;
        } else {
            BufferedWriter salida;
            try {
                salida = new BufferedWriter(new FileWriter(ruta));
                for (String s : entrada) {
                    salida.write(s);
                    salida.newLine();
                }
                salida.close();
                return true;
            } catch (IOException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }
    }
}
