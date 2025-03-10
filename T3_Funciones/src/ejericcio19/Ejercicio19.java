package ejericcio19;

import java.time.LocalDate;
import java.time.Year;
import java.util.Date;

/*
Diseña una función Java que devuelva un String con la fecha actual del sistema.
A. Con la clase Date. Para conocer la fecha del sistema debes crear un objeto de
la clase Date(), contenida en el paquete java.util. Un objeto de estas
características se crea así: Date fecha = new Date();
Para acceder a la fecha actual debes utilizar el método toString() de ese objeto,
de la forma: String fechaActual = fecha.toString();
B. Con la clase LocalDate. Utiliza también el método toString. Un objeto
LocalDate se crea así:
a. LocalDate fechaActual = LocalDate.now();
b. LocalDate fecha = LocalDate.of(año, mes, dia);
*/
public class Ejercicio19 {
    public static void main(String[] args) {
        String casoA, casoB, casoC;

        casoA = obtenerFechaDATE();
        casoB = obtenerFechaLOCALDATE1();
        casoC = obtenerFechaLOCALDATE2();
        System.out.println("Con la clase Date():\t" + casoA);
        System.out.println("Con la clase y método LocalDate().now() general:\t" + casoB);
        System.out.println("Con la clase y método LocalDate().of (fecha especificada en formato local):\t" + casoC);
    }

    public static String obtenerFechaDATE() {
        Date fecha = new Date(); // Declaro objeto "Date" como nuevo objeto con la función "Date()"
        String salida;

        salida = fecha.toString();
        return salida;
    }

    public static String obtenerFechaLOCALDATE1() {
        LocalDate fecha = LocalDate.now();
        String salida;

        salida = fecha.toString();
        return salida;
    }

    public static String obtenerFechaLOCALDATE2() {
        LocalDate fecha = LocalDate.of(1999,12,12);
        String salida;

        salida = fecha.toString();
        return salida;
    }
}
