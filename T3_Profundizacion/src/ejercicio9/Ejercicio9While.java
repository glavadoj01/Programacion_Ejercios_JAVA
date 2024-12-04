package ejercicio9;
import java.util.Scanner;
/*
Diseña un programa Java que solicite un número al usuario y diga si es par o impar.
El programa debe dar al usuario la posibilidad de repetir el proceso.
*/
public class Ejercicio9While {
    public static void main(String[] args) {
        Scanner escanear = new Scanner(System.in);
        String rep = "R";
        int num;

        while (rep.equals("R")==true){
            System.out.print("Ingrese un numero entero: ");
            num = escanear.nextInt();
            if (num%2==0){
                System.out.printf("El numero %d es par\n", num);
            }
            else {
                System.out.printf("El numero %d es impar\n", num);
            }

            do {
                System.out.println("Para Repetir introducir R");
                System.out.println("Para   Salir introducir S");
                rep = escanear.next().toUpperCase();
                if (rep.equals("S")==false && rep.equals("R")==false) {
                    System.out.println("ERROR");
                }
            } while (rep.equals("S")==false && rep.equals("R")==false);
        }
    }
}
