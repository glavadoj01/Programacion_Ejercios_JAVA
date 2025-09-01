package ejercicio12;

import recursos.RecursosIO;

import java.nio.file.Path;

public class EjemploCopiar {
    public static void main(String[] args) {
        String rutaO = System.getProperty("user.dir") + "/src/tema10/ejercicio12/ejemploO" ;
        String rutaD = System.getProperty("user.dir") + "/src/tema10/ejercicio12/ejemploD" ;

        System.out.println(rutaO);
        System.out.println(rutaD);

        try {
            if (RecursosIO.copiarDirectorioFORCED(Path.of(rutaO),Path.of(rutaD))) {
                System.out.println("El recurso '" + rutaO + "', se ha copiado correctamente en '" + rutaD + '\'');
            } else {
                System.out.println("El copiado ha fallado");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
