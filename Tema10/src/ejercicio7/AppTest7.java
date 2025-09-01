package ejercicio7;

/*
Diseña un programa que realice una gestión de los datos de una serie de alumnos almacenados en este archivo.
El archivo contiene por cada alumno: un número que lo identifica, su nombre y diez notas (double).
La gestión consistirá en programar una aplicación que incluya las opciones:
    a. Obtener las notas de un alumno identificado mediante su número.
    b. Obtener la media de las notas de un alumno identificado mediante su número.
    c. Obtener la mejor nota de un alumno identificado mediante su número.
    d. Mostrar, para cada alumno: número, nombre y media de sus notas.

Una pista. La clase Arrays tiene un metodo llamado copyOfRange, que devuelve un array a partir de otro array,
desde una posición concreta hasta otra.
*/

import java.text.DecimalFormat;

public class AppTest7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");
        GestionAlumnos claseFp = new GestionAlumnos("src/tema10/ejercicio7/", "DatosAlumnos.txt");
        claseFp.mostrarListaAlumnos();

        System.out.println("\nMejor nota del alumno 1 (Id=1173391): " + df.format(claseFp.obtenerMejorNota(1173391)));
    }
}
