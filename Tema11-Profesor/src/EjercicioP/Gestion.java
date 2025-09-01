package EjercicioP;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Gestion {
    private Map<Integer, String> mapaP;

    public Gestion() {
        this.mapaP = new HashMap<>();
        cargarMapa();
    }

    private void cargarMapa() {
        try {
            GestionBD gbd = new GestionBD();
            ResultSet rs = gbd.leerParticipantes();
            while (rs.next()) {
                /*int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                Participante p = new Participante(id, nombre);*/
                mapaP.put(rs.getInt("id"), rs.getString("nombreApellido"));
            }
        }catch (SQLException e) {
            System.out.println("Error al cargar los participantes: " + e.getMessage());
        }
    }


    public Map<Integer, String> getMapaP() {
        return mapaP;
    }
}
