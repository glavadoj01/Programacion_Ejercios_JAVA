package ejercicio01;

/*
Crea una clase llamada GestionDatosMeteo. Tendrá como atributo un arrayList de la clase DatosMeteo
Y los métodos:
    ● anadirDatos. Recibe un objeto de la clase DatosMeteo y lo añade al arrayList.
    ● mediaTempMax. Devuelve un double.
    ● mediaTempMax. Media de las máximas de un mes y año pasados como parámetros (enteros). Devuelve double.
    ● numeroRegistros. Devuelve el número de elementos del arrayList.
*/

import java.util.ArrayList;
import java.util.List;

public class GestionDatosMeteo {
    private final List<DatosMeteo> listaDatosHistoricos;


    public GestionDatosMeteo() {
        listaDatosHistoricos = new ArrayList<>();
        // Si lo inicias (new) arriba solo puede haber 1
        // Si lo inicias en el constructor (aquí), habrá uno cada vez que
        // declaramos un objeto GestionDatosMeteo

        //Lo importante es que se inicie en uno de los dos sitios (NO EN LOS DOS, solo en 1)
    }


    public void anadirDatos(DatosMeteo datos) {
        listaDatosHistoricos.add(datos);
    }

    public double mediaTempMax() {
        double mediaTempMax = 0;
        for (DatosMeteo registro : listaDatosHistoricos) {
            mediaTempMax = mediaTempMax + registro.getTemperaturaMax();
            // mediaTempMax += registro.getTemperaturaMax();
        }
        return mediaTempMax / listaDatosHistoricos.size();
    }

    public double mediaTempMax(int mes, int anno) {
        double mediaTempMax = 0;
        int cont = 0; // antes no porque eran todos (size), ahora solo algunos, y vamos a contar cuantos son
        for (DatosMeteo registro : listaDatosHistoricos) {
            if (registro.getFecha().getYear() == anno && registro.getFecha().getMonthValue() == mes) {
                mediaTempMax = mediaTempMax + registro.getTemperaturaMax();
                cont++;
            }
        }
        if (cont == 0) {
            return 0;
        } else {
            return mediaTempMax / cont;
        }
    }

    public int numeroRegistros() {
        return listaDatosHistoricos.size();
    }
}
