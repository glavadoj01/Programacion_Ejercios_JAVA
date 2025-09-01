package ejercicio14;

/*
Ahora ampliaremos la funcionalidad del ejercicio 6, que buscaba una cadena en las líneas de un archivo,
haciendo que busque en todos los archivos de un directorio.
Nota: Descargar los archivos donde se debe buscar.
*/

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String patron;

        while (true) {
            System.out.println("Para salir: fin");
            System.out.print("Ingresar un patrón: ");
            patron = sc.nextLine();
            int i;

            if (patron.equalsIgnoreCase("fin")) {
                break;
            }

            // Para leer solo los archivos de texto plano
            FilenameFilter filtro = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".txt");
                }
            };
            // Recomendación IDE => Sustituir por Lambda:
            // FilenameFilter filtro = (dir, name) -> name.endsWith(".txt");

            Path dirOrigen = Paths.get(System.getProperty("user.dir") + "/src/tema10/ejercicio14");

            for (String file : Objects.requireNonNull(dirOrigen.toFile().list(filtro))) {
                try {
                    i = 1;
                    Path archivo = Paths.get(dirOrigen.toString(),"/", file);
                    System.out.println("Buscando \"" + patron + "\" en " +  file);
                    System.out.println("*****************************************");
                    for (String linea : Files.readAllLines(archivo)) {
                        if (linea.contains(patron)) {
                            System.out.println("Encontrada en la línea " + i + ": " + linea);
                        }
                        i++;
                    }
                    System.out.println();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }


            }
        }
        sc.close();
    }
}



