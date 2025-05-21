package ejercicio04;

/*
En un proyecto Java construye un arrayList que almacene ciudades. Una ciudad tiene
como atributos nombre, país y habitantes. Insertar datos en el array y muestra estos
ordenados por
    a. número de habitantes.
    b. país.
    c. nombre de ciudad, ascendente y descendente, según se elija.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AppTest {
    public static void main(String[] args) {
        ArrayList<Ciudad> listaCiudades = new ArrayList<>();

        listaCiudades.add(new Ciudad("Albacete","España",123454));
        listaCiudades.add(new Ciudad("Barcelona","España",6346556));
        listaCiudades.add(new Ciudad("Coimbra","Portugal",654321));

        System.out.println("*****************************");
        System.out.println("Lista inicial: ");
        printCiudades(listaCiudades);
        System.out.println("*****************************");
        System.out.println("Lista con ordenación Natural (Nº habitantes): ");
        Collections.sort(listaCiudades);
        printCiudades(listaCiudades);

        System.out.println("*****************************");
        System.out.println("Lista con ordenación por Pais: ");

        Collections.sort(listaCiudades, new Comparator<>() {
            public int compare(Ciudad c1, Ciudad c2) {
                return c1.getPais().compareTo(c2.getPais());
            }
        });

        printCiudades(listaCiudades);

        System.out.println("******************************");
        System.out.println("Lista con ordenación por Nombre (Asc): ");
        ordenarNombre(1, listaCiudades);  // 1 = Asc
        // Quiero "algo" que ordene una lista y en función de un parámetro 1/0
        printCiudades(listaCiudades);

        System.out.println("******************************");
        System.out.println("Lista con ordenación por Nombre (Desc): ");
        ordenarNombre(0, listaCiudades); // 0 = Desc
        printCiudades(listaCiudades);


    }

    private static void ordenarNombre(int i, ArrayList<Ciudad> listaCiudades) {
        if (i == 1) {
            Collections.sort(listaCiudades, new Comparator<>() {
                public int compare(Ciudad c1, Ciudad c2) {
                    return c1.getNombre().compareTo(c2.getNombre());
                }
            });
        }
        else {
            Collections.sort(listaCiudades, new Comparator<>() {
                public int compare(Ciudad c1, Ciudad c2) {
                    return -1*(c1.getNombre().compareTo(c2.getNombre()));
                } // Iguál, pero al revés? (multiplico por menos 1)
            });
        }
    }

    public static void printCiudades(ArrayList<Ciudad> lista) {
        for (Ciudad ciudad : lista) {
            System.out.println(ciudad);
        }
    }
}



