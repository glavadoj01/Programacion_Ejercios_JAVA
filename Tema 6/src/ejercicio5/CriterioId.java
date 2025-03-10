package ejercicio5;

import java.util.Comparator;

public class CriterioId implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(Integer.parseInt(p1.getId()), Integer.parseInt(p2.getId()));
    }
}
