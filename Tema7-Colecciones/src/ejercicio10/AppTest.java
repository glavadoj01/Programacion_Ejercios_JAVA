package ejercicio10;

/*
Diseña una aplicación que sirva para gestionar datos de estudiantes. Para ello debes
crear las clases que siguen.
Esta es la descripción base de las clases, puedes añadir métodos que consideres
necesarios.
    - Estudiante
            - Atributos: id, nombre, curso, HashMap de notas (pareja asignaturanota)
            - Métodos: Constructor (solo id, nombre y curso), getters, setters,
            toString, addNota.
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

import java.util.List;
import java.util.Map;

public class AppTest {
    public static void main(String[] args) {
        GestionEstudiante curso = new GestionEstudiante();
        curso.cargarDatos();

        System.out.println("************************************************");
        System.out.println("Obtener Estudiante Id 5:");
        System.out.println(curso.getEstudiante(5));


        System.out.println("************************************************");
        System.out.println("Notas Estudiante Id 1:");
        Map<String,Integer> notasId1 = curso.getNotasEstudiante(1);
        for (Map.Entry<String,Integer> entry : notasId1.entrySet()) {
            System.out.println("Asignatura: " + entry.getKey() + "\tNota: " + entry.getValue());
        }

        System.out.println("************************************************");
        System.out.println("Listado Estudiantes con Todo Aprobado:");
        Map<Integer,String> aprobados = curso.getAprobados();
        for (Map.Entry<Integer,String> entry : aprobados.entrySet()) {
            System.out.println("Id Alumno: " + entry.getKey() + "\tNombre: " + entry.getValue());
        }

        System.out.println("************************************************");
        System.out.println("Listado Estudiantes Aprobados en Asignatura 1:");
       List<String> aprobadosAs = curso.getAprobadosXAsignatura("Asignatura 1");
        for (String alumno : aprobadosAs) {
            System.out.println("Nombre: " + alumno);
        }
    }
}
