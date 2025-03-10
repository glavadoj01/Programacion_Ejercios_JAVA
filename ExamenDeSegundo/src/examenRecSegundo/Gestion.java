package examenRecSegundo;

import java.util.*;

public class Gestion {
    private List<Trabajador> listaT;

    public Gestion() {
        this.listaT = new ArrayList<>();
    }

    public List<Trabajador> getListaT() {
        return listaT;
    }
    public void setListaT(List<Trabajador> listaT) {
        this.listaT = listaT;
    }

    public void nuevoTrabajador(Trabajador trabajadorNuevo) {
        this.listaT.add(trabajadorNuevo);
    }

    public Trabajador buscarTrabajador(int id) {
        for (Trabajador quehay : this.listaT) {
            if (quehay.getId() == id) {
                return quehay;
            }
        }
        return null;
    }
    public Trabajador buscarTrabajadorNombre(String nombre) {
        for (Trabajador trabajadores : this.listaT) {
            if (trabajadores.getNombre().equals(nombre)) {
                return trabajadores;
            }
        }
        return null;
    }
    public List<Trabajador> buscarTrabajadoresClase(String clase) {
        List<Trabajador> listaSalida = new ArrayList<>();
        for (Trabajador buscado : this.listaT) {
            if (buscado.getClass().getSimpleName().equals(clase)) {
                listaSalida.add(buscado);
            }
        }
        return listaSalida;
    }
    public int buscarRepetidos(Comercial prueba) {
        int cont = 0;
        for (Trabajador trabajador : this.listaT) {
            if (trabajador.getClass().getSimpleName().equals("Comercial")
                    && trabajador.equals(prueba)) {
                cont++;
            }
        }
        return cont;
    }
    public boolean eliminarTrabajador(int id) {
        Iterator<Trabajador> iterator = this.listaT.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public void mostrarListaOrdenNatural() {
        Collections.sort(this.listaT);
        for (Trabajador trabajador : this.listaT) {
            System.out.println(trabajador);
        }
    }
    public void mostrarListaOrdenNombre(){
        Collections.sort(this.listaT, new Comparator<Trabajador>() {
            @Override
            public int compare(Trabajador o1, Trabajador o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        for (Trabajador trabajador : this.listaT) {
            System.out.println(trabajador);
        }
    }
}
