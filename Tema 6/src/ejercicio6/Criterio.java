package ejercicio6;

import java.util.Comparator;

public class Criterio implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        int salida = p1.getNombre().compareTo(p2.getNombre());

       if (salida == 0) {
           return p1.getFechaNacimiento().compareTo(p2.getFechaNacimiento());
       }
        return p1.getNombre().compareTo(p2.getNombre());

    }
}
