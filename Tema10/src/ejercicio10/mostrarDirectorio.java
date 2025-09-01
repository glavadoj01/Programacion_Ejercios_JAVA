package ejercicio10;

/*
Vamos a listar los archivos y directorios contenidos en una carpeta.
Para ello creamos una carpeta llamada “archivos” en el directorio del usuario con el que estamos conectados.
Crea varios archivos en esa carpeta. Las clases que usaremos son Paths y Files, además de la interfaz Path.
*/

import recursos.RecursosIO;

public class mostrarDirectorio {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        String rutaRelativa = "/OneDrive/Carpeta_Git/ejercicios-3-evaluacion-glavadoj01";
        System.out.println("*********************************************");
        // Utilizando ruta.listFiles()
        RecursosIO.mostrarDirectorio(home + rutaRelativa);

        System.out.println("*********************************************");
        try {
            // Utilizando Files.walk(ruta,prof)
            RecursosIO.mostrarDirectorioConProf(home + rutaRelativa,1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
