package ejercicios_extra.ejercicioP.presentacion;

/*
Primero: Quiero crear una colección tipo Map<dni, nombreApellido>, y el nombreApellido
            hay que sacarlo de la base de datos Evento, de la tabla Participante.

Segundo: Guardar el Map en un archivo de texto llamado “participantes.txt”.
*/

import tema11.ejercicios_extra.ejercicioP.logica.Operaciones;

import java.util.Map;

public class AppTest {
    public static void main(String[] args) {

        Map<String,String> map = Operaciones.getParticipantes();

        if (map == null || map.isEmpty()) {
            System.out.println("No hay participantes para mostrar.");

        } else {
            if (Operaciones.guardarParticipantes(map)) {
                System.out.println("Participantes guardados en participantes.txt");

            } else {
                System.out.println("Error al guardar los participantes en el archivo.");
            }
        }
    }
}
