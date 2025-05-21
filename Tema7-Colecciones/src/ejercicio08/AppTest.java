package ejercicio08;

/*
Diseña un programa Java que cree un ArrayList y lo llene con 10 valores enteros elegidos al azar
y comprendidos entre 1 y 10. El programa mostrará en pantalla los valores del arrayList en orden
ascendente y las veces que se repite cada uno. Utiliza un HashMap para realizar las cuentas.
*/

import java.util.*;

public class AppTest {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> azar = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            azar.add(rand.nextInt(1,11));
        }

        System.out.println("\nArray generado al azar (Desordenado):");
        for (Integer azarI : azar) {
            System.out.print(azarI + ",\t");
        }
        System.out.print("\b\b\n");

        Collections.sort(azar);
        System.out.println("\nArray generado al azar (Ordenado):");
        for (Integer azarI : azar) {
            System.out.print(azarI + ",\t");
        }
        System.out.print("\b\b\n");

        // Para contar los sucesos:
        // Clave: Integer
        // Valor: Integer   => La repetición será el Valor
        Map<Integer, Integer> contadores = new HashMap<>();

        for (Integer azarI : azar) {
            if (contadores.containsKey(azarI)) {
                contadores.put(azarI, contadores.get(azarI) + 1);
            } else {
                contadores.put(azarI, 1);
            }
        }

        System.out.println("*********************************");
        System.out.println("Nº generado\tNº de Repeticiones");
        for (Integer azarI : azar) {
            System.out.println("\t" + azarI + "\t\t\t\t" + contadores.get(azarI));
        }

        System.out.println("*********************************");
        System.out.println("Repeticiones de cada número:");
        for (Map.Entry<Integer,Integer> objetoNumero : contadores.entrySet()) {
            System.out.println("Número\t" + objetoNumero.getKey() + ":\t" + objetoNumero.getValue() + (objetoNumero.getValue()==1 ? " vez" : " veces"));
        }
    }
}
