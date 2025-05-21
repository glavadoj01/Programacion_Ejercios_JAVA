package ejercicio03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        GestionEventos calendarioEventos = new GestionEventos();
        ArrayList<Evento> eventosSalidas;


        System.out.println("***************************");
        System.out.println("Agregar Evento Nuevo");                // Me aseguro que haya un año repetido, un dia repetido.....
        calendarioEventos.agregarEvento(new Evento(LocalDate.of(2021, 3, 2), "Descripción nº 5",
                49.99, "Ubicación nº 5"));

        System.out.println("***************************");
        System.out.println("Mostrar Por fechas:");
        calendarioEventos.mostrarPorFecha();

        System.out.println("***************************");
        System.out.println("Listar por Fecha (Año 2021):");
        eventosSalidas=calendarioEventos.listaEventos(2021);
        mostrarArray(eventosSalidas);

        System.out.println("***************************");
        System.out.println("Listar por Fecha (Año 2021, Mes 3):");
        eventosSalidas=calendarioEventos.listaEventos(2021,3);
        mostrarArray(eventosSalidas);

        System.out.println("***************************");
        System.out.println("Listar por Fecha (Año 2022, Mes 2, Dia 4):");
        eventosSalidas=calendarioEventos.listaEventos(2022,2,4);
        mostrarArray(eventosSalidas);


        System.out.println("***************************");
        System.out.println("Listar por Fecha LocalDate (Año 2022, Mes 2, Dia 4):");
        eventosSalidas=calendarioEventos.listaEventos(LocalDate.of(2022, 2, 4));
        mostrarArray(eventosSalidas);

        System.out.println("***************************");
        System.out.println("Eliminar Eventos 2021 y Enero");
        calendarioEventos.eliminarEventos(2021,1);
        mostrarArray(calendarioEventos.getEventos());
    }


    public static void mostrarArray(ArrayList<Evento> eventos) {
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }
}
