package ejercicios_extra.ejercicioExtra.bbdd;

import tema11.ejercicios_extra.ejercicioExtra.modelos.Empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OperacionesBD {

    public static List<Empleado> cargarEmpleados() {
        List<Empleado> empleados = new ArrayList<>();

        try (Connection con = Conexion.getConnection()) {
            String sql = "SELECT * FROM employees";
            ResultSet rs = con.createStatement().executeQuery(sql);
            while (rs.next()) {
                empleados.add(new Empleado(rs.getInt(1),
                                            rs.getString(2),
                                            rs.getString(3),
                                            rs.getString(4),
                                            rs.getString(5),
                                            rs.getString(6),
                                            rs.getInt(7),
                                            rs.getString(8)
                ));
            }

        } catch (SQLException e) {
            System.err.println("Error al cargar los empleados: " + e.getMessage());
        }
        return empleados;
    }

    /**
     * Inserta un nuevo empleado en la base de datos.
     * @param nvE El objeto Empleado a insertar.
     * @return El ID del nuevo empleado insertado, o -1 si hubo un error.
     */
    public static boolean insertarEmpleado(Empleado nvE) {
        try (Connection con = Conexion.getConnection()) {
            String sql = "INSERT INTO employees (employeeNumber, lastName, firstName, extension, email, officeCode, reportsTo, jobTitle) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nvE.getEmployeeNumber());
            ps.setString(2, nvE.getLastName());
            ps.setString(3, nvE.getFirstName());
            ps.setString(4, nvE.getExtension());
            ps.setString(5, nvE.getEmail());
            ps.setString(6, nvE.getOfficeCode());
            ps.setInt(7, nvE.getReportsTo());
            ps.setString(8, nvE.getJobTitle());

            return ps.execute(); // Retorna true si se insertó al menos una fila

        } catch (SQLException e) {
            System.err.println("Error al insertar el empleado: " + e.getMessage());
            return false;
        }

    }

    public static boolean eliminarEmpleado(int idEmpleado) {
        try (Connection con = Conexion.getConnection()) {
            String sql = "DELETE FROM employees WHERE employeeNumber = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idEmpleado);
            return ps.execute();

        } catch (SQLException e) {
            System.err.println("Error al eliminar el empleado: " + e.getMessage());
            return false;
        }
    }
}
