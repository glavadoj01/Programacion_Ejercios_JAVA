package ejercicio5;
/*
En un nuevo proyecto, copia la clase Alumno del ejercicio 1, y añade:
a. Dos atributos que guarden sendas notas (tipo double).
b. Crea los métodos get/set correspondientes, modifica también el constructor para que incluya estas notas.
c. Crea un método que devuelva la media de las notas (double).
d. Crea un método que devuelva número de expediente, nombre y nota media.
*/

import java.time.LocalDate;

public class Main5 {
    public static void main(String[] args) {
        Alumno persona1 = new Alumno(1234, "Alicia", "García García", LocalDate.of(1995, 1, 25), "Programación", 5.7, 8.5);
        Alumno persona2 = new Alumno(4321, "Bob", "Hernandez Hernandez", LocalDate.of(1998, 11, 2), "Programación", 4.4, 3.3);
        Alumno persona3 = new Alumno(5678, "Catalina", "Hernandez García", LocalDate.of(2000, 4, 15), "Bases de Datos", 9.5, 4.2);

        Alumno alumnoParaEvaluar = persona1;
        System.out.printf("Alumno 1: %s\t%s\t", alumnoParaEvaluar.getNombre(), alumnoParaEvaluar.getApellido());
        System.out.println(alumnoParaEvaluar.getExpediente());
        alumnoParaEvaluar.setExpediente(1111);
        System.out.println("Alumno 1: " + persona1.getNombre() + ";\tExpediente Actualizado: " + persona1.getExpediente());
        System.out.println(persona1.toString());
        System.out.println(persona2);
        System.out.println(persona3);

        System.out.println("Nota media alumno 1: " + persona1.mediaNotas());
        System.out.println("Nota media alumno 2: " + persona2.mediaNotas());
        System.out.println("Nota media alumno 3: " + persona3.mediaNotas());

        System.out.println(persona1.devolverDatos());
        System.out.println(persona2.devolverDatos());
        System.out.println(persona3.devolverDatos());
    }
}