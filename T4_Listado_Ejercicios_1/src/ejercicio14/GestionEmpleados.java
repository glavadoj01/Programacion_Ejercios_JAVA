package ejercicio14;

/*
a. buscarEmpleadoPorId. Recibe un Id de empleado y retorna el empleado con esa Id o null si no lo encuentra.
b. empleadosCorreo. Muestra todos los empleados cuyo correo electrónico contenga una cadena pasada como parámetro.
		Utiliza el metodo “contains” de la clase String. Busca información sobre el mismo.
c. filtrarPorSalario. Muestra id, nombre, apellidos y salario de los empleados cuyo salario está comprendido entre
		un valor mínimo y un máximo pasados como parámetros.
d. actualizaSalario. Actualizar el salario de un empleado. El metodo recibe la Id y el nuevo salario. Retorna true
		si se llevó a cabo el cambio, false en caso contrario.
e. nacidosEn. Recibe un año y muestra los empleados nacidos en ese año (toString).
f. nacidosEn. Recibe un año y un mes y muestra los empleados nacidos ese año y mes (toString).
*/

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestionEmpleados {

    private ArrayList<Empleado> listaEmpleados;

    public GestionEmpleados() {
        listaEmpleados = new ArrayList<>();
        cargarDatosPrueba();
    }

    public Empleado buscarEmpleadoPorId(String id) {
        for (Empleado p : listaEmpleados) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Empleado> empleadosCorreo(String correo) {
        ArrayList<Empleado> salida = new ArrayList<>();
        for (Empleado e : listaEmpleados) {
            if (e.getCorreo().contains(correo)) {
                salida.add(e);
            }
        }
        return salida;
    }

    public ArrayList<Empleado> filtrarPorSalario(double a, double b) {
        ArrayList<Empleado> salida = new ArrayList<>();
        for (Empleado e : listaEmpleados) {
            if (e.getSalario() >= a && e.getSalario() <= b) {
                salida.add(e);
            }
        }
        return salida;
    }

    public boolean actualizarS(String id, double sal) {
        for (Empleado p : listaEmpleados) {
            if (p.getId().equals(id)) {
                p.setSalario(sal);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Empleado> nacidosEn(int ano) {
        ArrayList<Empleado> salida = new ArrayList<>();
        for (Empleado e : listaEmpleados) {
            if (e.getFechaNac().getYear() == ano) {
                salida.add(e);
            }
        }
        return salida;
    }

    public ArrayList<Empleado> nacidosEn(int ano, int mes) {
        ArrayList<Empleado> salida = new ArrayList<>();
        for (Empleado e : listaEmpleados) {
            if (e.getFechaNac().getYear() == ano && e.getFechaNac().getMonthValue() == mes) {
                salida.add(e);
            }
        }
        return salida;
    }

    public void mostrarTodos() {
        for (Empleado p : listaEmpleados) {
            System.out.println(p);
        }
    }

    public void cargarDatosPrueba() {
        try {
            List<String> lines = Files.readAllLines(
                    Paths.get("src/ejercicio14/empleados.csv"),
                    StandardCharsets.UTF_8);
            for (String string : lines) {
                listaEmpleados.add(new Empleado(string));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}