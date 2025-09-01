package ejemplos.ejemplo2;

import java.sql.*;

public class App {
    public static void main( String[] args ) {
        try {
            System.out.println();
            Operaciones.updateCategoria("Heli", "Helicóptero X3Z");

		} catch (SQLException e) {			
			System.out.println(e.getMessage());
		}
    }
}
