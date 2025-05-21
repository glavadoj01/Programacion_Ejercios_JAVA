package ejercicio07;

import java.util.*;

public class Diccionario {
    public String idioma;
    public Map<String, Set<String>> terminos; // Palabra U {Significados}

    public Diccionario(String idioma) {
        this.idioma = idioma;
        this.terminos = new HashMap<>();
    }

    public void addPalabra(String palabra, String significado) {
        if (terminos.containsKey(palabra)) {
            terminos.get(palabra).add(significado);
        } else {
            Set<String> significados = new HashSet<>();
            significados.add(significado);
            terminos.put(palabra, significados);
        }
    }

    public void addPalabra(String palabra, List<String> significados) {
        if(terminos.containsKey(palabra)) {
            terminos.get(palabra).addAll(significados);
        } else {
            terminos.put(palabra, new HashSet<>(significados));
        }
    }

    public void addPalabra(String palabra, String [] significados) {
        if(terminos.containsKey(palabra)) {
            terminos.get(palabra).addAll(Arrays.asList(significados));
        } else {
            terminos.put(palabra, new HashSet<>(Arrays.asList(significados)));
        }
    }

    public void addPalabra(String palabra, String significados, String separador) {
        if(terminos.containsKey(palabra)) {
            terminos.get(palabra).addAll(Arrays.asList(significados.split(separador)));
        } else {
            terminos.put(palabra, new HashSet<>(Arrays.asList(significados.split(separador))));
        }
    }

    public List<String> getSignificadosDe(String palabra) {
        if(terminos.containsKey(palabra)) {
            return terminos.get(palabra).stream().toList();
        }
        return null;
    }

}
