package ejercicio6;
/*
Diseña un programa Java que trabaje con la clase Alumno del ejercicio 5, copiándola
y pegándola en este. Crea otra clase llamada GestionAlumnos con las siguientes características:
    - Atributos: Array List de Alumnos
    - Métodos:
            - llenarArray, rellena el array de alumnos con datos.
            - mostrarAlumnos, muestra en pantalla cada alumno y su nota media.
            - mostrarNotas, muestra nº de expediente, nombre y nota media de cada alumno.
            - buscarAlumnoPorNumeroExpediente. Recibe como parámetro un nº de expediente
                y devuelve/retorna al alumno con ese nº expediente, o null si no lo encuentra.
    - Prueba la clase GestionAlumnos.
*/

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionAlumnos {
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();


    public GestionAlumnos() {
        insertarDatosPrueba();
    }

    public void agregarAlumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }

    public void insertarDatosPrueba() {
        Alumno alumno1 = new Alumno(1,"Alicia", "Alvarez", LocalDate.of(1990,1,1), "DAW 1", 5.5,6.5);
        listaAlumnos.add(alumno1);
        listaAlumnos.add(new Alumno("Bob", "Barroso", LocalDate.of(1995,12,31), "DAW 1", 5.5,6.5));
        listaAlumnos.add(new Alumno("Cris","Carvaja", LocalDate.of(1988,11,11), "DAW 1"));
        listaAlumnos.add(new Alumno("Daniel","Dominguez", LocalDate.of(1997,7,7), "DAW 1"));
        listaAlumnos.add(new Alumno("Esther","Estephan",LocalDate.of(1993,3,3),"DAW 1"));
        listaAlumnos.add(new Alumno("Fabian","Fernandéz",LocalDate.of(1994,4,4),"DAW 1"));
        listaAlumnos.add(new Alumno("Gonzalo","Gonzalez",LocalDate.of(1995,5,5),"DAW 2"));
        listaAlumnos.add(new Alumno("Hector","de Miguel",LocalDate.of(1996,6,6),"DAW 2"));
        listaAlumnos.add(new Alumno("Isabel","Jaen",LocalDate.of(1997,7,7),"DAW 2"));
        listaAlumnos.add(new Alumno("Javier","Jimenéz",LocalDate.of(1998,8,8),"DAW 2"));
    }

    //Métodos
    public void mostrarAlumnos() {
        System.out.println("Nombre:\t\tApellido:\t\tNota Media:");
        for (Alumno a : listaAlumnos) {
            System.out.printf("%s\t\t%s\t\t%.2f\n",a.getNombre(),a.getApellido(),a.mediaNotas());
        }
    }

    public void mostrarNotas() {
        System.out.println("Expediente:\t\tNombre:\t\tApellido:\t\tNota 1:\t\tNota 2:\t\tNota Media:");
        for (Alumno a : listaAlumnos) {
            System.out.printf("%d\t%s\t%s\t%.2f\t%.2f\t%.2f\n",
                    a.getExpediente(),a.getNombre(),a.getApellido(),a.getNota1(),a.getNota2(),a.mediaNotas());
        }
    }

    public Alumno buscarAlumnoPorNumeroExpediente(int numeroExpediente) {
        for (Alumno a : listaAlumnos) {
            if (a.getExpediente() == numeroExpediente) {
                return a;
            }
        }
        return null;
    }

}
