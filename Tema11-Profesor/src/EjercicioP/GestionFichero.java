package EjercicioP;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class GestionFichero {

    public void guardarFichero(Map<Integer, String> mapaP, String pathFichero) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFichero))) {
           /* for (Map.Entry<Integer, String> entry : mapaP.entrySet()) {
                bw.write(entry.getKey() + "," + entry.getValue());
                bw.newLine();
            }*/
            for (Integer k : mapaP.keySet()) {
                bw.write(k + ", "+ mapaP.get(k));
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }
}
