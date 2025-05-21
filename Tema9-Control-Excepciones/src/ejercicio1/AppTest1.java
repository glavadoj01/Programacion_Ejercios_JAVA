package ejercicio1;

/*
Diseña una aplicación Java que permita escribir datos en un archivo de texto.
Los datos deben estar contenidos en un arrayList de String
*/

import tema9.recursoscomunes.Utiles;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest1 {
    public static void main(String[] args) {
        ArrayList<String> texto = new ArrayList<>(Arrays.asList("Hola Mundo IO","Esto es un texto","De prueba para la actividad 1"));

        if (Utiles.escribirDatos(texto,"src/tema9/ejercicio1/salida1.txt")) {
            System.out.println("Escritura completada");
        } else {
            System.out.println("Escritura no completada");
        }
    }
}
