package ejercicio12;

import java.util.Comparator;

public class ComparadorEdad implements Comparator<Persona> {
    public int compare(Persona o1, Persona o2) {
        if (o1.getEdad() > o2.getEdad()) {
            return 1;
        }
        if (o1.getEdad() < o2.getEdad()) {
            return -1;
        }
        return 0;
    }
}
