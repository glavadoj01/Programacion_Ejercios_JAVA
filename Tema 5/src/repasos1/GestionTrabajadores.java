package repasos1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GestionTrabajadores {
    private List<Trabajador> listaEmpleados;

    public GestionTrabajadores() {
        this.listaEmpleados = new ArrayList<>();
    }

    public List<Trabajador> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(List<Trabajador> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void insertarTrabajador(Trabajador t) {
        this.listaEmpleados.add(t);
    }

    public Trabajador buscarTrabajador(int id) {
        for (Trabajador t : this.listaEmpleados) {
            if (t.getId() == id) {
                return t;
            }
        }
        return null;
    }

    public Trabajador buscarTrabajador(String nombre) {
        for (Trabajador t : this.listaEmpleados) {
            if (t.getNombre().equals(nombre)) {
                return t;
            }
        }
        return null;
    }

    public double verSalario(Trabajador t) {
        return t.calcularSalario();
    }

    public boolean modificarDatos(Trabajador t, String nombre) {
        try {
            t.setNombre(nombre);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean modificarSueldo(Trabajador t, double sueldoBase) {
        if (t instanceof Conductores) {
            ((Conductores) t).setSueldoBase(sueldoBase);
            return true;
        }
        if (t instanceof Mecanicos) {
            ((Mecanicos) t).setSueldoBase(sueldoBase);
            return true;
        }
        if (t instanceof Oficina) {
            ((Oficina) t).setSueldoBase(sueldoBase);
            return true;
        }
        return false;

    }

    // TRUE: Ordenada por nombre (orden natural) FALSE: ordena por FechaNacimiento
    public void mostrarListaTrabajadores(boolean opcion) {
        if (opcion) {
            Collections.sort(this.listaEmpleados);
        }
        else {
            Collections.sort(this.listaEmpleados, new CriterioEdad());
        }
        for (Trabajador t: this.listaEmpleados) {
            System.out.println(t);
        }
    }

    public boolean eliminarTrabajador(Trabajador t) {
        try {
            this.listaEmpleados.remove(t);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public boolean eliminarTrabajador(int id) {
        Iterator<Trabajador> it = this.listaEmpleados.iterator();

        while (it.hasNext()) { // Mientras quede otro por mirar
            if (it.next().getId() == id) { // Mira el siguiente y a ver si tiene el mismo Id
                it.remove();               // Elimina el siguiente
                return true;
            }
        }
        return false;
    }

}