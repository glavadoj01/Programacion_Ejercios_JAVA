package recursoscomunes;

import java.io.*;
import java.util.ArrayList;

public class Utiles {

    public static boolean escribirDatos(ArrayList<String> datos, String ruta) {
        BufferedWriter escribir;

        try {
            escribir = new BufferedWriter( new FileWriter(ruta));
            for (String dato : datos) {
                escribir.write(dato);
                escribir.newLine();
            }
            escribir.close();
            return true;
        }catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean escribirDato(String dato, String ruta) {
        BufferedWriter escribir;
        try {
            escribir = new BufferedWriter( new FileWriter(ruta));
            escribir.write(dato);
            escribir.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static void leerYMostrarDatos(String ruta) {
        BufferedReader leer;
        String linea;

        try {
            leer = new BufferedReader( new FileReader(ruta));

            while ((linea = leer.readLine()) != null) {
                System.out.println(linea);
            }

            leer.close();

        }catch (IOException e) {
            System.out.println("Error en la lectura del archivo");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("*******************************");
            System.out.println("*******************************");
        }
    }

    public static ArrayList<String> leerDatos(String ruta) {
        BufferedReader leer;
        String linea;
        ArrayList<String> salida = new ArrayList<>();

        try {
            leer = new BufferedReader( new FileReader(ruta));
            while ((linea = leer.readLine()) != null) {
                salida.add(linea);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return salida;
    }
}
