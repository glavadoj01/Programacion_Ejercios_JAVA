package ejercicios_extra.ejercicioExtra.gestion;

import tema11.ejercicios_extra.ejercicioExtra.bbdd.OperacionesBD;
import tema11.ejercicios_extra.ejercicioExtra.modelos.Empleado;

import java.util.List;

public class GestionEmpleados {
    private final List<Empleado> empleados;

    public GestionEmpleados() {
        this.empleados = OperacionesBD.cargarEmpleados();
    }

    public void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            System.out.println("---------------------------------");
            System.out.printf("%-4s %-20s %-20s %-10s %-30s %-10s %-4s %-20s%n", "ID", "Nombre", "Apellido", "Extensión", "Correo", "Código de Oficina", "Id Jefe","Titulo");
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

    public boolean insertarEmpleado(int id, String apellido, String nombre, String extension, String email, String codigoOf, int jefeId, String cargo) {
        Empleado nuevoEmpleado = new Empleado(id, apellido, nombre, extension, email, codigoOf, jefeId, cargo);

        boolean resultado = OperacionesBD.insertarEmpleado(nuevoEmpleado);
        if (resultado) {
            empleados.add(nuevoEmpleado);
        }
        return resultado;
    }

    public boolean eliminarEmpleado(int idEmpleado) {
        boolean eliminado = OperacionesBD.eliminarEmpleado(idEmpleado);
        if (eliminado) {
            empleados.removeIf(e -> e.getEmployeeNumber() == idEmpleado);
        }
        return eliminado;
    }

    public Empleado buscarEmpleado(int idEmpleado) {
        return empleados.stream()
                .filter(e -> e.getEmployeeNumber() == idEmpleado)
                .findFirst().orElse(null);
    }
}
