package ejercicio13;

import recursos.RecursosIO;

import java.nio.file.Paths;

public class ListaPaises {
    public static void main(String[] args) {
        String rutaOrigen = System.getProperty("user.dir") + "/src/tema10/ejercicio13";
        String extension = ".txt";
        String nombreArchivoSalida = "Países_Conjunto.txt";

        try {
            if (RecursosIO.fusionarArchivos(Paths.get(rutaOrigen), extension, nombreArchivoSalida)) {
                System.out.println("Archivos fusionados");
            } else {
                System.out.println("Archivos no fusionados");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
