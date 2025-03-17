package ejercicio56;

import java.util.Scanner;

/*
Diseña un programa Java que compruebe si un número es de Armstrong. Se dice que un número es de Armstrong
si “es igual a la suma de sus propios dígitos elevados al número de dígitos”.
Los números 153, 370 y 9474 son Nº's de Armstrong.
*/
public class Ejercicio56 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int longitud, entrada, num, suma = 0, temp, pot;
        String digitos;

        System.out.print("Ingrese un numero: ");
        entrada = escanear.nextInt();       // Guardo el nº como INT

        digitos = String.valueOf(entrada);  // Guardo el nº como STRING
        longitud = digitos.length();   //  Cantidad de digitos del nº STRING
        num = entrada;                 //  Nº temp que ira variando

        for (int i = longitud - 1; i >= 0; i--) {
            pot = (int) Math.pow(10, i);   //Potencia i-esima de 10
            temp = num / pot;               // Obtengo el digito i-esimo
            suma += (int) Math.pow(temp, longitud);
            num = num % pot;               // Actualizo num
        }

        if (suma == entrada) {
            System.out.println("El numero " + entrada + ", es un Nº de Armstrong");
        } else {
            System.out.println("El numero " + entrada + ", no es un Nº de Armstrong");
        }
    }
}
