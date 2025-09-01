package ejercicio4;

/*
Diseña un programa Java que tenga una clase con un metodo estático que permita:
    a. Leer líneas de un archivo de texto cualquiera y guardarlas en un arrayList.
    b. Ordenar el arrayList
    c. Volver a escribir las palabras en el archivo.
*/

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;


public class UtilTextos {

    public static ArrayList<String> leerLineasRuta(String directorio, String fichero) {
        try {
            Path p = Paths.get(directorio, fichero);
            return leerPath(p);
        } catch (NotDirectoryException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static ArrayList<String> leerLineasRuta(String rutaCompleta) {
        try {
            Path p = Paths.get(rutaCompleta);
            return leerPath(p);
        } catch (NotDirectoryException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private static ArrayList<String> leerPath(Path p) throws NotDirectoryException {
        if (!Files.exists(p)) {
            throw new NotDirectoryException(p.toString());
        }

        ArrayList<String> lista = new ArrayList<>();
        BufferedReader br;
        String linea;

        try {
            br = new BufferedReader(new FileReader(p.toFile()));
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    public static ArrayList<String> ordenarArray(ArrayList<String> arrayListEntrada) {
        Collections.sort(arrayListEntrada);
        return arrayListEntrada;
    }

    public static boolean escribirDatos(ArrayList<String> entrada, String ruta) {
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
