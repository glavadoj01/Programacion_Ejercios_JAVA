package ejercicios_extra.ejercicioQ.presentacion;

/*
Dado el archivo de texto "participantes.csv". Que nos muestra una lista de DNIs, Nombres y Apellidos;
    hay que cargar los valores del archivo en una colección de tipo Map<DNI, NombreApellido>
    igual que en el caso anterior (Se puede utilizar la clase Participante).

Posteriormente, se debe mostrar un reducido grupo de participantes al azar
    (20 - 30) por pantalla, para que el usuario seleccione un DNI.

Dado este DNI, hay que buscar todos los datos del participante correspondiente,
    que se hallan en la base de datos en la tabla participantes y mostrarlo por pantalla.
*/


import ejercicios_extra.ejercicioQ.logica.Operaciones;

import java.util.Map;
import java.util.Scanner;

public class AppTest {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int id;

        Map<String,String> map = Operaciones.cargarDatos();

        if (map == null || map.isEmpty()) {
            System.out.println("No hay participantes disponibles.");
        } else {
            Operaciones.mostrarParticipantesAleatorios(map);
            id = escanerId();
            Operaciones.mostrarDatosParticipante(id);
        }
    }

    public static int escanerId() {
        while (true) {
            System.out.print("Introduce el Id del participante que quieres buscar: ");
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes introducir un número entero");
            }
        }
    }
}
