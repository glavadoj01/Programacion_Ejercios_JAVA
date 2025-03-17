package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Pila implements IColaPila {
    private int capacidad;
    private List<Persona> listaPila;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.listaPila = new ArrayList<>();
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public List<Persona> getListaPila() {
        return listaPila;
    }
    public void setListaPila(List<Persona> listaPila) {
        this.listaPila = listaPila;
    }

    @Override
    public String toString() {
        String salida = "PILA\n***************\n" +
                "\nCapacidad = " + getCapacidad()+
                "\nHuecos Libres = " + (getCapacidad() - listaPila.size());
        for (Persona persona : listaPila) {
            salida += persona.toString();
        }
        return salida;
    }
    @Override
    public boolean esVacia() {
        return listaPila.isEmpty();
    }
    @Override
    public Persona primero() {
        return listaPila.getLast();
    }
    @Override
    public boolean extraer() {
        if (esVacia()) {
            return false;
        }
        System.out.println(primero());
        return listaPila.remove(primero());
    }
    @Override
    public boolean insertar(Persona p) {
        if (listaPila.size() < capacidad) {
            listaPila.add(p);
            return true;
        }
        return false;
    }
    @Override
    public void mostrar() {
        System.out.println("PILA\n***************" +
                "\nCapacidad = " + getCapacidad() +
                "\nHuecos Libres = " + (getCapacidad() - listaPila.size()));
        for (Persona persona : listaPila) {
            System.out.print(persona);
        }
    }
}
