package ejercicio9;
import java.util.Scanner;
/*
Diseña un programa Java que solicite un número al usuario y diga si es par o impar.
El programa debe dar al usuario la posibilidad de repetir el proceso.
*/
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        int num;
        String rep;

       do {
            // ENTRADA DE DATOS
            System.out.print("Introducir un entero: ");
            num = escanear.nextInt();


            // SALIDA DATOS
             if (num%2==0){
                 System.out.printf("El número %d es par\n", num);

             }else System.out.printf("El número %d es impar\n", num);

             //Repetición
           do {
               System.out.println("Para  salir  introduzca S");
               System.out.println("Para repetir introduzca R");
               rep = escanear.next().toUpperCase();
               if (rep.equals("S") == false && rep.equals("R") == false) {
                   System.out.println("Error");
               }
           } while (rep.equals("S") == false && rep.equals("R") == false);

       }while (rep.equals("R") == true);
    }
}
