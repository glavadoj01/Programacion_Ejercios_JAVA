package ejercicio9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Datos {
    public static ArrayList<Producto> leerDatos (String directorio, String fichero) throws IOException {
        Path ruta = Paths.get(directorio, fichero);
        if (!Files.exists(ruta)) {
            throw new IOException("No existe el fichero '" + fichero + "'; en la ruta: " + directorio);
        }

        ArrayList<Producto> catalogoE = new ArrayList<>();
        Producto productoT;
        String linea;
        String[] datos;

        try (BufferedReader br = Files.newBufferedReader(ruta)) {
            while ((linea=br.readLine()) != null ) {
                datos = linea.split(";");

                productoT = new Producto(datos[0],datos[1] );
                for (int i = 2; i <= datos.length-3; i++,i++) {
                    productoT.getVentas().put(Integer.parseInt(datos[i]), Integer.parseInt(datos[i+1]));
                }
                catalogoE.add(productoT);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IOException("Error al leer el fichero '" + fichero + '\'');
        }
        return catalogoE;
    }

    public static boolean escribirDatos(String directorio, String fichero, ArrayList<Producto> catalogoG) throws IOException {
        Path ruta = Paths.get(directorio, fichero);
        if (catalogoG.isEmpty()) {
            throw new IOException("La mémoria se encuentra vacía");
        }

        try (BufferedWriter br = Files.newBufferedWriter(ruta)) {
            for (Producto p : catalogoG) {
                br.write(p.toString());
                br.newLine();
            }
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IOException("Error al escribir el fichero '" + fichero + "'");
        }
    }
}