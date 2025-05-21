package ejercicio10;

/*
 - Estudiante
            - Atributos: id, nombre, curso, HashMap de notas (pareja asignaturanota)
            - Métodos: Constructor (solo id, nombre y curso), getters, setters,
            toString, addNota.
*/

import java.util.HashMap;
import java.util.Map;

public class Estudiante {
    private int id;
    private String nombre;
    private String curso;
    private Map<String,Integer> notas;

    public Estudiante(int id, String nombre, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.notas = new HashMap<>();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public Map<String, Integer> getNotas() {
        return notas;
    }
    public void setNotas(Map<String, Integer> notas) {
        this.notas = notas;
    }

    public void addNota(String nombre, int nota) {
            this.notas.put(nombre, nota);
    }

    @Override
    public String toString() {
        String res = "Estudiante:\n" +
                "\tId = " + id +
                "\tNombre = " + nombre +
                "\tCurso = " + curso +
                "\n\tNotas:\n" +
                "\t\tAsignatura\t|\tNota" ;
        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            res += "\n\t\t" + entry.getKey() + ":\t" + entry.getValue();
        }
        return res;
    }
}
