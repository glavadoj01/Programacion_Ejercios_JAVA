package ejercicio12;

/*
Diseña una clase llamada GestionNumeros que tenga como atributo un arrayList que permita trabajar con enteros.

Las opciones(métodos) a programar en esta clase serán:
    a. en el constructor, añade varios valores al arrayList.
    b. añadir un valor al arrayList.
    c. añadir una colección completa al arrayList.
    d. mostrar el arraList en formato toString.
    e. ordenar el arraylist de forma ascendente y descendente (indicarlo mediante un parámetro).
    f. retornar el tamaño del arrayList.
    g. retornar los valores pares del arrayList en formato List<Integer>.
    h. retornar la suma de los valores del arrayList
    i. eliminar un entero pasado como parámetro.
        Si puede eliminarse, retorna true. En caso contrario, retorna false.
    j. eliminar del arrayList los múltiplos de “n”. Siendo “n” un valor pasado como parámetro.
        Retornar cuántos elementos se han eliminado.
    k. retornar un array que contenga todos los valores pares del arrayList.
*/

import java.util.*;

public class GestionNumeros {
    private ArrayList<Integer> listaNumeros;

    // A - Constructor
    public GestionNumeros() {
        Random rand = new Random();
        this.listaNumeros = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            listaNumeros.add(rand.nextInt(1, 11));
        }
        listaNumeros.add(2);
        listaNumeros.add(4);
        listaNumeros.add(8);
        listaNumeros.add(10);
        listaNumeros.add(3);
        listaNumeros.add(9);
        listaNumeros.add(15);
    }

    // B - Añadir Valor
    public void agregarNumero(int numero) {
        listaNumeros.add(numero);
    }

    //C - Añadir Colección
    public void agregarColeccion(List<Integer> numeros) {
        listaNumeros.addAll(numeros);
    }

    // D - Mostrar el ArrayList en formato String
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Integer numero : listaNumeros) {
            res.append(numero).append("\t");
        }
        return res.toString();
    }

    // E - Ordenar según parámetro => 0 : Asc./Natural  |  1 : Desc./Reverse
    public void ordenarLista(int n) {
        if (n == 1) {
            Collections.sort(listaNumeros, Collections.reverseOrder());
        } else if (n == 0) {
            Collections.sort(listaNumeros);
        } else {
            System.out.println("Parámetro de ordenación invalido");
        }
    }

    // F - Retornar tamaño
    public int tamLista() {
        return listaNumeros.size();
    }

    // G - Retornar los valores pares del arrayList en formato List<Integer>.
    public List<Integer> obtenerPares() {
        List<Integer> res = new ArrayList<>();
        for (Integer numero : listaNumeros) {
            if (numero % 2 == 0) {
                res.add(numero);
            }
        }
        return res;
    }

    // H - Retornar la suma de los valores del arrayList
    public int sumaTotal() {
        int suma = 0;
        for (Integer numero : listaNumeros) {
            suma += numero;
        }
        return suma;
    }

    // I - Eliminar un entero pasado como parámetro.
    // Si puede eliminarse, retorna true. En caso contrario, retornar falso.
    public boolean eliminaNumero(int num) {
        Iterator<Integer> iterator = listaNumeros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == num) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // J - Eliminar del arrayList los múltiplos de “n”. Siendo “n” un valor pasado como parámetro.
    // Retornar cuántos elementos se han eliminado.
    public int eliminarMultiplos(int num) {
        int cont = 0;

        Iterator<Integer> iterator = listaNumeros.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % num == 0) {
                iterator.remove();
                cont++;
            }
        }
        return cont;
    }
    // K - Retornar un array que contenga todos los valores pares del arrayList.
    public Integer[] devolverArray() {
        return obtenerPares().toArray(new Integer[0]);
    }
}
