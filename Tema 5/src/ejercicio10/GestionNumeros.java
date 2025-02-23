package ejercicio10;

import java.util.Random;

public class GestionNumeros implements InterfazNumeros {
    Random rand = new Random();
    private int[] listaNumeros;

    public GestionNumeros(int cantidad) {
        this.listaNumeros = new int[cantidad];
        for (int i = 0; i < listaNumeros.length; i++) {
            listaNumeros[i] = rand.nextInt(0,100)+1;
        }
    }

    @Override
    public void mostrarNumeros() {
        for (int i : listaNumeros) {
            System.out.print(i + "\t");
        }
        System.out.print("\b\n");
    }
    @Override
    public void mostrarNumerosComoString() {
        System.out.print('[');
        for (int i = 0; i < listaNumeros.length; i++) {
            if (i == listaNumeros.length - 1) {
                System.out.print(listaNumeros[i]);
            } else {
                System.out.print(listaNumeros[i] + ", ");
            }
        }
        System.out.print(']');
    }
    @Override
    public void multiplicarPor(int numero) {
        for (int i=0; i< listaNumeros.length; i++) {
            listaNumeros[i] *= numero;
        }
        mostrarNumeros();
    }
    @Override
    public int contarValoresMayoresQue(int numero) {
        int cont = 0;
        for (int n : listaNumeros) {
            if (n > numero) {
                cont++;
            }
        }
        return cont;
    }
    @Override
    public int contarValoresEntre(int numero1, int numero2) {
        int cont = 0;
        for (int n : listaNumeros) {
            if (n >= numero1 && n <= numero2) {
                cont++;
            }
        }
        return cont;
    }
    @Override
    public int compararCon(int[] otraArray) {
        int sum = 0;
        if (listaNumeros.length > otraArray.length) {
            for (int n : listaNumeros) {
                sum += n;
            }
        }else {
            for (int n : otraArray) {
                sum += n;
            }
        }
        return sum;
    }
    @Override
    public int[] getArray(int[] otroArray) {
        if (listaNumeros.length > otroArray.length) {
            return listaNumeros;
        } else {
            return otroArray;
        }
    }
}
