package ejercicioExtra;

import tema11.ConectarBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GestionBD {
    private Connection c = null;

    public GestionBD() {
        try {
            c = ConectarBD.getConexion("classicmodels");        // Constructor
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public List<Empleado> leerEmpleados() {
        List<Empleado> listaE = new ArrayList<>();

        try {
            String sql = "SELECT * FROM employees";
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                listaE.add(new Empleado(rs.getInt("employeeNumber"), rs.getString("lastName"),
                        rs.getString("firstName"), rs.getString("extension"),
                        rs.getString("email"), rs.getString("officeCode"),
                        rs.getInt("reportsTo"), rs.getString("jobTitle")));
            }
        } catch (SQLException e) {
            System.out.println("Error al leer empleados: " + e.getMessage());
        }

        return listaE;
    }

    public int insertarEmpleado(Empleado e) {
        int n=0;
        try {
            String sql = "INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, e.getEmployeeNumber());
            ps.setString(2, e.getLastName());
            ps.setString(3, e.getFirstName());
            ps.setString(4, e.getExtension());
            ps.setString(5, e.getEmail());
            ps.setString(6, e.getOfficeCode());
            ps.setInt(7, e.getReportsTo());
            ps.setString(8, e.getJobTitle());

            n = ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al insertar empleado: " + ex.getMessage());
        }
        return n;
    }

    public int eliminarEmpleado(int employeeNumber) {
        int n=0;
        try {
            String sql = "DELETE FROM employees WHERE employeeNumber = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, employeeNumber);
            n = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar empleado: " + e.getMessage());
        }
        return n;
    }

    public int modificarEmpleado(Empleado e) {
        int n=0;
        try {
            String sql = "UPDATE employees SET lastName = ?, firstName = ?, extension = ?," +
                    " email = ?, officeCode = ?, reportsTo = ?, jobTitle = ? WHERE employeeNumber = ?";
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, e.getLastName());
            ps.setString(2, e.getFirstName());
            ps.setString(3, e.getExtension());
            ps.setString(4, e.getEmail());
            ps.setString(5, e.getOfficeCode());
            ps.setInt(6, e.getReportsTo());
            ps.setString(7, e.getJobTitle());
            ps.setInt(8, e.getEmployeeNumber());

            n = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al modificar empleado: " + ex.getMessage());
        }
        return n;
    }
    public void cerrarConexion() {
        try {
            if (c != null && !c.isClosed()) {
                ConectarBD.closeConnection();
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

}
