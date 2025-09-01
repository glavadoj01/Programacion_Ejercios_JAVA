package examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AccesoFicheros {

    public List<String> leerFicheroSql(String ruta) {
        List<String> listaSql = new ArrayList<>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = br.readLine()) != null) {
                listaSql.add(linea);
            }
            return listaSql;
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
            return null;
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println("Error al cerrar el fichero: " + e.getMessage());
            }
        }
    }

    /**
     * Es una version de leerFicheroSql pero sin el finally, ya que  se cierra  el fichero
     * automaticamente al salir del bloque try-with-resources. Para ello hay que definir
     * bufferreader despues del try y no antes.
      * @param ruta
     * @return
     */
    public List<String> leerFicheroSql1(String ruta) {
            List<String> listaSql = new ArrayList<>();

            try(BufferedReader br = new BufferedReader(new FileReader(ruta))){

                String linea;
                while ((linea = br.readLine()) != null) {
                    listaSql.add(linea);
                }
                return listaSql;
            } catch (IOException e) {
                System.out.println("Error al leer el fichero: " + e.getMessage());
                return null;
            }
    }

}
