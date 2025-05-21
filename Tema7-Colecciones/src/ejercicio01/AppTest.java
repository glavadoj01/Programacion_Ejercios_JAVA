package ejercicio01;

/*
Diseña un programa que sirva para trabajar con datos de una estación meteorológica. Para ello crea la
clase DatosMeteo que guarda datos de temperatura, precipitaciones, etc.; de una fecha concreta.

Características:
    a. Atributos
        i. fecha, clase LocalDate (java.time).
        ii. temperaturas máxima y mínima, double.
        iii. humedad máxima y mínima, double.
        iv. precipitaciones, double
    b. Métodos.
        i. Constructor. Todos los atributos.
        ii. Constructor. Todos los atributos menos la fecha. Tomamos la fecha del sistema.
        iii. Getters, setters y redefinir toString.

Crea una clase llamada GestionDatosMeteo. Tendrá como atributo un arrayList de la clase DatosMeteo y los métodos:
    ● anadirDatos. Recibe un objeto de la clase DatosMeteo y lo añade al arrayList.
    ● mediaTempMax. Devuelve un double.
    ● mediaTempMax. Media de las máximas de un mes y año pasados como parámetros (enteros). Devuelve double.
    ● numeroRegistros. Devuelve el número de elementos del arrayList.
*/

import java.time.LocalDate;

public class AppTest {

    public static void main(String[] args) {
        GestionDatosMeteo listaRegistros = new GestionDatosMeteo();

        // Insertar 10 registros de ejemplo
        for (int i = 1; i <= 10; i++) {
            listaRegistros.anadirDatos(new DatosMeteo(LocalDate.of(1990+i, i, i),25+i,15-i,55+i,15-i,150+(i*100)));
        }
        // Repetimos un par mas en enero del 1991 (para que haya medias)
        listaRegistros.anadirDatos(new DatosMeteo(LocalDate.of(1991, 1, 2), 20,10,25,5,100));
        listaRegistros.anadirDatos(new DatosMeteo(LocalDate.of(1991, 1, 3), 20,10,45,25,500));

        System.out.println("Imprimir media global:");
        System.out.printf("%.2f ºC\n",listaRegistros.mediaTempMax());

        System.out.println("****************************");
        System.out.println("Imprimir media Enero 1991:");
        System.out.printf("%.2f ºC\n",listaRegistros.mediaTempMax(1,1991));

        System.out.println("****************************");
        System.out.println("Imprimir número de registros:");
        System.out.println(listaRegistros.numeroRegistros());
        // Este ya es entero, no hace falta redondear
    }
}



