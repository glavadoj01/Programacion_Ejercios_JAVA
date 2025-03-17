package Examenes.segundo;

import java.util.*;

public class GestionServicios {
    private List<Servicios> listaS;

    public GestionServicios() {
        DaoFicheros dao = new DaoFicheros();
        listaS = dao.leerServicios();
    }

    public void guardarServicios() {
        List<String> lp = new ArrayList<>();
        for (Servicios servicio : listaS) {
            lp.add(servicio.toString());
        }
        DaoFicheros dao = new DaoFicheros();
        dao.guardarServicio(lp);
    }

    public void addServicio(Servicios s) {
        listaS.add(s);
    }

    public void mostrarEmpleados() {
        for (Servicios servicio : listaS) {
            System.out.println(servicio.getEmpleado().toString());
        }
    }

    public List<Servicios> buscarServiciosPorEmpleado(String s) {
        List<Servicios> listaSalida = new ArrayList<>();
        for (Servicios servicio : listaS) {
            if (servicio.getEmpleado().getNombre().equals(s)) {
                listaSalida.add(servicio);
            }
        }
        return listaSalida;
    }

    public List<Servicios> buscarServiciosPorCliente(String s) {
        List<Servicios> listaSalida = new ArrayList<>();
        for (Servicios servicio : listaS) {
            if (servicio.getCliente().equals(s)) {
                listaSalida.add(servicio);
            }
        }
        return listaSalida;
    }

    public List<Servicios> ListarServiciosTipo(String s) {
        List<Servicios> listaSalida = new ArrayList<>();
        for (Servicios servicio : listaS) {
            if (servicio.getClass().getSimpleName().equals(s)) {
                listaSalida.add(servicio);
            }
        }
        return listaSalida;
    }

    public Servicios buscarServicio(int i) {
        for (Servicios servicio : listaS) {
            if (servicio.getIdServicio() == i) {
                return servicio;
            }
        }
        return null;
    }

    public boolean eliminarServicio(int i) {
        Iterator<Servicios> iterator = listaS.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getIdServicio() == i) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void ordenarServicios() {
        Collections.sort(listaS, Collections.reverseOrder());
        for (Servicios s : listaS) {
            System.out.println(s);
        }
    }

    public void ordenarServiciosPorCliente() {
        Collections.sort(listaS, new Comparator<Servicios>() {
            @Override
            public int compare(Servicios o1, Servicios o2) {
                return o1.getCliente().compareTo(o2.getCliente());
            }
        });
        for (Servicios s : listaS) {
            System.out.println(s);
        }
    }

    public int buscarRepetidos(Servicios s1) {
        int cont=0;
        for (Servicios servicio : listaS) {
            if(servicio.equals(s1)) {
                cont++;
            }
        }
        return cont;
    }
}
