package ejercicio2;

/*
Diseña una aplicación Java que permita leer datos de un archivo de texto y los muestre en la pantalla.
Esta tarea debe llevarse a cabo mediante un metodo que reciba como parámetro el nombre del archivo
*/

import tema9.recursoscomunes.Utiles;

public class AppTest2 {
    public static void main(String[] args) {
        System.out.println("Prueba de lectura - ejercicio2");
        System.out.println("Ruta: Directorio de este tema  => src/tema9");
        System.out.println("Archivo: Archivo de ejemplo => EjemplosLecturas.txt");
        System.out.println("*********************************************************");

        Utiles.leerYMostrarDatos("src/tema9/EjemplosLecturas.txt");

        System.out.println("\n\n*********************************************************");
        System.out.println("Lectura con error:");
        Utiles.leerYMostrarDatos("NoRuta");
    }
}
