package ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Cola implements IColaPila {
    private int capacidad;
    private List<Persona> listaCola;

    public Cola(int capacidad) {
        this.capacidad = capacidad;
        this.listaCola = new ArrayList<>();
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public List<Persona> getListaCola() {
        return listaCola;
    }
    public void setListaCola(List<Persona> listaCola) {
        this.listaCola = listaCola;
    }

    @Override
    public String toString() {
        String salida = "COLA\n***************\n" +
                "\nCapacidad = " + getCapacidad() +
                "\nHuecos Libres = " + (getCapacidad() - listaCola.size());
        for (Persona persona : listaCola) {
            salida += persona.toString();
        }
        return salida;
    }
    @Override
    public boolean esVacia() {
        return listaCola.isEmpty();
    }
    @Override
    public Persona primero() {
        return listaCola.getFirst();
    }
    @Override
    public boolean extraer() {
        if (esVacia()) {
            System.out.println("La cola esta vacía");
            return false;
        }
        System.out.println(primero());
        return listaCola.remove(primero());
    }
    @Override
    public boolean insertar(Persona p) {
        if (listaCola.size() < capacidad) {
            listaCola.add(p);
            return true;
        }
        return false;
    }
    @Override
    public void mostrar() {
        System.out.println("COLA\n***************" +
                "\nCapacidad = " + getCapacidad() +
                "\nHuecos Libres = " + (getCapacidad() - listaCola.size()));
        for (Persona persona : listaCola) {
            System.out.print(persona);
        }
    }
}
