package ejercicio03;

/*
El programa trabajará también con la clase GestionEventos que contiene como
atributo un arrayList de eventos y los métodos.
    - nuevoElemento, recibe un evento y lo guarda en el arrayList.
    - listaEventos. Metodo sobrecargado que devuelva todos los eventos:
        - los de un año pasado como parámetro
        - los de un año y un mes pasados como parámetros
        - los de un año, mes y día pasados como parámetros
        - los de una fecha (clase DateTime/LocalDate) pasada como parámetro
    - mostrar eventos ordenados por fecha
    - eliminar los eventos de un año y mes pasados como parámetros.
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class GestionEventos {
    private ArrayList<Evento> eventos;

    public GestionEventos() {
        this.eventos = new ArrayList<>();
        this.eventos = cargarPruebas();
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void agregarEvento(Evento eventoNuevo) {
        this.eventos.add(eventoNuevo);
    }

    public void mostrarPorFecha() {
        Collections.sort(this.eventos);
        for (Evento evento : this.eventos) {
            System.out.println(evento);
        }
    }

    public void eliminarEventos(int annoE, int mesE) {
        Iterator<Evento> iterator = this.eventos.iterator();
        LocalDate fechaT;
        while (iterator.hasNext()) {
            fechaT = iterator.next().getFechaEvento();
            if (fechaT.getYear() == annoE && fechaT.getMonthValue() == mesE) {
                iterator.remove();
            }
                // Cada vez que llamo it.Next, avanza, aunque sea dos veces "al mismo"
                // lo hace una vez para uno y otra vez para el siguiente
        }
    }

    public ArrayList<Evento> listaEventos(int annoBusq) {
        ArrayList<Evento> eventos = new ArrayList<>();
        for (Evento evento : this.eventos) {
            if (evento.getFechaEvento().getYear() == annoBusq) {
                eventos.add(evento);
            }
        }
        return eventos;
    }

    public ArrayList<Evento> listaEventos(int annoBusq, int mesBusq) {
        ArrayList<Evento> eventos = new ArrayList<>();
        for (Evento evento : this.eventos) {
            if (evento.getFechaEvento().getYear() == annoBusq
                    && evento.getFechaEvento().getMonthValue() == mesBusq) {
                eventos.add(evento);
            }
        }
        return eventos;
    }

    public ArrayList<Evento> listaEventos(int annoBusq, int mesBusq, int diaBusq) {
        ArrayList<Evento> eventos = new ArrayList<>();
        for (Evento evento : this.eventos) {
            if (evento.getFechaEvento().getYear() == annoBusq
                    && evento.getFechaEvento().getMonthValue() == mesBusq
                    && evento.getFechaEvento().getDayOfMonth() == diaBusq) {
                eventos.add(evento);
            }
        }
        return eventos;
    }

    public ArrayList<Evento> listaEventos(LocalDate fecha) {
        ArrayList<Evento> eventos = new ArrayList<>();
        for (Evento evento : this.eventos) { // Los objetos no se comparan así
            if (evento.getFechaEvento().equals(fecha)) { // Estaba así
                eventos.add(evento);
            }
        }
        return eventos;
    }

    private ArrayList<Evento> cargarPruebas() {
        ArrayList<Evento> eventosP = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            eventosP.add(new Evento(LocalDate.of(2020 + i, i, i * 2), "Descripción nº " + i,
                    12 * i, "Ubicación nº " + i));
        }
        return eventosP;
    }
}
