package ejercicio13;

/*
Diseña una aplicación java que trabaje con un arrayList de cadenas (String).
Para ello debes programar una clase que tenga como atributo un arrayList de String y los métodos:
    a. addCadena. Recibe una cadena de caracteres con formato “valor1;valor2;valor3;...;valorN”
            e inserta individualmente todos esos valores en el arrayList.
    b. buscarCadena. Retorna true si la cadena pasada como parámetro está contenida en el arrayList,
            false en caso contrario.
    c. getListaPatron. Retorna una lista (List) con todas las cadenas del arrayList que contienen
            el patrón pasado como parámetro.
    d. ordenar. Ordena el contenido del arrayList de forma ascendente o descendente, según índique
            el parámetro pasado.
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilCadenas {
    private final ArrayList<String> listaCadenas;

    public UtilCadenas() {
        listaCadenas = new ArrayList<>();
    }
    public void addCadena(String cadena) {
        listaCadenas.addAll(Arrays.asList(cadena.split(";")));
    }
    public boolean buscarCadena(String cadena) {
        return listaCadenas.contains(cadena);
    }
    public List<String> getListaPatron(String patron) {
        List<String> listaPatron = new ArrayList<>();
        for (String cadena : listaCadenas) {
            if (cadena.contains(patron)) {
                listaPatron.add(cadena);
            }
        }
        return listaPatron;
    }
    public void ordenarListaPatron(int num) {
        if (num == 1) {
            Collections.sort(listaCadenas);
        }
        else {
            Collections.reverse(listaCadenas);
        }
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder("Cadenas: ");
        for (String str : listaCadenas) {
            cadena.append('\t' + str);
        }
        return cadena.toString();
    }
}
