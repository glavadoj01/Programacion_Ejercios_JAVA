package ejercicioExtra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GestionE {
    private List<Empleado> listaE = new ArrayList<>();
    private GestionBD bd;

    public GestionE() {
        bd = new GestionBD();
        this.listaE = bd.leerEmpleados();
    }

    public void insertarEmpleado(Empleado em) {
        int n = bd.insertarEmpleado(em);//Lo insertamos en la base de datos
        if (n > 0) {//si se ha insertado correctamente
            listaE.add(em);//
            System.out.println("Empleado insertado correctamente.");
        } else {
            System.out.println("Error al insertar el empleado.");
        }
    }

    public void eliminarEmpleado(int employeeNumber) {
        int n = bd.eliminarEmpleado(employeeNumber);
        if (n > 0) {
            Iterator<Empleado> it = listaE.iterator();
            while (it.hasNext()) {
                Empleado e = it.next();
                if (e.getEmployeeNumber() == employeeNumber) {
                    it.remove();
                    System.out.println("Empleado eliminado correctamente.");
                    return;
                }
            }
        }
    }

    public void modificarEmpleado(Empleado em) {
        int n = bd.modificarEmpleado(em);//Lo modificamos en la base de datos
        if (n > 0) {//si se ha modificado correctamente
            for (int i = 0; i < listaE.size(); i++) {
                if (listaE.get(i).getEmployeeNumber() == em.getEmployeeNumber()) {
                    listaE.set(i, em);//modificamos el empleado en la lista
                    System.out.println("Empleado modificado correctamente.");
                    break;
                }
            }
        } else {
            System.out.println("Error al modificar el empleado.");
        }
    }
    public Empleado buscarEmpleado(int employeeNumber) {
        for (Empleado e : listaE) {
            if (e.getEmployeeNumber() == employeeNumber) {
                return e;
            }
        }
        return null;
    }

    public void mostrarEmpleados() {
        for (Empleado e : listaE) {
            System.out.println(e);
        }
    }

    public void ordenarLista() {//ordenación natural de los empleados
        Collections.sort(listaE);
    }

    public int obtenerUltimoId() {
        int max = 0;
        for (Empleado e : listaE) {
            if (e.getEmployeeNumber() > max) {
                max = e.getEmployeeNumber();
            }
        }
        return max + 1;
    }

}
