package ejercicio10;

/*
- GestionEstudiante.
        - Atributos: ArrayList de Estudiantes
        - Métodos:
                - addEstudiante. Recibe un estudiante y lo añade a la colección.
                - getEstudiante. Recibe un id y devuelve el estudiante con esa Id
                u Optional<Estudiante> si no lo encuentra.
                - getNotasEstudiante. Recibe un id de estudiante y devuelve sus
                notas (retornar el mapa).
                - getAprobados. Devuelve un hashMap con los estudiantes que
                tienen todas las asignaturas aprobadas. El hashMap tendrá el
                id y nombre del estudiante.
                - getAprobadosXAsignatura. Devuelve un listado de los nombres
                de los alumnos aprobados en una asignatura que se pasará como parámetro.
*/

import java.util.*;

public class GestionEstudiante {
    private List<Estudiante> estudiantes;

    public GestionEstudiante() {
        this.estudiantes = new ArrayList<>();
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void addEstudiante(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public Estudiante getEstudiante(int id) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                return estudiante;
            }
        }
        return null;
    }

    public Map<String, Integer> getNotasEstudiante(int id) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getId() == id) {
                return estudiante.getNotas();
            }
        }
        return null;
    }

    public Map<Integer, String> getAprobados() {
        Map<Integer, String> res = new HashMap<>();
        int cont;

        for (Estudiante e : estudiantes) {
            cont = 0;
            for (Map.Entry<String, Integer> not : e.getNotas().entrySet()) {
                if (not.getValue() >= 5) {
                    cont++;
                }
            }
            if (cont == e.getNotas().size()) {
                res.put(e.getId(), e.getNombre());
            }
        }
        return res;
    }

    public List<String> getAprobadosXAsignatura(String asig) {
        List<String> res = new ArrayList<>();

        for (Estudiante e : estudiantes) {
            if (e.getNotas().containsKey(asig)) {
                if (e.getNotas().get(asig) >= 5) {
                    res.add(e.getNombre());
                }
            }
        }
        return res;
    }

    public void cargarDatos() {
        Random rand = new Random();

        Estudiante e1 = new Estudiante(1, "Adalberto", "DAW-1");
        Estudiante e2 = new Estudiante(2, "Balduino", "DAW-1");
        Estudiante e3 = new Estudiante(3, "Calixto", "DAW-2");
        Estudiante e4 = new Estudiante(4, "Dan", "DAW-2");
        Estudiante e5 = new Estudiante(5, "Eustaquío", "DAW-2");

        for (int i = 1; i <= 4; i++) {
            e1.addNota("Asignatura " + i, rand.nextInt(0, 11));
            e2.addNota("Asignatura " + i, rand.nextInt(0, 11));
            e3.addNota("Asignatura " + i, rand.nextInt(0, 11));
        }
        e4.addNota("Asignatura 1",10);
        e4.addNota("Asignatura 2",5);
        e4.addNota("Asignatura 3",5);
        e4.addNota("Asignatura 4",10);

        e5.addNota("Asignatura 1",2);
        e5.addNota("Asignatura 2",5);
        e5.addNota("Asignatura 3",5);
        e5.addNota("Asignatura 4",2);

        addEstudiante(e1);
        addEstudiante(e2);
        addEstudiante(e3);
        addEstudiante(e4);
        addEstudiante(e5);
    }
}
