package suarez.prog.tema6.maven;
import org.joda.time.DateTime;


/* Crea un proyecto Maven e incluye en el mismo la dependencia a la API JodaTime.
    Este proyecto debe contener una función que reciba como parámetro un array de fechas (JodaTime)
    y las muestre en pantalla en formato largo: 30 de septiembre de 2018.
    Puedes usar estos métodos: getDayOfMonth(), monthOfYear().getAsText() y getYear(). */

public class App {
    public static void main(String[] args) {
        DateTime[] fechas = {
                new DateTime(2018, 9, 30, 0, 0),
                new DateTime(2023, 3, 10, 0, 0)
        };
        imprimirFechas(fechas);
    }

    public static void imprimirFechas(DateTime[] fechas) {
        for (DateTime fecha : fechas) {
            System.out.println(fecha.getDayOfMonth() +
                    " de " + fecha.monthOfYear().getAsText() +
                    " de " + fecha.getYear());
        }
    }
}
