package ejemplos.ejemplo2;

import tema11._00_recursosComunes.ConexionBD;
import java.sql.SQLException;
import java.sql.Statement;

public class Operaciones {

	public static int insertarCategoria(String categoria, String descripcion) throws SQLException {

		Statement statement = ConexionBD.obtenerConexion("neptuno").createStatement();

		String sqlInsert = "Insert into categoriasproductos (categoria, descripcion) " + "values ('" + categoria
				+ "', '" + descripcion + "')";

		return statement.executeUpdate(sqlInsert);

	}

	public static int deleteCategoria(String categoria) throws SQLException {

		Statement statement = ConexionBD.obtenerConexion("neptuno").createStatement();

		String sqlDelete = "delete from categoriasproductos where categoria ='"
				+ categoria + "'";

		return statement.executeUpdate(sqlDelete);
	}
	
	public static int updateCategoria(String categoria, String descripcionNueva) throws SQLException {

		Statement statement = ConexionBD.obtenerConexion("neptuno").createStatement();

		String sqlUpdate = "update categoriasproductos set descripcion = '"
				+ descripcionNueva + "' where categoria = '" + categoria + "'";

		return statement.executeUpdate(sqlUpdate);
	}
}
