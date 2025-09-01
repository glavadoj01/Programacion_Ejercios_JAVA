package ejercicio4;

import java.util.ArrayList;

public class AppTest4 {
    public static void main(String[] args) {
        String ruta = "src/tema10/";
        String archivo = "EjemplosLecturas.txt";
        String archivoOr = "EjemploOrdenado.txt";
        String rutaCompleta = ruta + archivo;
        String rutaSalida = ruta + archivoOr;

        System.out.println("********************************");
        System.out.println("Lectura Inicial:");
        ArrayList<String> Datos = UtilTextos.leerLineasRuta(ruta, archivo);

        if (!Datos.isEmpty()) {
            for (String s : Datos) {
                System.out.println(s);
            }

            System.out.println("*******************************");
            System.out.println("Ordenación:");
            UtilTextos.ordenarArray(Datos);
            for (String s : Datos) {
                System.out.println(s);
            }

            System.out.println("*******************************");
            System.out.println("¿Escritura realizada con éxito? " + UtilTextos.escribirDatos(Datos, rutaSalida));
        }
    }
}
