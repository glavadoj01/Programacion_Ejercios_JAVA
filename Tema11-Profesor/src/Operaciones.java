import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operaciones {

    public static void consulta(){
        try {
            Connection c =ConectarBD.getConexion("NBA");
            System.out.println("Conexión establecida con la base de datos.");
            Statement st = c.createStatement();
            String sql = "select * from jugadores";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                String nombre = rs.getString("Nombre");
                String equipo = rs.getString("Nombre_equipo");
                System.out.println("Nombre: " + nombre + ", Equipo: " + equipo);
            }
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        } finally {
            try {
                ConectarBD.closeConnection();
                System.out.println("Conexión cerrada.");
            } catch (Exception e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    public static int insertarJugador(String nombre, String equipo) throws SQLException {

            Connection c = ConectarBD.getConexion("NBA");
            Statement st = c.createStatement();
            //Statement statement = ConectarBD.getConexion("NBA").createStatement();

            String sqlInsert = "Insert into jugadores (codigo, Nombre, Nombre_equipo) " + "values ('614','" + nombre
                    + "', '" + equipo + "')";

            return st.executeUpdate(sqlInsert);

    }

    public static int deleteCategoria(int codigo) throws SQLException {

        Statement st = ConectarBD.getConexion("NBA").createStatement();

        String sqlDelete = "delete from jugadores where codigo ='"
                + codigo + "'";

        return st.executeUpdate(sqlDelete);
    }

    public static int updateCategoria(String nombre, String equipo)
            throws SQLException {

        Statement statement = ConectarBD.getConexion("NBA").createStatement();

        String sqlUpdate = "update jugadores set Nombre_equipo = '"
                + equipo + "' where Nombre = '" + nombre + "'";

        return statement.executeUpdate(sqlUpdate);
    }
}
