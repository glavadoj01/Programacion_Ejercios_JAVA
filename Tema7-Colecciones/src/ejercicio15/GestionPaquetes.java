package ejercicio15;

/*
- GestionPaquetes.
    - Atributos.
        - ArrayList, clase Paquete.
    - Métodos.
        - nuevoPaquete. Recibe un paquete y lo almacena en el ArrayList.
        - cambiarEstado. Parámetros: id de paquete y estado. Cambia el estado del paquete con el Id, indicado
            al nuevo estado pasado como parámetro. Devuelve true si pudo hacerse el cambio, false en caso contrario.
        - getTodos. Devuelve el ArrayList al completo.
        - consultarEstadoPaquete. Parámetro: id de paquete. Devuelve un String con el valor del estado de ese paquete,
            y null en caso de que ese Id no exista en la colección.
        - getPaquetesEstado. Parámetro: un valor de estado. Devuelve un HashMap con los paquetes en los
            que el estado coincide con el pasado como parámetro. El HashMap estará formado por la pareja: id, Paquete.
*/

import java.util.ArrayList;
import java.util.HashMap;

public class GestionPaquetes {
    private final ArrayList<Paquete> stockPaquetes;

    public GestionPaquetes() {
        this.stockPaquetes = new ArrayList<>();
    }

    public void nuevoPaquete(Paquete paquete) {
        this.stockPaquetes.add(paquete);
    }
    public ArrayList<Paquete> getTodos() {
        return stockPaquetes;
    }

    public boolean cambiarEstado(String idBusc, Estados estadoDestino) {
        for (Paquete paquete : stockPaquetes) {
            if (paquete.getId().equals(idBusc)) {
                paquete.cambiarEstado(estadoDestino);
                return true;
            }
        }
        return false;
    }

    public String consultarEstadoPaquete(String idBusc) {
        for (Paquete paquete : stockPaquetes) {
            if (paquete.getId().equals(idBusc)) {
                return paquete.getEstado().getNombreEstado();
            }
        }
        return null;
    }

    public HashMap<String,Paquete> getPaquetesEstado(String estadoBuscado) {
        HashMap<String,Paquete> salida = new HashMap<>();
        if (Estados.esUnEstado(estadoBuscado)) {
            for (Paquete paquete : stockPaquetes) {
                if (paquete.getEstado().getNombreEstado().equalsIgnoreCase(estadoBuscado)) {
                    salida.put(paquete.getId(), paquete);
                }
            }
        }
        return salida;
    }
}
