package EjercicioQ;

import java.sql.ResultSet;
import java.util.*;

public class Operaciones {

    private Map<String, String> miMap;

    public Operaciones() {
        this.miMap = new HashMap<>();
    }

    public void rellenaMap(){
        List<String> lineas = AccesoArchivo.leerArchivo("src/tema11/EjercicioQ/participantes.csv");
        String [] partes;

        for (String l : lineas) {
            partes = l.split(", ");
            miMap.put(partes[0], partes[1] + ", " + partes[2]);
        }
    }

    public void muestraMap(){

        /*for (Map.Entry<String, String> entry : miMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }*/

        for (String key : miMap.keySet()) {
            System.out.println(key + " -> " + miMap.get(key));
        }
    }

    public void muestra20ElementosAlAzar() {
        List<String> claves = new ArrayList<>(miMap.keySet());
        Collections.shuffle(claves); // Mezcla las claves aleatoriamente

        for (int i = 0; i < 20 && i < claves.size(); i++) {
            String key = claves.get(i);
            System.out.println(key + " -> " + miMap.get(key));
        }
    }
    public  void buscarParticipante(String dni){
        ResultSet rs;
        // Buscamos el participante por su DNI
        String participante = miMap.get(dni);
        // Separar en nombre y apellidos
        String[] partes = participante.split(", ");
        try {
            rs = AccesoBDatos.buscarParticipante(partes[0], partes[1]);
            while(rs.next()){
                System.out.println("Id: " + rs.getInt(1));
                System.out.println("Nombre: " + rs.getString("nombre"));
                System.out.println("Apellidos: " + rs.getString("apellidos"));
                System.out.println("Telefono: " + rs.getString("telefono"));
                System.out.println("Email: " + rs.getString("email"));
                System.out.println("Direccion: " + rs.getString("direccion"));
                System.out.println("Ciudad: " + rs.getString("ciudad"));
                System.out.println("Cpostal: " + rs.getString("cpostal"));
            }
        } catch (Exception e) {
            System.out.println("Error al buscar el participante: " + e.getMessage());
        }

    }
}
