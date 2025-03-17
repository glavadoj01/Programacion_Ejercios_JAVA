package ejercicio11;

import java.util.Scanner;

/*Diseña un programa Java que muestre un menú en pantalla. El usuario debe elegir una de
las opciones y el programa mostrará el texto de la opción elegida. Es decir, si el
usuario eligió la opción 1, el programa mostrará el texto “Has seleccionado Abrir”.
    Menú
    1. Abrir
    2. Cerrar
    3. Conectar
    4. Desconectar
    5. Fin
    Elige opción:
*/
public class Ejercicio11 {
    public static void main(String[] args) {
        //Def métodos y variables
        Scanner escanear = new Scanner(System.in);
        int a;
        //Entrada de datos
        System.out.println("Menú\n" +
                "1. Abrir\n" +
                "2. Cerrar\n" +
                "3. Conectar\n" +
                "4. Desconectar\n" +
                "5. Fin");
        System.out.print("Elige una opción: ");
        a = escanear.nextInt();
        while (a < 1 || a > 5) {
            System.out.print("Introducir un menú valido: ");
            a = escanear.nextInt();
        }
        /* Si en vez de Opción "1", fuera Opción "A", podríamos definir una variable "char".
        Pero nos encontramos con el problema de que la función Scanner, nos devuelve una variable string. Aunque sea un
        único carácter, será una cadena/string de 1 elemento.

        a = escanear.next().charAt(0)

        Añadiendo ".charAt(Nº)", convertimos la cadena de caracteres a una variable char, guardando el dígito nº N.
        En nuestro ejemplo, el dígito en la posición 0 (primera posición)

        En este caso, en el apartado switch(), en los casos, hay que poner el char con comilla simple
        Mientras que, si utilizamos una variable string, hay que ponerla con comilla doble/normal.
        */

        //Salida de datos
        switch (a) {
            case 1:
                System.out.println("Has seleccionado Abrir");
                break;
            case 2:
                System.out.println("Has seleccionado Cerrar");
                break;
            case 3:
                System.out.println("Has seleccionado Conectar");
                break;
            case 4:
                System.out.println("Has seleccionado Desconectar");
                break;
            default:
                System.out.println("Has seleccionado Fin");
        }
    }
}
