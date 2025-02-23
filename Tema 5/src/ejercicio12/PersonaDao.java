package ejercicio12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonaDao {
    private List<Persona> listaPersonas;

    public PersonaDao() {
        this.listaPersonas = new ArrayList<>();
    }

    public void insertarPersona (Persona p) {
        this.listaPersonas.add(p);
    }

    public Persona buscarPersona (String dni) {
        for (Persona p : this.listaPersonas) {
            if (p.getDni().equals(dni)) {
                return p;
            }
        }
        return null;
    }

    public int getNumeroPersonas() {
        return this.listaPersonas.size();
    }

    public void mostrarDatos() {
        for (Persona p : this.listaPersonas) {
            System.out.println(p);
        }
    }

    public List<Persona> getNPrimerasPersonas(int n) {
        List<Persona> primerasPersonas = new ArrayList<>();
        ordenarDatos();
        if (n <= listaPersonas.size()) {
            for (int i = 0; i < n; i++) {
                primerasPersonas.add(this.listaPersonas.get(i));
            }
        }
        else {
            System.out.println("No hay tantas personas");
        }
        return primerasPersonas;
    }

    public boolean cambiarPuestoTrabajo (String dni, Trabajo t) {
        for (Persona p : this.listaPersonas) {
            if (p.getDni().equals(dni)) {
                p.setPuesto(t);
                return true;
            }
        }
        return false;
    }

    public void ordenarDatos() {
        Collections.sort(this.listaPersonas);
    }

    public void ordenarDatosPorEdad() {
        Collections.sort(listaPersonas, new ComparadorEdad());
    }
}
