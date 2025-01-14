package ejercicio1;

import java.time.LocalDate;

/*
Diseña un programa en Java que trabaje con una clase llamada Alumno. Serán
atributos del alumno su número de expediente, nombre, apellidos, fecha de nacimiento
y curso en el que se matricula. La clase debe incluir un constructor y los métodos get
y set correspondientes y toString. Instancia varios objetos de esta clase y prueba los
métodos creados.
*/
public class Main {
    public static void main(String[] args) {
        Alumno persona1 = new Alumno(1234, "Alicia", "García García", LocalDate.of(1995, 01, 25), "Programación");
        Alumno persona2 = new Alumno(4321, "Bob", "Hernandez Hernandez", LocalDate.of(1998, 11, 02), "Programación");
        Alumno persona3 = new Alumno(5678, "Catalina", "Hernandez García", LocalDate.of(2000, 04, 15), "Bases de Datos");

        Alumno alumnoParaEvaluar = persona1;
        System.out.printf("Alumno 1: %s\t%s\t", alumnoParaEvaluar.getNombre(), alumnoParaEvaluar.getApellido());
        System.out.println(alumnoParaEvaluar.getExpediente());
        alumnoParaEvaluar.setExpediente(1111);
        System.out.println("Alumno 1: " + persona1.getNombre() + ";\tExpediente Actualizado: " + persona1.getExpediente());
        System.out.println(persona1.toString());
        System.out.println(persona2);
        System.out.println(persona3);
    }
}
