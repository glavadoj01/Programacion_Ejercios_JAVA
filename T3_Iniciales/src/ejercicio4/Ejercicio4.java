package ejercicio4;
import java.util.Scanner;
/*Diseña un programa Java que solicite dos números enteros y muestre un mensaje
indicando cuál de ellos es mayor o bien si son iguales.*/
public class Ejercicio4 {
    public static void main(String[] args) {
        //Def de métodos y variables
        Scanner escanear = new Scanner(System.in);
        int a,b;
        //Entrada de datos
        System.out.print("Introducir el primer nº: ");
        a = escanear.nextInt();
        System.out.print("Introducir el segundo nº: ");
        b = escanear.nextInt();
        //Salida de datos
        if (a<b){
            System.out.println("El nº " + b + " es mayor que el nº " + a);
        } else if (a>b) {
            System.out.println("El nº " + a + " es mayor que el nº " + b);
        } else {
            System.out.println("Los dos nº's son iguales");
        }
    }
}