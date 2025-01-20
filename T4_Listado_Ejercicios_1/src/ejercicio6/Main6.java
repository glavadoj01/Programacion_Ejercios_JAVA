package ejercicio6;
/*
Diseña un programa Java que trabaje con la clase Alumno del ejercicio 5, copiándola
y pegándola en este. Crea otra clase llamada GestionAlumnos con las siguientes características:
    - Atributos: array de 10 Alumnos
    - Métodos:
            - llenarArray, rellena el array de alumnos con datos.
            - mostrarAlumnos, muestra en pantalla cada alumno y su nota media.
            - mostrarNotas, muestra nº de expediente, nombre y nota media de cada alumno.
            - buscarAlumnoPorNumeroExpediente. Recibe como parámetro un nº de expediente
                y devuelve/retorna al alumno con ese nº expediente, o null si no lo encuentra.
    - Prueba la clase GestionAlumnos.
*/

import java.time.LocalDate;

public class Main6 {
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
