package repasos1;

import java.util.Comparator;

public class CriterioEdad implements Comparator<Trabajador> {
    public int compare(Trabajador o1, Trabajador o2) {
        if (o1.getFechaNacimiento().isBefore(o2.getFechaNacimiento())) {
            return 1;
        }
        if (o1.getFechaNacimiento().isAfter(o2.getFechaNacimiento())) {
            return -1;
        }
        return 0;
    }
}
