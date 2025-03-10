package ejercicio4;
import java.util.Calendar;
import java.util.Scanner;
/*
Ejercicio nº 4:
Diseña un programa en Java que pida el año de nacimiento de una persona y su nombre.
A continuación, debe escribir un mensaje del tipo: Paco tienes 24 años.
*/
public class Ejercicio4 {
    public static void main(String[] args) {

//  Nombre Librería | Defino variable propia mia que va a utilizar dicha librería | Que hace esa variable

        Scanner escanear = new Scanner(System.in);
//        Librería: Scanner
//        VariableMia:  escanear
//        QueHace:  nueva entrada de teclado mediante ¿acción/clase/métodos? Scanner

        Calendar fecha = Calendar.getInstance();
//        Librería: Calendar  | igual que Scanner, al introducir esta orden,
//                            | aparece la librería importada arriba en el encabezado
//        VariableMia: fecha
//        QueHace:  Utiliza la librería Calendar para obtener algo. El algo lo especificamos luego


        System.out.println("¿Como se llama la persona?");
        String nombre = escanear.nextLine();
        System.out.println("¿En que año nació la persona?");
        int anno = escanear.nextInt();
//        CUIDADO QUE NO PILLA LA LETRA Ñ en el código interno, Se propone doblar la N: Ñ ==> NN
//        Si funciona para imprimirla en pantalla como carácter, pero no para variables, métodos, ...
//        Lo mismo para cualquier acento o énfasis en cualquier letra

        int annoahora = fecha.get(Calendar.YEAR);
        int edad = annoahora - anno;

        System.out.println(nombre + " tiene " + edad + " años.");
    }
}