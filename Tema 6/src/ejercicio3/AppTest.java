package ejercicio3;

/* En este caso, programaremos un proyecto al que pasaremos en el array de argumentos
    del metodo Main una lista de años. La aplicación comprobará si esos años son bisiestos o no
    Se dice: un año es bisiesto si es divisible entre cuatro y no es divisible entre 100; o si es divisible entre 400 */

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Scanner;

public class AppTest {
    public static void main(String[] args) {
        LocalDate[] listaFechas = {LocalDate.of(2000,5,15),
                LocalDate.of(1999,8,30),
                LocalDate.of(2004,2,28)
        };

        for (LocalDate fecha : listaFechas) {
            if (esBisiesto(fecha)) {
                System.out.println(fecha + "\t Es un año es bisiesto");
            }
            else {
                System.out.println(fecha + "\t No es un año es bisiesto");
            }
        }


    }


    public static boolean esBisiesto(LocalDate fecha) {
        int anno = fecha.getYear();

        return (anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0);
    }
}
