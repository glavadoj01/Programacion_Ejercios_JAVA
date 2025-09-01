import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class PruebaBD {
    public static void main(String[] args) {

        Operaciones.consulta();
        try {
            int filasInsertadas = Operaciones.insertarJugador("Juan", "Lakers");
            System.out.println("Filas insertadas: " + filasInsertadas);
        } catch (Exception e) {
            System.out.println("Error al insertar jugador: " + e.getMessage());
        }

        try {
            int filasEliminadas = Operaciones.deleteCategoria(614);
            System.out.println("Filas eliminadas: " + filasEliminadas);
        } catch (Exception e) {
            System.out.println("Error al eliminar jugador: " + e.getMessage());
        }
        try {
            int filasActualizadas = Operaciones.updateCategoria("Juan", "Lakers");
            System.out.println("Filas actualizadas: " + filasActualizadas);
        } catch (Exception e) {
            System.out.println("Error al actualizar jugador: " + e.getMessage());
        }

    }
}
