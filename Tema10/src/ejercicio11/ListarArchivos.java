package ejercicio11;

import recursos.RecursosIO;

public class ListarArchivos {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        String rutaRelativa = "/OneDrive/Carpeta_Git/ejercicios-3-evaluacion-glavadoj01";

        System.out.println("*********************************************");
        try {
            RecursosIO.mostrarArchivosSize(home + rutaRelativa);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
