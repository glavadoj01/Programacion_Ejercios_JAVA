package ejercicio11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendaHasMap implements Agenda {
    private final Map<String, Map<String, List<String>>> listaContactos;

    public AgendaHasMap() {
        this.listaContactos = new HashMap<>();
    }

    @Override
    public String toString() {
        String salida = "";
        for (Map.Entry<String, Map<String, List<String>>> entry : listaContactos.entrySet()) {
            salida += "\nContacto: " + entry.getKey();

            for (Map.Entry<String, List<String>> tiposDatos : entry.getValue().entrySet()) {
                salida += "\n\t" + tiposDatos.getKey() + "/s:\t";
                for (String dato : tiposDatos.getValue()) {
                    salida += "\t" + dato;
                }

            }
        }
        return salida;
    }

    public String toString2() {
        String salida = "";
        for (Map.Entry<String, Map<String, List<String>>> entry : listaContactos.entrySet()) {
            salida += "\nContacto: " + entry.getKey() +
                    "\n\tCorreo/s:\t\t" + entry.getValue().get("Correo") +
                    "\n\tTeléfono/s:\t\t" + entry.getValue().get("Teléfono");
        }
        return salida;
    }

    @Override
    public boolean insertarNuevoContacto(String nombre) {
        if (listaContactos.containsKey(nombre)) {
            return false;
        }
        listaContactos.put(nombre, new HashMap<>());
        listaContactos.get(nombre).put("Correo", new ArrayList<>());
        listaContactos.get(nombre).put("Teléfono", new ArrayList<>());
        return true;
    }

    @Override
    public boolean agregarCorreo(String nombreContacto, String correo) {
        if (!listaContactos.containsKey(nombreContacto)) {
            return false;
        }
        listaContactos.get(nombreContacto).get("Correo").add(correo);
        return true;
    }

    @Override
    public boolean agregarTelefono(String nombreContacto, String tlf) {
        if (!listaContactos.containsKey(nombreContacto)) {
            return false;
        }
        listaContactos.get(nombreContacto).get("Teléfono").add(tlf);
        return true;
    }

    @Override
    public List<String> buscarTelefonos(String nombreContacto) {
        if (!listaContactos.containsKey(nombreContacto)) {
            return null;
        }

        return listaContactos.get(nombreContacto).get("Teléfono");
    }

    @Override
    public List<String> buscarCorreo(String nombreContacto) {
        if (!listaContactos.containsKey(nombreContacto)) {
            return null;
        }
        return listaContactos.get(nombreContacto).get("Correo");
    }
}
